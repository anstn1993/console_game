package consolegame.item;


public class Weapon extends Item {
	private double strength;

	public Weapon(String name, int price, double strength) {
		super(name, price);
		this.strength = strength;
	}

	public double getStrength() {
		return strength;
	}

	public void setStrength(double strength) {
		this.strength = strength;
	}
}
