package TestPractice;

public class Furniture {
	private String color;
	private String material;
	private double price;
	
	public Furniture() {
		color = "n/a";
		material = "n/a";
		price  = -1;
	}
	public Furniture(String color, String material, double price) {
		this.color = color;
		this.material = material;
		this.price = price;
	}
	@Override
	public String toString() {
		return "color: " + this.color + " material: " + this.material + " price: " + this.price;
	}

}
