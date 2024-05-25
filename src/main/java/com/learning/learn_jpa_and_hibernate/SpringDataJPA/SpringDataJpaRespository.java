package com.learning.learn_jpa_and_hibernate.SpringDataJPA;

import com.learning.learn_jpa_and_hibernate.Course;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface SpringDataJpaRespository extends JpaRepository<Course, Long> {

    List<Course> findByAuthor(String author);
    List<Course> findByName(String name);
}
