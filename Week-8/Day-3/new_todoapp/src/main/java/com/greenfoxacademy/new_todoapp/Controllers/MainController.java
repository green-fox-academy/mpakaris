package com.greenfoxacademy.new_todoapp.Controllers;

import com.greenfoxacademy.new_todoapp.Services.AssigneeService;
import com.greenfoxacademy.new_todoapp.Services.TaskService;
import org.hibernate.validator.constraints.pl.REGON;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.*;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

@Controller
public class MainController {

    private AssigneeService assigneeService;
    private TaskService taskService;
    // private SubtaskService subtaskService;

    public MainController(AssigneeService assigneeService, TaskService taskService /*, SubtaskService subtaskService*/) {
        this.assigneeService = assigneeService;
        this.taskService = taskService;
        // this.subtaskService = subtaskService;
    }

    @GetMapping("/")
    public String renderMainpage(Model model) {
        model.addAttribute("main", true);
        return "main";
    }

    @GetMapping("/createnewtask")
    public String createNewTask(Model model) {
        model.addAttribute("newTask", true);
        return "main";
    }

    @InitBinder
    public void bindingPreparation(WebDataBinder binder) {
        DateFormat dateFormat = new SimpleDateFormat("MMM d, YYYY");
        CustomDateEditor orderDateEditor = new CustomDateEditor(dateFormat, true);
        binder.registerCustomEditor(Date.class, orderDateEditor);
    }

    /*
    @PostMapping("/createnewtask")
    public String createNewTask(@RequestParam (required = false) String taskName,
                                @RequestParam (required = false) String taskDescription,
                                @RequestParam (required = false) String isUrgent,
                                @RequestParam("dateStart") @DateTimeFormat (pattern = "yyyy-MM-dd") Date dateStart,
                                @RequestParam("dateDue") @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) Date dateDue,
                                @RequestParam (required = false) long assigneeID, Model model) {


        
       model.addAttribute("taskCreated", taskService.createNewTask(taskName,
                                  taskDescription, isUrgent.equals("true") ? true : false, dateStart, dateDue, assigneeID));
        return "main";
    } */


    @GetMapping("/createAssignee")
    public String createAssignee(Model model) {
        model.addAttribute("createAssignee", true);
        return "main";
    }


    @PostMapping("/createAssignee")
    public String createAssignee(@RequestParam String userName,
                                 @RequestParam String userEmail, Model model) {
        model.addAttribute("assignee", assigneeService.createNewAssignee(userName, userEmail));
        return "main";
    }

}