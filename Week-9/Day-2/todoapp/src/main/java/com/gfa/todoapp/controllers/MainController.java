package com.gfa.todoapp.controllers;

import com.gfa.todoapp.models.Subtask;
import com.gfa.todoapp.models.Todo;
import com.gfa.todoapp.services.AssigneeService;
import com.gfa.todoapp.services.SubtaskService;
import com.gfa.todoapp.services.TodoService;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

@Controller
public class MainController {

    @Autowired
    TodoService todoService;
    @Autowired
    AssigneeService assigneeService;
    @Autowired
    SubtaskService subtaskService;

    @GetMapping({"/", "/main", "/index", "/home"})
    public String renderMainPage(Model model) {
        model.addAttribute("seeAllTodo", true);
        model.addAttribute("listTodos", todoService.findAllTodo());
        model.addAttribute("showButtons", true);
        return "main";
    }

    @GetMapping("/newtodo")
    public String addNewTodo(Model model) {
        model.addAttribute("listTodos", todoService.findAllTodo());
        model.addAttribute("newTodo", true);
        model.addAttribute("todo", new Todo());
        model.addAttribute("listAssignees", assigneeService.returnAllAssignees());
        return "main";
    }

    @GetMapping("/seesubtasks/{id}")
    public String showSubTask(@PathVariable long id, Model model) {
        model.addAttribute("seeAssignees", false);
        model.addAttribute("showSubTasks", true);
        model.addAttribute("leadTask", todoService.findTodoById(id));
        model.addAttribute("leadTaskSubtasks", todoService.findTodoById(id).getSubtasks());
        return "main";
    }

    @GetMapping("/addsubtask/{id}")
    public String addSubTask(@PathVariable long id, Model model) {
        if (todoService.findTodoById(id) == null) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND);
        } else {
            model.addAttribute("newSubtask", true);
            model.addAttribute("leadTask", todoService.findTodoById(id));
            model.addAttribute("subtask", new Subtask());
            model.addAttribute("listAssignees", assigneeService.returnAllAssignees());
            return "main";
        }
    }

    @PostMapping("/addsubtask/{id}")
    public String addSubTask(@ModelAttribute Subtask subtask,
                             @PathVariable long id) {
        subtaskService.createSubtask(subtask, id);
        return "redirect:/seesubtasks/" + id;
    }

    @PostMapping("/newtodo")
    public String addNewTodo(@ModelAttribute Todo todo) {
        todoService.createTodo(todo);
        return "redirect:/main";
    }

    @GetMapping("/newassignee")
    public String addNewAssignee(Model model) {
        model.addAttribute("newTodo", false);
        model.addAttribute("newAssignee", true);
        model.addAttribute("seeAssignees", true);
        model.addAttribute("listAssignees", assigneeService.returnAllAssignees());
        return "main";
    }

    @PostMapping("/newassignee")
    public String addNewAssignee(@RequestParam String name){
        assigneeService.createNewAssignee(name);
        return "redirect:/seeassignees";
    }

    @GetMapping("/seeassignees")
    public String seeAllAssignees(Model model){
        model.addAttribute("seeAssignees", true);
        model.addAttribute("showButtons", true);
        model.addAttribute("listAssignees", assigneeService.returnAllAssignees());
        return "main";
    }

    @GetMapping("/deleteassignee/{id}")
    public String deleteAssignee(@PathVariable long id) {
        assigneeService.deleteAssignee(id);
        return "redirect:/seeassignees";
    }

    @GetMapping("/editassignee/{id}")
    public String editAssignee(@PathVariable long id, Model model) {
        model.addAttribute("editAssignee", true);
        model.addAttribute("seeAssignees", true);
        model.addAttribute("listAssignees", assigneeService.returnAllAssignees());
        model.addAttribute("editingAssignee", assigneeService.returnAssignee(id));
        return "main";
    }

    @PostMapping("/editassignee/{id}")
    public String editAssignee(@PathVariable long id, @RequestParam String name){
        assigneeService.editAssignee(name, id);
        return "redirect:/seeassignees";
    }

    @GetMapping("/seetodos/{id}")
    public String seeAssigneeTodos(@PathVariable long id, Model model) {
        model.addAttribute("showButtons", true);
        model.addAttribute("showTasksOfAssignee", true);
        model.addAttribute("taskOfAssignee", assigneeService.returnAssignee(id));
        model.addAttribute("assigneeTasks", assigneeService.tasksOfAssignee(id));
        return "main";
    }

    @GetMapping("/edit/{id}")
    public String editTodo(@PathVariable long id, Model model) {
        model.addAttribute("todo", todoService.findTodoById(id));
        model.addAttribute("listTodos", todoService.findAllTodo());
        model.addAttribute("listAssignees", assigneeService.returnAllAssignees());
        model.addAttribute("editTodo", true);
        return "main";
    }

    @PostMapping("/edit/{id}")
    public String editTodo(@ModelAttribute Todo todo) {
        todoService.updateTodo(todo);
        return "redirect:/main";
    }

    @GetMapping("/delete/{id}")
    public String deleteTodo(@PathVariable long id) {
        todoService.deleteTodo(id);
        return "redirect:/main";
    }

    @GetMapping("/complete/{id}")
    public String markAsCompleted(@PathVariable long id) {
        todoService.markAsCompleted(id);
        return "redirect:/main";
    }

    @GetMapping("/reopen/{id}")
    public String reopenTodo(@PathVariable long id) {
        todoService.reopenTask(id);
        return "redirect:/main";
    }
}
