package com.example.taskList.domain;

import lombok.*;
import org.thymeleaf.standard.expression.Each;

import java.util.Random;

@Data
@NoArgsConstructor
public class Tasks {
    //nesta pasta voce criara o objeto task com os getters e setters
    private String nameTask, descTask;
    private boolean stats;
    private String id;

    public Tasks(String nameTask, String descTask, boolean stats) {
        this.nameTask = nameTask;
        this.descTask = descTask;
        this.stats = stats;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNameTask() {
        return nameTask;
    }

    public void setNameTask(String nameTask) {
        this.nameTask = nameTask;
    }

    public String getDescTask() {
        return descTask;
    }

    public void setDescTask(String descTask) {
        this.descTask = descTask;
    }

    public boolean isStats() {
        return stats;
    }

    public void setStats(boolean stats) {
        this.stats = stats;
    }
}
