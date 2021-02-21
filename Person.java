package TestPractice;

import java.util.Arrays;

public class Person implements Talk, Moveable {
	String name = "Peter";
	
	public String introduction() {
		return "my name is " + name;
	}
	@Override
	public void talk() {
		char[] temp = Arrays.copyOf(phrase, phrase.length);
		temp[0] = 'H';
		System.out.println(String.valueOf(temp) + ", " + introduction());
		
	}

	@Override
	public void scream() {
		char[] temp = Arrays.copyOf(phrase, phrase.length);
		for(int i = 0; i < phrase.length; i++) {
			temp[i] -= 32;
		}
		System.out.println(String.valueOf(temp) + ", " + introduction().toUpperCase());
	}

	@Override
	public void whisper() {
		System.out.println(String.valueOf(phrase) + ", " + introduction().toLowerCase());
	}
	
	@Override
	public void move() {
		System.out.println("Walking...");
	}

}
