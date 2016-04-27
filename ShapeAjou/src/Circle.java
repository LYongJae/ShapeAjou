public class Circle extends Shape {

	private double radius;

	public Circle(double radius) {
		this.radius = radius;
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	public double calculateArea() {
		return radius * radius * Math.PI;
	}

	public double calculatePerimeter() {
		return 2 * radius * Math.PI;
	}

	public void printInfo() {
		System.out.format("Circle with an id of ");
		System.out.format("radius of %f, ", radius);
		System.out.format("area of %f, and ", calculateArea());
		System.out.format("perimeter of %f", calculatePerimeter());
	}

}
