package com.example.spring_security_demo.controller;

import com.example.spring_security_demo.model.Student;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class StudentController {
    List<Student> students = new ArrayList<>();
    @GetMapping("/students")
    public List<Student> students(){
        Student student1 = new Student(1L, "Ramesh", "kutrapali");
        Student student2 = new Student(2L, "Ramerash", "kutraputi");
        students.add(student1);
        students.add(student2);
        return students;
    }

    @PostMapping("/students/new")
    public Student createStudent(@RequestBody Student student){
        students.add(student);
        return student;
    }
}
