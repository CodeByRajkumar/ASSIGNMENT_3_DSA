import java.util.*;
public class RQ10 {
	public static String reverse(String s) {
        if (s.isEmpty()) 
            return s;
        
            return reverse(s.substring(1)) + s.charAt(0);
    }
	
	public static void main(String[] args) {
		
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string:");
        String s = sc.nextLine();
        String reversed = reverse(s);
        System.out.println("Reversed string: " + reversed);
    }	    
}
/*
String.isEmpty():

Returns true if, and only if, length() is 0.

Specified by: isEmpty() in CharSequence
Returns:true if length() is 0, otherwise falseSince
*/
