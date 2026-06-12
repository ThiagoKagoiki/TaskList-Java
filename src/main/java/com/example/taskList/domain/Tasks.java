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
    private static int id = 0;

    public Tasks(String nameTask, String descTask, boolean stats) {
        this.id = id++;
        this.nameTask = nameTask;
        this.descTask = descTask;
        this.stats = stats;
    }

    public static int getId() {
        return id;
    }

    public static void setId(int id) {
        Tasks.id = id;
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
