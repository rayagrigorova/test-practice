package TestPractice;

public class TestClasses {
	public static void main(String[] args) {
		Furniture[]f = new Furniture[3];
		f[0]= new Furniture("red", "cotton", 120.45);
		f[1] = new Chair("blue", "wood", 30.24, 4, true, false);
		f[2] = new Table("clear", "glass", 204.27, "circle", "none", true);
		
		for(int i = 0; i < 3; i++) {
			System.out.println(f[i]);
		}
	}
}
