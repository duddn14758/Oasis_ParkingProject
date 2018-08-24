package sun.spring.test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import sun.spring.blog.model.Parking;

public class SqlConnection {
	ArrayList<Parking> parking_list = new ArrayList<Parking>();

	public SqlConnection() {
		Connection connection = null;
		Statement st = null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			connection = DriverManager.getConnection("jdbc:mysql://192.168.15.2/bigdata", "sqoop", "sqoop");
			st = connection.createStatement();
			String sql = "select * from region_count;";
			ResultSet rs = st.executeQuery(sql);
			while (rs.next()) {
				Parking park = new Parking();
				park.setCrackdown(rs.getInt("count"));
				park.setDay(rs.getInt("day"));
				park.setGun_gu(rs.getString("gun_gu"));
				park.setMonth(rs.getInt("month"));
				park.setYear(rs.getInt("year"));
				parking_list.add(park);
			}
			for (int i = 0; i < parking_list.size(); i++)
				System.out.println(parking_list.get(i));
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

	public ArrayList<Parking> getParking_list() {
		return parking_list;
	}

	public void setParking_list(ArrayList<Parking> parking_list) {
		this.parking_list = parking_list;
	}

	public int listyear(int i) {
		return parking_list.get(i).getYear();
	}

	public int listmonth(int i) {
		return parking_list.get(i).getMonth();
	}

	public int listday(int i) {
		return parking_list.get(i).getDay();
	}

	public String listgungu(int i) {
		return parking_list.get(i).getGun_gu();
	}

	public int listcrackdown(int i) {
		return parking_list.get(i).getCrackdown();
	}
	public int size() {
		return parking_list.size();
	}

}
