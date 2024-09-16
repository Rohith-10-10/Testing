package Abstract_Example;

import java.util.Scanner;

public class Circle extends Shape_1 {
	float radius;
	@Override
	void collectinput() {
	Scanner scan = new Scanner(System.in);
	System.out.println("enter radius");
	radius = scan.nextFloat();
	}

    @Override
    void calculatearea() {
    	area = 3.14f*radius*radius;
    }
    }
    
