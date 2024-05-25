package com.learning.learn_jpa_and_hibernate.CourseJpa;

import com.learning.learn_jpa_and_hibernate.Course;
import com.learning.learn_jpa_and_hibernate.Repository.CourseJdbcRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class CourseJpaCommandLineRunner implements CommandLineRunner {
    @Autowired
    private CourseJpaRepository repository;

    @Override
    public void run(String... args) throws Exception {
        repository.insert(new Course(1,"Android JPA","Vandu"));
        repository.insert(new Course(2,"Kotlin","Vandu"));
        repository.insert(new Course(3,"Java","Vandu"));

        repository.deleteById(2);

        System.out.println(repository.findById(1));
        System.out.println(repository.findById(3));
    }
}
