import java.util.ArrayList;
import java.util.Scanner;

public class GameMenu
{
	private ArrayList<String> actions=new ArrayList<String>();

	GameMenu(ArrayList actions)
	{
		this.actions=actions;
	}

	public void displayMenu()
	{
		System.out.println(actions);
	}

	public String getAction()
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Type a number to choose an action");
		String choice = scan.nextLine();
		return choice;
	}
}