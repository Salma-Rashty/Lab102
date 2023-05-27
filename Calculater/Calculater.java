package test;

import java.util.Scanner;
public class Calculater {
	public static void main(String[] args) {
		
		System.out.println("Welcome to the simple math helper.");
		System.out.println("what would you like to calculate? \n 1.Sqrt \n 2.log \n 3.Factorial ");
		
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		if(num==1) {
			System.out.println("Enter the number to sqrt: ");
			int n1 = sc.nextInt();
			System.out.println(Math.sqrt(n1));
		}
		else if(num==2) {
			System.out.println("Enter the number to log: ");
			int n2 = sc.nextInt();
			System.out.println(Math.log(n2));
		}
		else if(num==3) {
			System.out.println("Enter the number to factorial: ");
			int n3 = sc.nextInt();
			int result=1;
			while(n3!=0) {
				result*=n3;
				n3--;
			}
			System.out.println(result);
		}
		else {
			System.out.println("Error, character not found");
		}
	}
}
