import java.util.Scanner;

/**
 * 
 */

/**
 * @author Tobias
 *
 */
public class HelloWorld {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("Hello ASE2015 - how are you now? :)");
		Scanner sc = new Scanner(System.in);
		System.out.print("Please enter your name: ");
		String name = sc.nextLine();
		sc.close();
		new HelloUser(name).greetUser();
	}

}
