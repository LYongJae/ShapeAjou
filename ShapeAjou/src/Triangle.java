public class Triangle extends Shape {
	private double side1;
	private double side2;
	private double side3;

	public Triangle(double a, double b, double c) {
		this.side1 = a;
	    this.side2 = b;
        this.side3 = c;
	}
	
	public double getSide1() {
		return side1;
	}

	public void setSide1(double side1) {
		this.side1 = side1;
	}

	public double getSide2() {
		return side2;
	}

	public void setSide2(double side2) {
		this.side2 = side2;
	}

	public double getSide3() {
		return side3;
	}

	public void setSide3(double side3) {
		this.side3 = side3;
	}

	public double calculateArea() {
		double s = ((side1 + side2 + side3) / 2);

		return Math.sqrt((s - side1) * (s - side2) * (s - side3));
	}

	public double calculatePerimeter() {
        return side1 + side2 + side3;
	}

	public void printInfo() {
        System.out.format("Triangle with an id of " + Triangle.this.getId());
        System.out.format("sides of %f, %f and %f, ", side1, side2, side3);
        System.out.format("area of %f, and ", calculateArea());
        System.out.format("perimeter of %f", calculatePerimeter());
	}


}
