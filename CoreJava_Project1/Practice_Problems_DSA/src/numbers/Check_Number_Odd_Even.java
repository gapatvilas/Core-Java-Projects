package numbers;
import java.util.*;
public class Check_Number_Odd_Even {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A =sc.nextInt();
		
		if(A%2==0) {
			System.out.println("Number is Even");
		}
		else {
			System.out.println("Number is Odd");
		}
	}

}
