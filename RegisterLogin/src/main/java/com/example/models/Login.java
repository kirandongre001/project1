package com.example.models;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name="login")
public class Login {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String login_id;
    private String password;

    @OneToMany(mappedBy="login",cascade=CascadeType.ALL)
    private List<Task> tasks;

    public List<Task> getTasks() {
        return tasks;
    }

    public void setTasks(List<Task> tasks) {
        this.tasks = tasks;
    }

    public Login(List<Task> tasks, String password, String login_id) {
        this.tasks = tasks;
        this.password = password;
        this.login_id = login_id;
    }

    public Login(int id, String login_id, String password, List<Task> tasks) {
        this.id = id;
        this.login_id = login_id;
        this.password = password;
        this.tasks = tasks;
    }

    public Login(){

    }
    public Login(int id, String login_id, String password) {
        this.id = id;
        this.login_id = login_id;
        this.password = password;
    }

    public Login(String login_id, String password) {
        this.login_id = login_id;
        this.password = password;
    }

    @Override
    public String toString() {
        return "Login{" +
                "id=" + id +
                ", login_id='" + login_id + '\'' +
                ", password='" + password + '\'' +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLogin_id() {
        return login_id;
    }

    public void setLogin_id(String login_id) {
        this.login_id = login_id;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
