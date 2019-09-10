import java.util.Scanner;

/**
 * @author B Sanyer
 *
 */
import java.util.Scanner;
public class Sum3 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		//1--Introduce the program
		System.out.println("Welcome This Program\ngenerates"
				+"sum of three numbers");
		//2--Asks the user for the inputs
		System.out.println("Enter three numbers");
		//3--Wait for the user's input and store
		int num1 = input.nextInt();
		int num2 = input.nextInt();
		int num3 = input.nextInt();
		//4--Calculate
		int result= num1+num2+num3;
		//5-- Display result
		System.out.println("Result is "+result);
		
	}
}
