import java.util.ArrayList;
import java.util.Scanner;

class GameMenu {
	
	Scanner scan = new Scanner(System.in);

	private ArrayList<String> actions = new ArrayList<String>();


	// konstruktor
	public GameMenu(ArrayList<String> actions) {
		this.actions = actions;
	}

	public void displayMenu(ArrayList<String> actions) {
		for(String s : actions) {
			System.out.println(s);
			}
		}
		

		public String getAction(ArrayList<String> actions) {
			System.out.println("Type a number to choose an action");
		for(String s : actions) {
			System.out.println(s);
			}
			String choice = scan.nextLine();
			return choice;
		}
}

