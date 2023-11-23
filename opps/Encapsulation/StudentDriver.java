package encapsulation;

public class StudentDriver {
	public static void main(String[] args) {
		
		Student s = new Student();
		
		s.setName("MAX");
		s.setAge(24);
		s.setRollNo(35);
		
		System.out.println("Name: "+ s.getName());
		System.out.println("Age: "+ s.getAge());
		System.out.println("Rollno: "+ s.getRollNo());
	}
}
