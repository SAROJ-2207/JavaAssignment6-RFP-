import java.util.Scanner;

class FibonacciSeriesTest {
	void fibonacciSeries (int num) {
				
		int x =0,y=1,z;
		System.out.println(""+x+""+ "\n"+y);
		for(int i =1;i<=num-2;i++) {
			
			z = x+y;
			System.out.println(z);
			x = y;
			y=z;			
	}
  }
}
public class FibonacciSeries {

	public static void main(String[] args) {
		
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter Any Number:- ");
		int num = obj.nextInt();
		FibonacciSeriesTest cobj = new FibonacciSeriesTest();
		cobj.fibonacciSeries(num);		
		}
		
	}

