package com.gfa.todoapp.services;

import com.gfa.todoapp.models.Subtask;
import com.gfa.todoapp.models.Todo;

public interface SubtaskService {

    void createSubtask(Subtask subtask, long idMainTask);

    void deleteSubtask(long id);

    void editSubtask(Subtask subtask);
}
