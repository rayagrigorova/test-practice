package TestPractice;

public class Table extends Furniture {
	private String shape;
	private String tableclothColor;
	private boolean isCleaned;
	
	public Table() {
		shape = "n/a";
		tableclothColor = "n/a";
		isCleaned = false;
		
	}
	public Table(String color, String material, double price, String shape, String tableclothColor, boolean isCleaned) {
		super(color, material, price);
		this.shape = shape;
		this.tableclothColor = tableclothColor ;
		this.isCleaned = isCleaned;
	}
	@Override
	public String toString() {
		return super.toString() + " shape: " + this.shape + " tablecloth color: " + this.tableclothColor + " cleaned: " + 
		((this.isCleaned == true) ? "yes" : "no");
	}
}
