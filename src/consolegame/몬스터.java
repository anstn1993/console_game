package consolegame;
import java.util.Random;
public class 몬스터 extends 케릭터{
	Random random=new Random();
	String 드롭hp포션;
	String 드롭mp포션;
	
//----------------몬스터의 속성 입력------------------------------
	public void 파란원숭이정보() {//파란원숭이(1층 몬스터)
		this.이름="파란 원숭이";
		this.레벨=1;
		this.hp=350;
		this.maxhp=350;
		this.공격력=140;
		this.방어력=105;
		this.기본공격="할퀴기";
		this.돈=100;
		this.경험치=100;
		this.드롭hp포션="하급 hp포션";
		this.드롭mp포션="하급 mp포션";
		this.시작대사="끽~~~끽끽~~~!!!!";
	}
	
	public void 빨간원숭이정보() {//빨간원숭이(1층 몬스터)
		this.이름="빨간 원숭이";
		this.레벨=2;
		this.hp=370;
		this.maxhp=370;
		this.공격력=190;
		this.방어력=155;
		this.기본공격="분노의 펀치";
		this.돈=200;
		this.경험치=200;
		this.드롭hp포션="하급 hp포션";
		this.드롭mp포션="하급 mp포션";
		this.시작대사="끽~~~끽끽~~~!!!!";
	}
	
	public void 노네임드몬스터정보() {//노네임드몬스터(2층 몬스터)
		this.이름="노네임드 몬스터";
		this.레벨=3;
		this.hp=450;
		this.maxhp=450;
		this.공격력=240;
		this.방어력=220;
		this.기본공격="돌진하기";
		this.돈=400;
		this.경험치=200;
		this.드롭hp포션="하급 hp포션";
		this.드롭mp포션="하급 mp포션";
		this.시작대사="너의 이름을 빼앗아야겠어!!!!!";
	}
	
	public void 네임드몬스터정보() {//네임드몬스터(2층 몬스터)
		this.이름="네임드 몬스터";
		this.레벨=4;
		this.hp=480;
		this.maxhp=480;
		this.공격력=300;
		this.방어력=260;
		this.기본공격="네임드 어택";
		this.돈=600;
		this.경험치=250;
		this.드롭hp포션="하급 hp포션";
		this.드롭mp포션="하급 mp포션";
		this.시작대사="너의 이름을 걸고 싸워라!!";
	}
	
	public void 거충야두정보() {//거충 야두(3층 몬스터)
		this.이름="거충 야두";
		this.레벨=5;
		this.hp=530;
		this.maxhp=530;
		this.공격력=380;
		this.방어력=300;
		this.기본공격="절단";
		this.돈=800;
		this.경험치=300;
		this.드롭hp포션="중급 hp포션";
		this.드롭mp포션="중급 mp포션";
		this.시작대사="크르릉.....";
	}
	
	public void 날개거충야두정보() {//날개거충야두(3층 몬스터)
		this.이름="날개 거충 야두";
		this.레벨=6;
		this.hp=550;
		this.maxhp=550;
		this.공격력=430;
		this.방어력=360;
		this.기본공격="날개치기";
		this.돈=1000;
		this.경험치=400;
		this.드롭hp포션="중급 hp포션";
		this.드롭mp포션="중급 mp포션";
		this.시작대사="푸드드득~~~";
	}
	
	public void 칼라반의병사정보() {//칼라반의 병사(4층 몬스터)
		this.이름="칼라반의 병사";
		this.레벨=8;
		this.hp=800;
		this.maxhp=800;
		this.공격력=530;
		this.방어력=470;
		this.기본공격="대검의 관통";
		this.돈=1300;
		this.경험치=450;
		this.드롭hp포션="하급 hp포션";
		this.드롭mp포션="하급 mp포션";
		this.시작대사="칼라반님의 층에 무단으로 침입하면 어떻게 되는지 보여주마!";
	}
	
	public void 칼라반의호위무사정보() {//칼라반의 호위 무사(4층 몬스터)
		this.이름="칼라반의 호위무사";
		this.레벨=10;
		this.hp=1000;
		this.maxhp=1000;
		this.공격력=750;
		this.방어력=580;
		this.기본공격="칼라반류 검술";
		this.돈=1500;
		this.경험치=500;
		this.드롭hp포션="중급 hp포션";
		this.드롭mp포션="중급 mp포션";
		this.시작대사="칼라반님께 가려거든 나를 먼저 쓰러뜨리고 가라!!";
	}
	
