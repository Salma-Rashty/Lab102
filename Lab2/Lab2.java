package Lab102;
import java.util.Scanner;
public class Lab2 {
	public static void main(String[] args) {
		
		//part1
		Scanner na = new Scanner(System.in);
		System.out.print("Enter first number : ");
		int s1 = na.nextInt();
		
		System.out.print("Enter second number : ");
		int s2 = na.nextInt();
		
		System.out.print("Enter operation : ");
		String s3 = na.next();
		
		if (s3.equals("+")) {
			int z1 = s1 + s2;
			System.out.println("Result is "+ z1);
		}
		else if (s3.equals("-")) {
			int z2 = s1 - s2;
			System.out.println("Result is "+ z2);
		}
		else if (s3.equals("*")) {
			int z3 = s1 * s2;
			System.out.println("Result is "+ z3);
		}
		else if (s3.equals("/")) {
			int z4 = s1 / s2;
			System.out.println("Result is "+ z4);
		}
		else {
			System.out.println("Error 404, you must enter one of this operator (+, -, *, / )");
		}
		
		
		
		//part2
		System.out.print("Enter a number : ");
		int d1 = na.nextInt();
		int d2 = 1;
		int d3 = d1;
		
		while (d1>1) {
			d2*=d1;
			d1--;
		}
		System.out.println(d3+"! = "+d2);
		
		
		
		//part3
		System.out.print("Enter a number : ");
		int n = na.nextInt();
		int max = 0;
		int count = 1;
		int b1 = n;
		
		while(n>1) {
			if (n%2==0) {
				count++;
				System.out.print(n+" ");
				n/=2;
				
				if (n>max) {
					max=n;
				}
			}
			else if (n%2!=0) {
				count++;
				System.out.print(n+" ");
				n=n*3+1;
				
				if (n>max) {
					max=n;
				}		
			}
		}
		System.out.println(" ");
		System.out.println("Maximum number: "+max);
		System.out.println("Collatz sequence starting with "+b1+" has "+count+" numbers.");
		
		
		
		//part4
		double sum = 0;
		int count1 = 0;
		
		while (true) {
			System.out.print("Enter a number :");
			double m = na.nextDouble();
			if (m==0) {
				break;
			}
			else if (m<60 && m>0) {
				sum+=m;
				count1+=1;
			}
			else if (m>60) {
				continue;
			}
		}
		System.out.println("average is "+(sum/count1));
		
	}

}
