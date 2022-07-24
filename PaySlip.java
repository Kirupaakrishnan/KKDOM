import java.util.Scanner;
import java.lang.String;
class Emp
{
	String name,gender;
	int age;
    int bpay,ded,allow,netpay;
    Scanner obj=new Scanner(System.in);
	void getdata()
	{
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
		obj.close();
		netpay=bpay+allow-ded;
	}
}
public class PaySlip {

	public static void main(String[] args) {
		Emp obj1[]=new Emp[3];
		for(int i=0;i<3;i++)
		{
		  obj1[i].getdata(); 
		}
		for(int i=0;i<3;i++)
		{
			System.out.println("~~~~~~EMPLOYEE PAYSLIP~~~~~~~~");
			System.out.println("Name\t"+"Age\t"+"Gender\t"+"Basic Pay\t"+"Allowances\t"+"Deductions\t"+"Netpay");
			System.out.println(obj1[i].name+"\t"+obj1[i].age+"\t"+obj1[i].gender+"\t"+obj1[i].bpay+"\t\t"+obj1[i].allow+"\t\t"+obj1[i].ded+"\t\t"+obj1[i].netpay);
		}
	}			
}
