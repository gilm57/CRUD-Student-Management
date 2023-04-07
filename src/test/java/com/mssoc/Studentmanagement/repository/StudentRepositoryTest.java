package com.mssoc.Studentmanagement.repository;

import com.mssoc.Studentmanagement.entity.Student;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.annotation.Rollback;

@DataJpaTest
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
@Rollback(false)
class StudentRepositoryTest {

    @Autowired
    private StudentRepository studentRepository;

    @Test
    public void  saveStudentTest(){
        Guardian guardian = Guardian.builder()
                .firstName("Kris")
                .lastName("Santos")
                .email("krisan@gmail.com")
                .mobile("123456789")
                .build();

        Student student= Student.builder()

                .studentFirstName("Eric")
                .studentLastName("Santos")
                .studentEmail("esantos@gmail.com")
                .guardian(guardian)
                .build();

        studentRepository.save(student);
    }


}