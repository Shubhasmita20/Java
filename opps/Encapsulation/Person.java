package encapsulation;

public class Person {
	String name;
	private int age;
	private String address;
	
	Person (String name){
		this.name = name;
	}
	
	void setAge(int age) {
		if(age <0) {
			this.age = age;
		}
	}
	int getAge(){
		return age;
	}
	
	void setAddress(String address) {
		this.address = address;
	}
	
	String getAddress() {
		return address;
	}
	
	void personDetails() {
		System.out.println("name: "+name);
	}
	
//	public static void main(String[] args) {
//		Person p = new Person("xyz");
//		System.out.println(personDetails("xyz"));
//	}

}


