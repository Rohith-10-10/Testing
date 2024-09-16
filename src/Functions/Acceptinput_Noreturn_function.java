package Functions;

class calculator {
     void add(int num1, int num2){
    	 int sum;
    	 sum = num1 + num2;
    	 System.out.println("Total is "+sum);
     }

}

public class Acceptinput_Noreturn_function {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		calculator c1 = new calculator();
		c1.add(2, 3);
		
	}

}
