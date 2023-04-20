package numbers;
import java.util.*;


public class PalindromeNumber {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int num, t, s, rem;
		System.out.println(" Enter any Number ");
		num =sc.nextInt();
		
		t=num;
		for(s=0;num>0; num/=10) {
			rem=num%10;
			s=(s*10)+rem;
			
			
		}
		if(s==t) {
			System.out.println(t+ "is Palindrome Number ");
		}
		else {
			System.out.println(t+ "is not a Palindrome Number");
		}
			

	}

}
