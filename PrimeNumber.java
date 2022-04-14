import java.util.*;

class PrimeNumber {
   public static void main(String arg[]){
    
    System.out.print("Enter any one number = ");
    Scanner obj = new Scanner(System.in);
    int num = obj.nextInt();
    
    if((num==0) || (num==1)){
		System.out.println(num +" This is not a Prime number");
	}
	else if(num%2 == 0){			
				System.out.println(num+" It is a prime number");
			}
			else{
				System.out.println(num+" It is not a prime number");
				}
			
		}
    }


