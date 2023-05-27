package Lab102;
import java.util.ArrayList;
import java.util.Scanner;
import java.io.*;

public class Lab7 {
	public static void main(String[] args) throws FileNotFoundException {
		//part1
		ArrayList<Integer> arList = readNums("Lab07.txt");
		System.out.println("there are "+arList.size()+" numbers in the file.");
		System.out.print("numbers: ");
		printList(arList);
		
		
		//part2
		System.out.println("\n");
		System.out.print("Unique numbers: ");
		printList(unique(arList));
		
		//part3
		System.out.println("\n");
		System.out.println("Reversed unique numbers: ");
		printList(reverseAl(unique(arList)));
		
		//part4
		int c1 = 0;
		int c2 = 0;
		int most = 0;
		for (int i=0 ; i<arList.size() ; i++) {
			for (int j=0 ; j<arList.size() ; j++) {
				if (arList.get(i)==arList.get(j)) {
					c1++;
					if (c1>c2) {
						
						c2=c1;
						most = arList.get(i);
					}
				}	
			}
		}
		System.out.println("The number that repeats most is "+most+" and it repeats "+c2+" times.");
		
	}
	
	
	//part1 method
		private static ArrayList<Integer> readNums(String a) throws FileNotFoundException {
			ArrayList<Integer> list = new ArrayList<Integer>();
			Scanner f = new Scanner(new File(a));
			while(f.hasNext()) {
				int num = f.nextInt();
				list.add(num);
			}
			f.close();
			return list;
		}
		
		private static void printList(ArrayList n) {
			for (int i=0 ; i<n.size() ; i++) {
			
				if (i%10==0) {
					System.out.println();
				
				}
				else {
					System.out.print(n.get(i)+" ");
				}
			}
		}
	
		//part2 method 
		private static ArrayList<Integer> unique(ArrayList<Integer> s){
			ArrayList<Integer> ar = new ArrayList<Integer>();
			ArrayList<Integer> s2 = s;
			int an = 0;
			int a = 0;
			for (int j=0 ; j<s.size() ; j++) {
				an = s.get(j);
				s2.remove(s2.get(j+a));
				a++;
				if (s2.contains(an)) {
					continue;
				}
				else {
					ar.add(an);
				}
			}
			return ar;
		}
		
		//part3 method
		private static ArrayList<Integer> reverseAl(ArrayList<Integer> x){
			ArrayList<Integer> arr = new ArrayList<Integer>();
			for (int y=x.size()-1 ; y>=0 ; y-- ) {
				arr.add(x.get(y));
			}
			return arr;
		}
		
	
}