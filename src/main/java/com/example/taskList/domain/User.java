package com.example.taskList.domain;

import java.util.ArrayList;

public class User {
    private String user_name;
    private String password;
    private ArrayList<Tasks> tasks;
    private static int id_user = 0;

    public User(String user_name, String password){
        this.id_user = id_user++;
        this.user_name = user_name;
        this.password = password;
        this.tasks = null;
    }

    public static int getId() {
        return id_user;
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
