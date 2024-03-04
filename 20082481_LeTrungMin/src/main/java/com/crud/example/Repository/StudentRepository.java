package com.crud.example.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.crud.example.Entity.Student;

public interface StudentRepository  extends JpaRepository<Student , Integer>{
    Student findByName(String name);
}
