package gameSalesSystem.entities.concrates;

import gameSalesSystem.entities.abstracts.Entity;

public class Game implements Entity {

	private int id;
	private String name;
	private double price;
	private double discount;
	private double discountedPrice;
	private String gameType;
	private Campaign campaign;
	
	public Game() {
		super();
	}

	public Game(int id, String name, double price, double discount, String gameType) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
		this.discount = discount;
		this.discountedPrice = price-discount;
		this.gameType = gameType;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public double getDiscount() {
		return discount;
	}

	public void setDiscount(double discount) {
		this.discount = discount;
	}

	public double getDiscountedPrice() {
		return discountedPrice;
	}

	public String getGameType() {
		return gameType;
	}

	public void setGameType(String gameType) {
		this.gameType = gameType;
	}

	public Campaign getCampaign() {
		return campaign;
	}

	public void setCampaign(Campaign campaign) {
		this.campaign = campaign;
	}
	
	
	
	
}
