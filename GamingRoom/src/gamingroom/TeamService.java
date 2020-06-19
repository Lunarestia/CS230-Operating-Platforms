package gamingroom;

import java.util.ArrayList;
import java.util.List;

public class TeamService {
	/**
	 * A list of the teams
	 */
	private static List<Team> teams = new ArrayList<Team>();

	//Add missing pieces to turn this class a singleton 
	private static TeamService instance = new TeamService();
	
	public static TeamService getInstance() {
		return instance;
	}

	/**
	 * Construct a new team instance
	 * 
	 * @param name the unique name of the team
	 * @return the team instance (new or existing)
	 */
	public Team addTeam(String teamName) {

		// a local team instance
		Team team = null;

		// Use iterator to look for existing team with same name
		// if found, simply return the existing instance
		for (Team existingTeam : teams) {
			if(existingTeam.getName().equals(teamName)) {
				return existingTeam;
			}
		}
		// if not found, make a new team instance and add to list of teams
		if (team == null) {
			team = new Team(teamName);
			teams.add(team);
		}
		
		// return the new/existing team instance to the caller
		return team;
	}

	/**
	 * Returns the team instance with the specified name.
	 * 
	 * @param name unique name of team to search for
	 * @return requested team instance
	 */
	public Team getTeam(String teamName) {

		// a local team instance
		Team team = null;

		// Use iterator to look for existing team with same name
		// if found, simply assign that instance to the local variable
		for (Team existingTeam : teams) {
			if (existingTeam.getName().equals(teamName)) {
				team = existingTeam;
			}
		}
		
		return team;
	}
}
