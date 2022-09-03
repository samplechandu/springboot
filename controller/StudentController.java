package com.example.demo.controller;

import com.example.demo.entity.Student;
import com.example.demo.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/student")
public class StudentController {
    @Autowired

    StudentRepository studentRepository;

    @PostMapping
    public Student saveStudent(@RequestBody Student student) {
        return studentRepository.save(student);
    }

    @PutMapping
    public Student updateStudent(@RequestBody Student student) {
        return studentRepository.save(student);
    }

    @DeleteMapping
    public String deleteStudent(@RequestParam Integer studentId) {
        studentRepository.deleteById(studentId);
        return "deleted Successfully";
    }

    @GetMapping("/fetch-all")
    public List<Student> getAllStudent() {
        return studentRepository.findAll();
    }

    @GetMapping
    public Student getAllStudent(@RequestParam Integer studentId){
        return studentRepository.findById(studentId).get();
    }
}

