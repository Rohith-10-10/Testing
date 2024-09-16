package Functions;
class value{
	int add(int num1, int num2) {
		int sum;
		sum = num1 + num2;
		return sum;
	}
}

public class Acceptinput_Returnvalue_function {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		value c1 = new value();
		int res = c1.add(7,3);
		System.out.println(res);
	}

}
