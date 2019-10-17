package consolegame;
import java.util.Random;
public class 케릭터 {
	Random random=new Random();
	String 이름;
	String 기본공격;
	double hp;
	double maxhp;
	double 공격력;
	double 방어력;
	int 돈;
	int 경험치;
	int 레벨;
	String 시작대사;
	
//--------------기본공격 메소드----------------------------------------------
	public double 기본공격() {
		int damage_percentage=random.nextInt(4)+6;
		return (int)(공격력*0.1*damage_percentage);
	}

//--------------공격받기 메소드----------------------------------------------	
	public void attacked(double 공격력) {//this가 데미지를 받는 메소드로 입력값으로 보스나 몬스터의 기본공격, 스킬공격, 궁극기 메소드가 들어간다. 
		if(this.방어력>공격력) {
			System.out.println("공격받았지만 "+this.이름+"의 hp에는 변화가 없다.");
			System.out.println("");
		} else {
			int damage_percentage=random.nextInt(4)+6;//데미지를 공격력의 60%~100%로 출력하기 위해서 랜덤 숫자를 담는 변수
			hp=hp-(공격력-this.방어력)*0.1*damage_percentage;
			System.out.println(this.이름+"의 hp가"+(int)((공격력-this.방어력)*0.1*damage_percentage)+"만큼 감소했다.");
			System.out.println("");
		}
		
	}	
}
