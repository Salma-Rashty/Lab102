package Lab102;
import java.util.Scanner;
import java.util.Random;

public class Lab6 {
	public static void main(String[] args) {
		
		//part1 && part2 && part3
		int[] ar = new int[20];
		Random ra = new Random();
		for (int i=0 ; i<ar.length ; i++) {
			ar[i] = ra.nextInt(101);
		}
		
		printArray(ar , reverse(ar) ,  merge4(ar) , merge2(ar));
		
		
		}
		
	
	//part1 method
	private static void printArray(int[] r , int[] r2 , double[] r3 , String[] r4){
        System.out.print("Array: ");
		for (int t:r) {
			System.out.print(t +" ");
		}
		System.out.print("\nOriginal array: ");
		for (int t:r) {
			System.out.print(t +" ");
		}
		System.out.print("\nreversed array: ");
		for (int t:r2) {
			System.out.print(t +" ");
		}
		System.out.print("\nOriginal array: ");
		for (int t:r) {
			System.out.print(t +" ");
		}
		System.out.print("\nDouble array: ");
		for (double t:r3) {
			System.out.print(t +" ");
		}	
		System.out.print("\nOriginal array: ");
		for (int t:r) {
			System.out.print(t +" ");
		}
		System.out.print("\nString array: ");
		for (String t:r4) {
			System.out.print(t +" ");
		}	
		
	}
	
	//part2 method
	private static int[] reverse(int[] n1) {
		int len = n1.length;
		int a = 0;
		int[] ar2 = new int[20];
		for (int j=len-1 ; j>=0 ; j--) {
			ar2[a] = n1[j];
			a++;
		}
		return ar2;
	}
	
	//part3 method
	private static double[] merge4(int[] arr) {
		int len1 = arr.length;
		int n = 0;
		double[] ar3 = new double[len1/4];
		for (int x=0 ; x<=len1-1 ; x+=4) {
			ar3[n] = (arr[x]/Math.pow(10, 0)) + (arr[x+1]/Math.pow(10, 2)) + (arr[x+2]/Math.pow(10, 4)) + (arr[x+3]/Math.pow(10, 6));
			n++;
		}
		return ar3;
	}
	
	
	//part4 method
	private static String[] merge2(int[] a) {
		int len2 = a.length;
		int c = 0;
		String[] ar4 = new String[len2/2];
		for (int z=0 ; z<=len2-1 ; z+=2) {
			String s1 =String.valueOf(a[z]);
			String s2 = String.valueOf(a[z+1]);
			
			if (s1.length() ==1 && s2.length()==1) {
				ar4[c] = "0"+s1+".0"+s2;
			}
			else if (s1.length() ==2 && s2.length()==2) {
				ar4[c] = s1+"."+s2;
			}
			else if (s1.length() ==1 && s2.length()==2) {
				ar4[c] = "0"+s1+"."+s2;
			}
			else if (s1.length() ==2 && s2.length()==1) {
				ar4[c] = s1+".0"+s2;
			}
			c++;
		}
		return ar4;
	}
}
