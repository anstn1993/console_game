package consolegame;
import consolegame.character.Adventurer;
import consolegame.character.Boss;
import consolegame.character.Monster;

public class Stage {
	private int floor;
	private Monster monster1;
	private Monster monster2;
	private Boss boss;
	private Shop shop;

	public Stage(int floor, Monster monster1, Monster monster2, Boss boss, Shop shop) {
		this.floor = floor;
		this.monster1 = monster1;
		this.monster2 = monster2;
		this.boss = boss;
		this.shop = shop;
	}

	public int getFloor() {
		return floor;
	}

	public void setFloor(int floor) {
		this.floor = floor;
	}

	public Monster getMonster1() {
		return monster1;
	}

	public void setMonster1(Monster monster1) {
		this.monster1 = monster1;
	}

	public Monster getMonster2() {
		return monster2;
	}

	public void setMonster2(Monster monster2) {
		this.monster2 = monster2;
	}

	public Boss getBoss() {
		return boss;
	}

	public void setBoss(Boss boss) {
		this.boss = boss;
	}

	public Shop getShop() {
		return shop;
	}

	public void setShop(Shop shop) {
		this.shop = shop;
	}
}


