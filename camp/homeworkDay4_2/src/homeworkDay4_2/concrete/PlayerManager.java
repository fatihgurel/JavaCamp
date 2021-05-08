package homeworkDay4_2.concrete;

import homeworkDay4_2.abstracts.PlayerCheckService;
import homeworkDay4_2.abstracts.PlayerService;
import homeworkDay4_2.entities.Player;

public class PlayerManager implements PlayerService {
	private PlayerCheckService playerCheckService;

	public PlayerManager(PlayerCheckService playerCheckService) {
		super();
		this.playerCheckService = playerCheckService;
	}

	@Override
	public void add(Player player) {

		if (playerCheckService.checkIfRealPerson(player)) {
			System.out.println("A valid player : " + player.getFirstName());
		}

		else {
			System.err.println("Not a valid player");
		}
	}

	@Override
	public void update(Player player) {
		if (playerCheckService.checkIfRealPerson(player)) {
			System.out.println("A valid player: " + player.getFirstName() + " updated successfully");
		}

		else {
			System.err.println("Not a valid player, update failed");
		}

	}

	@Override
	public void delete(Player player) {
		System.err.println("Player deleted : " + player.getFirstName());

	}

}
