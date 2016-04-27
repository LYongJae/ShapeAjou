
abstract public class Shape {
	
	private int id;
	private int temporary;
	
	public Shape() {
		
	}
	
	public abstract double calculateArea();
	
	public abstract double calculatePerimeter();
	
	public abstract void printInfo();

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

}
