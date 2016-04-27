public class Circle extends Shape {

	private double radius;

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	public double calculateArea() {
		return radius * radius;
	}

	public double calculatePerimeter() {
		return 2;
	}

	public void printinfo() {

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
