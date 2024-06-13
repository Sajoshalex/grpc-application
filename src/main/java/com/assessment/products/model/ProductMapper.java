package com.assessment.products.model;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class ProductMapper implements RowMapper<Product> {

	public Product mapRow(ResultSet resultSet, int i) throws SQLException {

		Product product = new Product();
		product.setId(resultSet.getInt("id"));
		product.setName(resultSet.getString("name"));
		product.setStatus(resultSet.getString("status"));		
		return product;
	}
}
