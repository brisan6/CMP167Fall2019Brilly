import java.util.Scanner;

/**
 * 
 * @author B Sanyer
 *
 */
import java.util.Scanner;
public class Minusfive {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		//1--Introduce the program
		System.out.println("Welcome This Program\ngenerates"
				+ "difference of five number");
		//2--Asks the user for the inputs
		System.out.println("Enter five numbers");
		//3--Wait for the user's input and store
		int num1 = input.nextInt();
		int num2 = input.nextInt();
		int num3 = input.nextInt();
		int num4 = input.nextInt();
		int num5 = input.nextInt();
		//4-- Calculate
		int result= num5-num4-num3-num2-num1;
		//Display result
		System.out.println("Result is "+result);
		
				
	}

}
