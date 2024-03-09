package org.resk.studysail.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;

import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.SplittableRandom;

@Entity
public class Course {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;
    private String courseName;
    @Column(name = "data")
    private String someData;
    @ManyToMany
    private Set<User> users;
    public Course(){}

    public Set<User> getUsers() {
        return users;
    }

    public void setUsers(Set<User> users) {
        this.users = users;
    }

    public Course(Long id, String courseName, String someData) {
        this.id = id;
        this.courseName = courseName;
        this.someData = someData;
    }
    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getSomeData() {
        return someData;
    }

    public void setSomeData(String someData) {
        this.someData = someData;
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        Course course = (Course) object;
        return Objects.equals(id, course.id) && Objects.equals(courseName, course.courseName) && Objects.equals(someData, course.someData) && Objects.equals(users, course.users);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, courseName, someData, users);
    }
}
