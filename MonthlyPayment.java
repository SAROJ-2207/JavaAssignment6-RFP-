import java.util.Scanner;

public class MonthlyPayment {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Principal Amount:- ");
		int p = sc.nextInt();
		
		System.out.print("Enter Year:- ");
		int y = sc.nextInt();
		
		System.out.print("Enter Interest Amount :- ");
		double r = sc.nextDouble();
		int  r = R/(12*100);
		System.out.print(" Rate of Interest:- "+r);
		int n = 12*y;
		
	
		double payment= (p * r) / (1 - Math.pow(1 + r, -n));
		payment= Math.round(payment* 100) / 100;
		
		System.out.println("Payment :- "+payment);
	}
}