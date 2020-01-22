package consolegame.item;


public class HpPotion extends Item {
	private double hp;

	public HpPotion(String name, int price, double hp) {
		super(name, price);
		this.hp = hp;
	}

	public double getHp() {
		return hp;
	}

	public void setHp(double hp) {
		this.hp = hp;
	}
}
