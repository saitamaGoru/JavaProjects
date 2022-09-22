package wk2session2ex1;
import java.util.Scanner;
public class AccountTest {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		Account myAccount = new Account();
		
		System.out.printf("Initial name is %s%n%n",myAccount.getName());
		
		System.out.println("Please enter the name:");
		String theName = input.nextLine(); //read a line of text, user can enter input until he hit enters
		myAccount.setName(theName);
		System.out.println(); //outputs a blank line
		
		System.out.printf("Name in object myAccount is:%n%s%n",myAccount.getName());
	}

}
