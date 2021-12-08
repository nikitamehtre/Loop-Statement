package Looping;

import java.util.Scanner;

public class a_z {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*		char smallalpabets, capitalaplpabets;
		 
	      for( smallalpabets = 'a' ; smallalpabets <= 'z' ; smallalpabets++ )
	         System.out.print(smallalpabets);
	      
	      System.out.println("----------------");
	      
	      for( capitalaplpabets = 'A' ; capitalaplpabets <= 'Z' ; capitalaplpabets++ )
		         System.out.print(capitalaplpabets);
	*/    
		Scanner s1 = new Scanner(System.in);
		char ch = 'a', ch1 = 'A';
		do {
			System.out.println(ch + " "+ ch1);
			ch++;
			ch1++;
			}while(ch <= 'z');
		}

	}

