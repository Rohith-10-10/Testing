package Java_Assignment;

public class Q2_ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 String original = "it's me Rohith";
	        String reversed = "";

	        // Loop through the string in reverse order and append each character
	        for (int i = original.length() - 1; i >= 0; i--) {
	            reversed += original.charAt(i);
	        }

	        // Output the original and reversed strings
	        System.out.println("Original string: " + original);
	        System.out.println("Reversed string: " + reversed);
	}

}
