package Exception_Handling;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Multiple_Exception_Handling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			int arr[] = new int[5];
			Scanner scan = new Scanner(System.in);
			System.out.println("Enter value of a:");
			int a = scan.nextInt();
			System.out.println("Enter value of b:");
			int b = scan.nextInt();
			int c = a/b;
			System.out.println("Enter value of a:"+c);
			System.out.println("Enter value of array");
				int index = scan.nextInt();
				arr[index] = 5;
	 } catch (ArithmeticException e) {
		 System.out.println("This code has arithmetic error");
	 } catch (InputMismatchException e) {
		 System.out.println("This code has wrong input type");
	 } catch (ArrayIndexOutOfBoundsException e) {
		 System.out.println("This code has error in array index");
	 } catch (Exception e) {
		 System.out.println("This code is executed");
	 }
	}

}
