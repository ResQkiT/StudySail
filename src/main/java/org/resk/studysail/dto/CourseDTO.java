package org.resk.studysail.dto;

import org.resk.studysail.model.Course;

public record CourseDTO(String name, String data) {
    public Course getModel(){
        Course course = new Course();
        course.setCourseName(name);
        course.setSomeData(data);
        return course;
    }
}

