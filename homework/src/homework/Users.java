package homework;

public class Users {
	int id;
	String name;
	String surname;
	String sex;
	int birtdayYear;
	int age;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSurname() {
		return surname;
	}
	public void setSurname(String surname) {
		this.surname = surname;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public int getAge() {
		System.out.println("Hesaplanan Yaþýnýz: ");
		return (2021 - this.birtdayYear);
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getBirtdayYear() {
		return birtdayYear;
	}
	public void setBirtdayYear(int birtdayYear) {
		this.birtdayYear = birtdayYear;
	}
}
