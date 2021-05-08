package concretes;

import abstracts.GameService;
import entities.Game;

public class GameManager implements GameService{

	@Override
	public void add(Game game) {
		System.out.println("Game Added :"+ game.getGameName());
		
	}

	@Override
	public void delete(Game game) {
		System.out.println("Game Deleted :"+ game.getGameName());
		
	}

	@Override
	public void update(Game game) {
		System.out.println("Game Updated :"+ game.getGameName());
		
	}

}
