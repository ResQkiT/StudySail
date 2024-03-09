package org.resk.studysail.service;

import org.resk.studysail.model.Course;
import org.resk.studysail.repository.CourseRepository;
import org.resk.studysail.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CourseService {
    private CourseRepository courseRepository;
    private UserRepository userRepository;
    @Autowired
    public CourseService(CourseRepository courseRepository, UserRepository userRepository){
        this.courseRepository = courseRepository;
        this.userRepository = userRepository;
    }
    public Course getCourse(long id){
        return courseRepository.findById(id).orElseThrow();
    }
    public List<Course> getAllCourses(){
        return courseRepository.findAll();
    }
    public Course addCourse(Course course){
        return courseRepository.save(course);
    }
    public void deleteCourse(Long id){courseRepository.deleteById(id);}
    public Course save(Course course){
        return  courseRepository.save(course);
    }
}
