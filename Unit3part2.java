/**
 * 
 * @author B Sanyer
 *
 **/


import java.util.Scanner;

public class Unit3part2 {
 public static void main(String[] args) {
	 String myWords = "Sarah 45 Cruz";
	 Scanner in = new Scanner(myWords);
	 
	 String name = in.next();
	 int age = in.nextInt();
	 
	System.out.printf("%s is %d years old", name, age);
	 
 }
}
