package Abstract_Example;

public class ApplicationShape {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println("calculating area of the circle ");
Circle cr = new Circle();
cr.collectinput();
cr.calculatearea();
cr.display();
Square sq = new Square();
sq.collectinput();
sq.calculatearea();
sq.display();
	}

}
