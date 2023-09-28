import java.util.ArrayList;
import java.util.Scanner;

public class MainGame
{
	public static void main(String[] args) 
	{
		ArrayList<String> actions=new ArrayList<String>();
		actions.add("1) Start Game");
		actions.add("2) Resume Game");
		actions.add("3) Pause Game");
		actions.add("4) End Game");

		GameMenu gameMenu = new GameMenu(actions);
		gameMenu.displayMenu();

		String userChoice = getAction();
		int i = Integer.parseInt(userChoice);

	}
	public static void doAction(int action)
	{
		switch(action)
		{
		case 1: 
			System.out.println("Starting the game now");
			break;
		case 2:
			System.out.println("Fetching previously saves games");
			break;
		case 3:
			System.out.println("Game paused");
			break;
		case 4:
			System.out.println("Ending game");
			break;
		}
	}
}