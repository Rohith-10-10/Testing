package Exception_Handling;

import java.util.Scanner;

public class Example1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 try {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter value of a:");
		int a = scan.nextInt();
		System.out.println("Enter value of b:");
		int b = scan.nextInt();
		int c = a/b;
		System.out.println("Enter value of a:"+c);
 } catch (Exception e) {
	 System.out.println("This code is executed");
 }
	}

}
