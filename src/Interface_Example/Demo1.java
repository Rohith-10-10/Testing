package Interface_Example;

public class Demo1 implements Compute {
       @Override
       public void add() {
    	   int num1, num2, res;
    	   num1 = 10;
    	   num2 = 20;
    	   res = num1+num2;
    	   System.out.println("Result for add is "+res);
       }
       @Override
       public void sub() {
    	   int num1, num2, res;
    	   num1 = 20;
    	   num2 = 15;
    	   res = num1-num2;
    	   System.out.println("Result for sub is "+res);
       }
       
}
