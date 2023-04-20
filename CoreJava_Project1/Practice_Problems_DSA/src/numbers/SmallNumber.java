package numbers;

import java.util.Scanner;

public class SmallNumber {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Value of x :");
		
		int x = sc.nextInt();
		System.out.println("Enetr Value of y :");
		
		int y = sc.nextInt();
		System.out.println("Enter Value of z :");
		
		float z =sc.nextFloat();
		
		
		if (x<y && x<z) {
			System.out.println("Small Value is x :"+x);
			
		}
		else if (y<x && y<z) {
			System.out.print("Small Value is y :" +y);
		}
		else {
			System.out.print("Small Value is z :" +z);
		}
		sc.close();
	}

}
