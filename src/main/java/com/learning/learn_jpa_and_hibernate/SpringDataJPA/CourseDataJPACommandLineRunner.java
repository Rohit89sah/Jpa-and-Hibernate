package com.learning.learn_jpa_and_hibernate.SpringDataJPA;

import com.learning.learn_jpa_and_hibernate.Course;
import com.learning.learn_jpa_and_hibernate.Repository.CourseJdbcRepository;
import com.learning.learn_jpa_and_hibernate.SpringDataJPA.SpringDataJpaRespository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class CourseDataJPACommandLineRunner implements CommandLineRunner {
    @Autowired
    private SpringDataJpaRespository repository;

    @Override
    public void run(String... args) throws Exception {
        repository.save(new Course(1,"Android JPA","Vandu"));
        repository.save(new Course(2,"Kotlin","Vandu"));
        repository.save(new Course(3,"Java","Vandu"));

        repository.deleteById(2l);

        System.out.println(repository.findById(1l));
        System.out.println(repository.findById(3l));
        System.out.println(repository.findAll());

        System.out.println(repository.findByAuthor("vandu"));

    }
}
