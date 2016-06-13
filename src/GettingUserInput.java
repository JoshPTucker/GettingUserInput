/*Joshua Tucker
 * Simple user input drive program
 * 06/13/16
 */
import java.util.Scanner;
public class GettingUserInput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner keyboard= new Scanner(System.in);
		
		System.out.print("Enter adress");
		String firstInitial = keyboard.next();
		String lastName = keyboard.next();
		int houseNumber = keyboard.nextInt();
		String streetName = keyboard.next();
		String streetType = keyboard.next();
		String city=keyboard.next();
				
		System.out.print(firstInitial + " " + lastName + " " + houseNumber + " "); 
		System.out.println(streetName + " " + streetType + " " + city);
	}

}
