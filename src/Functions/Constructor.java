package Functions;
class Student{
	String name;
	int age;
	String qualification;
	Student(){       // Constructor
System.out.println("Student Constructor");
	}
	void run() {
		System.out.println("Student is running");
	}
	void Study() {
		System.out.println("Student is studying");
	}

}
public class Constructor {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
         Student s1 = new Student();
         s1.run();
         s1.Study();
	}

}
