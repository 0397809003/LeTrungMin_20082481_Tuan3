package com.crud.example.Serviec;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.crud.example.Entity.Student;
import com.crud.example.Repository.StudentRepository;

@Service
public class StudentServiec {
	@Autowired
     private StudentRepository repons ;
	
	public Student saveStudent(Student student) {
	  return repons.save(student);

	}
	public List<Student> saveStudents(List<Student> students) {
		  return repons.saveAll(students);

		}
	     
	public List<Student> getStudents() {
		return repons.findAll();
	}
	  
       public Student  getStudentById(int id){
    	   return repons.findById(id).orElse(null);
       }
		
     public Student  getStudentByName(String name ){
    	 return repons.findByName(name);
      }
     public String deletestudent (int id) {
		repons.deleteById(id);
		return "student removed !! " + id;
				
	}
     
    public Student  updatastudent (Student student) {
    	Student exitingstudent = repons.findById(student.getId()).orElse(null);
    	exitingstudent.setName(student.getName());
    	exitingstudent.setQuantity(student.getQuantity());
    	exitingstudent.setPrice(student.getPrice());
		return repons.save(exitingstudent);
    }
	
	
}
