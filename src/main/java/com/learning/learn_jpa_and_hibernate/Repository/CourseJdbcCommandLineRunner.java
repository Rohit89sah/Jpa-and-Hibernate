package com.learning.learn_jpa_and_hibernate.Repository;

import com.learning.learn_jpa_and_hibernate.Course;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

/*
@Component
public class CourseJdbcCommandLineRunner implements CommandLineRunner {

    @Autowired
    private CourseJdbcRepository repository;

    @Override
    public void run(String... args) throws Exception {
        repository.insert(new Course(1,"Android","Vandu"));
        repository.insert(new Course(2,"Kotlin","Vandu"));
        repository.insert(new Course(3,"Java","Vandu"));

        repository.deleteById(2);

        System.out.println(repository.findById(1));
        System.out.println(repository.findById(3));
    }
}

 */
