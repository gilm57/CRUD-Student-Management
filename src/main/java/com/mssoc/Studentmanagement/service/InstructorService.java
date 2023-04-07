package com.mssoc.Studentmanagement.service;

import com.mssoc.Studentmanagement.entity.Instructor;
import com.mssoc.Studentmanagement.repository.InstructorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class InstructorService {

    @Autowired
    private InstructorRepository instructorRepository;

    public Instructor addInstructor(Instructor instructor) {
        return instructorRepository.save(instructor);
    }
}
