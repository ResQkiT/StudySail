package org.resk.studysail.service;

import org.resk.studysail.model.User;
import org.resk.studysail.repository.CourseRepository;
import org.resk.studysail.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    private CourseRepository courseRepository;
    private UserRepository userRepository;
    @Autowired
    public UserService(CourseRepository courseRepository, UserRepository userRepository){
        this.courseRepository = courseRepository;
        this.userRepository = userRepository;
    }
    public User getUser(long id){
        return userRepository.findById(id).orElseThrow();
    }
    public List<User> getAllUsers(){
        return userRepository.findAll();
    }
    public User createUser(User user){
        return userRepository.save(user);
    }
    public void deleteUser(Long id){
        userRepository.deleteById(id);
    }

}
