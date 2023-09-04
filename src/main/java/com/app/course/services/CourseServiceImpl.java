package com.app.course.services;

import com.app.course.course.Course;
import com.app.course.repository.CourseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class CourseServiceImpl implements CourseService{

    List<Course> list;

    @Autowired
    private CourseRepository courseRepository;

    public CourseServiceImpl(){
        list = new ArrayList<>();
        list.add(new Course(101L,"Java Course","This course is good"));
        list.add(new Course(102L,"Python Course","This course is good"));
    }
    @Override
    public List<Course> getCourses() {
        return courseRepository.findAll();
    }

    @Override
    public Course getCourse(long courseId) {
        Optional<Course> courseOptional = courseRepository.findById(courseId);
        if(courseOptional.isPresent()){
            return courseOptional.get();
        }
        return null;
    }

    @Override
    public Course create(Course course) {
        return courseRepository.save(course);
    }

    @Override
    public Course updateCourse(Course course) {
        return courseRepository.save(course);
    }
}
