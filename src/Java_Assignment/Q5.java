package Java_Assignment;
class Member {
    String name;
    int age;
    String phoneNumber;
    String address;
    double salary;

    
    public void printSalary() {
        System.out.println("Salary: " + salary);
    }
}
class Employee extends Member {
   
    String specialization;
}
class Manager extends Member {
    
    String department;
}

public class Q5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee employee = new Employee();
        employee.name = "ROHITH KUMAR";
        employee.age = 21;
        employee.phoneNumber = "9133617159";
        employee.address = "Andhra Pradesh";
        employee.salary = 50000;
        employee.specialization = "Software Testing";

        // Create a Manager object and assign values
        Manager manager = new Manager();
        manager.name = "Michael Scott";
        manager.age = 40;
        manager.phoneNumber = "098-765-4321";
        manager.address = "America";
        manager.salary = 80000;
        manager.department = "IT";

        // Print Employee details
        System.out.println("Employee Details:");
        System.out.println("Name: " + employee.name);
        System.out.println("Age: " + employee.age);
        System.out.println("Phone Number: " + employee.phoneNumber);
        System.out.println("Address: " + employee.address);
        System.out.println("Specialization: " + employee.specialization);
        employee.printSalary();

        // Print Manager details
        System.out.println("\nManager Details:");
        System.out.println("Name: " + manager.name);
        System.out.println("Age: " + manager.age);
        System.out.println("Phone Number: " + manager.phoneNumber);
        System.out.println("Address: " + manager.address);
        System.out.println("Department: " + manager.department);
        manager.printSalary();
    }

	}

