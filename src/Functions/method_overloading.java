package Functions;
class Adder{
	void add() {
		int num1, num2, sum;
		num1 = 2;
		num2 = 3;
		sum = num1+num2;
		System.out.println(sum);
	}
	void add(int a, int b) {
		int sum;
		sum = a+b;
		System.out.println(sum);
	}
	void add(float a, float b) {
		float sum;
		sum = a + b;
		System.out.println(sum);
	}
	void add(int a, float b) {
		float sum;
		sum = a+b;
		System.out.println(sum);
	}
	
}

public class method_overloading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Adder c1 = new Adder();
		c1.add();
		c1.add(5,5);
		c1.add(2.5f, 1.5f);
		c1.add(5, 2.5f);
	}

}
