package consolegame;

import java.util.Scanner;
import java.util.Random;
import java.util.Random;
public class 보스 extends 몬스터{
	Random random=new Random();
	
	double mp;
	double maxmp;
	String 드롭무기;
	String 드롭방어구;

//--------------보스의 속성 입력------------------
		public void 헤돈정보(스킬 공격스킬) {//헤돈 정보 입력
			this.이름="헤돈";
			this.레벨=3;
			this.hp=650;
			this.maxhp=650;
			this.mp=1000000000;
			this.공격력=260;
			this.방어력=210;
			this.기본공격="봉찌르기";
			공격스킬.이름="심판의 일격";
			공격스킬.숙련도=1;
			공격스킬.공격력=this.공격력*1.2;
			this.돈=5000;
			this.경험치=800;
			this.드롭무기="낡은 검";
			this.드롭방어구="낡은 갑옷";
			this.드롭hp포션="하급 hp포션";
			this.드롭mp포션="하급 mp포션";
			this.시작대사="가능하다면 해보시지요. 저는 모험가들이 다음층으로 갈 수 있는지 평가하는 자. 다른 악감정은 없습니다!";
		}	
		
		public void 카이저정보(스킬 공격스킬) {//카이저 정보 입력
			this.이름="카이저";
			this.레벨=6;
			this.hp=800;
			this.maxhp=800;
			this.mp=1000000000;
			this.공격력=450;
			this.방어력=350;
			this.기본공격="인비지블 니들";
			공격스킬.이름="늑대의 이빨";
			공격스킬.숙련도=1;	
			공격스킬.공격력=this.공격력*1.3;
			this.돈=8000;
			this.경험치=1000;
			this.드롭무기="강철 검";
			this.드롭방어구="강철 갑옷";
			this.드롭hp포션="하급 hp포션";
			this.드롭mp포션="하급 mp포션";
			this.시작대사="1층에선 그냥 올려보냈지만 여기선 어림없다. 난 이곳에서 1000년을 군림한 자. 너역시 내 희생양에 불과하다!";
		}
		
		public void 헬조정보(스킬 공격스킬, 모험가 모험가, 특수무기 특수무기) {//헬조 정보 입력
			this.이름="헬조";
			this.레벨=9;
			this.hp=1200;
			this.maxhp=1200;
			this.mp=1000000000;
			this.공격력=650;
			this.방어력=550;
			this.기본공격="헬조의 광선";
			공격스킬.이름="붉은바리의 광선";
			공격스킬.숙련도=1;
			공격스킬.공격력=this.공격력*1.3;
			this.돈=12000;
			this.경험치=1500;
			if(모험가.이름.equals("스물다섯번째 밤")) {
				특수무기.이름="가시";
			}else if(모험가.이름.equals("쿤 아게로 아그니스")) {
				특수무기.이름="천둥의 창";	
			}else {
				특수무기.이름="매드쇼크";			
			}
			this.드롭hp포션="중급 hp포션";
			this.드롭mp포션="중급 mp포션";
			this.시작대사="죽음의 층에 오다니...겁이 없구나";
		}
		
		public void 칼라반정보(스킬 공격스킬, 스킬 궁극기) {//칼라반 정보 입력
			this.이름="칼라반";
			this.레벨=12;
			this.hp=1400;
			this.maxhp=1400;
			this.mp=1000000000;
			this.공격력=900;
			this.방어력=900;
			this.기본공격="정권찌르기";
			공격스킬.이름="빅봄버";
			공격스킬.숙련도=1;
			공격스킬.공격력=this.공격력*1.4;
			궁극기.이름="칼라반류 궁극기 무의정수";
			궁극기.숙련도=1;
			궁극기.공격력=this.공격력*1.8;
			this.돈=20000;
			this.경험치=2000;
			this.드롭무기="무의 검";
			this.드롭방어구="무의 갑옷";
			this.드롭hp포션="상급 hp포션";
			this.드롭mp포션="상급 mp포션";
			this.시작대사="난 자하드군의 군단장 칼라반이다. 감히 자하드님께 반기를 들다니. 넌 내선에서 처리해주마!!!";
		}
		
