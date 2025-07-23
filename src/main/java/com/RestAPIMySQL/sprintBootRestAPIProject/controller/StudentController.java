package com.RestAPIMySQL.sprintBootRestAPIProject.controller;

import com.RestAPIMySQL.sprintBootRestAPIProject.entity.Student;
import com.RestAPIMySQL.sprintBootRestAPIProject.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class StudentController {

    @Autowired
    StudentRepository repo;

    @GetMapping("/students")
    public List<Student> getAllStudents(){
        return repo.findAll();
    }
    @GetMapping("/students/{id}")
    public Student getStudent(@PathVariable int id){
        return repo.findById(id).get();
    }

    @PostMapping("/students/add")
    @ResponseStatus(code = HttpStatus.CREATED)
    public void createStudent(@RequestBody Student student){
        repo.save(student);
    }

    @PutMapping("/students/update/{id}")
    public ResponseEntity<Student>updateStudentById(@PathVariable int id, @RequestBody Student newStudent){
        Optional<Student> oldStudent = repo.findById(id);
        if (oldStudent.isPresent()){
            Student updatedStudent =oldStudent.get();
            updatedStudent.setName(newStudent.getName());
            updatedStudent.setPercentage(newStudent.getPercentage());
            updatedStudent.setBranch(newStudent.getBranch());

            Student studentObj =repo.save(updatedStudent);
            return new ResponseEntity<>(studentObj, HttpStatus.OK);
        }
        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }

    @DeleteMapping("/students/delete/{id}")
    public ResponseEntity<HttpStatus> deleteStudentById(@PathVariable int id){
        repo.deleteById(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }






}
