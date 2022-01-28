package gameSalesSystem.entities.concrates;

import gameSalesSystem.entities.abstracts.Entity;

public class Campaign implements Entity{
	private int campaignID;
	private String campaignName;
	private double discountRate;
	
	public Campaign() {
		super();
	}

	public Campaign(int campaignID, String campaignName, double discountRate) {
		super();
		this.campaignID = campaignID;
		this.campaignName = campaignName;
		this.discountRate = discountRate;
	}

	public int getCampaignID() {
		return campaignID;
	}

	public void setCampaignID(int campaignID) {
		this.campaignID = campaignID;
	}

	public String getCampaignName() {
		return campaignName;
	}

	public void setCampaignName(String campaignName) {
		this.campaignName = campaignName;
	}

	public double getDiscountRate() {
		return discountRate;
	}

	public void setDiscountRate(double discountRate) {
		this.discountRate = discountRate;
	}
	
	
	
	
	
}
