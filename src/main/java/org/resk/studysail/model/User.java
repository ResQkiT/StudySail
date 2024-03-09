package org.resk.studysail.model;
import jakarta.persistence.*;

import java.util.List;
import java.util.Objects;
import java.util.Set;

@Entity
@Table(name = "users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long ID;
    @Column(name = "username")
    private String name;
    @Column(name = "email")
    private String email;

    @ManyToMany(mappedBy = "users")
    private Set<Course> courses;

    public Set<Course> getCourses() {
        return courses;
    }

    public void setCourses(Set<Course> courses) {
        this.courses = courses;
    }

    public User() {}

    public User(Long ID, String name, String email) {
        this.ID = ID;
        this.name = name;
        this.email = email;

    }

    public Long getID() {
        return ID;
    }

    public void setID(Long ID) {
        this.ID = ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        User user = (User) object;
        return Objects.equals(ID, user.ID) && Objects.equals(name, user.name) && Objects.equals(email, user.email) && Objects.equals(courses, user.courses);
    }

    @Override
    public int hashCode() {
        return Objects.hash(ID, name, email, courses);
    }
}
