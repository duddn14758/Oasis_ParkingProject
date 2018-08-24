package sun.spring.test;

import java.sql.*;
import java.util.ArrayList;

public class test {
	static int cnt = 0;
	static ArrayList<String> idol = new ArrayList<String>();
	public static void main(String[] args) {
		System.out.println("시작");
		Connection connection = null;
		Statement st = null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			connection = DriverManager.getConnection("jdbc:mysql://192.168.15.2/bigdata", "sqoop", "sqoop");
			st = connection.createStatement();
			String count = "";
			String sql = "select * from region_count;"; 
			ResultSet rs = st.executeQuery(sql);
			while (rs.next()) {
				count = rs.getString("gun_gu");
				idol.add(count);
			}
			for(int i = 0; i<idol.size(); i++)
				System.out.println(idol.get(i));
			rs.close();
			st.close();
			connection.close();
		} catch (SQLException se1) {
			se1.printStackTrace();
		} catch (Exception ex) {
			ex.printStackTrace();
		} finally {
			try {
				if (st != null)
					st.close();
			} catch (SQLException se2) {
			}
			try {
				if (connection != null)
					connection.close();
			} catch (SQLException se) {
				se.printStackTrace();
			}
		}
	}
}