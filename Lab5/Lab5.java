package Lab102;
import java.util.Scanner;
import java.util.Random;

public class Lab5 {
	public static void main(String[] args) {
		
		//pat1
		Scanner na = new Scanner(System.in);
		System.out.print("Enter first string: ");
		String d = na.next();
		System.out.print("Enter second string: ");
		String f = na.next();
		System.out.println("Mixed string is "+mix(d,f));
		
		
		
		//part2
		System.out.print("Enter first string: ");
		String y = na.next();
		System.out.print("Enter second string: ");
		String y2 = na.next();
		System.out.println("Common string is: "+common(y,y2));
		
		
		//part3
		System.out.print("Enter the length of b: ");
		double b = na.nextDouble();
		System.out.print("Enter the length of c: ");
		double c = na.nextDouble();
		System.out.printf("length of hypotenuse is : %.3f",hypotenuse(b,c));
		
		
		System.out.println("");
		//part4
		Random nb = new Random();
		System.out.print("How many numbers to find: ");
		int num = na.nextInt();
		System.out.print("Maximum number: ");
		int random = na.nextInt();
		
		System.out.print("Results are ");
		while (num>0) {
			int rand = nb.nextInt(random)+1;
			System.out.print(rand+" ");
			num--;
		}
		
	}
	
	//part1 method
	private static String mix(String n1 , String n2){
		int s1 = n1.length()-1;
		int s2 = n2.length()-1;
		int d1 = s1;
		int d2 = s2;
		String r = "";
		
		if (s1>s2) {
			for (int i=0; i<=s1; i++) {
				if (i==d2) {
					r+=n1.charAt(i);
				}
				else {
					r+= n1.charAt(i);
					r+= n2.charAt(i);
				}
				
			}
		}	
		else {
			for (int j=0; j<=s2; j++) {
				if (j==d1) {
					r+=n2.charAt(j);
				}
				else {
					r+= n1.charAt(j);
					r+= n2.charAt(j);	
				}
			}
		}
		return r;
	}
	
	
	
	//part2 method 
	private static String common(String k1 , String k2){
		
		String a3 = "";
		int l1 = k1.length()-1;
		int l2 = k2.length()-1;
		if (l1>l2) {
			for (int x=0 ; x<=l1 ; x++) {
				char a1=k1.charAt(x);
				String v1=Character.toString(a1);
				if(k2.contains(v1)) {
					if(a3.contains(v1)) {
						continue;
					}
					else {
						a3+=k1.charAt(x);
					}
				}
				else {
					continue;
				}
			}
		}
		else {
			for (int x=0 ; x<=l2 ; x++) {
				char a2=k2.charAt(x);
				String v2=Character.toString(a2);
				if(k1.contains(v2)) {
					if(a3.contains(v2)) {
						continue;
					}
					else {
						a3+=k2.charAt(x);
					}
				}
				else {
					continue;
				}
			}
		}
		return a3;
	}

	
	//part3 method
	private static double hypotenuse(double g1 , double g2) {
		double a =Math.sqrt(Math.pow(g1,2)+Math.pow(g2, 2));
		return a;
		 
	}
}

 