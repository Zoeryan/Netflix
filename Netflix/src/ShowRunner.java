import java.util.Scanner;

public class ShowRunner {
	
	public static void main(String[] args)
	{
	Scanner file = new Scanner(System.in);
	System.out.println("What is your favorite show?");
	String inputShow = file.next();
	
	System.out.println("Is " + inputShow + " a 1. Drama 2. Comedy 3. Reality 4. GameShow 5. Sport");
	
	}
}
