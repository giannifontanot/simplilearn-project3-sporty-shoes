package com.javabootcamp.project3.sportyshoes.jdbc;

import com.javabootcamp.project3.sportyshoes.entity.Product;
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
public class ProductDao {
    @Autowired
    JdbcTemplate jdbcTemplate;

    final String SELECT_ALL_PRODUCTS_QUERY = "SELECT * FROM PRODUCTS";
    final String UPDATE_CATEGORY = "UPDATE PRODUCTS SET PRODUCT_CATEGORY = ? WHERE PRODUCT_ID = ?";

    public List<Product> getAllProducts() {
        return jdbcTemplate.query(SELECT_ALL_PRODUCTS_QUERY, new BeanPropertyRowMapper<>(Product.class));
    }

    public int updateCategory(int productId, String category) {
        return jdbcTemplate.update(UPDATE_CATEGORY, category,productId);
    }

//
//    private static final class UserMapper implements RowMapper<User> {
//        public User mapRow(ResultSet rs, int rowNum) throws SQLException {
//            User user = new User();
//            user.setUserId(rs.getInt("USER_ID"));
//            user.setUserName(rs.getString("USER_NAME"));
//            user.setUserPassword(rs.getString("USER_PASSWORD"));
//            return user;
//        }
//    }
}