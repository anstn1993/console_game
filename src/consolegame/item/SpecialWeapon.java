package consolegame.item;

public class SpecialWeapon extends Weapon {

    private double defense;
    private double hp;
    private double mp;

    public SpecialWeapon(String name, int price, double strength, double defense, double hp, double mp) {
        super(name, price, strength);
        this.defense = defense;
        this.hp = hp;
        this.mp = mp;
    }

    public double getDefense() {
                return defense;
        }

        public void setDefense(double defense) {
                this.defense = defense;
        }

        public double getHp() {
                return hp;
        }

        public void setHp(double hp) {
                this.hp = hp;
        }

        public double getMp() {
                return mp;
        }

        public void setMp(double mp) {
                this.mp = mp;
        }
}
