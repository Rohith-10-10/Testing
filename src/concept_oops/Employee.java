package concept_oops;

public class Employee {
//variables
	int empid;
	String ename;
	String ejob;
	int salaries;
//methods
	void display() {
		System.out.println(empid);
		System.out.println(ename);
		System.out.println(ejob);
		System.out.println(salaries);
	
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Employee emp1 = new Employee();
		emp1.empid =  101;
		emp1.ename =  "rohith";
		emp1.ejob =  "Student";
		emp1.salaries =  2000;
		emp1.display();
	}

}
