package com.mssoc.Studentmanagement.controller;

import com.mssoc.Studentmanagement.entity.Student;
import com.mssoc.Studentmanagement.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class StudentController {

    @Autowired
    private StudentService studentService;

    @PostMapping("/saveStudent")
    public Student saveStudent(@RequestBody Student student){
        return studentService.saveStudent(student);
    }
    @GetMapping("/studentList")
    public List<Student> getSudentList(){
        return  studentService.getSudentList();
    }
    @GetMapping("/studentEmail/{studentEmail}")
    public Student findByStudentEmail(@PathVariable("studentEmail") String studentEmail){
        return studentService.findByStudentEmail(studentEmail);
    }
    @GetMapping("/studentId/{id}")
    public Optional<Student> getStudentById(@PathVariable("id") Integer studentId){
        return studentService.getStudentById(studentId);
    }

    @PutMapping("/updateStudent")
    public Student updateStudent(@RequestBody Student student){
        return studentService.updateStudent(student);
    }

    @DeleteMapping({"/deleteStudent/{studentId}"})
    public String deleteStudent(@PathVariable("studentId") Integer studentId){
         studentService.deleteStudent(studentId);
        return "Student successfully deleted!";
    }

}
