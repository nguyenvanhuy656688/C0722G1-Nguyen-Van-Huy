package com.case_study.model.user;

import com.case_study.model.employee.Employee;
import jakarta.persistence.*;

import java.util.Set;

@Entity
public class User {
    @Id
    private String username;
    private String password;

    @ManyToMany
    @JoinTable(name = "user_role", joinColumns = @JoinColumn(name = "user_username"), inverseJoinColumns = @JoinColumn(name = "role_id"))
    private Set<Role> likedCourses;


    public User() {
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Set<Role> getLikedCourses() {
        return likedCourses;
    }

    public void setLikedCourses(Set<Role> likedCourses) {
        this.likedCourses = likedCourses;
    }
}
