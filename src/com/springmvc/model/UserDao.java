package com.springmvc.model;

import org.springframework.dao.DuplicateKeyException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.util.NestedServletException;

import java.util.List;
import java.util.Map;

public class UserDao {

    JdbcTemplate jdbcTemplate;

    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public void register(User user) throws DuplicateKeyException {
        String query="insert into user values('"+user.getFirstName()+"','"+user.getLastName()+"','"+user.getPhoneNumber()+"'," +
                "'"+user.getEmail()+"','"+user.getPassword()+"')";
        jdbcTemplate.update(query);
    }


    public boolean login(String email, String password) {
        String query = "select * from info where email='" +email+ "' and password='"+password+"'";
        List<Map<String, Object>> list = jdbcTemplate.queryForList(query);
        return list.size() == 1;
    }
}
