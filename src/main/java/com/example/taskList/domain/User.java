package com.example.taskList.domain;

import java.util.ArrayList;

public class User {
    private String user_name;
    private String password;
    private ArrayList<Tasks> tasks;

    public User(String user_name, String password){
        this.user_name = user_name;
        this.password = password;
        this.tasks = null;
    }

    public String getUser_name() {
        return user_name;
    }

    public void setUser_name(String user_name) {
        this.user_name = user_name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void addTask(Tasks task){
        tasks.add(task);
    }
}
