package com.mssoc.Studentmanagement.controller;

import com.mssoc.Studentmanagement.entity.Instructor;
import com.mssoc.Studentmanagement.service.InstructorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class InstructorController {

    @Autowired
    private InstructorService instructorService;

    @PostMapping({"/addInstructor"})
    public Instructor addInstructor(@RequestBody Instructor instructor){
        return instructorService.addInstructor(instructor);
    }
}
