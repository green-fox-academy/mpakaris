package com.greenfoxacademy.gfa.Controllers;

import com.greenfoxacademy.gfa.Services.StudentService;
import jdk.jfr.Registered;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.thymeleaf.model.IModel;

@Controller
public class MainController {

    private StudentService studentService;

    @Autowired
    public MainController(StudentService studentService) {
        this.studentService = studentService;
    }

    @RequestMapping (value = "/gfa")
    public String showMain (Model model) {
        model.addAttribute("enrolledStudents", studentService.count());
        return "main";
    }

    @RequestMapping (value = "/gfa/list")
    public String listAllStudents (Model model) {
        model.addAttribute("listOfStudents", studentService.findAll());
        return "list";
    }

    @RequestMapping (value = "/gfa/addStudent")
    public String showInputToAddStudent() {
        return "addStudent";
    }

    @RequestMapping (value = "/gfa/save", method = RequestMethod.POST)
    public String addStudent(String name) {
        studentService.save(name);
        return "redirect:/gfa/list";
    }

    @RequestMapping (value = "/gfa/checkStudent", method = RequestMethod.GET)
    public String displayCheck(Model model) {
        model.addAttribute("nameExists", false);
        return "check";
    }

    @RequestMapping (value = "/gfa/checkIfStudentExists", method = RequestMethod.POST)
    public String checkIfStudentExists(String name, Model model) {
        model.addAttribute("nameExists", studentService.check(name));
        model.addAttribute("nameStudent", name);
        return "check";
    }

}
