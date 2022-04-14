import java.util.*;

public class TemperaturConversion {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter celsius:- ");
		int celsius = sc.nextInt();
		
		double Fahrenheit = (celsius*9/5)+32;
		System.out.print("Celsius To Fahrenheit : - "+Fahrenheit);	
		
		System.out.print("\n=========================== ");
		System.out.print("\nEnter Fahrenheit:- ");
		int fahrenheit1 = sc.nextInt();
		
		double celsius1 = (fahrenheit1 - 32)+5/9;
		System.out.print("Fahrenheit To Celsius : - "+celsius1);	
	}

}
