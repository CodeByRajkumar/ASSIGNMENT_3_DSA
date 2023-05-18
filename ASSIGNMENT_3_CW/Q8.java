import java.util.*;
public class Q8 {
	
	 public static void reverseDigits(int num) {
         if (num < 10) {
             System.out.print(num);
         }
         else if(num<0){
        	 System.out.println("Negative number can't be reversble");
         }
         else {
         System.out.print(num % 10);
         reverseDigits(num / 10);
         }
     }
	 public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         
         System.out.print("Write the number thats you want to reverse: ");
         int number =sc.nextInt() ;
         System.out.print("Original number: " + number + "\nReversed number: ");
         reverseDigits(number);
     }
 }