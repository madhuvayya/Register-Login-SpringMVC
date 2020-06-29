package model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;

public class UserDao {

    @Autowired
    JdbcTemplate jdbcTemplate;

    public void register(User user){
        String query="insert into user values('"+user.getFirstName()+"','"+user.getLastName()+"','"+user.getPhoneNumber()+"'," +
                "'"+user.getEmail()+"','"+user.getPassword()+"')";
        jdbcTemplate.update(query);
    }

    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }
}
