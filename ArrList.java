import java.util.ArrayList;
import java.util.Scanner;

public class ArrList {

	public static void main(String[] args) {
		 ArrayList<String> student=new ArrayList<String>();
	        Scanner input = new Scanner(System.in); 
	        String arname=" ";
	        String ans=" ";
	        String a=" ";
	        
	        //Storing value to student arraylist
	         
	          do
	          {
	             System.out.println("Enter student name ");
	             arname=input.next();
	             student.add(arname); 
	             
	             System.out.println("Do you want to input again ");
	             ans=input.next();
	             arname=" ";
	          }while(ans.charAt(0) != 'n');
	          
	          
	          System.out.println("The array list has the values of: ");
	          student.forEach((n) -> System.out.println(n));
	        
	          
	          //////////////////////////////
	          System.out.println("Using the for loop to display the content of the arraylist");
	          for (int i = 0; i<student.size(); i++)
	          {
	              System.out.println(student.get(i));
	          }
	          ///////////////////////////
	          System.out.println("Using the foreach loop to display the content of the arraylist");
	          for(String idx: student)
	          {
	            System.out.println(idx);
	          }
	        
	}
	

}
