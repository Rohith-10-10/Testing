package Inheritance;
class X{
	int a;
		void display() {
			System.out.println(a);
	}
}
class Y extends X{
	int b;
	void show() {
		System.out.println(b);
	}
}
class Z extends Y{
	int c;
	  void show() {
		  System.out.println(c);
	  }
}

public class Multilevel_Inheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         Z obj = new Z();
         obj.a = 100;
         obj.b = 200;
         obj.c = 300;
         System.out.println(obj.a);
         System.out.println(obj.b);
         System.out.println(obj.c);
	}

}
