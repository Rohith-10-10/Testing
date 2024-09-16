package day_1;

import java.util.Scanner;

public class Arrays_2D {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		int arr[][] = new int[2][2];
		for (int i=0; i<arr.length; i++) {
			for(int j=0;j<arr[i].length; j++) {
				System.out.println("ENTER ith element " +i+ " " +"enter j element " +j+ " ");
				arr[i][j] = scan.nextInt();
			}
		}
		for (int i = 0; i<arr.length; i++ ) {
			for (int j = 0; j<arr.length; j++) {
				System.out.println(arr[i][j]);
			}
		}
	}

}
