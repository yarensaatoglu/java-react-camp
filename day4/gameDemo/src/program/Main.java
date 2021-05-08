package program;

import concretes.CampaignManager;
import concretes.CustomerCheckManager;
import concretes.CustomerManager;
import concretes.GameManager;
import concretes.SalesManager;
import entities.Campaign;
import entities.Customer;
import entities.Game;

public class Main {

	public static void main(String[] args) {
		
		Customer customer = new Customer(1, "Yaren", "Saatoglu", 1999, "yarensaatoglu@gmail.com", "123456");
		Game game = new Game(1, "Star Wars Jedi-Fallen Order ", 2799);
		Campaign campaign = new Campaign(1, "%20 kampanyasý", 20);
		
		CustomerManager customerM = new CustomerManager(new CustomerCheckManager());
		customerM.add(customer);
		
		GameManager gameM = new GameManager();
		gameM.add(game);
		
		CampaignManager campaignM = new CampaignManager();
		campaignM.add(campaign);
		
		SalesManager salesM = new SalesManager();
		salesM.sales(game, customer, campaign);
		
		
		
		
	}

}
