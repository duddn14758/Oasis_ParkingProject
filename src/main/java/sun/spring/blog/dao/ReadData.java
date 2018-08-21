package sun.spring.blog.dao;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import sun.spring.blog.model.Parking;

public class ReadData {
	public ReadData() throws IOException {
		Connection connection = null;
       Statement st = null;
       try {
           Class.forName("com.mysql.jdbc.Driver");
           connection = DriverManager.getConnection("jdbc:mysql://192.168.15.2/bigdata" , "sqoop", "sqoop");
           st = connection.createStatement();

           String sql;
           sql = "insert into store (crackdown" + 
           		"address" + 
           		"time" + 
           		"longitude" + 
           		"latitude" + 
           		"gis_code_0_500" + 
           		"gis_code_94_00" + 
           		"gis_code_124_500" + 
           		"gis_code_100_500" + 
           		"gis_code_1500_500" + 
           		"gis_code_1147_500" + 
           		"gis_code_others_500" + 
           		"building_01_500" + 
           		"building_01_1000" + 
           		"building_01_2000" + 
           		"building_02_500" + 
           		"building_02_1000" + 
           		"building_02_2000" + 
           		"building_03_500" + 
           		"building_03_1000" + 
           		"building_03_2000" + 
           		"building_04_500" + 
           		"building_04_1000" + 
           		"building_04_2000" + 
           		"building_05_500" + 
           		"building_05_1000" + 
           		"building_05_2000" + 
           		"building_06_500" + 
           		"building_06_1000" + 
           		"building_06_2000" + 
           		"building_07_500" + 
           		"building_07_1000" + 
           		"building_07_2000" + 
           		"building_08_500" + 
           		"building_08_1000" + 
           		"building_08_2000" + 
           		"building_09_500" + 
           		"building_09_1000" + 
           		"building_09_2000" + 
           		"building_10_500" + 
           		"building_10_1000" + 
           		"building_10_2000" + 
           		"building_11_500" + 
           		"building_11_1000" + 
           		"building_11_2000" + 
           		"building_12_500" + 
           		"building_12_1000" + 
           		"building_12_2000 varchar(255),\n" + 
           		"building_13_500 varchar(255),\n" + 
           		"building_13_1000 varchar(255),\n" + 
           		"building_13_2000 varchar(255),\n" + 
           		"building_14_500 varchar(255),\n" + 
           		"building_14_1000 varchar(255),\n" + 
           		"building_14_2000 varchar(255),\n" + 
           		"building_15_500 varchar(255),\n" + 
           		"building_15_1000 varchar(255),\n" + 
           		"building_15_2000 varchar(255),\n" + 
           		"building_16_500 varchar(255),\n" + 
           		"building_16_1000 varchar(255),\n" + 
           		"building_16_2000 varchar(255),\n" + 
           		"building_17_500 varchar(255),\n" + 
           		"building_17_1000 varchar(255),\n" + 
           		"building_17_2000 varchar(255),\n" + 
           		"building_18_500 varchar(255),\n" + 
           		"building_18_1000 varchar(255),\n" + 
           		"building_18_2000 varchar(255)\n" + 
           		") values (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
           ResultSet rs = st.executeQuery(sql);
           while (rs.next()) {
               System.out.println("1");
           }

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
		
		String path = "/home/jaemin/data/result_data.csv";
		String csvSplitBy = ",";
		String line;
		BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(path), "utf-8"));
		while((line = br.readLine()) != null) {
			String[] field = line.split(csvSplitBy);
			// parking 총 columns 66개
			Parking park = new Parking(field[0], field[1], field[4], field[5], field[6], 
					field[7], field[8], field[9], field[10], field[11], field[12], field[13], field[14], field[15], 
					field[16], field[17], field[18], field[19], field[20], field[21], field[22], field[23], field[24], 
					field[25], field[26], field[27], field[28], field[29], field[30], field[31], field[32], field[33], 
					field[34], field[35], field[36], field[37], field[38], field[39], field[40], field[41], field[42], 
					field[43], field[44], field[45], field[46], field[47], field[48], field[49], field[50], field[51], 
					field[52], field[53], field[54], field[55], field[56], field[57], field[58], field[59], field[60], 
					field[61], field[62], field[63], field[64], field[65], field[66], field[67] );
			
			
		
		}
		
	}
}
