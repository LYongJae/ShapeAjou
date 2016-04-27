
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
		for(int i=0; i<height; i++)
		{
			for(int j=0; j<width; j++)
			{
				if(i == 0 || j == 0 || j == width - 1)
					System.out.print("+");
				else if(i > 0 && j == 0 || j == width - 1)
					System.out.print("|");
				else
					System.out.print("-");
			}
			System.out.println();
		}
	}
	
	public void printInfo(){
		//Leader
	}
}
