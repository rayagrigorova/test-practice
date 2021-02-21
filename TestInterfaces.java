package TestPractice;

public class TestInterfaces {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person p = new Person();
		p.whisper();
		p.talk();
		p.scream();
		p.move();
		
		System.out.println();
		Bird b = new Bird();
		b.move();
		b.pet();
	}

}
