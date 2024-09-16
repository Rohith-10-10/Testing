package string_concepts;

public class String_methods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String name = "Rohith";
		String name2 = "roHiTh";
		String name3 = "   hi all ";
		System.out.println(name.length());
		System.out.println(name.toUpperCase());
		System.out.println(name.toLowerCase());
		System.out.println(name+name2);
		System.out.println(name.concat(name2));
		System.out.println(name.concat(" ").concat(name2));
	if (name.equalsIgnoreCase(name2)) {	
		System.out.println("data is same");
	}else {
		System.out.println("data is different");
	}
	System.out.println(name.contains("hi"));
	System.out.println(name.replace("ith", "an"));
	// trim() - Removes spaces from prior(left) and after(right) of the string
	System.out.println(name3.trim());
	System.out.println(name.substring(2,5));
	}

}
