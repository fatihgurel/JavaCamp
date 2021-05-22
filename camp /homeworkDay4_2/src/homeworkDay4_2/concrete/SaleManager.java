package homeworkDay4_2.concrete;

import homeworkDay4_2.abstracts.SaleService;
import homeworkDay4_2.entities.Campaign;
import homeworkDay4_2.entities.Game;
import homeworkDay4_2.entities.Player;
 
public class SaleManager implements SaleService{

	@Override
	public void sale(Player player, Game game) {
		System.out.println(player.getFirstName() + " bought " + game.getGameName());
		
	}

	@Override
	public void saleCampaign(Player player, Game game, Campaign campaign) {
		System.out.println(player.getFirstName() + " bought " + game.getGameName() + " game for " + campaign.getCampaignName() + " campaign");
		
	}

}
