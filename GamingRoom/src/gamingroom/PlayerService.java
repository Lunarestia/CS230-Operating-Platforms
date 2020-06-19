package gamingroom;

import java.util.ArrayList;
import java.util.List;


public class PlayerService {
	/**
	 * A list of the players
	 */
	private static List<Player> players = new ArrayList<Player>();
 
	private static PlayerService instance = new PlayerService();
	
	public static PlayerService getInstance() {
		return instance;
	}
	
	/**
	 * Returns the player instance with the specified id.
	 * 
	 * @param id unique identifier of player to search for
	 * @return requested player instance
	 */
	public Player getPlayer(long id) {

		// a local game instance
		Player player = null;

		//Use iterator to look for existing player with same id
		// if found, simply assign that instance to the local variable
		for (Player existingPlayer : players) {
			if (existingPlayer.getId() == id) {
				player = existingPlayer;
			}
		}

		return player;
	}

}
