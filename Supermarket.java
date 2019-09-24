/**
 * 
 * @author B Sanyer
 *
 */
import java.util.Scanner;
public class Supermarket {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String answer;
		double budget;
		
		System.out.println("Welcome to Tina's Supermarket");
		System.out.println("Would you like to see the inventory");
		answer = in.next();
		if(answer.equalsIgnoreCase("yes")) {
			System.out.printf(" 1.%s %n 2.%s %n "
					+ "3.%s", "Pringles", "Prosecco", "Mozzarella Sticks");
			System.out.println("Would you like to buy? 1 2 3 0");
			int choice=in.nextInt();
			switch(choice) {
			case 1:
				System.out.println("You selected Pringles");
				System.out.println("That's $2.99");
				break;
			case 2:
				System.out.println("You selescted Prosecco");
				System.out.println("That's $90.99");
				break;
			case 3:
				System.out.println("Mozzarella Sticks");
				System.out.println("That's $9.99");
				break;
			default:
				System.out.println("OK, Bye, Come back");
			}
			
		}else {
			System.out.println("OK, come back soon");
		}
		
		}

	}
