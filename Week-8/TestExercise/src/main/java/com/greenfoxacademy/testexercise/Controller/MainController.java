package com.greenfoxacademy.testexercise.Controller;

import com.greenfoxacademy.testexercise.Models.Task;
import com.greenfoxacademy.testexercise.Service.TaskService;
import org.jboss.jandex.Main;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.validation.Valid;
import java.time.LocalDate;
import java.util.Date;

@Controller
public class MainController {

    private TaskService taskService;

    public MainController(TaskService taskService) {
        this.taskService = taskService;
    }


    @GetMapping("/main")
    public String renderMain(Model model) {

        model.addAttribute("dateToday", new Date());
        return "main";
    }

    @PostMapping("/sendDate")
    public String sendNewTask(@ModelAttribute Task task,
                              BindingResult bindingResult,
                              Model model) {

        if (bindingResult.hasErrors()) {
            return "/main";
        }
        model.addAttribute("task", taskService.createNewTask(task));
        return "success";
    }

}
