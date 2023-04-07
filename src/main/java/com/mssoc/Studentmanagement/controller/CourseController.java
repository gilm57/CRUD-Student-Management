package com.mssoc.Studentmanagement.controller;

import com.mssoc.Studentmanagement.entity.Course;
import com.mssoc.Studentmanagement.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class CourseController {

    @Autowired
    private CourseService courseService;

    @PostMapping({"/addCourse"})
    public Course addCourse(@RequestBody Course course) {
        return courseService.addCourse(course);
    }
    @GetMapping({"/getCourseList"})
    public List<Course> getCourseList(){
        return courseService.getCourseList();
    }

    @GetMapping({"/getCourseById/{id}"})
    public Course getCourseByID(@PathVariable("id") Integer id){
        return courseService.getCourseByID(id);
    }
    @PutMapping({"/updateCourse"})
    public Course updateCourse(@RequestBody Course course){
        return courseService.updateCourse(course);
    }

    @DeleteMapping({"/deleteCourse/{id}"})
    public String deleteCourse(@PathVariable("id") Integer id){
        courseService.deleteCourse(id);
        return "Course successfully deleted!";
    }
}