	public void 자하드의호위병정보() {//자하드의 호위병(5층 몬스터)
		this.이름="자하드의 호위병";
		this.레벨=11;
		this.hp=1100;
		this.maxhp=1100;
		this.공격력=800;
		this.방어력=630;
		this.기본공격="자하드식 검술";
		this.돈=2000;
		this.경험치=1000;//디폴트 값: 600
		this.드롭hp포션="중급 hp포션";
		this.드롭mp포션="중급 mp포션";
		this.시작대사="자하드님께 충성을!!!";
	}
	
	public void 자하드가의왕자정보() {//자하드가의 왕자(5층 몬스터)
		this.이름="자하드가의 왕자";
		this.레벨=13;
		this.hp=1400;
		this.maxhp=1400;
		this.공격력=950;
		this.방어력=950;
		this.기본공격="자하드식 공파술 금강장";
		this.돈=1000;
		this.경험치=1000;//디폴트 값: 800
		this.드롭hp포션="상급 hp포션";
		this.드롭mp포션="상급 mp포션";
		this.시작대사="새로운 변화라.. 아버님께서 들으시면 크게 노하실터.. 여기서 널 멈춰야겠다.";
	}
	



//---------------------싸움이 시작됐을 때 몬스터의 턴을 한번에 묶은 메소드---------------------------
		public void 몬스터턴(모험가 모험가, 스테이지 스테이지) {
			for(int i=0; i<60; i++) {
				System.out.println("");
			}
			System.out.println(스테이지.몬스터이름(스테이지.층수)+"의 공격이 시작됩니다.");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			사운드스레드 몬스터기본공격사운드=new 사운드스레드("monster.mp3",false);
			Thread 몬스터기본공격사운드스레드=new Thread(몬스터기본공격사운드);
			몬스터기본공격사운드스레드.start();
			공격효과스레드 공격효과=new 공격효과스레드("몬스터공격");
			Thread 공격효과스레드=new Thread(공격효과);
			공격효과스레드.start();
			try {
				공격효과스레드.join();
			} catch (InterruptedException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			System.out.println("");
			System.out.println(스테이지.몬스터이름(스테이지.층수)+"의 "+this.기본공격+" 공격!");
			this.기본공격();
			모험가.attacked(this.기본공격());
			try {
				Thread.sleep(1500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
//-----------------------------------------------------------------------------		
	
//--------------------------모험가가 몬스터를 잡았을 때 몬스터가 주는 보상 메소드------------------------
	public void 보상(모험가 모험가, hp포션 하급hp포션, hp포션 중급hp포션, hp포션 상급hp포션, mp포션 하급mp포션, mp포션 중급mp포션, mp포션 상급mp포션, 스테이지 스테이지) {
		int potiondrop=random.nextInt(5)+1;
		int moneydrop=random.nextInt(3)+7;
		모험가.돈+=this.돈*0.1*moneydrop;
		모험가.경험치+=this.경험치;
		if(this.드롭hp포션.equals("하급 hp포션")) {
			하급hp포션.개수+=potiondrop;
			하급mp포션.개수+=potiondrop;
		}else if(this.드롭hp포션.equals("중급 hp포션")) {
			중급hp포션.개수+=potiondrop;
			중급mp포션.개수+=potiondrop;
		}else {
			상급hp포션.개수+=potiondrop;
			상급mp포션.개수+=potiondrop;
		}
		
		for(int i=0;i<1;i++) {
			System.out.println("");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println("===========================================================");
		System.out.println("보상으로");
		System.out.println("돈: "+(int)this.돈+"원");
		System.out.println("경험치: "+this.경험치);
		System.out.println(this.드롭hp포션+": "+potiondrop+"개");
		System.out.println(this.드롭mp포션+": "+potiondrop+"개");
		System.out.println("을(를) 획득하셨습니다!");
		System.out.println("===========================================================");
		System.out.println("");
		for(int i=0;i<1;i++) {
			System.out.print("");
			try {
				Thread.sleep(2500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	//-------------------------------------------------------------------------------------------------------------------------------	
}
