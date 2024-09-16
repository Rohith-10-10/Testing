package day_1;

public class Conditional_statements {
	public static void main(String[] args) {

	/*int a = 2;
	int b = 5;
	if(a>b){
    System.out.println("IT IS TRUE");
    }else { 
    	System.out.println("IT IS FALSE");
    	}*/
		int i =2;
		/*if (i<18) {System.out.println("MINOR");}
		else if(i>=18 && i<60) {System.out.println("ADULT");}
		else {System.out.println("SENIOR CITIZEN");}*/
		switch (i) {
		case 1:{
			System.out.println("it is 1");
			break;
		}case 2:{
			System.out.println("it is 2");
			break;
		}case 3:{
			System.out.println("it is 3");
			break;
		} default: {
			System.out.println("it doesn't belong here");
		}
		}
}
}
