package sun.spring.blog.model;

public class Parking {
	int year;
	int month;
	int day;
	String gun_gu;
	int crackdown;
	
	public Parking() {
	}
	
	
	public Parking(int year, int month, int day, String gun_gu, int crackdown) {
		super();
		this.year = year;
		this.month = month;
		this.day = day;
		this.gun_gu = gun_gu;
		this.crackdown = crackdown;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public int getMonth() {
		return month;
	}
	public void setMonth(int month) {
		this.month = month;
	}
	public int getDay() {
		return day;
	}
	public void setDay(int day) {
		this.day = day;
	}
	public String getGun_gu() {
		return gun_gu;
	}
	public void setGun_gu(String gun_gu) {
		this.gun_gu = gun_gu;
	}
	public int getCrackdown() {
		return crackdown;
	}
	public void setCrackdown(int crackdown) {
		this.crackdown = crackdown;
	}
	
	
}
