package consolegame.item;


public class MpPotion extends Item {
    private double mp;

    public MpPotion(String name, int price, double mp) {
        super(name, price);
        this.mp = mp;
    }

    public double getMp() {
        return mp;
    }

    public void setMp(double mp) {
        this.mp = mp;
    }
}
