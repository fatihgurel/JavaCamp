package homeworkDay4_2.concrete;

import homeworkDay4_2.abstracts.GameService;
import homeworkDay4_2.entities.Game;

public class GameManager implements GameService {

	@Override
	public void add(Game game) {
		System.out.println("Game added : " + game.getGameName());
	}

	@Override
	public void update(Game game) {
		System.out.println("Game updated : " + game.getGameName());
		
	}

	@Override
	public void delete(Game game) {
		System.err.println("Game deleted : " + game.getGameName());
		
	}

}
