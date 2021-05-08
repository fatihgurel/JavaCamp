package homeworkDay4_2.abstracts;

import homeworkDay4_2.entities.Player;
import homeworkDay4_2.entities.Game;
import homeworkDay4_2.entities.Campaign;

public interface SaleService {
	void sale(Player player,Game game);
	void saleCampaign(Player player,Game game,Campaign campaign);
}
