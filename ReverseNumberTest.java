import java.util.*;

class ReverseNumber {
	static void reverseNum (int num){
		int i,rem,rev=0;
		for(i = num;i!=0;i=i/10) {
			rem=i%10;
			rev=(rev*10)+rem;
	}
		System.out.println(num+" After Reversing  "+rev);
  }
}
class ReverseNumberTest {
	
	public static void main(String arg[]){
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Any Number:- ");
		int num = sc.nextInt();
		ReverseNumber.reverseNum(num);
	}
}
