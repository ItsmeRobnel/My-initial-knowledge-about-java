import java.util.Scanner;
public class SimpleCalcu {

	static int add(int num1, int num2) {return num1 + num2;}
	static int minus(int num1, int num2) {return num1 - num2;}
	static int times(int num1, int num2) {return num1 * num2;}
	static int divide(int num1, int num2) {return num1 / num2;}

	public static void main(String[] args) {
Scanner sc = new Scanner(System.in);

System.out.print("Enter the First Number: ");
int num1 = sc.nextInt();
System.out.print("Enter the Second Number: ");
int num2 = sc.nextInt();
System.out.println("\nEnter the Operators [+]Add [-] Subtract [x]Multiply  [/] Divide    ");
String menu = sc.next();

switch(menu.charAt(0)){

case '+':
	System.out.println("The Sum of the two numbers is " + add(num1,num2));
	break;
case '-':
	System.out.println("The Difference of the two numbers is " + minus(num1,num2));
	break;
case 'x':
	System.out.println("The Product of the two numbers is " + times(num1,num2));
	break;
case '/':
	System.out.println("The Quotient of the two numbers is " + divide(num1,num2));
	break;
}

	}
}