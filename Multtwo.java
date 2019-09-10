/**
 * @author B Sanyer
 *
 */
import java.util.Scanner;
public class Multtwo {
   public static void main(String[] args) {
	   Scanner input = new Scanner(System.in);
	   //1--Introduce the program
	   System.out.println("Welcome This Program\ngenerates" 
	   + "product of two numbers");
	   //2--Asks the user for the inputs
	   System.out.println("Enter two numbers");
	   //3--Wait for the user's input and store
	   int num1 = input.nextInt();
	   int num2 = input.nextInt();
	   //4--Calculate
	   int result= num1*num2;
	   //5-- Display result
	   System.out.println("Result is "+result);
	   
   }
}
