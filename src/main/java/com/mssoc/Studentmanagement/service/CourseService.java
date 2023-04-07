package com.mssoc.Studentmanagement.service;

import com.mssoc.Studentmanagement.entity.Course;
import com.mssoc.Studentmanagement.repository.CourseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.criteria.CriteriaBuilder;
import java.util.List;
import java.util.Optional;

@Service
public class CourseService {

    @Autowired
    private CourseRepository courseRepository;

    public Course addCourse(Course course) {
        return courseRepository.save(course);
    }

    public List<Course> getCourseList() {
        return courseRepository.findAll();
    }

    public Course getCourseByID(Integer id) {
        return courseRepository.findById(id).get();
    }

    public Course updateCourse(Course course) {
        return courseRepository.save(course);
    }
    public void deleteCourse(Integer id){
         courseRepository.deleteById(id);
    }
}
