package com.greenfoxacademy.mysql.Controller;

import com.greenfoxacademy.mysql.Service.AsigneeService;
import com.greenfoxacademy.mysql.Service.TodoService;
import org.hibernate.validator.constraints.pl.REGON;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller(value = "/todo")
public class TodoController {

    private AsigneeService asigneeService;
    private TodoService todoService;

    public TodoController(AsigneeService asigneeService, TodoService todoService) {
        this.asigneeService = asigneeService;
        this.todoService = todoService;
    }

    @Autowired
    public TodoController(TodoService todoService, AsigneeService asigneeService) {
        this.todoService = todoService;
        this.asigneeService = asigneeService;
    }

    @RequestMapping(value = {"/", "/list"}, method = RequestMethod.GET)
    public String list(@RequestParam(value = "isActive") String active, Model model) {
        model.addAttribute("tasks", todoService.listTasks(active));
        model.addAttribute("asignees", asigneeService.getAllAsignees());
        return "list";
    }

    @PostMapping(value = "/addTask")
    public String addTask(@RequestParam(value = "urgent", defaultValue = "notUrgent") String urgent,
                          @RequestParam(value = "nameTask", defaultValue = "New Task") String task,
                          @RequestParam(value = "id_asignee") long id, Model model) {
        todoService.addTask(task, urgent, id);
        return "redirect:/list/?isActive=false";
    }

    @RequestMapping(path = "/{id}/deleteTask", method = RequestMethod.GET)
    public String deleteTask(@PathVariable("id") Long id) {
        todoService.deleteTask(id);
        return "redirect:/list/?isActive=false";
    }

    @RequestMapping(path = "/{id}/editTask", method = RequestMethod.GET)
    public String editTask(@PathVariable("id") long id, Model model) {
        model.addAttribute("task", todoService.fetchTaskToEdit(id));
        model.addAttribute("asignees", asigneeService.getAllAsignees());
        return "edit";
    }

    @PostMapping("/{id_task}/editTask")
    public String editTask_(@PathVariable("id_task") long idTask,
                            @RequestParam(value = "id_asignee") long idAsignee,
                            @RequestParam(value = "newTask") String newTask,
                            @RequestParam(value = "done", required = false) boolean done,
                            @RequestParam(value = "urgent", required = false) boolean urgent) {
        todoService.editTask(idTask, newTask, urgent, done, idAsignee);
        return "redirect:/list/?isActive=false";
    }

    @PostMapping("/findTask")
    public String findTask(@RequestParam("search") String query, Model model) {
        model.addAttribute("tasks", todoService.searchTask(query));
        return "list";
    }

    @GetMapping("/showAll")
    public String showAllTasks() {
        return "redirect:/list/?isActive=false";
    }

    @GetMapping("/showOpen")
    public String showOpenTasks() {
        return "redirect:/list/?isActive=true";
    }


}
