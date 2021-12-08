package Looping;

import java.util.Scanner;

public class Sum_even {

	public static void main(String[] args) {
		{
			int i=1, Sum = 0;
			Scanner scan = new Scanner(System.in);
			System.out.print(" Please Enter any Number : ");
			int num = scan.nextInt();	
			
			while(i<= num) {
				if(i % 2 == 0) {
					Sum = Sum + i;
				}
				i++;
			}
			
			System.out.print("Sum " + Sum);
		}
 
	}
}
