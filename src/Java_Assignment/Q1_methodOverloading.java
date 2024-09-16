package Java_Assignment;
class question_1{
	void add() {
	int a, b, result;
	a = 16;
	b = 14;
	result = a+b;
	System.out.println(result);}
	
	void rule(int a, int b) {
		int sum;
		sum = a+b;
		System.out.println(sum);
	}
	void rule1(int a ,int b, int c) { // number of parameters should be different
		int sub;
		c = 2;
		sub = a+b-c;
		System.out.println(sub);
	}
	void rule2(float a, float b) {  // different data type should be present
		float mul;
		mul = a*b;
		System.out.println(mul);
	}
	void rule3(int a, double b) {  // order of the parameters should be different
		double div;
		div = a/b;
		System.out.println(div);
	}
}
public class Q1_methodOverloading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		question_1 obj = new question_1();
		obj.rule(5, 4);
		obj.rule1(5, 4, 2);
		obj.rule2(2, 5);
		obj.rule3(24, 10.5);
	}

}
