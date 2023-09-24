package com.app.course.model;



public class CourseResponse {
    private String message;

    public CourseResponse() {
    }

    public CourseResponse(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
