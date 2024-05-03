package com.example.models;

import jakarta.persistence.*;

import java.util.Date;

@Entity
public class Task {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    String Task;
    Date assigned;
    Date completed;
    boolean status;

    @ManyToOne
    @JoinColumn(name="login_id")
    private Login login;

    public Task(int id, String task, Date assigned, Date completed, boolean status, Login login) {
        this.id = id;
        Task = task;
        this.assigned = assigned;
        this.completed = completed;
        this.status = status;
        this.login = login;
    }

    public Task() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTask() {
        return Task;
    }

    public void setTask(String task) {
        Task = task;
    }

    public Date getAssigned() {
        return assigned;
    }

    public void setAssigned(Date assigned) {
        this.assigned = assigned;
    }

    public Date getCompleted() {
        return completed;
    }

    public void setCompleted(Date completed) {
        this.completed = completed;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public Login getLogin() {
        return login;
    }

    public void setLogin(Login login) {
        this.login = login;
    }

    @Override
    public String toString() {
        return "Task{" +
                "id=" + id +
                ", Task='" + Task + '\'' +
                ", assigned=" + assigned +
                ", completed=" + completed +
                ", status=" + status +
                ", login=" + login +
                '}';
    }
}
