package homeworkDay4_2;

import java.util.Date;

import homeworkDay4_2.abstracts.SaleService;
import homeworkDay4_2.adapters.MernisServiceAdapter;
import homeworkDay4_2.concrete.CampaignManager;
import homeworkDay4_2.concrete.GameManager;
import homeworkDay4_2.concrete.PlayerManager;
import homeworkDay4_2.concrete.SaleManager;
import homeworkDay4_2.entities.Campaign;
import homeworkDay4_2.entities.Game;
import homeworkDay4_2.entities.Player;
 
public class Main {
	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		PlayerManager playerManager = new PlayerManager(new MernisServiceAdapter());
		playerManager.add(new Player(1, "FATİH", "GÜREL", new Date(1999, 1, 7), "12345678900"));
		playerManager.update(new Player(1, "FATİH", "GÜREL", new Date(1999, 1, 7), "12345678900"));
		playerManager.delete(new Player(1, "FATİH", "GÜREL", new Date(1999, 1, 7), "12345678900"));

		GameManager gameManager = new GameManager();
		gameManager.add(new Game(1,"PUBG",1000));
		gameManager.update(new Game(1,"PUBG",1100));
		gameManager.delete(new Game(1,"PUBG",1100));
		
		CampaignManager campaingManager = new CampaignManager();
		campaingManager.add(new Campaign(1,"Spring",100));
		campaingManager.update(new Campaign(1,"Spring",200));
		campaingManager.delete(new Campaign(1,"Spring",200));
		
		SaleService saleService = new SaleManager();
		saleService.sale(new Player(1, "FATİH", "GÜREL", new Date(1999, 1, 7), "12345678900"),new Game(1,"PUBG",1000));
		saleService.saleCampaign(new Player(1, "FATİH", "GÜREL", new Date(1999, 1, 7), "12345678900"), new Game(1,"PUBG",1000), new Campaign(1,"Spring",100));
	}
}
