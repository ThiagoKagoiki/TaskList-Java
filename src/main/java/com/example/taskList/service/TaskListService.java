package com.example.taskList.service;

import com.example.taskList.domain.Tasks;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
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
        System.out.println(List.of(tarefas));
        return List.of(tarefas);
    }

    public Tasks postTask(Tasks tasks){
        return restTemplate.postForObject(urlApi, tasks, Tasks.class);
    }

    public String editTask(String new_task, String old_task){
        List<Tasks> tarefas = getAllTasks();
        for(Tasks t : tarefas){
            if(t.getNameTask() == old_task){
                return "";
            }
        }
        return "";
    }
}