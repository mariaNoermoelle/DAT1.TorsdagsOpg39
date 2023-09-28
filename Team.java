import java.util.ArrayList;

public class Team
{
	private String teamName;
	private int teamRank;
	private ArrayList<String> playerName= new ArrayList<String> ();

	public Team(String teamName)
	{
		this.teamName=teamName;
	}

	public int setRank(int rank)
	{
		return this.teamRank=rank;
	}

	public String toString()
	{
		return "Team: " + teamName + " Rank: " + teamRank;
	}
}