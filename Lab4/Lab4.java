package Lab102;
import java.util.Scanner;

public class Lab4 {
	public static void main(String[] args) {
		
		
		//part1
		Scanner na = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int e = na.nextInt();
		System.out.println(convertBinary(e));
		
		
		
		
		//part2
		System.out.print("Enter a sentence: ");
		String se= na.next();
		int len = se.length();
		
		for (int i=len-1 ; i>=0 ; i--) {
			if (Character.isLetterOrDigit(se.charAt(i))) {
				System.out.print(se.charAt(i));
			}
			else {
				continue;
			}
		}
		System.out.println(" ");
		
		
		
		
		//part3
		System.out.print("Enter a string: ");
		String st = na.next();
		System.out.print("Enter substring: ");
		String sn = na.next();
		String s1 = sn;
		int count = 0;
		int y = 0;
		int len1 = sn.length();
		
		while (y!=-1) {
			y=st.indexOf(sn,y);
			if (y!=-1) {
				count++;
				y+=len1;
			}
		}
	    System.out.println(s1+" has occured "+ count +" times.");
	    
	    
	    
		
		//paret4
	    System.out.print("Enter a string: ");
	    String v = na.next();
	    System.out.println("sum is "+sumDigits(v));
	}
	
	//part4
	private static int sumDigits(String s) {
		int sum = 0;
		int n5 = 0;
		int len2 = s.length();
		boolean h = true;
		for (int z=0 ; z<=len2 ; z++) {
			if (Character.isDigit(s.charAt(z))) {
				h = true;
				sum+= (int)s.charAt(z);
			}
			else {
				h = false;
			}
		}
		if (h= true) {
			n5 = sum;
		}
		else {
			n5 = 0;
		}
		return n5;
	}
	
	
	
	//part1
	private static String convertBinary(int n) {
		String x = "";
		while(n>0) {
			int b = n%2;
			x = b + "" + x;
			n/=2;
		}
		return x;
		
	}

}
