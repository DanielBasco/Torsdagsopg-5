import java.util.ArrayList;

public class Main{
	public static void main(String[] args){

		Team team1 = new Team("De uovervindelige");
		Team team2 = new Team("De fortrolige vindere");
		Team team3 = new Team("Ghostbusters");
		Team team4 = new Team("Danish Vikings");
		Team team5 = new Team("Sea Hawks");
		Team team6 = new Team("Yorick Ult");

		//Rang til teams
		Team[] teams = {team1, team2, team3, team4, team5, team6};
		for (int i = 0; i<teams.length; i++){
			teams[i].setRank((i+1));
		}


		//Tilføjer spillernavn til teams via ArrayList
		team1.addPlayer("Carsten");
		team2.addPlayer("Holger Rune");
		team3.addPlayer("Svend");
		team4.addPlayer("Ulrik");
		team5.addPlayer("Daniel");
		team6.addPlayer("Asger");



		for(int i = 0;i<teams.length; i++){
			System.out.println(teams[i].toString());

		}
	}
}