package com.exam.ts.controller;

import com.exam.ts.model.Student;
import com.exam.ts.model.Supervisor;
import com.exam.ts.repository.StudentRepository;
import com.exam.ts.repository.SupervisorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
@RestController
public class SupervisorController {


    @Autowired
    SupervisorRepository supervisorRepository;



    //Show index
    @GetMapping("/supervisor")
    public Iterable<Supervisor> index(){
        return supervisorRepository.findAll();
    }

    //get by id
    @GetMapping("/supervisor/{id}")
    public ResponseEntity<Optional<Supervisor>> readOne(@PathVariable Long id){

        Optional<Supervisor> res = supervisorRepository.findById(id);
        if(res.isPresent()){
            return ResponseEntity.status(200).body(res);
        }else{
            return ResponseEntity.status(404).body(res);
        }
    }


    //post
    @CrossOrigin(origins = "*", exposedHeaders = "Location")
    @PostMapping("/supervisor")
    public ResponseEntity<String> create(@ModelAttribute Supervisor su) {
        Supervisor supervisor = supervisorRepository.save(su);

        return ResponseEntity.status(201).header("Location", "/supervisor/" + supervisor.getId()).body("{'Msg': 'post created'}");
    }


    //put
    @CrossOrigin(origins = "*", exposedHeaders = "Location")
    @PostMapping("/supervisor/{id}")
    public ResponseEntity <String> update(@ModelAttribute Supervisor su){
        Supervisor supervisor = supervisorRepository.save(su);

        return ResponseEntity.status(201).header("Location", "/supervisor/" + supervisor.getId()).body("{'Msg': 'post created'}");
    }

    //delete
    @CrossOrigin(origins = "*")
    @DeleteMapping("/supervisor/{id}")
    public ResponseEntity<String> delete(@PathVariable Long id){
        supervisorRepository.deleteById(id);
        return ResponseEntity.status(200).body("{'msg':'Deleted'}");
    }

}
