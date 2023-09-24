package com.app.course.controller;

import com.app.course.course.Course;
import com.app.course.model.CourseResponse;
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

    @CrossOrigin(origins = "http://localhost:3000")
    @GetMapping("/courses")
    public List<Course> getAllCourse(){
        return courseService.getCourses();
    }

    @CrossOrigin(origins = "http://localhost:3000")
    @DeleteMapping("/courses/{courseId}")
    public CourseResponse delete(@PathVariable long courseId){
        return courseService.delete(courseId);
    }

    @CrossOrigin(origins = "http://localhost:3000")
    @PostMapping("/courses")
    public Course createCourse(@RequestBody Course course){
        return courseService.create(course);
    }

    @CrossOrigin(origins = "http://localhost:3000")
    @PutMapping("/courses")
    public Course updateCourse(@RequestBody Course course){
        return courseService.updateCourse(course);
    }
}
