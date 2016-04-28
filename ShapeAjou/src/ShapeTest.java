
public class ShapeTest {

	public ShapeTest(){
		
	}
	
	public void start(){
		Rectangle r = new Rectangle(8,5);	//w=8,h=5
		Circle c = new Circle(5);			//r=5
		Triangle t = new Triangle(3,3,5);	//side 3,3,5
		
		Shape[] aryShape = new Shape[3];
		
		int i = 1;
		
		aryShape[0] = r;	r.setId(i++);
		aryShape[1] = c;	c.setId(i++);
		aryShape[2] = t;	t.setId(i++);
		
		processShape(aryShape[0]);
		processShape(aryShape[1]);
		processShape(aryShape[2]);
	}
	
	public static void main(String[] args) {
		ShapeTest st = new ShapeTest();
		
		st.start();
	}
	
	public void processShape(Shape a){
		a.printInfo();
		if(a instanceof Rectangle){
			((Rectangle) a).drawRectangle();
		}
	}

}
