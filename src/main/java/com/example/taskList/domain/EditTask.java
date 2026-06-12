package com.example.taskList.domain;

public class EditTask {
    private String new_name;
    private String id;

    public EditTask(String new_name, String id) {
        this.new_name = new_name;
        this.id = id;
    }

    public String getNew_name() {
        return new_name;
    }

    public void setNew_name(String new_name) {
        this.new_name = new_name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
