package com.artur.spring.data.jpa.dao;
import com.artur.spring.data.jpa.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface StudentRepository extends JpaRepository<Student, Integer> {
    public List<Student> findAllByName(String name);
}
