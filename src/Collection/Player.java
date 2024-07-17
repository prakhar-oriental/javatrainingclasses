package Collection;

public class Player {
	String playername;
	int playerid;
	String skill;
    String country;
    
	@Override
	public String toString() {
		return "Player [playername=" + playername + ", playerid=" + playerid + ", skill=" + skill + ", country="
				+ country + "]";
	}
	public Player(String playername, int playerid, String skill, String country) {
		super();
		this.playername = playername;
		this.playerid = playerid;
		this.skill = skill;
		this.country = country;
	}
	
	public String getPlayername() {
		return playername;
	}
	public void setPlayername(String playername) {
		this.playername = playername;
	}
	public int getPlayerid() {
		return playerid;
	}
	public void setPlayerid(int playerid) {
		this.playerid = playerid;
	}
	public String getSkill() {
		return skill;
	}
	public void setSkill(String skill) {
		this.skill = skill;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
    
}
