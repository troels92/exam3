package com.exam.ts.controller;

import com.exam.ts.model.Student;
import com.exam.ts.model.Supervisor;
import com.exam.ts.repository.StudentRepository;
import com.exam.ts.repository.SupervisorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

public class SupervisorController {
/*
    @Autowired
    SupervisorRepository supervisorRepository;

    //post
    @CrossOrigin(origins = "*", exposedHeaders = "Location")
    @PostMapping("/student")
    public ResponseEntity<String> create(@ModelAttribute Supervisor su) {
        Supervisor supervisor = supervisorRepository.save(su);

        return ResponseEntity.status(201).header("Location", "/student/" + supervisor.getId()).body("{'Msg': 'post created'}");
    }


    //put
    @CrossOrigin(origins = "*", exposedHeaders = "Location")
    @PostMapping("/student/{id}")
    public ResponseEntity <String> update(@ModelAttribute Supervisor su){
        Supervisor supervisor = supervisorRepository.save(su);

        return ResponseEntity.status(201).header("Location", "/student/" + supervisor.getId()).body("{'Msg': 'post created'}");
    }

    //delete
    @CrossOrigin(origins = "*")
    @DeleteMapping("/student/{id}")
    public ResponseEntity<String> delete(@PathVariable Long id){
        supervisorRepository.deleteById(id);
        return ResponseEntity.status(200).body("{'msg':'Deleted'}");
    }
*/
}
