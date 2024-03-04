package com.crud.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.crud.example.Entity.Student;
import com.crud.example.Serviec.StudentServiec;

import lombok.experimental.Delegate;

@RestController
public class StudentController {
      @Autowired
     private StudentServiec serviec ;
     @PostMapping("/addStudent")
	public Student addStudent(@RequestBody  Student student) {
		return serviec.saveStudent(student);
	}
     @PostMapping("/addStudents")
	public List<Student> addStudents(@RequestBody List<Student> students) {
		return serviec.saveStudents(students);
	}
     @GetMapping("/Students")
   public List<Student> fillAlllStundent() {
	  
	   return serviec.getStudents();
  }
     @GetMapping("/Student/{id}")
   public Student findStudentByid(@PathVariable  int  id) {
		  
	   return serviec.getStudentById(id);
  }
   

     @GetMapping("/Student/{name}")
   public  Student findStudentByid(@PathVariable String  name) {
		  
	   return serviec.getStudentByName(name);
  }
     
     

     @GetMapping("/update")
   public  Student updateStudent(@RequestBody Student  student) {
		  
	   return serviec.updatastudent(student);
  }
     
     @DeleteMapping("/delete/{id}")
     public  String DelêtStudent(@PathVariable int id) {
  		  
  	   return serviec.deletestudent(id);
    }
       
      
}
