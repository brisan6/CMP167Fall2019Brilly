
/**
 * 
 * @author B Sanyer
 *
 */
import java.util.Random;
import java.util.Scanner;

public class MegaMillionp2 {
	public static void main(String[] args) {
		Random randGen= new Random();
		//int rnum1=randGen.nextInt();
		Scanner input = new Scanner(System.in);
		
		double cost = 2;
		
		System.out.println("Enter the amount of dollars you will bet ");
		
		double amount= input.nextDouble();
		
		System.out.println("Enter six numbers");
		int num1 = input.nextInt();
		int num2 = input.nextInt();
		int num3 = input.nextInt();
		int num4 = input.nextInt();
		int num5 = input.nextInt();
		int num6 = input.nextInt();
		
		int rnum1= randGen.nextInt(60)+1;
		int rnum2= randGen.nextInt(60)+1;
		int rnum3= randGen.nextInt(60)+1;
		int rnum4= randGen.nextInt(60)+1;
		int rnum5= randGen.nextInt(60)+1;
		int rnum6= randGen.nextInt(60)+1;
		
		System.out.printf("Display results ");
		System.out.printf("Display random results %d %d %d %d %d %d", rnum1, rnum2, rnum3, rnum4, rnum5, rnum6);
		
		
	}
}
