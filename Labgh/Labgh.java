package Lab102;
import java.util.Scanner;
import java.io.*;
import java.util.Random;

public class Labgh {
	
	
		public static void main (String[] args) throws IOException  {
		
			Scanner kb = new Scanner (System.in);
			// Input file name:
			System.out.print ("Enter file name: ");
			String fileName = kb.nextLine();
			System.out.print ("Enter a number: ");
			int num = kb.nextInt();
			kb.close();

			createFile(fileName, num);
			System.out.println(fileName + " is created.");
		} // end main
		
		private static void createFile(String fname, int num) throws FileNotFoundException  {
		
			// Open file for writing:
			PrintWriter writer = new PrintWriter(fname);
			Random rand = new Random();

			// Write num lines into file:.
			for(int n = 1; n <= num; n++)
			{
//				writer.println (n);
				writer.printf ("%d\n", rand.nextInt(100)+1);
			}
			writer.close();
		}
} // end A_FileWrite_3
