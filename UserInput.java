package AllPrograms;

import java.util.Scanner;

public class UserInput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Scanner obj = new Scanner(System.in);
	System.out.println("Enter the name:");
	//string Input
	String name=obj.nextLine();
	//Numerical Output
	System.out.println("Enter the age");
	int age=obj.nextInt();
	System.out.println("Enter the Salary:");
	double salary=obj.nextDouble();
	System.out.println("Enter the float value:");
	float f=obj.nextFloat();
	System.out.println("Enter the Short value");
	short s=obj.nextShort();
	System.out.println("Enter the byte value");
	byte b=obj.nextByte();
	System.out.println("Enter the long value");
	long l=obj.nextLong();
	System.out.println("Are you 18 years old (true or false)");
	boolean bn=obj.nextBoolean();
	
	//Output
	System.out.println("Name:"+name);
	System.out.println("Age:"+age);
	System.out.println("Salary:"+salary);
	System.out.println("float value:"+f);
	System.out.println("short value:"+s);
	System.out.println("byte value:"+b);
	System.out.println("long value:"+l);
	System.out.println("Are you 18 years old:"+bn);
	

	
	
	
	
	
	
	}

}
