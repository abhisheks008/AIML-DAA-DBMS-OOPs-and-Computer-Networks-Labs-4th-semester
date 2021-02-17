// reversing the number

import java.util.*;

public class rev {
	public static void main (String[] args){
		Scanner sc = new Scanner (System.in);
		System.out.print("Enter the number :");
		int x = sc.nextInt();
		int old = x;
		int r, sum=0;
		while (x>0){
			r = x%10;
			x = x/10;
			sum = sum*10 + r;
		}

		System.out.println("Given number was " + old);
		System.out.println("Reversed number is " + sum);
	}
}

// output :
// Enter the number :12345
// Given number was 12345
// Reversed number is 54321
