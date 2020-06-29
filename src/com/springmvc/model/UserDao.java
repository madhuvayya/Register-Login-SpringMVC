package com.springmvc.model;

import org.springframework.jdbc.core.JdbcTemplate;

public class UserDao {

    JdbcTemplate jdbcTemplate;

    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public void register(User user){
        String query="insert into user values('"+user.getFirstName()+"','"+user.getLastName()+"','"+user.getPhoneNumber()+"'," +
                "'"+user.getEmail()+"','"+user.getPassword()+"')";
        jdbcTemplate.update(query);
    }


}
