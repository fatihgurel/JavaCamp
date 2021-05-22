package homeworkDay4_2.concrete;

import homeworkDay4_2.abstracts.PlayerCheckService;
import homeworkDay4_2.entities.Player;
 
public class PlayerCheckManager implements PlayerCheckService {

	@Override
	public boolean checkIfRealPerson(Player player) {
		return true;
	}

}
