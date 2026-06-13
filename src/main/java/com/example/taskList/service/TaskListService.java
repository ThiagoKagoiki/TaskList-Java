package com.example.taskList.service;

import com.example.taskList.domain.EditTask;
import com.example.taskList.domain.Tasks;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.List;

@Service
public class TaskListService {
    //nesta pasta voce ira criar metodos que fazem um return
    @Autowired
    private RestTemplate restTemplate;//biblioteca

    private final String urlApi = "https://68b8ecb8b71540504329771c.mockapi.io/tasks"; //link api

    public List<Tasks> getAllTasks(){
        Tasks[] tarefas = restTemplate.getForObject(urlApi, Tasks[].class);
        return List.of(tarefas);
    }

    public Tasks postTask(Tasks tasks){
        return restTemplate.postForObject(urlApi, tasks, Tasks.class);
    }

    public Tasks getById(String id){
        String new_url = urlApi + '/' + id;
        System.out.println(id);
        Tasks task = restTemplate.getForObject(new_url, Tasks.class);
        return task;
    }

    public boolean editTask(EditTask editTask){
        List<Tasks> tarefas = getAllTasks();
        for(Tasks t : tarefas){
            if(editTask.getId().equals(t.getId())){
                t.setNameTask(editTask.getNew_name());
                String new_url = urlApi + '/' + editTask.getId();
                restTemplate.put(new_url, t);
                return true;
            }
        }
        return false;
    }

    public boolean deleteTask(String id){
        List<Tasks> tarefas = getAllTasks();
        for(Tasks t : tarefas){
            System.out.println(id);
            String id_tarefa = t.getId();
            System.out.println(id_tarefa);
            if(id.equals(id_tarefa)){
                String new_url = urlApi + '/' + t.getId();
                restTemplate.delete(new_url, t);
                return true;
            }
        }
        return false;
    }
}