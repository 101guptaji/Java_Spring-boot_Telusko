package org.hg.SpringBootJDBC1.service;

import org.hg.SpringBootJDBC1.dao.StudentRepo;
import org.hg.SpringBootJDBC1.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {

    @Autowired
    private StudentRepo studentRepo;

    public void addStudent(Student s){
        studentRepo.save(s);
    }

    public List<Student> getStudents(){
        return studentRepo.findAll();
    }
}
