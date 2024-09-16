package Abstract_Example;

import java.util.Scanner;

public class Square extends Shape_1{
	float length;
	@Override
	void collectinput() {
	Scanner scan = new Scanner(System.in);
	System.out.println("enter Length");
	length = scan.nextFloat();
	}

    @Override
    void calculatearea() {
    	area = length*length;
    }
    }

