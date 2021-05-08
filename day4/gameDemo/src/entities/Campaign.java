package entities;

public class Campaign {
   private int CampaignID;
   private String CampaignName;
   private double CampaignValue; //%50=50 mesela
   
   
public Campaign(int campaignID, String campaignName, double campaignValue) {
	super();
	CampaignID = campaignID;
	CampaignName = campaignName;
	CampaignValue = campaignValue;
}
public int getCampaignID() {
	return CampaignID;
}
public void setCampaignID(int campaignID) {
	CampaignID = campaignID;
}
public String getCampaignName() {
	return CampaignName;
}
public void setCampaignName(String campaignName) {
	CampaignName = campaignName;
}
public double getCampaignValue() {
	return CampaignValue;
}
public void setCampaignValue(double campaignValue) {
	CampaignValue = campaignValue;
}
   
}
