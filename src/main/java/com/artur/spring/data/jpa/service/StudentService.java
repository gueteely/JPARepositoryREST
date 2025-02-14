package com.artur.spring.data.jpa.service;
import com.artur.spring.data.jpa.entity.Student;

import java.util.List;

public interface StudentService {
    public List<Student> getAllStudents();
    public void saveStudent(Student student);
    public Student getStudent(int id);
    public void deleteStudent(int id);
    public List<Student> findAllByName(String name);
}
