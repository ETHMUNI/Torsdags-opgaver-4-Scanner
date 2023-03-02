import java.util.ArrayList;

class Team {
	
	private String teamName;
	private int teamRank;
	private ArrayList<String> players = new ArrayList<String>();


	//Constructor
	public Team(String teamName, int teamRank) {
		this.teamName = teamName;
		this.teamRank = teamRank;
	}

	public int setRank() {
		return this.teamRank;
	}

	public String toString() {
		String s = "Hold: " + teamName + ", Rang: " + setRank();
		return s; 
	}
}