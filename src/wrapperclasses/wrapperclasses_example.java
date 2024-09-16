package wrapperclasses;

public class wrapperclasses_example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         //converting string to int
		String s = "welcome"; //can't be converted to int
		String s1 = "10";
		String s2 = "20";
		System.out.println(Integer.parseInt(s1)+Integer.parseInt(s2));
		//converting string to double
		String s3 = "10.25";
		String s4 = "20.50";
		System.out.println(Double.parseDouble(s3)+Double.parseDouble(s4));
		//converting string to boolean
		String s5 = "true"; //other than true, if you pass any string, it returns false
		System.out.println(Boolean.parseBoolean(s5));
	}

}
