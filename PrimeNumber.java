import java.util.Scanner;

 class PrimeNumber1 {

		public static void primeNum(int num) {	
			
	    int c=0;
	    
	    for(int i=1;i<=num/2;i++) {
	    	if(num%i==0) {
	    		c=c+1;
	    	}
	    }
	    if(c==1) {
	    	System.out.println(num+" It is a Prime Number");
	    }else {
	    	System.out.println(num+" It is Not a Prime Number");
	    }
	}
 }
		class PrimeNumberTest {
		public static void main(String args[]) {
			
			System.out.print("Enter any one number = ");
		    Scanner obj = new Scanner(System.in);
		    int num = obj.nextInt();
		    PrimeNumber1.primeNum(num);
		}
}