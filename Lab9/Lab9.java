package Lab102;
import java.util.Scanner;
import java.util.ArrayList;
import java.io.*;


public class Lab9 {
	public static void main(String[] args) throws FileNotFoundException {
		//part1
		printBooks(readBook("Books.txt"));
		
		//part2
		Scanner na = new Scanner(System.in);
		 System.out.println("\nEnter part of author name: ");
		 String name = na.next();
		 System.out.println("Books written by "+name+": ");
		
		 findBooks(readBook("Books.txt"),name);
		 
		 //part3
		 System.out.println("Enter an integer number: ");
		 int numm = na.nextInt();
		 System.out.println("sum of digits of "+numm+" is "+sumDigits(numm));
		 
	}
	
	//part1
	private static ArrayList<Book> readBook(String n) throws FileNotFoundException {
		ArrayList <Book> na = new ArrayList <Book>();
		Scanner sc = new Scanner(new File(n));
		while (sc.hasNext()) {
			String l = sc.nextLine();
			String[] s = l.split(";");
			int y = Integer.parseInt(s[2]);
			int p = Integer.parseInt(s[3]);
			
			Book b = new Book(s[0] , s[1] , y , p);
			na.add(b);
		}
		
		return na;
		
	}
	
	
	private static void printBooks(ArrayList<Book> arr) {
		for (Book i:arr) {
			System.out.print(i);
		}
	}
	
	
	//part2
	private static void findBooks(ArrayList<Book> ar , String a) {
		 ArrayList<Book> nb = new ArrayList<Book>();
	     for (int i = 0;i < ar.size(); i++){
	          String author = ar.get(i).getAuthor();
	          if(author.indexOf(a)!=-1){
	              nb.add(ar.get(i));
	          }
	     }
	     printBooks(nb);
    }
	
	
	//part3
	private static int sumDigits(int num) {
		int sum=0;
		int num2 = num;
		while (num2!=0) {
			sum+=num2%10;
			num2/=10;
			
		}
		return sum;
    }
	
	
}

class Book {
	private String name;
	private String author;
	private int year;
	private int pages;
	
	public Book(String name , String author , int year , int pages) {
		this.name = name;
		this.author = author;
		this.year = year;
		this.pages = pages;
	}
	
	public String getName() {
		return name;
	}
	public String getAuthor() {
		return author;
	}
	public int getYear() {
		return year;
	}
	public int getPages() {
		return pages;
	}
	
	public void set(String author , int pages) {
		this.author = author;
		this.pages = pages;
	}
	
	public String toString() {
		return name +"; " + author+"; " + year+"; " + pages +"p.\n";
	}

}

