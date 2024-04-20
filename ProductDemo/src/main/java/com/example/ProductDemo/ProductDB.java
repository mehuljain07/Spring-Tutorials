package com.example.ProductDemo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ProductDB {
	
	Connection conn = null;
	
	public ProductDB() {
		try {
			this.conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/telusko", "root", "##Mehul**9");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			throw new RuntimeException(e);
		}
	}

	
	
	public void save(Product p) {
		// TODO Auto-generated method stub
		String query = "insert into product (name, type, place, warranty) values (?, ?, ?, ?)";
		
		try {
			PreparedStatement st = conn.prepareStatement(query);
			st.setString(1, p.getName());
			st.setString(2, p.getType());
			st.setString(3, p.getPlace());
			st.setInt(4, p.getWarranty());
			st.execute();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}



	public List<Product> getAllProducts() {
		// TODO Auto-generated method stub
		List<Product> products = new ArrayList<>();
		String query = "select * from product";
		try {
			PreparedStatement st = conn.prepareStatement(query);
			ResultSet rs = st.executeQuery();
			while(rs.next()) {
				Product p = new Product(rs.getString(2), rs.getString(4), rs.getString(3), rs.getInt(5));
				products.add(p);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return products;
	}
}
