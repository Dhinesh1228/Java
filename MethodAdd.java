package AllPrograms;

import java.util.Scanner;

public class MethodAdd {

	static void addition(int a,int b) {
		int c=a+b;
		System.out.println(a+"+"+b+"="+c);
	}
	

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter two numbers :");
		int a=scan.nextInt();
		int b=scan.nextInt();
		
		addition(a,b);


	}

}
