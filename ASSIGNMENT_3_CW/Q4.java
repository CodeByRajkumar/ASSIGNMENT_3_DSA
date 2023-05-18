
import java.util.*;
public class Q4 {
	
	 public static <E> void printArray(E[] inputArray) {
		 
	        for (int i=0;i<inputArray.length;i++) 
	             System.out.print(inputArray[i]+"  ");
	        System.out.println();
	    }
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		//For integer
        Integer[] intarr = new Integer[5];
        System.out.println("Enter array elements:");
        for (int i = 0; i < 5; i++) 
            intarr[i] = sc.nextInt();
        System.out.print("Integer Array contains:\n");
        printArray(intarr);
        //For double
        System.out.println("Enter array elements:");
        Double[] douarr = new Double[5];
        for (int i = 0; i < 5; i++) 
             douarr[i] = sc.nextDouble();
        System.out.print("Double Array contains:\n");
        printArray(douarr);        
       
	}
}
/*
OUTPUT:
Enter array elements:
1
2
3
4
5
Integer Array contains:
1  2  3  4  5  
Enter array elements:
1.2
2.3
3.4
4.5
5.6
Double Array contains:
1.2  2.3  3.4  4.5  5.6  
*/