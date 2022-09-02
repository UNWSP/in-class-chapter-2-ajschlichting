
import javax.swing.JOptionPane;

public class Scope {

	final int firstVar;
	
	static int secondVar;
	
	public int thirdVar;
	
public static void main(String[] args) {

	firstVar = 24;
	
	System.out.println("The number is" + firstVar);
	
	secondVar = 32;
	
	System.out.println("The new number is " + secondVar);
	
	thirdVar = 81;
	
	System.out.println("The next number is " + thirdVar);
	
	public int fourthVar = 12;
	
	System.out.println("The last number is " + fourthVar);
	
	
	}

	
	
	
}
