package firstpgm;

import java.util.Scanner;

public class Swap {

	public static void main(String[] args) {
		
		{
			int x, y, t;
			Scanner scanner = new Scanner(System.in);
			 System.out.println("Enter the value of x and y");
			x = scanner.nextInt();
			y = scanner.nextInt();
			System.out.println("before Swapping numbers:" + x +"  "+y);
			
			t = x;
			x = y;
			y = t;
			System.out.println("After Swapping numbers:" + x +" "+y);
			scanner.close();
		}

	}

}
