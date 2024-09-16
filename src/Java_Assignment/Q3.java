package Java_Assignment;
class Shape{
	void display() {
		System.out.println("This is shape");
	}
}
class Rectangle extends Shape{
	void print() {
		System.out.println("This is rectangular shape");
	}
}
class Circle extends Shape{
	void print2() {
		System.out.println("This is circlular shape");
	}
}
class Square extends Rectangle{
	void show() {
System.out.println("Square is rectangle");
	}
}
public class Q3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Square s1 = new Square();
	//  call the method of 'Shape' and 'Rectangle' class by the object of 'Square' class.
		s1.display();
		s1.print();
	}

}
