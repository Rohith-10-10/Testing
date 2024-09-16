package Functions;

class Calculator1 {
	void add() { // void is a keyword that doesn't accept any input, returns nothing and add is a method name
		int num1,num2,sum;
		num1 = 2;
		num2 = 3;
		sum = num1 + num2;
		System.out.println("Total is "+sum);
	}
	
}

public class Noinput_Noreturn_Function_ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculator1 c1 = new Calculator1();
        c1.add();
	}

}
