package abstracts;

import entities.Customer;
import entities.Game;

public interface GameService {

	void add(Game game);
	void delete(Game game);
	void update(Game game);
}
