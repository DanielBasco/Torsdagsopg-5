import java.util.ArrayList;

public class GameMain{
	
	public static void main(String[] args){

			ArrayList<String> actions = new ArrayList<String>();
			actions.add("Start game");
			actions.add("Resume game");
			actions.add("Pause game");
			actions.add("End game");

			// System.out.print(actions.get(2));

			GameMenu gameMenu = new GameMenu(actions);

			gameMenu.displayMenu();

	}
}