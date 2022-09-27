import java.util.ArrayList;
import java.util.*;

public class Practice {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<String> list = new ArrayList<String>();
		String ans = "";
		do {
			
			System.out.print("Enter a name: ");
			String name = sc.next();
			list.add(name);
			if (list.get(0).equals("Apple")) {
				System.out.println("This is my Favorite!" + list.get(0));
			}
			System.out.println("Do you want to enter a name again?: [y][n]");
			ans = sc.next();
		} while (!ans.equals("n"));
		System.out.println(list);

	}
}
