
import java.util.*;

class MarksOutOfBoundException extends Exception{
	MarksOutOfBoundException(String s){
	super(s);
	}
}
class Student {
    void getNameMark() {
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter the name of the Student");
        String name =obj.nextLine();
        System.out.println("Enter marks ");
        try{
            double mark=obj.nextInt();
            if(mark>100)
            throw new MarksOutOfBoundException("Mark can't be greater than 100");
            
            System.out.println(name+" has got "+mark);
        }
        catch(MarksOutOfBoundException e)
        {
            System.out.println(e);
        }
    }
}
public class Q3 {
	public static void main(String[] args) {
		
		 Student s1 = new Student();
		 s1.getNameMark();
		 System.out.println();
		 Student s2 = new Student();
		 s2.getNameMark();
	}
}
/*
OUTPUT:
Enter the name of the Student
RAMESH
Enter marks 
98
RAMESH has got 98.0

Enter the name of the Student
Raju
Enter marks 
130
MarksOutOfBoundException: Mark can't be greater than 100
*/