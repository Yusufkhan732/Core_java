package constructor;

public class Shape {
	
	private String colour;
	
	private int borderWidth;
	
	public Shape() {
		
		System.out.println("Default Constructor");
		
	}
	
	public Shape(String colour, int borderWidth) {
		
		System.out.println("2 param constructor");
		this.colour = colour;
		this.borderWidth = borderWidth;
		
	}
	public void setColor(String color) {
		this.colour = color;
	}

	public String getColor() {
		return colour;
	}

	public void setBorderWidth(int borderWidth) {
		this.borderWidth = borderWidth;
	}

	public int getBorderWidth() {
		return borderWidth;
	}
	
}