package Lab102;
import java.util.Scanner;

public class Lab3 {
	public static void main(String[] args) {
		
		
		//part1
		Scanner na = new Scanner(System.in);
		System.out.print("Enter first number : ");
		int n1 = na.nextInt();
		System.out.print("Enter second number : ");
		int n2 = na.nextInt();
		
		for (int j=10 ; j<=100 ; j++) {
			if (j%n1==0 || j%n2==0) {
				System.out.print(j+" ");
			}
			else {
				continue;
			}	
		}
		System.out.println("");
		
		
		
		//part2
		System.out.println("Enter a number: ");
		int num = na.nextInt();
		int num2 = 0;
		while(num!=0) {
			num2=num%10;
			if (num2!=1) {
				System.out.print(num2);
			}
			else if (num2==1) {
				System.out.print("*");
			}
			num/=10;
		}
		
		
		
		
		//part3
		System.out.println(" ");
		System.out.println("Enter a year: ");
		int z1 = na.nextInt();
		
		if (leap(z1)==true) {
			System.out.println(z1+" is a leap year.");
		}
		else if (leap(z1)==false) {
			System.out.println(z1+" is not a leap year. ");
		}
		
		
		
		
		//part4
		System.out.print("Enter first number: ");
		int a1 = na.nextInt();
		System.out.print("Enter second number: ");
		int a2 = na.nextInt();
		
		int gcd = gcd(a1 , a2);
		System.out.println("GCD is "+gcd);
		
		
		
		//part4 2
		System.out.println("dgh");
		int first = na.nextInt();
		System.out.println("dgh 2");
		int second = na.nextInt();
		System.out.println("GCD is "+ GCD(first, second));
		
	}
	
	
	//part3
	private static boolean leap(int n) {
		boolean prime = true;
		if (n%4==0) {
			prime = true;
			
		}
		else if (n%4!=0) {
			prime = false;
			
		}
		return prime;
	}
	
	
	//part4
	private static int gcd(int x1 , int x2) {
		int n5 = 0 ;
		for (int i=x1 ; i>0 ; i--) {
			if (x1%i==0 && x2%i==0) {
				n5=i;
				break;	
			}
		}
		return n5;	
	}
	
	
	//part4 2
	private static int GCD(int first, int second) {
		if (first==0) {
			return second;
		}
		else if (second==0) {
			return first;
		}
		else if (first<second) {
			return GCD(first, second%first);
		}
		return GCD(second, first%second);
	}
	
	
	
}