		public void 자하드정보(스킬 공격스킬, 스킬 궁극기) {//자하드 정보 입력
			this.이름="자하드";
			this.레벨=15;
			this.hp=1500;
			this.maxhp=1500;
			this.mp=1000000000;
			this.공격력=1050;
			this.방어력=850;
			this.기본공격="자하드류 공파술 금강장";
			공격스킬.이름="자하드류 살인기 광란";
			공격스킬.숙련도=1;
			공격스킬.공격력=this.공격력*1.5;
			궁극기.이름="자하드류 궁극기 신원류";
			궁극기.숙련도=1;
			궁극기.공격력=this.공격력*1.9;
			this.돈=20000;
			this.경험치=3000;
			this.드롭무기="자하드의 검";
			this.드롭방어구="자하드의 갑옷";
			this.드롭hp포션="상급 hp포션";
			this.드롭mp포션="상급 mp포션";
			this.시작대사="여기까지 온 걸 보면 꽤나 실력이 대단한가보구나. 과연 니가 이 탑에 변화를 몰고 올 능력이 있는지 궁금하구나!!";
		}
		
	

//----------------스킬공격 메소드------------------------------------------
	public double 스킬공격(스킬 스킬) {
		int damage_percentage=random.nextInt(4)+6;
		return (int)(스킬.공격력*0.1*damage_percentage);
	}
		
//---------------궁극기 메소드----------------------------------
	public double 궁극기(스킬 스킬) {
		int damage_percentage=random.nextInt(4)+6;
		return (int)(스킬.공격력*0.1*damage_percentage);
	}

	
	


//---------------------싸움이 시작됐을 때 보스의 턴을 한번에 묶은 메소드---------------------------
	public void 보스턴(모험가 모험가, 스테이지 스테이지, 스킬 공격스킬, 스킬 궁극기) {
		for(int i=0; i<60; i++) {
			System.out.println("");
		}
		System.out.println(스테이지.지배자이름(스테이지.층수)+"의 공격이 시작됩니다.");
		System.out.println("");
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		int 보스공격=random.nextInt(10)+1;
		if(스테이지.층수<=3) {
			if(보스공격>=5) {//보스 기본공격
				사운드스레드 보스기본공격사운드스레드=new 사운드스레드("boss_attack.mp3",false);
				보스기본공격사운드스레드.start();
				공격효과스레드 공격효과=new 공격효과스레드("보스공격");
				Thread 공격효과스레드=new Thread(공격효과);
				공격효과스레드.start();
				try {
					공격효과스레드.join();
				} catch (InterruptedException e1) {
					e1.printStackTrace();
				}
				System.out.println(스테이지.지배자이름(스테이지.층수)+"의"+this.기본공격+" 공격!");
				모험가.attacked(기본공격());
				try {
					Thread.sleep(1500);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}else {//보스 공격스킬
				사운드스레드 보스스킬사운드스레드=new 사운드스레드("boss_skill.mp3",false);
				보스스킬사운드스레드.start();
				공격효과스레드 공격효과=new 공격효과스레드("보스스킬");
				Thread 공격효과스레드=new Thread(공격효과);
				공격효과스레드.start();
				try {
					공격효과스레드.join();
				} catch (InterruptedException e1) {
					e1.printStackTrace();
				}
				System.out.println(스테이지.지배자이름(스테이지.층수)+"의 "+공격스킬.이름);
				모험가.attacked(공격스킬.공격력);
				try {
					Thread.sleep(1500);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}	
		}else {
			if(보스공격>=8) {//보스 기본공격
				사운드스레드 보스기본공격사운드스레드=new 사운드스레드("boss_attack.mp3",false);
				보스기본공격사운드스레드.start();
				공격효과스레드 공격효과=new 공격효과스레드("보스공격");
				Thread 공격효과스레드=new Thread(공격효과);
				공격효과스레드.start();
				try {
					공격효과스레드.join();
				} catch (InterruptedException e1) {
					e1.printStackTrace();
				}
				System.out.println(스테이지.지배자이름(스테이지.층수)+"의"+this.기본공격+" 공격!");
				모험가.attacked(this.공격력);
				try {
					Thread.sleep(1500);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}else if(보스공격>=5){//보스 공격스킬
				사운드스레드 보스스킬사운드스레드=new 사운드스레드("boss_skill.mp3",false);
				보스스킬사운드스레드.start();
				공격효과스레드 공격효과=new 공격효과스레드("보스스킬");
				Thread 공격효과스레드=new Thread(공격효과);
				공격효과스레드.start();
				try {
					공격효과스레드.join();
				} catch (InterruptedException e1) {
					e1.printStackTrace();
				}
				System.out.println(스테이지.지배자이름(스테이지.층수)+"의 "+공격스킬.이름);
				모험가.attacked(공격스킬.공격력);;
				try {
					Thread.sleep(1500);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}else {//보스 궁극기
				사운드스레드 보스궁극기사운드스레드=new 사운드스레드("boss_hyper_skill.mp3",false);
				보스궁극기사운드스레드.start();
				공격효과스레드 공격효과=new 공격효과스레드("보스궁극기");
				Thread 공격효과스레드=new Thread(공격효과);
				공격효과스레드.start();
				try {
					공격효과스레드.join();
				} catch (InterruptedException e1) {
					e1.printStackTrace();
				}
				System.out.println(스테이지.지배자이름(스테이지.층수)+"의 "+궁극기.이름+" 사용!");
				모험가.attacked(궁극기.공격력);
				try {
					Thread.sleep(1500);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
		
	}
//-----------------------------------------------------------------------------	
	
//--------------------------모험가가 보스를 잡았을 때 보스가 주는 보상 메소드------------------------
	public void 보상(모험가 모험가, hp포션 하급hp포션, hp포션 중급hp포션, hp포션 상급hp포션, mp포션 하급mp포션, mp포션 중급mp포션, mp포션 상급mp포션, 특수무기 특수무기, 무기 낡은검, 무기 강철검, 무기 무의검, 무기 자하드의검, 방어구 낡은갑옷, 방어구 강철갑옷, 방어구 무의갑옷, 방어구 자하드의갑옷, 스테이지 스테이지) {
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
		if(this.이름.equals("헬조")) {
			모험가.특수무기장착여부=1;
			특수무기.소유여부=1;
			모험가.장착특수무기=특수무기.이름;
			모험가.공격력+=특수무기.공격력;
			모험가.방어력+=특수무기.방어력;
			모험가.hp+=특수무기.hp;
			모험가.mp+=특수무기.mp;
		}else {
			if(this.드롭무기.equals(낡은검.이름)) {
				낡은검.소유여부=1;
				낡은갑옷.소유여부=1;
			}else if(this.드롭무기.equals(강철검.이름)) {
				강철검.소유여부=1;
				강철갑옷.소유여부=1;
			}else if(this.드롭무기.equals(무의검.이름)) {
				무의검.소유여부=1;
				무의갑옷.소유여부=1;
			}else {
				자하드의검.소유여부=1;
				자하드의갑옷.소유여부=1;
			}
		}
		
		if(스테이지.층수!=3) {
			System.out.println("");
			for(int i=0;i<1;i++) {
				System.out.println("");
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
			System.out.println("===========================================================");
			System.out.println("보상으로");
			System.out.println("돈: "+(int)this.돈+"원");
			System.out.println("경험치: "+this.경험치);
			System.out.println("무기 :"+this.드롭무기);
			System.out.println("방어구:"+this.드롭방어구);
			System.out.println(this.드롭hp포션+": "+potiondrop+"개");
			System.out.println(this.드롭mp포션+": "+potiondrop+"개");
			System.out.println("을(를) 획득하셨습니다!");
			System.out.println("===========================================================");
			for(int i=0;i<1;i++) {
				System.out.print("");
				try {
					Thread.sleep(2500);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}else {
			for(int i=0;i<1;i++) {
				System.out.println("");
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
			System.out.println("===============================================================================");
			System.out.println("보상으로");
			System.out.println("돈: "+(int)this.돈+"원");
			System.out.println("경험치: "+this.경험치);
			System.out.println("특수무기 :"+특수무기.이름);
			System.out.println(this.드롭hp포션+": "+potiondrop+"개");
			System.out.println(this.드롭mp포션+": "+potiondrop+"개");
			System.out.println("을(를) 획득하셨습니다!");
			System.out.println("축하합니다!! '"+특수무기.이름+"'은(는) 궁극기 스킬을 쓸 수 있게 해줍니다. 임의로 장착을 해제하거나 팔 수 없는 특수무기입니다.");
			System.out.println("===============================================================================");
			for(int i=0;i<1;i++) {
				System.out.println("");
				try {
					Thread.sleep(2500);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}
//-------------------------------------------------------------------------------------------------------------------------------

	

	
	

	
	
}