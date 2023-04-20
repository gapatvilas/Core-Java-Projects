package assignments;
import java.util.*; 
public class SingleNo_Positive_Negative {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		
		int A=sc.nextInt();
		
		if(A>=1) {
			System.out.println("Given Value is Positive");
			
		}
		else if(A<0) {
			System.out.println("Given Value is Negative");
		}
		else {
			System.out.println("Given Value is Zero");
		}

	}

}
