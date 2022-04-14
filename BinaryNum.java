import java.util.*;

class DecToBinary {
    
     void decToBinary(int n)  {
        int[] binaryNum = new int[1000];
          
        int i = 0;
        while (n > 0) {
            binaryNum[i] = n % 2;
            n = n / 2;
            i++;
        }
         for (int j = i - 1; j >= 0; j--)
         System.out.print(""+binaryNum[j]);
    }
}       
public class BinaryNum {

	public static void main(String[] args) {
	 
	  Scanner input = new Scanner(System.in);	
      System.out.print("Enter Decimal number:- ");
      int dnum = input.nextInt();
      DecToBinary obj = new DecToBinary();
      obj.decToBinary(dnum);     
	}
}