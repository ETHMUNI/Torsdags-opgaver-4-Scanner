import java.util.ArrayList;

class GameMenu {
	

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
}

