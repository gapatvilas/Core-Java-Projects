package numbers;

import java.util.Scanner;

public class SimpleIntrest {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter P Value :");
	int P =sc.nextInt();
	System.out.println("Enter R Value :");
	int R =sc.nextInt();
	System.out.println("Enter T Value :");
	double T=sc.nextDouble();
	
	double SI = ((P*R*T)/100);
	
	System.out.println("Simple Intrest is :"+SI);
	
	}

}
