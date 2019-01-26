package com.lynda.javatraining.db.tables;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.NumberFormat;

public class Tours {
	public static void displayData(ResultSet rs) throws SQLException {
		while (rs.next()) {
			StringBuffer buffer = new StringBuffer();
			buffer.append("Tour " + rs.getInt("tourid") + ":");
			buffer.append(rs.getString("tourName"));
			Double price = rs.getDouble("price");
			NumberFormat format = NumberFormat.getCurrencyInstance();
			String formatPrice = format.format(price);
			buffer.append("with price of  " + formatPrice);
			System.out.println(buffer.toString());
		}
	}

}
