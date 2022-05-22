package com.javabootcamp.project3.sportyshoes.jdbc;

import com.javabootcamp.project3.sportyshoes.entity.Purchase;
import com.javabootcamp.project3.sportyshoes.entity.Report;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class PurchaseDao {
    @Autowired
    JdbcTemplate jdbcTemplate;

    final String SELECT_ALL_PURCHASES_QUERY = "SELECT * FROM PURCHASES";
    final String SELECT_PURCHASE_BY_DATE_QUERY = "select products.PRODUCT_NAME from purchases, products, BAGS, users\n" +
            "where purchases.USER_ID = users.USER_ID and\n" +
            "      purchases.BAG_ID = bags.BAG_ID and\n" +
            "      bags.PRODUCT_ID = products.PRODUCT_ID and\n" +
            "      PURCHASES.PURCHASE_DATE > ?";

    final String SELECT_PURCHASE_BY_CATEGORY_QUERY = "SELECT PURCHASES.PURCHASE_DATE, USERS.USER_NAME, PRODUCTS" +
            ".PRODUCT_NAME, PRODUCTS.PRODUCT_CATEGORY from purchases, products, BAGS, users\n" +
            "where purchases.USER_ID = users.USER_ID and\n" +
            "      purchases.BAG_ID = bags.BAG_ID and\n" +
            "      bags.PRODUCT_ID = products.PRODUCT_ID and\n" +
            "      PRODUCTS.PRODUCT_CATEGORY = ?";

    public List<Purchase> getAllPurchases() {
        return jdbcTemplate.query(SELECT_ALL_PURCHASES_QUERY, new BeanPropertyRowMapper<>(Purchase.class));
    }

    public List<Report> getPurchaseByDate(String purchaseDate) {
        return jdbcTemplate.query(SELECT_PURCHASE_BY_DATE_QUERY,
                new BeanPropertyRowMapper<>(Report.class),
                purchaseDate);
    }

    public List<Report> getPurchaseByCategory(String category) {
        return jdbcTemplate.query(SELECT_PURCHASE_BY_CATEGORY_QUERY,
                new BeanPropertyRowMapper<>(Report.class),
                category);
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