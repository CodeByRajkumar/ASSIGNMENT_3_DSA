import java.util.*;
public class Q01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter your lucky number");
		int n = sc.nextInt();
		try {
			if(n<0) {
				throw new NumberFormatException(":Negative number");
			}
			else {
				System.out.println("Your lucky number is "+n);
			}
			
		}
		catch(NumberFormatException e) {
			System.out.println(e.toString());
			e.printStackTrace();//location
			System.out.println( e.getLocalizedMessage());
			System.out.println(e.getMessage());
			System.out.println(e);
		}
	}

}
/*OUTPUT
Enter your lucky number
-1
java.lang.NumberFormatException: :Negative number
java.lang.NumberFormatException: :Negative number
	at Q01.main(Q01.java:10)
:Negative number
:Negative number
java.lang.NumberFormatException: :Negative number
*/
