
public class Rectangle extends Shape{
	private double width;
	private double height;
	
	Rectangle(double w, double h){
		width = w;
		height = h;
	}
	
	public double calculateArea(){
		double result = width*height;
		return result;
	}
	
	public double calculatePerimeter(){
		double result = 2*(width + height);
		return result;
	}
	
	public void drawRectangle(){
		//A
	}
	
	public void printInfo(){
		//Leader
	}
}
