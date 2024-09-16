package Java_Assignment;

class A{
	void display() {
		System.out.println("This is parent class");
	}
}
class B extends A{
	void show() {
		System.out.println("This is child class");
	}
}
public class Q4_Inheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A obj1 = new A();    //  1 - method of parent class by object of parent class
		obj1.display();
		B obj2 = new B();
		obj2.show();       //  2 - method of child class by object of child class
		obj2.display();    //  3 - method of parent class by object of child class
	}

}
