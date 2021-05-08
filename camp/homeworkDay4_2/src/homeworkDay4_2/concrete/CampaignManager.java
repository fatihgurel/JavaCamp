package homeworkDay4_2.concrete;

import homeworkDay4_2.abstracts.CampaignService;
import homeworkDay4_2.entities.Campaign;

public class CampaignManager implements CampaignService{

	@Override
	public void add(Campaign campaign) {
		System.out.println("Campaign added : " + campaign.getCampaignName());
	}

	@Override
	public void update(Campaign campaign) {
		System.out.println("Campaign updated : " + campaign.getCampaignName());
	}

	@Override
	public void delete(Campaign campaign) {
		System.err.println("Campaign deleted : " + campaign.getCampaignName());
	}

}
