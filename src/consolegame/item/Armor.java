package consolegame.item;

public class Armor extends Item {
	private double defense;

	public Armor(String name, int price, double defense) {
		super(name, price);
		this.defense = defense;
	}

	public double getDefense() {
		return defense;
	}

	public void setDefense(double defense) {
		this.defense = defense;
	}

}
