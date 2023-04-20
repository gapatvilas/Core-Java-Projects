package numbers;

import java.util.Scanner;

public class N_LargestNumber {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int i,n,large;
	
	System.out.println("Enter The Total Elements");
	n = sc.nextInt();
	System.out.println("Enter the Elements :");
	int [] a= new int[n];
	for(i=0;i<n;i++) {
		a[i] =sc.nextInt();
		
	}
	large =a[0];
	for(i=1;i<n;i++) {
		if(large<a[i]) {
			large =a[i];
		}
	}
	System.out.println("The Total Elements " +n+ "In this array largest element " +large);
	
	}
}
