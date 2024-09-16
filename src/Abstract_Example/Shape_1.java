package Abstract_Example;

public abstract class Shape_1 {
	
	float area;
	abstract void collectinput();
	abstract void calculatearea();
	void display() {
		System.out.println("the area is "+area);
	}

}
