package Inheritance;
class Bank{
	int getROI() {     // definition or signature or method name
		return 0;
	}
}
class SBI extends Bank{
	int getROI() {
		return 10;
	}
}
class ICICI extends Bank{
	int getROI() {
		return 15;
	}
}
public class Method_Overriding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         SBI sbiobj = new SBI();
         System.out.println(sbiobj.getROI());
         ICICI iciciobj = new ICICI();
         System.out.println(iciciobj.getROI());
         Bank obj =  new Bank();
         System.out.println(obj.getROI());
	}

}
