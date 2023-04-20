import java.util.*;

class LargeNumber 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();

		if(a>b && a>c){

		System.out.println("Largest Value is a :"+ a);
		}
		else if(b>a && b>c){
			System.out.println("Largest value is b :" + b);
		}
		else{
			System.out.println("Largest value is c :" + c);
		}
	}
}
