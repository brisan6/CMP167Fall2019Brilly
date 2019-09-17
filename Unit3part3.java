
/**
 * 
 * @author B Sanyer
 *
 **/
import java.io.StringWriter;
import java.io.PrintWriter;

public class Unit3part3 {
	public static void main(String[] args) {
		
		StringWriter sw = new StringWriter();
		PrintWriter pw = new PrintWriter(sw);
	
		pw.print("Ana Katherine");
		String name = sw.toString();
	
		System.out.println(name);
	
	}
}
