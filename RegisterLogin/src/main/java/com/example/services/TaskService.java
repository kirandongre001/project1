package com.example.services;

import com.example.models.Task;
import com.example.repos.TaskRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TaskService {

    @Autowired
    private TaskRepo tr;

    public List<Task> getAlltasks() {
        return tr.findAll();
    }

    public Task getById(int tid) {
        Optional<Task> op=tr.findById(tid);
        if(op.isPresent()) {
            return op.get();
        }
        return null;
    }

    public void addnewTask(Task t) {
        tr.save(t);
    }

    public void updateById(Task t) {
        Optional<Task> op=tr.findById(t.getId());
        if(op.isPresent()) {
            Task tt=op.get();

            tt.setTask(t.getTask());
            tt.setAssigned(t.getAssigned());
            tt.setCompleted(t.getCompleted());
            tt.setStatus(t.isStatus());

            tr.save(tt);

        }
    }

    public void deleteById(int tid) {
        tr.deleteById(tid);
    }
}
