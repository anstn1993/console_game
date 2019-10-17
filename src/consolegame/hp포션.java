package consolegame;

public class hp포션 extends 아이템{
	double hp회복량;
	int 개수;
	hp포션(){}
	hp포션(String 이름, int 가격, double hp회복량, int 개수){
		this.이름=이름;
		this.가격=가격;
		this.hp회복량=hp회복량;
		this.개수=개수;
	}


	public int 하급hp포션개수() {
		hp포션 하급hp포션=new hp포션();
		return 하급hp포션.개수;
	}

	public int 중급hp포션개수() {
		hp포션 중급hp포션=new hp포션();
		return 중급hp포션.개수;
	}

	public int 상급hp포션개수() {
		hp포션 상급hp포션=new hp포션();
		return 상급hp포션.개수;
	}
	
	
}
