package AllPrograms;

import java.util.Scanner;

public class Operator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//operator +,-,*,%--remainder,/--Quotient
		//operator--a+b,+ perform the task and returns the value
		//operand--a,b--just a variable to store the value
       int first, second, add, subract, multiply;
       float divide;
       Scanner sc = new Scanner(System.in);
       System.out.print("Enter two Numbers : ");
       first = sc.nextInt();
       second = sc.nextInt();
       
       add = first + second;
       subract = first - second;
       multiply = first * second;
       divide = first / second;
       
       System.out.println("Sum = " + add);
       System.out.println("Difference = " + subract);
       System.out.println("Multiplication = " + multiply);
       System.out.println("Division = " + divide);
       
       
       
       
       
	
	}

}
