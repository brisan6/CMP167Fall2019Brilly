
/**
 * 
 * @author B Sanyer
 * @description This program checks the user age and see if user can drink alcohol
 **/
import java.util.Scanner;

public class week4p1 {
	public static void main(String[] args) {
		int age;
		String name;
		String option = "cant";
		Scanner in = new Scanner(System.in);
		
		System.out.println("This program will check if you are legal to drink alcohol");
		
		//input
		System.out.println("Enter your name : ");
		name = in.next();
		System.out.printf("OK %s, Enter your age? " , name);
		age = in.nextInt();
		
		//logic
		if(age>=21) {
			option ="can";
		}
		
		//output
		System.out.printf("You %s drink alcohol" , option);
	}
}
