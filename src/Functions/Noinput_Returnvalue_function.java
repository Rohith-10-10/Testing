package Functions;

class Return{
	int add() {
		int num1, num2, sum;
		num1 = 2;
		num2 = 3;
		sum = num1+num2;
		return sum;
	}
}

public class Noinput_Returnvalue_function {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Return c1 = new Return();
        int res = c1.add();
        System.out.println(res);
	}

}
