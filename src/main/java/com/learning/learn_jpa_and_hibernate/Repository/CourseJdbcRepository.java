package com.learning.learn_jpa_and_hibernate.Repository;

import com.learning.learn_jpa_and_hibernate.Course;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class CourseJdbcRepository {

    @Autowired
    private JdbcTemplate springJdbcTemplate;

    private static String INSERT_QUERY =
            """
             insert into course (id,name,author) 
             values(? , ? , ?) ;       
                    """;

    private static String Delete_Query =
            """
                    delete from course where id = ? ;
                    """;

    private static String Select_Query =
            """
                    select * from course
                    where id = ? ; 
                    """;

    public void insert(Course course){
        springJdbcTemplate.update(INSERT_QUERY,course.getId(),course.getName(),course.getAuthor());
    }

    public void deleteById(long id){
        springJdbcTemplate.update(Delete_Query,id);
    }

    public Course findById(long id){
        return springJdbcTemplate.queryForObject(Select_Query,new BeanPropertyRowMapper<>(Course.class),id);
        //ResultSet -> Bean =>Row Mapper =>
    }

}
