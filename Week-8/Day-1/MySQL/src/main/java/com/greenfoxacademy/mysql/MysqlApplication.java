package com.greenfoxacademy.mysql;

import com.greenfoxacademy.mysql.Model.Asignee;
import com.greenfoxacademy.mysql.Model.Todo;
import com.greenfoxacademy.mysql.Repository.AsigneeRepository;
import com.greenfoxacademy.mysql.Repository.TodoRepository;
import com.greenfoxacademy.mysql.Service.TodoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.jdbc.core.ColumnMapRowMapper;

@SpringBootApplication
public class MysqlApplication implements CommandLineRunner {

    private AsigneeRepository asignee;
    private TodoRepository repo;
    private TodoService todoService;

    @Autowired
    public MysqlApplication(TodoRepository repository, AsigneeRepository asigneeRepository,
                            TodoService todoService) {
        this.repo = repository;
        this.asignee = asigneeRepository;
        this.todoService = todoService;
    }

    public static void main(String[] args) {
        SpringApplication.run(MysqlApplication.class, args);
    }


    @Override
    public void run(String... args) throws Exception {
        repo.save(new Todo("Daily Task", true, true));
        repo.save(new Todo("Make the Bed", false, false));
        repo.save(new Todo("Wash up", true, false));
        repo.save(new Todo("Clean the kitchen",  true, false));
        repo.save(new Todo("Cut the grass", true, true));
        repo.save(new Todo("Sweep the floor", true, false));
        repo.save(new Todo("Vaccum the carpet", false, false));
        repo.save(new Todo("Mop", true, true));
        repo.save(new Todo("Shop", true, false));
        repo.save(new Todo("Bath", false, false));
        repo.save(new Todo("Learn Coding", true, false));
        repo.save(new Todo("Play with Cat", true, true));
        repo.save(new Todo("Call Mummy", false, false));
        repo.save(new Todo("Buy new Phone", true, true));

        asignee.save(new Asignee("none"));
        asignee.save(new Asignee("Niko"));
        asignee.save(new Asignee("Eszter"));
        asignee.save(new Asignee("Kolbasz"));

        todoService.editTask(1,"Daily Task", true, true, 1);
        todoService.editTask(2, "Make the Bed", false, false,1);
        todoService.editTask(3, "Wash up", true, false,1);
        todoService.editTask(4,"Clean the kitchen",  true, false,1);
        todoService.editTask(5,"Cut the grass", true, true,1);
        todoService.editTask(6,"Sweep the floor", true, false,1);
        todoService.editTask(7,"Vaccum the carpet", false, false,1);
        todoService.editTask(8,"Mop", true, true,1);
        todoService.editTask(9,"Shop", true, false,1);
        todoService.editTask(10,"Bath", false, false,1);
        todoService.editTask(11,"Learn Coding", true, false,1);
        todoService.editTask(12,"Play with Cat", true, true,1);
        todoService.editTask(13,"Call Mummy", false, false,1);
        todoService.editTask(14,"Buy new Phone", true, true,1);
    }
}
