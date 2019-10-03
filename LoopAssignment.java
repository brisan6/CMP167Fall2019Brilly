/**
 * 
 * @author B Sanyer
 *
 **/
import java.util.Scanner;
public class LoopAssignment {
	public static void main(String [] args) {
		Scanner in = new Scanner(System.in);
		int number;
		int n;
		number =1;
		
		System.out.println("Lets play a game!");
		System.out.println("enter a value for N: ");
		int N = in.nextInt();
		
		System.out.println("Print all natural numbers from 1 to: ");
		
		while(number < N){
			System.out.printf("%d", number);
		}
		
		
		
	}
	
}
