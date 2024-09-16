package Inheritance;

class A{
	int a = 100;
	void display() {
		System.out.println(a);
	}
}
class B extends A{
	int b = 200;
	void print() {
		System.out.println(b);
	}
}

public class Single_Inheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         B obj = new B();
         obj.display();
         obj.print();
         System.out.println(obj.a);
         System.out.println(obj.b);
	}

}
