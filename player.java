import java.util.*;

class Playerr {
		Scanner sc = new Scanner(System.in);
		int PlayerId;
		int GameId;
		String PlayerName;
		static String CountryName = "India";
		
		protected int setPlayerId(){
			System.out.println("Enter Player's Id");
			PlayerId = sc.nextInt();
			return PlayerId;
		}
		
		protected int setGameId(){
			System.out.println("Enter Game's Id");
			GameId = sc.nextInt();
			return GameId;
		}
		
		protected String setPlayerName(){
			System.out.println("Enter Player's Name");
			PlayerName = sc.nextLine();
			return PlayerName;
		}
				
}

class Cricket_Player extends Playerr{
	String CricketGround;
	
	protected String setCricketGround(){
		System.out.println("Enter Player's Name");
		CricketGround = sc.nextLine();
		return CricketGround;
	}
	
}

class Football_Player extends Playerr{
	String FootballGround;
	
	protected String setFootballGround(){
		System.out.println("Enter Player's Name");
		FootballGround = sc.nextLine();
		return FootballGround;
	}
}

class Hockey_Player extends Playerr{
	String HockeyField;
	
	protected String setHockeyField(){
		System.out.println("Enter Player's Name");
		HockeyField = sc.nextLine();
		return HockeyField;
	}
}

public class Player{
	public static void main(String [] args) {
		
		Cricket_Player p1 = new Cricket_Player();
		Football_Player p2 = new Football_Player();
		Hockey_Player p3 = new Hockey_Player();
		
		int playerId = p1.setPlayerId();
		System.out.println(playerId);
		
		
	}
}

