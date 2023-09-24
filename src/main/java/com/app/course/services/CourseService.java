package com.app.course.services;

import com.app.course.course.Course;
import com.app.course.model.CourseResponse;

import java.util.List;

public interface CourseService {

    public List<Course> getCourses();

    public Course getCourse(long courseId);

    public Course create(Course course);

    public Course updateCourse(Course course);

    public CourseResponse delete(long courseId);
}
