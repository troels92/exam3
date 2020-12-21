package com.exam.ts.controller;


import com.exam.ts.model.Student;
import com.exam.ts.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
public class StudentController {

    @Autowired
    StudentRepository studentRepository;

    /* Autowired gør dette for os
    public StudentController(StudentRepository studentRepository){
        this.studentRepository = studentRepository;
    }
    */

    //Show index
    @GetMapping("/student")
    public Iterable<Student> index(){
        return studentRepository.findAll();
    }

    //get by id
    @GetMapping("/student/{id}")
    public ResponseEntity<Optional<Student>> readOne(@PathVariable Long id){

        Optional<Student> res = studentRepository.findById(id);
        if(res.isPresent()){
            return ResponseEntity.status(200).body(res);
        }else{
            return ResponseEntity.status(404).body(res);
        }
    }

    //post
    @CrossOrigin(origins = "*", exposedHeaders = "Location")
    @PostMapping("/student")
    public ResponseEntity <String> create(@ModelAttribute Student s) {
        Student student = studentRepository.save(s);

        return ResponseEntity.status(201).header("Location", "/student/" + student.getId()).body("{'Msg': 'post created'}");
    }


    //put
    @CrossOrigin(origins = "*", exposedHeaders = "Location")
    @PutMapping("/student/{id}")
    public ResponseEntity <String> update(@ModelAttribute Student s){
        Student student = studentRepository.save(s);

        return ResponseEntity.status(201).header("Location", "/student/" + student.getId()).body("{'Msg': 'post created'}");
    }

    //delete
    @CrossOrigin(origins = "*")
    @DeleteMapping("/student/{id}")
    public ResponseEntity<String> delete(@PathVariable Long id){
        studentRepository.deleteById(id);
        return ResponseEntity.status(200).body("{'msg':'Deleted'}");
    }


}
