package com.mssoc.Studentmanagement.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.Cascade;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Course {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer courseId;

    private Double coursePrice;

    @Column(length = 128,nullable = false)
    private String courseTitle;

    @Column(length = 128,nullable = false)
        private String courseUrl;

    @ManyToOne(
            cascade = CascadeType.ALL
    )
    @JoinColumn(
            name = "instructor_map_course",
            referencedColumnName = "instructorId"
    )
    private Instructor instructor;

    @ManyToMany(
            cascade = CascadeType.ALL
    )
    @JoinTable(
            name = "student_map_course",
            joinColumns = @JoinColumn(
                    name ="course_id",
            referencedColumnName = "courseId"
    ),
            inverseJoinColumns = @JoinColumn(
                    name = "student_id",
                    referencedColumnName = "studentId"
            )

    )
    private List<Student> studentList;
}
