package Interface_Example;

public class Demo2 implements Compute {
	@Override
    public void add() {
 	   float num1, num2, res;
 	   num1 = 10.20f;
 	   num2 = 20.20f;
 	   res = num1+num2;
 	   System.out.println("Result for add is "+res);
    }
    @Override
    public void sub() {
 	   float num1, num2, res;
 	   num1 = 20.50f;
 	   num2 = 15.25f;
 	   res = num1-num2;
 	   System.out.println("Result for sub is "+res);
    }
    
}


