package arraywithhconstr;

public class Circle extends Shape {

	private int radius;

	private static final float PI = 3.14f;

	public  Circle() {

	}

	public Circle (int radius) {

		this.radius = radius;
	}

	public int getRadius() {
		return radius;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}

	public void area() { // OVERRIDE AREA METHOD OF SHAPE CLASS

		double cArea = PI * radius * radius;
		System.out.println("Circle Area: " + cArea);

	}
}