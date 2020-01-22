package consolegame;

public class Skill {
	private String name;//스킬 명
	private int level;//스킬 레벨
	private double mp;
	private double damage;

	public Skill(String name, int level, double mp, double damage) {
		this.name = name;
		this.level = level;
		this.mp = mp;
		this.damage = damage;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getLevel() {
		return level;
	}

	public void setLevel(int level) {
		this.level = level;
	}

	public double getMp() {
		return mp;
	}

	public void setMp(double mp) {
		this.mp = mp;
	}

	public double getDamage() {
		return damage;
	}

	public void setDamage(double damage) {
		this.damage = damage;
	}
}

