package com.example.taskList.domain;

import lombok.*;

@Data
@NoArgsConstructor
public class Tasks {
    //nesta pasta voce criara o objeto task com os getters e setters
    private String nameTask, descTask;
    private boolean stats;

    public Tasks(String nameTask, String descTask, boolean stats) {
        this.nameTask = nameTask;
        this.descTask = descTask;
        this.stats = stats;
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
