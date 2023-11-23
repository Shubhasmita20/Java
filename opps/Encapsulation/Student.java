package encapsulation;

public class Student {
	private String name;
	private int rollNo;
	private int age;
	
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}
	public int getRollNo() {
		return rollNo;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getAge() {
		return age;
	}
	
}
