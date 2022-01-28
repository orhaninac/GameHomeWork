package gameSalesSystem.entities.concrates;

import java.util.ArrayList;

import gameSalesSystem.entities.abstracts.Entity;

public class Sale implements Entity {
	private int id;
	private User user;
	private Campaign campaign;
	private ArrayList<Game> games;
	
	public Sale() {
		super();
	}

	public Sale(int id, User customer, Campaign campaign, ArrayList<Game> games) {
		super();
		this.id = id;
		this.user = customer;
		this.campaign = campaign;
		this.games = games;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public User getCustomer() {
		return user;
	}

	public Campaign getCampaign() {
		return campaign;
	}

	public ArrayList<Game> getGames() {
		return games;
	}
}
