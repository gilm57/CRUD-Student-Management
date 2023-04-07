package com.mssoc.Studentmanagement.service;

import com.mssoc.Studentmanagement.entity.Student;
import com.mssoc.Studentmanagement.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StudentService {

    @Autowired
    private StudentRepository studentRepository;

    public Student saveStudent(Student student){
        return studentRepository.save(student);
    }
    public List<Student> getSudentList(){
        return studentRepository.findAll();
    }

    public Student updateStudent(Student student) {
        return studentRepository.save(student);
    }

    public void deleteStudent(Integer studentId) {
         studentRepository.deleteById(studentId);
    }

    public Student findByStudentEmail(String studentEmail) {
        return studentRepository.findByStudentEmail(studentEmail);
    }


    public Optional<Student> getStudentById(Integer studentId) {
        return studentRepository.findById(studentId);
    }
}
