package com.springmvc.model;

import org.springframework.jdbc.core.JdbcTemplate;

import java.util.List;
import java.util.Map;

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


    public boolean login(String email, String password) {
        String query = "select * from info where email='" +email+ "' and password='"+password+"'";
        List<Map<String, Object>> list = jdbcTemplate.queryForList(query);
        if( list.size() == 1 )
            return true;
        return false;
    }
}
