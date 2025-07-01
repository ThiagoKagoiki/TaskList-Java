package com.example.taskList.service;

import com.example.taskList.domain.Tasks;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@Service
public class TaskListService {
    //nesta pasta voce ira criar metodos que fazem um return
    @Autowired
    private RestTemplate restTemplate;//biblioteca

    private final String urlApi = "https://684c9eaaed2578be881f402f.mockapi.io/tasklist"; //link api

    public List<Tasks> getAllTasks(){
        Tasks[] tasks = restTemplate.getForObject(urlApi, Tasks[].class); //select * from
        return List.of(tasks);
    }

    public Tasks createTask(Tasks tasks){
        return restTemplate.postForObject(urlApi, tasks, Tasks.class); // postando a task (link, tasks significa o que tem dentro da classe Tasks, classe)
    }

    public boolean deleteTask(String name){
        List<Tasks> tasks = getAllTasks();
        for(Tasks task : tasks){
            if(task.getName().equalsIgnoreCase(name)){
                String deleteUrl = urlApi + '/' + task.getId();
                restTemplate.delete(deleteUrl);
                return true;
            }
        }
        return false;
    }

    public boolean renameTask(int id, String novoNome){
        List<Tasks> tasks = getAllTasks();
        for(Tasks task: tasks){
            if(task.getId() == id){
                task.setName(novoNome);
                String renameUrl = urlApi + '/' + task.getId();
                restTemplate.put(renameUrl, task);
//                return restTemplate.getForObject(renameUrl, Tasks.class);
                return true;
            }
        }
        return false;
    }
}
