package consolegame;

public class mp포션 extends 아이템{
	double mp회복량;
	int 개수;
	mp포션(){}
	mp포션(String 이름, int 가격, double mp회복량, int 개수){
		this.이름=이름;
		this.가격=가격;
		this.mp회복량=mp회복량;
		this.개수=개수;
	}
	public int 하급mp포션개수() {
		mp포션 하급mp포션=new mp포션();
		return 하급mp포션.개수;
	}
	
	public int 중급mp포션개수() {
		mp포션 중급mp포션=new mp포션();
		return 중급mp포션.개수;
	}
	
	public int 상급mp포션개수() {
		mp포션 상급mp포션=new mp포션();
		return 상급mp포션.개수;
	}
	
}
