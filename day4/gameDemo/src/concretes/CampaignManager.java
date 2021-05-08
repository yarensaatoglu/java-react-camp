package concretes;

import abstracts.CampaignService;
import entities.Campaign;

public class CampaignManager implements CampaignService{

	@Override
	public void add(Campaign compaign) {
		System.out.println("Compaign Added :"+ compaign.getCampaignName());
		
	}

	@Override
	public void delete(Campaign compaign) {
		System.out.println("Compaign Deleted :"+ compaign.getCampaignName());
		
	}

	@Override
	public void update(Campaign compaign) {
		System.out.println("Compaign Updated :"+ compaign.getCampaignName());
		
	}

}
