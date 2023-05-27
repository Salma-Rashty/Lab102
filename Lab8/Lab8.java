package Lab102;
import java.util.Scanner;
import java.io.*;


public class Lab8 {
	public static void main(String[] args) throws FileNotFoundException {
		//part1
		System.out.println("There are "+countNums("Lab08.txt")+" numbers in the file. ");
		
		//part2
		System.out.println("\nArray: ");
		double[] arra = readNums("Lab08.txt",countNums("Lab08.txt"));
		printArray(arra);
		
		//part3
		double[] a = arra;
		bubbleSort(a);
		System.out.println("\nArray in descending order: ");
		printArray(a);
		
		//part4
		System.out.println("\nMaximum = "+ a[0]);
		System.out.println("Minimum = "+ a[countNums("Lab08.txt")-1]);
		System.out.printf("Average = %.4f",average(a));
		
	}
	
	
	private static void printArray(double[] arr) {
		for(int i =0 ; i<arr.length ; i++) {
			if (i%10!=0) {
				System.out.print(arr[i]+" ");
			}
			else {
				System.out.println();
			}
		}
		System.out.println();
	}
	
	
	//part1 method
	private static int countNums(String na ) throws FileNotFoundException {
		Scanner n = new Scanner(new File(na));
		int count = 0;
		while(n.hasNext()) {
			double f = n.nextDouble();
			count ++;
		}
		return count;
	}
	
	
	//part2 method
	private static double[] readNums(String name , int n) throws FileNotFoundException {
		double[] arr = new double[n];
		int c = 0;
		Scanner a = new Scanner(new File(name));
		while(a.hasNext()) {
			Double num = a.nextDouble();
			arr[c] = num;
			c++;
		}
		return arr;
	}
	//part3 method
	private static void bubbleSort(double[] arr) {
		for (int i=0 ; i<arr.length-1 ; i++) {
			for (int j=0 ; j<arr.length-i-1 ; j++) {
				if(arr[j]<arr[j+1]) {
					double temp = arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
	}
	//part4 method
	private static double average(double[] ar) {
		double sum = 0;
		int count = 0;
		for (int i=0 ; i<=ar.length-1 ; i++) {
			sum += ar[i];
			count++;
		}
		return sum/count;
	}

	
}
