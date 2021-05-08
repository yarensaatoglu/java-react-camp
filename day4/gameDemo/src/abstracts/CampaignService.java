package abstracts;

import entities.Campaign;
import entities.Customer;

public interface CampaignService {

	void add(Campaign compaign);
	void delete(Campaign compaign);
	void update(Campaign compaign);
}
