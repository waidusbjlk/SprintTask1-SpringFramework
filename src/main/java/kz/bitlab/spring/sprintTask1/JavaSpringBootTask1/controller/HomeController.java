package kz.bitlab.spring.sprintTask1.JavaSpringBootTask1.controller;

import kz.bitlab.spring.sprintTask1.JavaSpringBootTask1.db.DBManager;
import kz.bitlab.spring.sprintTask1.JavaSpringBootTask1.db.Student;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.ArrayList;

@Controller
public class HomeController {

    @GetMapping(value = "/")
    public String getStudents(Model model){
        ArrayList<Student> studentArrayList = DBManager.getAllStudents();
        model.addAttribute("studentter" , studentArrayList);
        return "index";
    }
    @GetMapping(value = "/add-student")
    public String addStudent(Model model){
        return "addStudent";
    }


    @PostMapping(value = "/add-student")
    public String addStudentPage(Student student){
        DBManager.addMusic(student);
        return "redirect:/";
    }

}
