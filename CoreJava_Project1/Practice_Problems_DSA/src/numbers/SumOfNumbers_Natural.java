package numbers;
import java.util.*;

public class SumOfNumbers_Natural {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt();
		int sum=0 ,i=1;
		
		for(i=1;i<=x;++i) {
			sum=sum+i;
			
		}
		System.out.println(sum);
	}

}
