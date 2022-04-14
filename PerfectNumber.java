import java.util.*;

public class PerfectNumber {

	public static void main(String[] args) {
		
		int num,sum=0;
		
		System.out.print("Enter A Number :- " );
		Scanner sc = new Scanner(System.in);
		num = sc.nextInt();
		
		if(num>0) {
			
				for(int i=1; i <= num/2; i++) {
				
					if(num % i == 0) {
					sum = sum + i;
					}
				}
				if(sum == num) {
				System.out.println(num+" Is A Perfect Number");
				} else {
				System.out.println(num+" Is Not A perfect Number");
				}
		}
		else {
			System.out.println("Please Enter Valid Positive Number");
		}		
	}
}
