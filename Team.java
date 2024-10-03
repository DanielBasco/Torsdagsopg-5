import java.util.ArrayList;

public class Team{
	

	private String teamName;
	private int teamRank;
	private ArrayList<String> playerNames = new ArrayList<String>();

	public Team(String name){
		this.teamName = name;
	}

	public void setRank(int rang){
		this.teamRank = rang;
	}

	public String toString(){
		String toString;
		toString = "Hold: "+teamName +" | " + "Rang: "+teamRank+ "\n";

		for (String s: playerNames) {
			//toString = s + "\n";
			toString = toString + "Spillernavne: " + s +"\n";

		}
		return toString;
		//r<eturn "Hold: "+teamName+" | Rang: "+teamRank;
		//System.out.println(playerNames.get(i));
	}

	public String addPlayer(String playerName){
		playerNames.add(playerName);
		return playerName;
	}
}