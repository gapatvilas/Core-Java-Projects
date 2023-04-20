package numbers;

import java.util.Scanner;

public class LargestNumbers {

	public static void main(String[] args) {
		
		Scanner ac = new Scanner(System.in);
		
		System.out.println("Enter Value of A: ");
		int a =ac.nextInt();
		System.out.println("Enter Value of B: ");
		int b =ac.nextInt();
		System.out.println("Enter Value of C :");
		int c =ac.nextInt();
		
		if(a>b && a>c) {
			System.out.println("Largest Value is a :" +a);
			
		}
		else if (b>a && b>c) {
			System.out.println("Largest Value is b :"+ b);
			
		}
		else {
			System.out.println("Largest Value is c :" + c);
		}
		ac.close();


	}

}
