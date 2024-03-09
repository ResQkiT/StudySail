package org.resk.studysail.controllers;

import org.resk.studysail.dto.CourseDTO;
import org.resk.studysail.model.Course;
import org.resk.studysail.model.User;
import org.resk.studysail.repository.UserRepository;
import org.resk.studysail.service.CourseService;
import org.resk.studysail.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("StudySail/catalog")
public class CatalogController {
    CourseService courseService;
    UserService userService;
    @Autowired
    public CatalogController(CourseService courseService, UserService userService) {
        this.courseService = courseService;
        this.userService = userService;
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
    @DeleteMapping("/{id}")
    public void deleteCourse(@PathVariable(name = "id") Long id){courseService.deleteCourse(id);}
    @PostMapping("/{id}/assign")
    public Course assignUser(@PathVariable(name = "id") Long courseId , @RequestParam(name = "userId") Long userId){
        User user = userService.getUser(userId);
        Course course = courseService.getCourse(courseId);
        course.getUsers().add(user);
        user.getCourses().add(course);
        return courseService.save(course);
    }

}
