package com.app.course.controller;

import com.app.course.course.Course;
import com.app.course.services.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class MyController {

    @Autowired
    private CourseService courseService;

    @GetMapping("/test")
    public String test(){
        return "Test ..";
    }

    @GetMapping("/courses")
    public List<Course> getAllCourse(){
        return courseService.getCourses();
    }

    @GetMapping("/courses/{courseId}")
    public Course getAllCourse(@PathVariable long courseId){
        return courseService.getCourse(courseId);
    }

    @PostMapping("/courses")
    public Course createCourse(@RequestBody Course course){
        return courseService.create(course);
    }

    @PutMapping("/courses")
    public Course updateCourse(@RequestBody Course course){
        return courseService.updateCourse(course);
    }
}
