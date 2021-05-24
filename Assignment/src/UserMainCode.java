import java.util.*;
public class UserMainCode {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int n = sc.nextInt();
		System.out.println("The Sum of square of digits is");
		getvalues(n);
		}
 
	public static void getvalues(int n) {
		int a = n, rem = 0,sum = 0;
		while (a != 0) {
			rem = a % 10;
			sum = sum + (rem * rem);
			a = a / 10;
		}
	
	System.out.println(sum);
	}
}