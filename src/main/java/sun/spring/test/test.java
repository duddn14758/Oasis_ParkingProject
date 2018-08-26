package sun.spring.test;

import java.sql.*;
import java.util.ArrayList;

public class test {
	static int cnt = 0;
	static int sum = 0;
	static ArrayList<String> idol = new ArrayList<String>();

	public static void main(String[] args) {
		System.out.println("시작");
		Connection connection = null;
		Statement st = null;
		ArrayList<String> gu = new ArrayList<String>();
		ArrayList<String> month = new ArrayList<String>();
		gu.add("중구");
		gu.add("서구");
		gu.add("동구");
		gu.add("영도구");
		gu.add("부산진구");
		gu.add("동래구");
		gu.add("남구");
		gu.add("북구");
		gu.add("해운대구");
		gu.add("사하구");
		gu.add("금정구");
		gu.add("강서구");
		gu.add("연제구");
		gu.add("수영구");
		gu.add("사상구");
		gu.add("기장군");
		month.add("1");
		month.add("2");
		month.add("3");
		month.add("4");
		month.add("5");
		month.add("6");
		month.add("7");
		month.add("8");
		month.add("9");
		month.add("10");
		month.add("11");
		month.add("12");
		try {
			Class.forName("com.mysql.jdbc.Driver");
			connection = DriverManager.getConnection("jdbc:mysql://192.168.15.2/bigdata", "sqoop", "sqoop");
			st = connection.createStatement();
			for (int j = 0; j < gu.size(); j++) {
				for (int k = 0; k < month.size(); k++) {
					String sql = "select * from region_count where year = 2018 and month = " + month.get(k)
							+ " and gun_gu = '" + gu.get(j) + "';";
					ResultSet rs = st.executeQuery(sql);
					cnt = 0;
					sum = 0;
					while (rs.next()) {
						cnt = rs.getInt("count");
						sum += cnt;
					}
					System.out.println(gu.get(j)+" "+ month.get(k)+ "월" + ": " + sum);
					rs.close();
				}
			}
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