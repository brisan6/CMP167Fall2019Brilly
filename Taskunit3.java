
/**
 * 
 * @author B Sanyer
 *
 **/
import java.io.StringWriter;
import java.io.PrintWriter;
import java.util.Scanner;

public class Taskunit3 {
	public static void main(String[] args) {
		
		StringWriter sw = new StringWriter();
		PrintWriter pw = new PrintWriter(sw);
		
		pw.print("Booga");
		String name = sw.toString();
	
		Scanner input = new Scanner(System.in);
		int age = 5;

		System.out.printf("%s is %d years old", name, age);
	}
}
