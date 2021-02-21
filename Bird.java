package TestPractice;

public class Bird implements Moveable, Petable {
	private String name = "Ivanka";
	
	@Override
	public void pet() {
		System.out.println("Pet " + name + " on her head ");		
	}

	@Override
	public void move() {
		System.out.println("Flying...");
		
	}

}
