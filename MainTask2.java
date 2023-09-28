import java.util.Scanner;

public class MainTask2
{
	public static void main(String [] args)
	{
		System.out.println("Please type your name");
		Scanner scanner = new Scanner(System.in);
		String name = scanner.nextLine();
		System.out.println(name + ", Please type your age");
		
		String age = scanner.nextLine();
		int i=Integer.parseInt(age);

		System.out.println("Your age is: " + age);
		
		int retireAge=67-i;
		System.out.println("You may retire in;" + retireAge);
	}
}