package com.mssoc.Studentmanagement.repository;

import com.mssoc.Studentmanagement.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends JpaRepository<Student, Integer> {
   public Student findByStudentEmail(String studentEmail);
}
