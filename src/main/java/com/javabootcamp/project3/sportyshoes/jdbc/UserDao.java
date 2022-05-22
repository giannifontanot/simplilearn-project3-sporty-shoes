package com.javabootcamp.project3.sportyshoes.jdbc;

import com.javabootcamp.project3.sportyshoes.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

@Repository
public class UserDao {
    @Autowired
    JdbcTemplate jdbcTemplate;

    final String SELECT_ALL_USERS_QUERY = "SELECT * FROM USERS";
    final String SELECT_USER_BY_ID_QUERY = "SELECT * FROM USERS WHERE USER_ID=?";
    final String SELECT_USER_BY_NAME_QUERY = "SELECT * FROM USERS WHERE USERNAME=?";
    final String SELECT_LOGIN_QUERY = "SELECT * FROM USERS WHERE USERNAME=? and PASSWORD=?";
    final String UPDATE_PASSWORD = "UPDATE USERS SET PASSWORD = ? WHERE USERNAME = ? AND PASSWORD=?";

    public User login(String username, String password) {
        return jdbcTemplate.queryForObject(SELECT_LOGIN_QUERY, new UserMapper(), username,
                password);
    }

    public List<User> getAllUsers() {
        return jdbcTemplate.query(SELECT_ALL_USERS_QUERY, new BeanPropertyRowMapper<>(User.class));
    }

    public String getString() {
        return "This is a string.";
    }

    public User getUserById(String userId) {
        return jdbcTemplate.queryForObject(SELECT_USER_BY_ID_QUERY, new UserMapper(), userId);
    }

    public User getUserByName(String userName) {
        return jdbcTemplate.queryForObject(SELECT_USER_BY_NAME_QUERY, new UserMapper(), userName);
    }

    public int updatePassword(String username, String oldPassword, String newPassword) {
        return jdbcTemplate.update(UPDATE_PASSWORD, newPassword, username, oldPassword);
    }


    private static final class UserMapper implements RowMapper<User> {
        public User mapRow(ResultSet rs, int rowNum) throws SQLException {
            User user = new User();
            user.setUserId(rs.getInt("USER_ID"));
            user.setUsername(rs.getString("USERNAME"));
            user.setPassword(rs.getString("PASSWORD"));
            return user;
        }
    }

}