package concretes;

import entities.Campaign;
import entities.Customer;
import entities.Game;

public class SalesManager {

	public void sales(Game game,Customer customer, Campaign campaign) {
		double resultPrice = game.getGamePrice() - ((game.getGamePrice()*campaign.getCampaignValue()) / 100);
		
		System.out.println(customer.getFirstName()+" "+game.getGameName()+" sold ( "+resultPrice+" TL ) \n");
	}
}
