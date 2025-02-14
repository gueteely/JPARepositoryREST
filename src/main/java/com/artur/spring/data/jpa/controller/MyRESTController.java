package com.artur.spring.data.jpa.controller;
import com.artur.spring.data.jpa.entity.Student;
import com.artur.spring.data.jpa.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class MyRESTController {
    @Autowired
    private StudentService studentService;

    @GetMapping("/students")
    public List<Student> showAllStudents() {
        List<Student> allStudents = studentService.getAllStudents();
        return allStudents;
    }
    @GetMapping("/students/{id}")
    public Student getStudent(@PathVariable int id) {
        Student student = studentService.getStudent(id);
        return student;
    }

    @PostMapping("/students")
    public Student addStudent(@RequestBody Student student) {
        studentService.saveStudent(student);
        return student;
    }

    @PutMapping("/students")
    public Student updateStudent(@RequestBody Student student) {
        studentService.saveStudent(student);
        return student;
    }

    @DeleteMapping("/students/{id}")
    public String deleteStudent(@PathVariable int id) {
        Student student = studentService.getStudent(id);
        studentService.deleteStudent(id);
        return "Student with id " + id + " deleted";
    }
    @GetMapping("/students/name/{name}")
    public List<Student> showStudentsByName(@PathVariable String name) {
        List<Student> allStudents = studentService.findAllByName(name);
        return allStudents;
    }
}
