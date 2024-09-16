package concept_oops;

public class Static_Keyword {

	int a = 10;
	static int  b = 20;
	void m1(){
		System.out.println("This is M1");
	}
	static void m2() {
		System.out.println("This is M2");
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(b);
		m2();
		Static_Keyword st = new Static_Keyword();
		System.out.println(st.a);
		st.m1();
	}

}
