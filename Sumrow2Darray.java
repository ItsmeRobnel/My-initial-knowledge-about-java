import java.util.*;
public class Sumrow2Darray {

	public static void main(String[] args) {
	    Scanner value = new Scanner(System.in) ;
            int row_size =3;
            int col_size=3;
            int sum;
           int matrix[][] =new int[row_size][col_size];
            
            int i,j;
            //inputting elements
            System.out.println("Enter the Matrix Element:");
            for(i=0;i<row_size;i++)
            {
                for(j=0;j<col_size;j++)
                {
                    matrix[i][j]=value.nextInt();
                }
            }
            
           
           

            for(i=0;i<row_size;i++)
           { sum = 0;
            for(j=0;j<col_size;j++)
                {
                    sum += matrix[i][j];
                     System.out.print(matrix[i][j]+" ");
                }
               System.out.println("= "+sum);
           }
 }
		
	  }
		
		

	


