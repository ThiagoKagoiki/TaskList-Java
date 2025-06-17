package com.example.taskList.domain;

import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Tasks {
    //nesta pasta voce criara o objeto task com os getters e setters
    private int id;
    private String name;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
