import java.util.Scanner;

public class MaxMatrix {

	public static void main(String[] args) {
		int i,j,row = 0,col = 0;
		int biggest = Integer.MIN_VALUE;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the rows of the 2d array:");
		row=sc.nextInt();
		
		System.out.print("Enter the columns of the 2d array:");
		col = sc.nextInt();
		
		int [][]Array = new int[row][col];
		
		System.out.println("\nEnter the values of each Element");
		for (i = 0 ;i<row;i++) {
			for(j=0;j<col;j++) {
				Array[i][j] = sc.nextInt();
			}
		}
		System.out.println("\nThe values of each element in the array are:");
		for (i = 0 ;i<row;i++) {
			for(j=0;j<col;j++) {
				System.out.print(Array[i][j] + " " );
			}System.out.println();
		}
		for (i = 0 ;i<row;i++) {
			for(j=0;j<col;j++) {
				if(Array[i][j]>=biggest)
					biggest=Array[i][j];
			}
		}
		System.out.print("\nThe biggest element on the matix is: " +biggest);

	}

}
