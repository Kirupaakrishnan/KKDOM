import java.util.Scanner;
import java.lang.String;
class Emp
{
	String name,gender;
	int age;
    int bpay,ded,allow,netpay;
	void getdata()
	{
		Scanner obj=new Scanner(System.in);
		System.out.print("Enter the Employee Name:");
		name=obj.next();
		System.out.print("Enter the age:");
		age=obj.nextInt();				
		System.out.print("Enter the gender:");
		gender=obj.next();
		System.out.print("Enter the basic pay:");
		bpay=obj.nextInt();
		System.out.print("Enter the Deductions:");
		ded=obj.nextInt();
		System.out.print("Enter the Allowances:");
		allow=obj.nextInt();
		netpay=bpay+allow-ded;
	}
	void display()
	{
		System.out.println(name+"\t\t"+age+"\t"+gender+"\t"+bpay+"\t\t"+ded+"\t\t"+allow+"\tKIRUP\t"+netpay+"\t");
	}
}
public class PaySlip {

	public static void main(String[] args) {
		Emp obj1[]=new Emp[3];
		for(int i=0;i<3;i++)
		{
			obj1[i]=new Emp();
			obj1[i].getdata(); 
		}
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~Employee Details~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		System.out.println("Name \t\t"+"Age \t"+"Gender \t"+"BasicPay\t"+"Deductions\t"+"Allowances\t"+"Netpay\t");
		for(int i=0;i<3;i++)
		{
			obj1[i].display();
		}
	}			
}
