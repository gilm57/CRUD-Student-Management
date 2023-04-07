package com.mssoc.Studentmanagement.entity;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
public class Student {

    @Id
    @GeneratedValue( strategy = GenerationType.AUTO)
    private Integer studentId;

    @Column(name ="student_first_name",length = 45, nullable =false)
    private String studentFirstName;

    @Column(name ="student_last_name",length = 45, nullable =false)
    private String studentLastName;

    @Column(name = "student_email",length = 128,nullable = false, unique= true)
    private String studentEmail;

    @Column(length = 128,nullable = false, unique= true)
    private String guardianName;

    @Column(length = 45, nullable =false)
    private String guardianMobile;

}
