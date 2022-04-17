import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		System.out.print("Enter any one number = ");
	    Scanner obj = new Scanner(System.in);
	    int num = obj.nextInt();
	    int c=0;
	    
	    for(int i=1;i<=num/2;i++) {
	    	if(num%i==0) {
	    		c=c+1;
	    	}
	    }
	    if(c==1) {
	    	System.out.println(num+" is a Prime Number");
	    }else {
	    	System.out.println(num+" is Not a Prime Number");
	    }
	}

}
