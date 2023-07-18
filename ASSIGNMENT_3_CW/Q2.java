import java.util.*;

import javax.swing.plaf.synth.SynthOptionPaneUI;
public class Q2 {
	public static void main(String[] args) {
		
		String s[] = new String[4];
		Scanner sc =  new Scanner(System.in);
		try {
			System.out.println("Enter the four colous");
			for (int i=0;i<s.length;i++) {
				s[i]=sc.next();
				
			}
			System.out.println("Convert string to integer");
			Integer.parseInt(s[0]);
			throw new NumberFormatException();
		}
		catch(NumberFormatException e){
			System.out.println(e.toString());
		}
		
		try {
			System.out.println("Enter one more colour");
			s[4]=sc.next();
			throw new ArrayIndexOutOfBoundsException("Index "+ 5 +" out of bounds for length 4()");
		
		}
		catch(ArrayIndexOutOfBoundsException f){
			System.out.println(f.toString());
		}
		System.out.println("The colours entered are");
		for(int i=0;i<s.length;i++) {
			System.out.println(s[i]);
		}
	}

}
/*OUTPUT:
Enter the four colous
RED
BLUE
YELLOW
GREEN
Convert string to integer
java.lang.NumberFormatException: For input string: "RED"
Enter one more colour
VIOLET
java.lang.ArrayIndexOutOfBoundsException: Index 4 out of bounds for length 4
The colours entered are
RED
BLUE
YELLOW
GREEN
*/
