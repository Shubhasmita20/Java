package encapsulation;

public class Area {
	int length;
	int bredth;
	
	Area(int length, int bredth){
		this.length = length;
		this.bredth = bredth;
	}

	public void getArea() {
		int area = length * bredth;
		System.out.println("Area: "+ area);
	}
}
