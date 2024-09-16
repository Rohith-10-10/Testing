package day_1;

import java.util.Scanner;

public class Jagged_arrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Scanner scan = new Scanner(System.in);
     int arr[][] = new int[3][];
      arr[0] = new int[1];
      arr[1] = new int[2];
      arr[2] = new int[3];
      for (int i=0; i<arr.length; i++) {
    	  for(int j=0; j<arr[i].length; j++) {
    		  System.out.println("enter ith element "+i+" enter jth element "+j);
    		  arr[i][j] = scan.nextInt();
    		 
    	  }
      }
      for (int i=0; i<arr.length; i++) {
    	  for (int j=0; j<arr[i].length; j++) {
    		  System.out.println(arr[i][j]);
    	  }
      }
	}

}
