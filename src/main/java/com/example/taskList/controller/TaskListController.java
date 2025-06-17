package com.example.taskList.controller;


import com.example.taskList.domain.Tasks;
import com.example.taskList.service.TaskListService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/tasks")
public class TaskListController {
    //nesta pasta voce fara a conexao com a API, usando o @Autowired, getmapping e postmapping
    //crie uma instancia para declarar o service -> private ClassService classService com o @Autowired
    //no get ele retorna um return do service.metodoService(parametros)
    //no post ele passa como parametros o endpoint -> @Postmapping("/endpoint")
    //e no metodo ele passa @PathVariable("ex: id") String id, @RequestBody NomeDoObjeto body OBS: podemos usar só o requestbody
    //para postar, damos um retorno com o metodo body.getAlgo()

    @Autowired
    private TaskListService taskListService;

    @GetMapping
    public ResponseEntity<List<Tasks>> getAllTasks(){
        List<Tasks> tasks = taskListService.getAllTasks();
        return ResponseEntity.ok(tasks);
    }

    @PostMapping
    public ResponseEntity postTask(@RequestBody Tasks body){
        Tasks createdTask = taskListService.createTask(body);
        return ResponseEntity.ok(createdTask);
    }

    @DeleteMapping
    public ResponseEntity<String> deleteTask(@RequestBody Tasks body){
        boolean deleted = taskListService.deleteTask(body.getName());
        if(deleted){
            return ResponseEntity.ok("Task deleted: " + body.getName());
        }else{
            return ResponseEntity.notFound().build();
        }
    }



    //tentar fazer sem o arqv service
}
