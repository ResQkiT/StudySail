package org.resk.studysail.controllers;

import org.resk.studysail.dto.CourseDTO;
import org.resk.studysail.model.Course;
import org.resk.studysail.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("StudySail/catalog")
public class CatalogController {
    CourseService courseService;
    @Autowired
    public CatalogController(CourseService courseService) {
        this.courseService = courseService;
    }
    @GetMapping
    public List<Course> getAllCourses(){
        return courseService.getAllCourses();
    }
    @GetMapping("/{id}")
    public Course getCourseById(@PathVariable(name = "id") long id){
        return courseService.getCourse(id);
    }
    @PostMapping
    public Course addCourse(@RequestBody CourseDTO courseModel){
        return courseService.addCourse(courseModel.getModel());
    }

}
