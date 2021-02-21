package TestPractice;

public class Chair extends Furniture {
	private int numberOfLegs;
	private boolean hasBackrest;
	private boolean isAdjustable;
	
	public Chair() {
		numberOfLegs = -1;
		hasBackrest = false;
		isAdjustable = false;
	}
	public Chair(String color, String material, double price, int numberOfLegs, boolean hasBackrest, boolean isAdjustable) {
		super(color, material, price);
		this.numberOfLegs = numberOfLegs;
		this.hasBackrest = hasBackrest;
		this.isAdjustable = isAdjustable;
	}
	@Override
	public String toString() {
		return super.toString() + " number of legs: " + this.numberOfLegs + " has backrest: " + 
				 ((hasBackrest == true) ? "yes" : "no") + " is adjustable: " + 
				((isAdjustable == true) ? "yes" : "no");
	}
}