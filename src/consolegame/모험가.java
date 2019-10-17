package consolegame;
import java.util.Scanner;
import java.util.Random;
public class 모험가 extends 케릭터{
	Scanner scan=new Scanner(System.in);
	Random random=new Random();
	double mp;
	double maxmp;
	int 요구경험치;
	String 장착무기;
	String 장착방어구;
	String 장착특수무기;
	int 무기장착여부;
	int 방어구장착여부;
	int 특수무기장착여부;
	모험가 모험가;
	스테이지 스테이지;
//-------대사------------------
	String 마지막층시작대사;
	String 앤딩대사;
	

	
//--------------케릭터선택 메소드----------------
public void 밤선택(특수무기 특수무기, 스킬 공격스킬, 스킬 궁극기) {//케릭터 선택시 밤을 선택하면 밤의 데이터가 모험가 객체 변수에 입력되게 하는 메소드
	this.이름="스물다섯번째 밤";
	this.레벨=14;
	this.maxhp=40000;//디폴트 400
	this.hp=39912;//디폴트 400
	this.maxmp=20000;//디퐅트 200
	this.mp=19930;//디폴트 200
	this.공격력=1300;//디폴트 150
	this.방어력=100;
	this.기본공격="에너지볼";
	this.돈=10000;
	this.경험치=99000;
	this.요구경험치=100000;//300
	this.장착무기="없음";
	this.무기장착여부=0;
	this.장착특수무기="가시";
	this.특수무기장착여부=1;
	this.장착방어구="없음";
	this.방어구장착여부=0;
	this.시작대사="씨! 당신을 넘어 반드시 다음층으로 가겠습니다!";
	this.마지막층시작대사="자하드씨 당신만 행복한 탑은 의미가 없습니다. 이제 새로운 변화를 받아들이시죠. 당신을 쓰러뜨리고 탑에 변화를 몰고 오겠습니다!!!";
	this.앤딩대사="자하드씨. 이 탑은 이제 변화가 필요합니다. 더 이상 당신만을 위한 탑이 아닌 모두가 행복한 탑이 될 겁니다. 이제 그만 물러나시죠.";
	특수무기.이름="가시";
	특수무기.소유여부=0;
	특수무기.공격력=50;
	특수무기.방어력=50;
	특수무기.hp=100;
	특수무기.mp=100;
	공격스킬.이름="극익화접공파술";
	공격스킬.숙련도=1;
	공격스킬.공격력=this.공격력+공격스킬.숙련도*this.공격력*0.1;
	공격스킬.mp=공격스킬.숙련도*20;
	궁극기.이름="스물다섯번째 밤류 궁극기 장천";
	궁극기.숙련도=1;
	궁극기.공격력=this.공격력+궁극기.숙련도*this.공격력*0.3;
	궁극기.mp=궁극기.숙련도*30;
	System.out.println("'"+this.이름+"'을 선택하셨습니다.");	
	System.out.println("");
	System.out.println("========================== 케릭터 정보 ==========================");
	System.out.println("이름: "+this.이름);
	System.out.println("레벨: "+this.레벨);
	System.out.println("hp: "+(int)this.hp+"/"+(int)this.maxhp);
	System.out.println("mp: "+(int)this.mp+"/"+(int)this.maxmp);
	System.out.println("공격력: "+(int)this.공격력);
	System.out.println("방어력: "+(int)this.방어력);
	System.out.println("기본공격: "+this.기본공격);
	System.out.println("스킬1: "+공격스킬.이름+"(숙련도: "+공격스킬.숙련도+")");
	System.out.println("스킬2: "+궁극기.이름+"(숙련도: "+궁극기.숙련도+")");
	System.out.println("돈: "+this.돈+"원");
	System.out.println("경험치: "+this.경험치+"/"+this.요구경험치);
	System.out.println("무기: "+this.장착무기);
	System.out.println("방어구: "+this.장착방어구);
	System.out.println("특수무기: "+this.장착특수무기);
	System.out.println("============================================================");
	try {
		Thread.sleep(3000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}

public void 쿤선택(특수무기 특수무기, 스킬 공격스킬, 스킬 궁극기) {//케릭터 선택시 쿤을 선택하면 쿤의 데이터가 모험가 객체 변수에 입력되게 하는 메소드
	this.이름="쿤 아게로 아그니스";
	this.레벨=1;
	this.hp=420;
	this.maxhp=420;
	this.mp=130;
	this.maxmp=130;
	this.공격력=140;
	this.방어력=110;
	this.기본공격="단검날리기";
	this.돈=10000;
	this.경험치=0;
	this.요구경험치=300;
	this.장착무기= "없음";
	this.무기장착여부=0;
	this.장착특수무기="없음";
	this.특수무기장착여부=0;
	this.장착방어구="없음";
	this.방어구장착여부=0;
	this.시작대사="어차피 나한테 질 거 그냥 포기하는 게 어때? 시간낭비 하지 말자고.";
	this.마지막층시작대사="이봐 자하드. 탑에서 너로 인해 고통받는 사람들을 보니까 화가 나서 말이야. 이제 그만 그 자리에서 내려와주겠어?";
	this.앤딩대사="이봐 탑의 왕이라더니 별거 아니잖아? 그 실력으로 지금까지 왕노릇을 한 거야? 더는 못 봐주겠으니 이제 꺼지라고. 이 탑은 모두를 위한 탑이 될 거야.";
	특수무기.이름="천둥의 창";
	특수무기.소유여부=0;
	특수무기.공격력=50;
	특수무기.방어력=50;
	특수무기.hp=100;
	특수무기.mp=100;
	공격스킬.이름="아이스스피어";
	공격스킬.숙련도=0;
	공격스킬.공격력=this.공격력+공격스킬.숙련도*this.공격력*0.1;
	공격스킬.mp=공격스킬.숙련도*20;
	궁극기.이름="쿤 아게로 아그니스류 궁극기 전창술";
	궁극기.숙련도=0;
	궁극기.공격력=this.공격력+궁극기.숙련도*this.공격력*0.3;
	궁극기.mp=궁극기.숙련도*30;
	System.out.println("'"+this.이름+"'을 선택하셨습니다.");	
	System.out.println("");
	System.out.println("========================== 케릭터 정보 ==========================");
	System.out.println("이름: "+this.이름);
	System.out.println("레벨: "+this.레벨);
	System.out.println("hp: "+(int)this.hp+"/"+(int)this.maxhp);
	System.out.println("mp: "+(int)this.mp+"/"+(int)this.maxmp);
	System.out.println("공격력: "+(int)this.공격력);
	System.out.println("방어력: "+(int)this.방어력);
	System.out.println("기본공격: "+this.기본공격);
	System.out.println("스킬1: "+공격스킬.이름+"(숙련도: "+공격스킬.숙련도+")");
	System.out.println("스킬2: "+궁극기.이름+"(숙련도: "+궁극기.숙련도+")");
	System.out.println("돈: "+this.돈+"원");
	System.out.println("경험치: "+this.경험치+"/"+this.요구경험치);
	System.out.println("무기: "+this.장착무기);
	System.out.println("방어구: "+this.장착방어구);
	System.out.println("특수무기: "+this.장착특수무기);
	System.out.println("============================================================");
	try {
		Thread.sleep(3000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}
public void 라크선택(특수무기 특수무기, 스킬 공격스킬, 스킬 궁극기) {//케릭터 선택시 라크를 선택하면 라크의 데이터가 모험가 객체 변수에 입력되게 하는 메소드
	this.이름="라크 레크레이셔";
	this.레벨=1;
	this.hp=450;
	this.maxhp=450;
	this.mp=110;
	this.maxmp=110;
	this.공격력=130;
	this.방어력=120;
	this.기본공격="맨손치기";
	this.돈=10000;
	this.경험치=0;
	this.요구경험치=300;
	this.장착무기= "없음";
	this.무기장착여부=0;
	this.장착특수무기="없음";
	this.특수무기장착여부=0;
	this.장착방어구="없음";
	this.방어구장착여부=0;
	this.시작대사="넌 내 사냥감이다! 잡아먹어주마!!";
	this.마지막층시작대사="왕거북이!! 넌 내 사냥감이다! 잡아먹어주마!!!";
	this.앤딩대사="이봐! 왕거북이!! 패배를 인정하고 꺼져라! 이 탑은 이제 나의 사냥감들로 채울 것이니!!";
	특수무기.이름="매드쇼크";
	특수무기.소유여부=0;
	특수무기.공격력=50;
	특수무기.방어력=50;
	특수무기.hp=100;
	특수무기.mp=100;
	공격스킬.이름="스톤오브";
	공격스킬.숙련도=0;
	공격스킬.공격력=this.공격력+공격스킬.숙련도*this.공격력*0.1;
	공격스킬.mp=공격스킬.숙련도*20;
	궁극기.이름="라크 레크레이셔류 궁극기 매드쇼크";
	궁극기.숙련도=0;
	궁극기.공격력=this.공격력+궁극기.숙련도*this.공격력*0.3;
	궁극기.mp=궁극기.숙련도*30;
	System.out.println("'"+this.이름+"'을 선택하셨습니다.");	
	System.out.println("");
	System.out.println("========================== 케릭터 정보 ==========================");
	System.out.println("이름: "+this.이름);
	System.out.println("레벨: "+this.레벨);
	System.out.println("hp: "+(int)this.hp+"/"+(int)this.maxhp);
	System.out.println("mp: "+(int)this.mp+"/"+(int)this.maxmp);
	System.out.println("공격력: "+(int)this.공격력);
	System.out.println("방어력: "+(int)this.방어력);
	System.out.println("기본공격: "+this.기본공격);
	System.out.println("스킬1: "+공격스킬.이름+"(숙련도: "+공격스킬.숙련도+")");
	System.out.println("스킬2: "+궁극기.이름+"(숙련도: "+궁극기.숙련도+")");
	System.out.println("돈: "+this.돈+"원");
	System.out.println("경험치: "+this.경험치+"/"+this.요구경험치);
	System.out.println("무기: "+this.장착무기);
	System.out.println("방어구: "+this.장착방어구);
	System.out.println("특수무기: "+this.장착특수무기);
	System.out.println("============================================================");
	try {
		Thread.sleep(3000);
	} catch (InterruptedException e) {
		e.printStackTrace();
	}
}
//---------------------케릭터 정보 출력 메소드----------------
	public void 케릭터정보(스킬 스킬1, 스킬 스킬2) {
		for(int i=0; i<60; i++) {
			System.out.println("");
		}
		System.out.println("==========================케릭터 정보 ==========================");
		System.out.println("이름: "+this.이름);
		System.out.println("레벨: "+this.레벨);
		System.out.println("hp: "+(int)this.hp+"/"+(int)this.maxhp);
		System.out.println("mp: "+(int)this.mp+"/"+(int)this.maxmp);
		System.out.println("공격력: "+(int)this.공격력);
		System.out.println("방어력: "+(int)this.방어력);
		System.out.println("기본공격: "+this.기본공격);
		System.out.println("스킬1: "+스킬1.이름+"(숙련도: "+스킬1.숙련도+")");
		System.out.println("스킬2: "+스킬2.이름+"(숙련도: "+스킬2.숙련도+")");
		System.out.println("돈: "+this.돈+"원");
		System.out.println("경험치: "+this.경험치+"/"+this.요구경험치);
		System.out.println("무기: "+this.장착무기);
		System.out.println("방어구: "+this.장착방어구);
		System.out.println("특수무기: "+this.장착특수무기);
		System.out.println("===========================================================");
		
	}


//----------------스킬공격 메소드------------------------------------------
			public double 스킬공격(스킬 스킬) {
				int damage_percentage=random.nextInt(4)+6;//데미지를 공격력의 60%~100%로 출력하기 위해서 랜덤 숫자를 담는 변수
				return (int)(스킬.공격력*0.1*damage_percentage);
			}
				
//---------------궁극기 메소드----------------------------------
			public double 궁극기(스킬 스킬) {
				int damage_percentage=random.nextInt(4)+6;//데미지를 공격력의 60%~100%로 출력하기 위해서 랜덤 숫자를 담는 변수
				return (int)(스킬.공격력*0.1*damage_percentage);
			}
//---------------기본공격받기 메소드-------------------------
				
//---------------행동선택 메소드-------------------------------------------------			
	public void 행동선택(스테이지 스테이지) {
		System.out.println("================================================================");
		System.out.println("1. "+스테이지.지배자이름(스테이지.층수)+"과(와)의 대결        2. 사냥터 입장        3. 인벤토리        4. 상점 입장        5. 케릭터 정보");
		System.out.println("================================================================");
		System.out.println("0. 게임종료");
		System.out.println("");
		System.out.print("취할 행동을 선택해주세요:");
			
	}		

//----------------보스와의 싸움이 시작됐을 때 모험가의 턴을 한번에 묶은 메소드	--------------------
	public void 모험가턴(보스 보스, 스킬 공격스킬, 스킬 궁극기) {
		
		ㅣoop4: while(true) {
			for(int i=0; i<60; i++) {
				System.out.println("");
			}
			System.out.println("================================================");
			System.out.println("1. "+this.기본공격+"        2. "+공격스킬.이름+"        3. "+궁극기.이름);
			System.out.println("================================================");
			System.out.print("입력: ");
			String fight_attack=scan.next();
			if(fight_attack.equals("1")) {//기본공격을 선택했을 때 
				사운드스레드 모험가기본공격사운드스레드=new 사운드스레드("tourist_attack.mp3",false);//모험가의 기본공격 효과음 스레드 선언
				모험가기본공격사운드스레드.start();//모험가 기본공격 효과음 시작
				공격효과스레드 공격효과=new 공격효과스레드("모험가공격");//모험가 공격 효과 스레드 선언
				Thread 공격효과스레드=new Thread(공격효과);
				공격효과스레드.start();//모험가 공격효과 스레드 시작
				try {
					공격효과스레드.join();
				} catch (InterruptedException e1) {
					e1.printStackTrace();
				}
				try {
					Thread.sleep(500);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				System.out.println("");
				System.out.println(this.이름+"의 "+this.기본공격+"공격!!");//기본공격 효과음과 공격효과까지 다 나온 후 공격 멘트 출력
				보스.attacked(this.기본공격());
				try {
					Thread.sleep(1500);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				break;
			}else if(fight_attack.equals("2")) {//공격스킬
				if(this.mp>=공격스킬.mp) {//mp가 공격스킬을 사용할 때 소모되는 mp보다 많거나 같을 때
					if(공격스킬.숙련도==0) {//숙련도 0일 때는 스킬을 사용할 수 없음. 
						for(int i=0; i<60; i++) {
							System.out.println("");
						}
						System.out.println("");
						System.out.println("<해당스킬은 아직 사용할 수 없습니다.>");
						System.out.println("");
						try {
							Thread.sleep(1500);
						} catch (InterruptedException e) {
							e.printStackTrace();
						}
						continue;
					}else {//숙련도가 1 이상일 때 기본공격과 같은 과정으로 진행
						사운드스레드 모험가스킬공격사운드스레드=new 사운드스레드("tourist_skill.mp3",false);
						모험가스킬공격사운드스레드.start();
						공격효과스레드 공격효과=new 공격효과스레드("모험가스킬");
						Thread 공격효과스레드=new Thread(공격효과);
						공격효과스레드.start();
						try {
							공격효과스레드.join();
						} catch (InterruptedException e1) {
							// TODO Auto-generated catch block
							e1.printStackTrace();
						}
						try {
							Thread.sleep(700);
						} catch (InterruptedException e) {
							e.printStackTrace();
						}
						
						System.out.println("");
						System.out.println(this.이름+"의 "+공격스킬.이름+"!!");
						System.out.println("mp가"+(int)공격스킬.mp+"만큼 감소했다.");
						보스.attacked(공격스킬.공격력);
						this.mp-=공격스킬.mp;
						try {
							Thread.sleep(1500);
						} catch (InterruptedException e) {
							e.printStackTrace();
						}
						break;
					}
				}else {//mp가 공격스킬을 사용할 때 소모되는 mp보다 적을 때
					for(int i=0; i<60; i++) {
						System.out.println("");
					}
					System.out.println("");
					System.out.println("<mp가 부족합니다.>");
					System.out.println("");
					try {
						Thread.sleep(1500);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					continue;
				}
			}else if(fight_attack.equals("3")){//궁극기
				if(this.mp>=궁극기.mp) {//mp가 궁극기를 사용할 때 소모되는 mp보다 많거나 같을 때
					if(궁극기.숙련도==0) {//숙련도 0일 때는 궁극기를 사용할 수 없음. 
						for(int i=0; i<60; i++) {
							System.out.println("");
						}
						System.out.println("");
						System.out.println("<해당스킬은 아직 사용할 수 없습니다.>");
						System.out.println("");
						try {
							Thread.sleep(1500);
						} catch (InterruptedException e) {
							e.printStackTrace();
						}
						continue;
					}else {//숙련도가 1 이상일 때 
						if(this.특수무기장착여부==1) {//특수무기를 장착하고 있는 경우로 이 경우 기본공격과 공격스킬과 같은 흐름으로 진행
							for(int i=0; i<60; i++) {
								System.out.println("");
							}
							사운드스레드 모험가궁극기공격사운드스레드=new 사운드스레드("tourist_hyper_skill.mp3",false);
							모험가궁극기공격사운드스레드.start();
							공격효과스레드 공격효과=new 공격효과스레드("모험가궁극기");
							Thread 공격효과스레드=new Thread(공격효과);
							공격효과스레드.start();
							try {
								공격효과스레드.join();
							} catch (InterruptedException e1) {
								// TODO Auto-generated catch block
								e1.printStackTrace();
							}
							try {
								Thread.sleep(500);
							} catch (InterruptedException e) {
								e.printStackTrace();
							}
							System.out.println("");	
							System.out.println(this.이름+"의 "+궁극기.이름+"!!");
							System.out.println("mp가"+(int)궁극기.mp+"만큼 감소했다.");
							보스.attacked(궁극기.공격력);
							this.mp-=궁극기.mp;
							try {
								Thread.sleep(1500);
							} catch (InterruptedException e) {
								e.printStackTrace();
							}
							break;
						} else {//특수무기를 장착하지 않아서 궁극기를 사용할 수 없음
							for(int i=0; i<60; i++) {
								System.out.println("");
							}
							System.out.println("");
							System.out.println("<해당스킬은 아직 사용할 수 없습니다.>");
							System.out.println("");
							try {
								Thread.sleep(1500);
							} catch (InterruptedException e) {
								e.printStackTrace();
							}
							continue;
						}
					}
				}else {////mp가 궁극기를 사용할 때 소모되는 mp보다 적을 때
					for(int i=0; i<60; i++) {
						System.out.println("");
					}
					System.out.println("");
					System.out.println("<mp가 부족합니다.>");
					System.out.println("");
					try {
						Thread.sleep(1500);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					continue;
				}
			}else {
				for(int i=0; i<60; i++) {
					System.out.println("");
				}
				System.out.println("<잘못 입력하셨습니다. 다시 입력해주세요.>");
				System.out.println("");
				try {
					Thread.sleep(1500);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
	}
//---------------------------------------------------------------------------------

//----------------몬스터와의 싸움이 시작됐을 때 모험가의 턴을 한번에 묶은 메소드	--------------------
	public void 몬스터전모험가턴(몬스터 몬스터, 스킬 공격스킬, 스킬 궁극기) {
			while(true) {
				for(int i=0; i<60; i++) {
					System.out.println("");
				}
				System.out.println("================================================");
				System.out.println("1. "+this.기본공격+"        2. "+공격스킬.이름+"        3. "+궁극기.이름);
				System.out.println("================================================");
				System.out.print("입력: ");
				String fight_attack=scan.next();
				if(fight_attack.equals("1")) {//기본공격
					사운드스레드 모험가기본공격사운드스레드=new 사운드스레드("tourist_attack.mp3",false);
					모험가기본공격사운드스레드.start();
					공격효과스레드 공격효과=new 공격효과스레드("모험가공격");
					Thread 공격효과스레드=new Thread(공격효과);
					공격효과스레드.start();
					try {
						공격효과스레드.join();
					} catch (InterruptedException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
					
					try {
						Thread.sleep(500);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					
					System.out.println(this.이름+"의 "+this.기본공격+"공격!!");
					몬스터.attacked(this.기본공격());
					try {
						Thread.sleep(1500);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					break;
				}else if(fight_attack.equals("2")) {//공격스킬
					if(this.mp>=공격스킬.mp) {
						if(공격스킬.숙련도==0) {
							for(int i=0; i<60; i++) {
								System.out.println("");
							}
							System.out.println("");
							System.out.println("<해당스킬은 아직 사용할 수 없습니다.>");
							System.out.println("");
							try {
								Thread.sleep(1500);
							} catch (InterruptedException e) {
								e.printStackTrace();
							}
							continue;
						}else {
							사운드스레드 모험가스킬공격사운드스레드=new 사운드스레드("tourist_skill.mp3",false);
							모험가스킬공격사운드스레드.start();
							공격효과스레드 공격효과=new 공격효과스레드("모험가스킬");
							Thread 공격효과스레드=new Thread(공격효과);
							공격효과스레드.start();
							try {
								공격효과스레드.join();
							} catch (InterruptedException e1) {
								// TODO Auto-generated catch block
								e1.printStackTrace();
							}
							try {
								Thread.sleep(700);
							} catch (InterruptedException e) {
								e.printStackTrace();
							}
							System.out.println(this.이름+"의 "+공격스킬.이름+"!!");
							System.out.println("mp가"+(int)공격스킬.mp+"만큼 감소했다.");
							try {
								Thread.sleep(1500);
							} catch (InterruptedException e) {
								e.printStackTrace();
							}
							몬스터.attacked(공격스킬.공격력);
							this.mp-=공격스킬.mp;
							break;
						}
					}else {
						for(int i=0; i<60; i++) {
							System.out.println("");
						}
						System.out.println("mp가 부족합니다.");
						try {
							Thread.sleep(1500);
						} catch (InterruptedException e) {
							e.printStackTrace();
						}
						continue;
					}
				}else if(fight_attack.equals("3")){//궁극기
					if(this.mp>=궁극기.mp) {
						if(궁극기.숙련도==0) {
							for(int i=0; i<60; i++) {
								System.out.println("");
							}
							System.out.println("");
							System.out.println("<해당스킬은 아직 사용할 수 없습니다.>");
							System.out.println("");
							try {
								Thread.sleep(1500);
							} catch (InterruptedException e) {
								e.printStackTrace();
							}
							continue;
						}else {
							if(this.특수무기장착여부==1) {
								for(int i=0; i<60; i++) {
									System.out.println("");
								}
								사운드스레드 모험가궁극기공격사운드스레드=new 사운드스레드("tourist_hyper_skill.mp3",false);
								모험가궁극기공격사운드스레드.start();
								공격효과스레드 공격효과=new 공격효과스레드("모험가궁극기");
								Thread 공격효과스레드=new Thread(공격효과);
								공격효과스레드.start();
								try {
									공격효과스레드.join();
								} catch (InterruptedException e1) {
									// TODO Auto-generated catch block
									e1.printStackTrace();
								}
								try {
									Thread.sleep(500);
								} catch (InterruptedException e) {
									e.printStackTrace();
								}
								System.out.println(this.이름+"의 "+궁극기.이름+"!!");
								System.out.println("mp가"+(int)궁극기.mp+"만큼 감소했다.");
								몬스터.attacked(공격스킬.공격력);
								this.mp-=궁극기.mp;
								try {
									Thread.sleep(1500);
								} catch (InterruptedException e) {
									e.printStackTrace();
								}
								break;
							} else {
								for(int i=0; i<60; i++) {
									System.out.println("");
								}
								System.out.println("<해당스킬은 아직 사용할 수 없습니다.>");
								System.out.println("");
								try {
									Thread.sleep(1500);
								} catch (InterruptedException e) {
									e.printStackTrace();
								}
								continue;
							}
						}
					}else {
						for(int i=0; i<60; i++) {
							System.out.println("");
						}
						System.out.println("");
						System.out.println("<mp가 부족합니다.>");
						System.out.println("");
						try {
							Thread.sleep(1500);
						} catch (InterruptedException e) {
							e.printStackTrace();
						}
						continue;
					}
				}else {
					for(int i=0; i<60; i++) {
						System.out.println("");
					}
					System.out.println("<잘못 입력하셨습니다. 다시 입력해주세요.>");
					System.out.println("");
					try {
						Thread.sleep(1500);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				} 
			}
	}	
//---------------------------------------------------------------------------------

//-------------------------------모험가가 레벨업을 했을 때의 스텟 변화 메소드--------------------------
	public void 레벨업(스킬 공격스킬, 스킬 궁극기) {
		if(this.경험치>=this.요구경험치) {
			this.레벨+=1;
			this.경험치=this.경험치-this.요구경험치;
			this.요구경험치+=200;
			this.maxhp+=50;
			this.maxmp+=50;
			this.hp=this.maxhp;
			this.mp=this.maxmp;
			this.공격력+=50;
			this.방어력+=50;
			if(this.레벨<9) {//레벨 8까지는 공격스킬의 숙련도만 증가
				공격스킬.숙련도++;
				if(this.이름.equals("스물다섯번째 밤")) {
					공격스킬.공격력=this.공격력+공격스킬.숙련도*this.공격력*0.1;
					공격스킬.mp=공격스킬.숙련도*20;
				}else if(this.이름.equals("쿤 아게로 아그니스")) {
					공격스킬.공격력=this.공격력+공격스킬.숙련도*this.공격력*0.1;
					공격스킬.mp=공격스킬.숙련도*20;
				}else {
					공격스킬.공격력=this.공격력+공격스킬.숙련도*this.공격력*0.1;
					공격스킬.mp=공격스킬.숙련도*20;
				}
			}else if(this.레벨<=15&&this.레벨>=9){//레벨 9부터 15까지는 궁극기의 숙련도만 증가
				궁극기.숙련도++;
				if(this.이름.equals("스물다섯번째 밤")) {
					궁극기.공격력=this.공격력+궁극기.숙련도*this.공격력*0.3;
					궁극기.mp=궁극기.숙련도*30;
				}else if(this.이름.equals("쿤 아게로 아그니스")) {
					궁극기.공격력=this.공격력+궁극기.숙련도*this.공격력*0.3;
					궁극기.mp=궁극기.숙련도*30;
				}else {
					궁극기.공격력=this.공격력+궁극기.숙련도*this.공격력*0.3;
					궁극기.mp=궁극기.숙련도*30;
				}
			}
			레벨업스레드 레벨업=new 레벨업스레드();
			Thread 레벨업스레드=new Thread(레벨업);
			레벨업스레드.start();
			try {
				레벨업스레드.join();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("===========================================================");
			System.out.println("축하드립니다. 레벨업을 하셨습니다.!!");
			System.out.println("레벨: "+this.레벨);
			System.out.println("hp: "+(int)this.hp+"/"+(int)this.maxhp);
			System.out.println("mp: "+(int)this.mp+"/"+(int)this.maxmp);
			System.out.println("공격력: "+(int)this.공격력);
			System.out.println("방어력: "+(int)this.방어력);
			System.out.println("스킬1: "+공격스킬.이름+"(숙련도: "+공격스킬.숙련도+")");
			System.out.println("스킬2: "+궁극기.이름+"(숙련도: "+궁극기.숙련도+")");
			System.out.println("경험치: "+this.경험치+"/"+this.요구경험치);
			System.out.println("===========================================================");
			System.out.println("");
			try {
				Thread.sleep(4000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
		}
	}	
//---------------------------------------------------------------------------------------------------------------

//--------------------------------무기 장착 메소드--------------------------------------------
	public void 무기장착(무기 낡은검, 무기 강철검, 무기 무의검, 무기 자하드의검, 무기 하급검, 무기 중급검, 무기 상급검) {
		while(true) {
			if(this.장착무기.equals("없음")){//장착무기가 없는 경우 무기 장착 메뉴로 진입 가능
				for(int i=0; i<60; i++) {
					System.out.println("");
				}
				System.out.println("==========================================================================");
				System.out.println("1. "+낡은검.이름+"(공격력 "+(int)낡은검.공격력+"+)---------------------------------------------보유여부:"+낡은검.보유무기(낡은검.소유여부));
				System.out.println("2. "+강철검.이름+"(공격력 "+(int)강철검.공격력+"+)---------------------------------------------보유여부:"+강철검.보유무기(강철검.소유여부));
				System.out.println("3. "+무의검.이름+"(공격력 "+(int)무의검.공격력+"+)---------------------------------------------보유여부:"+무의검.보유무기(무의검.소유여부));
				System.out.println("4. "+자하드의검.이름+"(공격력 "+(int)자하드의검.공격력+"+)------------------------------------------보유여부:"+자하드의검.보유무기(자하드의검.소유여부));
				System.out.println("5. "+하급검.이름+"(공격력 "+(int)하급검.공격력+"+)---------------------------------------------보유여부:"+하급검.보유무기(하급검.소유여부));
				System.out.println("6. "+중급검.이름+"(공격력 "+(int)중급검.공격력+"+)---------------------------------------------보유여부:"+중급검.보유무기(중급검.소유여부));
				System.out.println("7. "+상급검.이름+"(공격력 "+(int)상급검.공격력+"+)---------------------------------------------보유여부:"+상급검.보유무기(상급검.소유여부));
				System.out.println("==========================================================================");
				System.out.println("1. 낡은 검        2. 강철 검        3. 무의 검        4. 자하드의 검 ");
				System.out.println("5. 하급 검        6. 중급 검        7. 상급 검");
				System.out.println("==========================================================================");
				System.out.println("0. 뒤로");
				System.out.println("--------------------------------------------------------------------------");
				System.out.print("하고 싶은 무기를 선택하세요:");
				String weapon_number=scan.next();
				if(weapon_number.equals("1")) {//낡은 검
					if(낡은검.소유여부==1) {
						for(int i=0; i<60; i++) {
							System.out.println("");
						}
						사운드스레드 장착스레드=new 사운드스레드("weapon_armor_equip.mp3",false);
						장착스레드.start();
						System.out.println("-----------------------------------------------------------");
						System.out.println(낡은검.이름+"을(를) 장착하셨습니다!");
						System.out.println("-----------------------------------------------------------");
						this.장착무기=낡은검.이름;
						this.공격력+=낡은검.공격력;
						this.무기장착여부=1;
						try {
							Thread.sleep(1500);
						} catch (InterruptedException e) {
							e.printStackTrace();
						}
						break;
				} else {
					for(int i=0; i<60; i++) {
						System.out.println("");
					}
					System.out.println("<아직 해당 무기는 가지고 있지 않습니다.>");
					System.out.println("");
					try {
						Thread.sleep(1500);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			}else if(weapon_number.equals("2")) {//강철 검
				if(강철검.소유여부==1) {
					for(int i=0; i<60; i++) {
						System.out.println("");
					}
					사운드스레드 장착스레드=new 사운드스레드("weapon_armor_equip.mp3",false);
					장착스레드.start();
					System.out.println("-----------------------------------------------------------");
					System.out.println(강철검.이름+"을(를) 장착하셨습니다!");
					System.out.println("-----------------------------------------------------------");
					this.장착무기=강철검.이름;
					this.공격력+=강철검.공격력;
					this.무기장착여부=1;
					try {
						Thread.sleep(1500);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					break;
				}else {
					for(int i=0; i<60; i++) {
						System.out.println("");
					}
					System.out.println("<아직 해당 무기는 가지고 있지 않습니다.>");
					System.out.println("");
					try {
						Thread.sleep(1500);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			}else if(weapon_number.equals("3")) {//무의 검
					if(무의검.소유여부==1) {
						for(int i=0; i<60; i++) {
							System.out.println("");
						}
						사운드스레드 장착스레드=new 사운드스레드("weapon_armor_equip.mp3",false);
						장착스레드.start();
						System.out.println("-----------------------------------------------------------");
						System.out.println(무의검.이름+"을(를) 장착하셨습니다!");
						System.out.println("-----------------------------------------------------------");
						this.장착무기=무의검.이름;
						this.공격력+=무의검.공격력;
						this.무기장착여부=1;
						try {
							Thread.sleep(1500);
						} catch (InterruptedException e) {
							e.printStackTrace();
						}
						break;
					}else {
						for(int i=0; i<60; i++) {
							System.out.println("");
						}
						System.out.println("<아직 해당 무기는 가지고 있지 않습니다.>");
						System.out.println("");
						try {
							Thread.sleep(1500);
						} catch (InterruptedException e) {
							e.printStackTrace();
						}
					}	
			}else if(weapon_number.equals("4")) {//자하드의 검
					if(자하드의검.소유여부==1) {
						for(int i=0; i<60; i++) {
							System.out.println("");
						}
						사운드스레드 장착스레드=new 사운드스레드("weapon_armor_equip.mp3",false);
						장착스레드.start();
						System.out.println("-----------------------------------------------------------");
						System.out.println(자하드의검.이름+"을(를) 장착하셨습니다!");
						System.out.println("-----------------------------------------------------------");
						this.장착무기=자하드의검.이름;
						this.공격력+=자하드의검.공격력;
						this.무기장착여부=1;
						try {
							Thread.sleep(1500);
						} catch (InterruptedException e) {
							e.printStackTrace();
						}
						break;
					}else {
						for(int i=0; i<60; i++) {
							System.out.println("");
						}
						System.out.println("<아직 해당 무기는 가지고 있지 않습니다.>");
						System.out.println("");
						try {
							Thread.sleep(1500);
						} catch (InterruptedException e) {
							e.printStackTrace();
						}
					}
			}else if(weapon_number.equals("5")) {//하급 검 
				if(하급검.소유여부==1) {
					for(int i=0; i<60; i++) {
						System.out.println("");
					}
					사운드스레드 장착스레드=new 사운드스레드("weapon_armor_equip.mp3",false);
					장착스레드.start();
					System.out.println("-----------------------------------------------------------");
					System.out.println(하급검.이름+"을(를) 장착하셨습니다!");
					System.out.println("-----------------------------------------------------------");
					this.장착무기=하급검.이름;
					this.공격력+=하급검.공격력;
					this.무기장착여부=1;
					try {
						Thread.sleep(1500);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					break;
				}else {
					for(int i=0; i<60; i++) {
						System.out.println("");
					}
					System.out.println("<아직 해당 무기는 가지고 있지 않습니다.>");
					System.out.println("");
					try {
						Thread.sleep(1500);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			}else if(weapon_number.equals("6")) {//중급 검
				if(중급검.소유여부==1) {
					for(int i=0; i<60; i++) {
						System.out.println("");
					}
					사운드스레드 장착스레드=new 사운드스레드("weapon_armor_equip.mp3",false);
					장착스레드.start();
					System.out.println("-----------------------------------------------------------");
					System.out.println(중급검.이름+"을(를) 장착하셨습니다!");
					System.out.println("-----------------------------------------------------------");
					this.장착무기=중급검.이름;
					this.공격력+=중급검.공격력;
					this.무기장착여부=1;
					try {
						Thread.sleep(1500);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					break;
				}else {
					for(int i=0; i<60; i++) {
						System.out.println("");
					}
					System.out.println("<아직 해당 무기는 가지고 있지 않습니다.>");
					System.out.println("");
					try {
						Thread.sleep(1500);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			}else if(weapon_number.equals("7")) {//상급 검
				if(상급검.소유여부==1) {
					for(int i=0; i<60; i++) {
						System.out.println("");
					}
					사운드스레드 장착스레드=new 사운드스레드("weapon_armor_equip.mp3",false);
					장착스레드.start();
					System.out.println("-----------------------------------------------------------");
					System.out.println(상급검.이름+"을(를) 장착하셨습니다!");
					System.out.println("-----------------------------------------------------------");
					this.장착무기=상급검.이름;
					this.공격력+=상급검.공격력;
					this.무기장착여부=1;
					try {
						Thread.sleep(1500);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					break;
				}else {
					for(int i=0; i<60; i++) {
						System.out.println("");
					}
					System.out.println("<아직 해당 무기는 가지고 있지 않습니다.>");
					System.out.println("");
					try {
						Thread.sleep(1500);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			}else if(weapon_number.equals("0")) {
				break;
			}else {
				for(int i=0; i<60; i++) {
					System.out.println("");
				}
				System.out.println("<잘못 입력하셨습니다. 다시 입력해주세요.>");
				System.out.println("");
				try {
					Thread.sleep(1500);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		
		}else {//장착중인 무기가 있을 때는 무기 장착 메뉴로 진입 불가
			for(int i=0; i<60; i++) {
				System.out.println("");
			}
			System.out.println("<이미 장착 중인 무기가 있습니다. 장착을 해제한 후 시도해주세요.>");
			System.out.println("");
			try {
				Thread.sleep(1500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			break;
			
		}
	}
}
//--------------------------------------------------------------------------------------	

//------------------------무기장착 해제 매소드---------------------------------------------------
	public void 무기장착해제(무기 낡은검, 무기 강철검, 무기 무의검, 무기 자하드의검, 무기 하급검, 무기 중급검, 무기 상급검) {
		while(true) {
			if(this.장착무기.equals("없음")) {//장착중인 무기가 없으면 무기장착 해제 메뉴로 진입 불가
				for(int i=0; i<60; i++) {
					System.out.println("");
				}
				System.out.println("<장착중인 무기가 없습니다.>");
				System.out.println("");
				try {
					Thread.sleep(1500);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				break;
			}else {//장착중인 무기가 있으면 무기장착 해제 메뉴로 진입 가능
				for(int i=0; i<60; i++) {
					System.out.println("");
				}
				System.out.println("===========================================================");
				System.out.println("1. 낡은 검        2. 강철 검        3. 무의 검        4. 자하드의 검 ");
				System.out.println("5. 하급 검        6. 중급 검        7. 상급 검");
				System.out.println("===========================================================");
				System.out.println("장착을 해제하고 싶은 무기를 선택하세요.");
				System.out.println("");
				System.out.println("0. 뒤로");
				System.out.println("-----------------------------------------------------------");
				String weapon_number=scan.next();
				if(weapon_number.equals("1")) {//낡은 검
					if(낡은검.소유여부==1) {
						 if(this.무기장착여부==1){
							 for(int i=0; i<60; i++) {
									System.out.println("");
								}
							사운드스레드 장착해제사운드스레드=new 사운드스레드("unmounting.mp3",false);
							장착해제사운드스레드.start();
							System.out.println("-----------------------------------------------------------");
							System.out.println(낡은검.이름+"을(를) 장착 해제하셨습니다.");
							System.out.println("-----------------------------------------------------------");
							this.장착무기="없음";
							this.공격력-=낡은검.공격력;
							this.무기장착여부=0;
							try {
								Thread.sleep(1500);
							} catch (InterruptedException e) {
								e.printStackTrace();
							}
							break;
						}else {
							for(int i=0; i<60; i++) {
								System.out.println("");
							}
							System.out.println("");
							System.out.println("<장착중인 무기가 없습니다.>");
							System.out.println("");
							try {
								Thread.sleep(1500);
							} catch (InterruptedException e) {
								e.printStackTrace();
							}
						}
					}else {
						for(int i=0; i<60; i++) {
							System.out.println("");
						}
						System.out.println("");
						System.out.println("<아직 해당 무기는 가지고 있지 않습니다.>");
						System.out.println("");
						try {
							Thread.sleep(1500);
						} catch (InterruptedException e) {
							e.printStackTrace();
						}
						
						
					}
				}else if(weapon_number.equals("2")) {//강철 검
					if(강철검.소유여부==1) {
						if(this.무기장착여부==1) {
							for(int i=0; i<60; i++) {
								System.out.println("");
							}
							사운드스레드 장착해제사운드스레드=new 사운드스레드("unmounting.mp3",false);
							장착해제사운드스레드.start();
							System.out.println("-----------------------------------------------------------");
							System.out.println(강철검.이름+"을(를) 장착 해제하셨습니다.");
							System.out.println("-----------------------------------------------------------");
							this.장착무기="없음";
							this.공격력-=강철검.공격력;
							this.무기장착여부=0;
							try {
								Thread.sleep(1500);
							} catch (InterruptedException e) {
								e.printStackTrace();
							}
							break;
						}else {
							for(int i=0; i<60; i++) {
								System.out.println("");
							}
							System.out.println("");
							System.out.println("<장착중인 무기가 없습니다.>");
							System.out.println("");
							try {
								Thread.sleep(1500);
							} catch (InterruptedException e) {
								e.printStackTrace();
							}
						}
					}else {
						for(int i=0; i<60; i++) {
							System.out.println("");
						}
						System.out.println("");
						System.out.println("<아직 해당 무기는 가지고 있지 않습니다.>");
						System.out.println("");
						try {
							Thread.sleep(1500);
						} catch (InterruptedException e) {
							e.printStackTrace();
						}
						
						
					}
				}else if(weapon_number.equals("3")) {//무의 검
					if(this.무기장착여부==1) {
						if(무의검.소유여부==1) {
							for(int i=0; i<60; i++) {
								System.out.println("");
							}
							사운드스레드 장착해제사운드스레드=new 사운드스레드("unmounting.mp3",false);
							장착해제사운드스레드.start();
							System.out.println("-----------------------------------------------------------");
							System.out.println(무의검.이름+"을(를) 장착 해제하셨습니다.");
							System.out.println("-----------------------------------------------------------");
							this.장착무기="없음";
							this.공격력-=무의검.공격력;
							this.무기장착여부=0;
							try {
								Thread.sleep(1500);
							} catch (InterruptedException e) {
								e.printStackTrace();
							}
							break;
						}else {
							for(int i=0; i<60; i++) {
								System.out.println("");
							}
							System.out.println("");
							System.out.println("<아직 해당 무기는 가지고 있지 않습니다.>");
							System.out.println("");
							try {
								Thread.sleep(1500);
							} catch (InterruptedException e) {
								e.printStackTrace();
							}
						}
					}else {
						for(int i=0; i<60; i++) {
							System.out.println("");
						}
						System.out.println("");
						System.out.println("<장착중인 무기가 없습니다.>");
						System.out.println("");
						try {
							Thread.sleep(1500);
						} catch (InterruptedException e) {
							e.printStackTrace();
						}
						
					}
				}else if(weapon_number.equals("4")) {//자하드의 검
					if(this.무기장착여부==1) {
						if(자하드의검.소유여부==1) {
							for(int i=0; i<60; i++) {
								System.out.println("");
							}
							사운드스레드 장착해제사운드스레드=new 사운드스레드("unmounting.mp3",false);
							장착해제사운드스레드.start();
							System.out.println("-----------------------------------------------------------");
							System.out.println(자하드의검.이름+"을(를) 장착 해제하셨습니다.");
							System.out.println("-----------------------------------------------------------");
							this.장착무기="없음";
							this.공격력-=자하드의검.공격력;
							this.무기장착여부=0;
							try {
								Thread.sleep(1500);
							} catch (InterruptedException e) {
								e.printStackTrace();
							}
							break;
						}else {
							for(int i=0; i<60; i++) {
								System.out.println("");
							}
							System.out.println("");
							System.out.println("<아직 해당 무기는 가지고 있지 않습니다.>");
							System.out.println("");
							try {
								Thread.sleep(1500);
							} catch (InterruptedException e) {
								e.printStackTrace();
							}
						}
					}else {
						for(int i=0; i<60; i++) {
							System.out.println("");
						}
						System.out.println("");
						System.out.println("<장착중인 무기가 없습니다.>");
						System.out.println("");
						try {
							Thread.sleep(1500);
						} catch (InterruptedException e) {
							e.printStackTrace();
						}
						
					}
				}else if(weapon_number.equals("5")) {//하급 검
					if(this.무기장착여부==1) {
						if(하급검.소유여부==1) {
							for(int i=0; i<60; i++) {
								System.out.println("");
							}
							사운드스레드 장착해제사운드스레드=new 사운드스레드("unmounting.mp3",false);
							장착해제사운드스레드.start();
							System.out.println("-----------------------------------------------------------");
							System.out.println(하급검.이름+"을(를) 장착 해제하셨습니다.");
							System.out.println("-----------------------------------------------------------");
							this.장착무기="없음";
							this.공격력-=하급검.공격력;
							this.무기장착여부=0;
							try {
								Thread.sleep(1500);
							} catch (InterruptedException e) {
								e.printStackTrace();
							}
							break;
						}else {
							for(int i=0; i<60; i++) {
								System.out.println("");
							}
							System.out.println("");
							System.out.println("<아직 해당 무기는 가지고 있지 않습니다.>");
							System.out.println("");
							try {
								Thread.sleep(1500);
							} catch (InterruptedException e) {
								e.printStackTrace();
							}
						}
					}else {
						for(int i=0; i<60; i++) {
							System.out.println("");
						}
						System.out.println("");
						System.out.println("<장착중인 무기가 없습니다.>");
						System.out.println("");
						try {
							Thread.sleep(1500);
						} catch (InterruptedException e) {
							e.printStackTrace();
						}
					}
				}else if(weapon_number.equals("6")) {//중급 검
					if(this.무기장착여부==1) {
						if(중급검.소유여부==1) {
							for(int i=0; i<60; i++) {
								System.out.println("");
							}
							사운드스레드 장착해제사운드스레드=new 사운드스레드("unmounting.mp3",false);
							장착해제사운드스레드.start();
							System.out.println("-----------------------------------------------------------");
							System.out.println(중급검.이름+"을(를) 장착 해제하셨습니다.");
							System.out.println("-----------------------------------------------------------");
							this.장착무기="없음";
							this.공격력-=중급검.공격력;
							this.무기장착여부=0;
							try {
								Thread.sleep(1500);
							} catch (InterruptedException e) {
								e.printStackTrace();
							}
							break;
						}else {
							for(int i=0; i<60; i++) {
								System.out.println("");
							}
							System.out.println("");
							System.out.println("<아직 해당 무기는 가지고 있지 않습니다.>");
							System.out.println("");
							try {
								Thread.sleep(1500);
							} catch (InterruptedException e) {
								e.printStackTrace();
							}
						}
					}else {
						for(int i=0; i<60; i++) {
							System.out.println("");
						}
						System.out.println("");
						System.out.println("<장착중인 무기가 없습니다.>");
						System.out.println("");
						try {
							Thread.sleep(1500);
						} catch (InterruptedException e) {
							e.printStackTrace();
						}
					}
				}else if(weapon_number.equals("7")) {//상급 검
					if(this.무기장착여부==1) {
						if(상급검.소유여부==1) {
							for(int i=0; i<60; i++) {
								System.out.println("");
							}
							사운드스레드 장착해제사운드스레드=new 사운드스레드("unmounting.mp3",false);
							장착해제사운드스레드.start();
							System.out.println("-----------------------------------------------------------");
							System.out.println(상급검.이름+"을(를) 장착 해제하셨습니다.");
							System.out.println("-----------------------------------------------------------");
							this.장착무기="없음";
							this.공격력-=상급검.공격력;
							this.무기장착여부=0;
							try {
								Thread.sleep(1500);
							} catch (InterruptedException e) {
								e.printStackTrace();
							}
							break;
						}else {
							for(int i=0; i<60; i++) {
								System.out.println("");
							}
							System.out.println("");
							System.out.println("<아직 해당 무기는 가지고 있지 않습니다.>");
							System.out.println("");
							try {
								Thread.sleep(1500);
							} catch (InterruptedException e) {
								e.printStackTrace();
							}
						}
					}else {
						for(int i=0; i<60; i++) {
							System.out.println("");
						}
						System.out.println("");
						System.out.println("<장착중인 무기가 없습니다.>");
						System.out.println("");
						try {
							Thread.sleep(1500);
						} catch (InterruptedException e) {
							e.printStackTrace();
						}
						
					}
				}else if(weapon_number.equals("0")) {
					break;
				}else {
					for(int i=0; i<60; i++) {
						System.out.println("");
					}
					System.out.println("");
					System.out.println("<잘못 입력하셨습니다. 다시 입력해주세요.>");
					System.out.println("");
					try {
						Thread.sleep(1500);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			}	
		}
	}
//--------------------------------------------------------------------------------------
	
//---------------------------방어구 장착 메소드-------------------------------------------------
	public void 방어구장착(방어구 낡은갑옷, 방어구 강철갑옷, 방어구 무의갑옷, 방어구 자하드의갑옷, 방어구 하급갑옷, 방어구 중급갑옷, 방어구 상급갑옷){
		while(true) {
			if(this.장착방어구.equals("없음")){
				for(int i=0; i<60; i++) {
					System.out.println("");
				}
				System.out.println("===========================================================");
				System.out.println("1. "+낡은갑옷.이름+"(방어력 "+(int)낡은갑옷.방어력+"+)--------------------------------보유여부:"+낡은갑옷.보유방어구(낡은갑옷.소유여부));
				System.out.println("2. "+강철갑옷.이름+"(방어력 "+(int)강철갑옷.방어력+"+)--------------------------------보유여부:"+강철갑옷.보유방어구(강철갑옷.소유여부));
				System.out.println("3. "+무의갑옷.이름+"(방어력 "+(int)무의갑옷.방어력+"+)--------------------------------보유여부:"+무의갑옷.보유방어구(무의갑옷.소유여부));
				System.out.println("4. "+자하드의갑옷.이름+"(방어력 "+(int)자하드의갑옷.방어력+"+)-----------------------------보유여부:"+자하드의갑옷.보유방어구(자하드의갑옷.소유여부));									
				System.out.println("5. "+하급갑옷.이름+"(방어력 "+(int)하급갑옷.방어력+"+)--------------------------------보유여부:"+하급갑옷.보유방어구(하급갑옷.소유여부));
				System.out.println("6. "+중급갑옷.이름+"(방어력 "+(int)중급갑옷.방어력+"+)--------------------------------보유여부:"+중급갑옷.보유방어구(중급갑옷.소유여부));
				System.out.println("7. "+상급갑옷.이름+"(방어력 "+(int)상급갑옷.방어력+"+)--------------------------------보유여부:"+상급갑옷.보유방어구(상급갑옷.소유여부));
				System.out.println("===========================================================");
				System.out.println("1. 낡은 갑옷        2. 강철 갑옷        3. 무의 갑옷        4. 자하드의 갑옷");
				System.out.println("5. 하급 갑옷        6. 중급 갑옷        7. 상급 갑옷");
				System.out.println("===========================================================");
				System.out.println("0. 뒤로");
				System.out.println("-----------------------------------------------------------");
				System.out.print("장착하고 싶은 방어구를 선택하세요:");
				String armor_number=scan.next();
				if(armor_number.equals("1")) {//낡은 갑옷
					if(낡은갑옷.소유여부==1) {
						for(int i=0; i<60; i++) {
							System.out.println("");
						}
						사운드스레드 장착스레드=new 사운드스레드("weapon_armor_equip.mp3",false);
						장착스레드.start();
						System.out.println("-----------------------------------------------------------");
						System.out.println(낡은갑옷.이름+"을(를) 장착하셨습니다!");
						System.out.println("-----------------------------------------------------------");
						try {
							Thread.sleep(1500);
						} catch (InterruptedException e) {
							e.printStackTrace();
						}
						this.장착방어구=낡은갑옷.이름;
						this.방어력+=낡은갑옷.방어력;
						this.방어구장착여부=1;
						break;
				} else {
					for(int i=0; i<60; i++) {
						System.out.println("");
					}
					System.out.println("");
					System.out.println("<아직 해당 방어구는 가지고 있지 않습니다.>");
					System.out.println("");
					try {
						Thread.sleep(1500);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			}else if(armor_number.equals("2")) {//강철 갑옷
				if(강철갑옷.소유여부==1) {
					for(int i=0; i<60; i++) {
						System.out.println("");
					}
					사운드스레드 장착스레드=new 사운드스레드("weapon_armor_equip.mp3",false);
					장착스레드.start();
					System.out.println("-----------------------------------------------------------");
					System.out.println(강철갑옷.이름+"을(를) 장착하셨습니다!");
					System.out.println("-----------------------------------------------------------");
					this.장착방어구=강철갑옷.이름;
					this.방어력+=강철갑옷.방어력;
					this.방어구장착여부=1;
					try {
						Thread.sleep(1500);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					break;
				}else {
					for(int i=0; i<60; i++) {
						System.out.println("");
					}
					System.out.println("");
					System.out.println("<아직 해당 방어구는 가지고 있지 않습니다.>");
					System.out.println("");
					try {
						Thread.sleep(1500);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			}else if(armor_number.equals("3")) {//무의 갑옷
					if(무의갑옷.소유여부==1) {
						for(int i=0; i<60; i++) {
							System.out.println("");
						}
						사운드스레드 장착스레드=new 사운드스레드("weapon_armor_equip.mp3",false);
						장착스레드.start();
						System.out.println("-----------------------------------------------------------");
						System.out.println(무의갑옷.이름+"을(를) 장착하셨습니다!");
						System.out.println("-----------------------------------------------------------");
						
						this.장착방어구=무의갑옷.이름;
						this.방어력+=무의갑옷.방어력;
						this.방어구장착여부=1;
						try {
							Thread.sleep(1500);
						} catch (InterruptedException e) {
							e.printStackTrace();
						}
						break;
					}else {
						for(int i=0; i<60; i++) {
							System.out.println("");
						}
						System.out.println("-----------------------------------------------------------");
						System.out.println("<아직 해당 방어구는 가지고 있지 않습니다.>");
						System.out.println("-----------------------------------------------------------");
						try {
							Thread.sleep(1500);
						} catch (InterruptedException e) {
							e.printStackTrace();
						}
					}	
			}else if(armor_number.equals("4")) {//자하드의 갑옷
					if(자하드의갑옷.소유여부==1) {
						for(int i=0; i<60; i++) {
							System.out.println("");
						}
						사운드스레드 장착스레드=new 사운드스레드("weapon_armor_equip.mp3",false);
						장착스레드.start();
						System.out.println("-----------------------------------------------------------");
						System.out.println(자하드의갑옷.이름+"을(를) 장착하셨습니다!");
						System.out.println("-----------------------------------------------------------");
						this.장착방어구=자하드의갑옷.이름;
						this.방어력+=자하드의갑옷.방어력;
						this.방어구장착여부=1;
						try {
							Thread.sleep(1500);
						} catch (InterruptedException e) {
							e.printStackTrace();
						}
						break;
					}else {
						for(int i=0; i<60; i++) {
							System.out.println("");
						}
						System.out.println("");
						System.out.println("<아직 해당 방어구는 가지고 있지 않습니다.>");
						System.out.println("");
						try {
							Thread.sleep(1500);
						} catch (InterruptedException e) {
							e.printStackTrace();
						}
					}
			}else if(armor_number.equals("5")) {//하급 갑옷
				if(하급갑옷.소유여부==1) {
					for(int i=0; i<60; i++) {
						System.out.println("");
					}
					사운드스레드 장착스레드=new 사운드스레드("weapon_armor_equip.mp3",false);
					장착스레드.start();
					System.out.println("-----------------------------------------------------------");
					System.out.println(하급갑옷.이름+"을(를) 장착하셨습니다!");
					System.out.println("-----------------------------------------------------------");
					this.장착방어구=하급갑옷.이름;
					this.방어력+=하급갑옷.방어력;
					this.방어구장착여부=1;
					try {
						Thread.sleep(1500);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					break;
				}else {
					for(int i=0; i<60; i++) {
						System.out.println("");
					}
					System.out.println("");
					System.out.println("<아직 해당 방어구는 가지고 있지 않습니다.>");
					System.out.println("");
					try {
						Thread.sleep(1500);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			}else if(armor_number.equals("6")) {//중급 갑옷
				if(중급갑옷.소유여부==1) {
					for(int i=0; i<60; i++) {
						System.out.println("");
					}
					사운드스레드 장착스레드=new 사운드스레드("weapon_armor_equip.mp3",false);
					장착스레드.start();
					System.out.println("-----------------------------------------------------------");
					System.out.println(중급갑옷.이름+"을(를) 장착하셨습니다!");
					System.out.println("-----------------------------------------------------------");
					this.장착방어구=중급갑옷.이름;
					this.방어력+=중급갑옷.방어력;
					this.방어구장착여부=1;
					try {
						Thread.sleep(1500);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					break;
				}else {
					for(int i=0; i<60; i++) {
						System.out.println("");
					}
					System.out.println("");
					System.out.println("<아직 해당 무기는 가지고 있지 않습니다.>");
					System.out.println("");
					try {
						Thread.sleep(1500);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			}else if(armor_number.equals("7")) {//상급 갑옷
				if(상급갑옷.소유여부==1) {
					for(int i=0; i<60; i++) {
						System.out.println("");
					}
					사운드스레드 장착스레드=new 사운드스레드("weapon_armor_equip.mp3",false);
					장착스레드.start();
					System.out.println("-----------------------------------------------------------");
					System.out.println(상급갑옷.이름+"을(를) 장착하셨습니다!");
					System.out.println("-----------------------------------------------------------");
					this.장착방어구=상급갑옷.이름;
					this.방어력+=상급갑옷.방어력;
					this.방어구장착여부=1;
					try {
						Thread.sleep(1500);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					break;
				}else {
					for(int i=0; i<60; i++) {
						System.out.println("");
					}
					System.out.println("");
					System.out.println("<아직 해당 무기는 가지고 있지 않습니다.>");
					System.out.println("");
					try {
						Thread.sleep(1500);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			}else if(armor_number.equals("0")) {//뒤로
				break;	
			}else {
				for(int i=0; i<60; i++) {
					System.out.println("");
				}
				System.out.println("");
				System.out.println("<잘못 입력하셨습니다. 다시 입력해주세요.>");
				System.out.println("");
				try {
					Thread.sleep(1500);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}else {
			for(int i=0; i<60; i++) {
				System.out.println("");
			}
			System.out.println("");
			System.out.println("<이미 장착 중인 방어구가 있습니다. 장착을 해제한 후 시도해주세요.>");
			System.out.println("");
			try {
				Thread.sleep(1500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			break;
		}
	}
}
//--------------------------------------------------------------------------------------
	
//-----------------------------방어구 장착 해제 매소드--------------------------------------------
	public void 방어구장착해제(방어구 낡은갑옷, 방어구 강철갑옷, 방어구 무의갑옷, 방어구 자하드의갑옷, 방어구 하급갑옷, 방어구 중급갑옷, 방어구 상급갑옷) {
		while(true) {
			if(this.장착방어구.equals("없음")) {
				for(int i=0; i<60; i++) {
					System.out.println("");
				}
				System.out.println("<장착 중인 방어구가 없습니다.>");
				System.out.println("");
				try {
					Thread.sleep(1500);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				break;
			}else {
				for(int i=0; i<60; i++) {
					System.out.println("");
				}
				System.out.println("===========================================================");	
				System.out.println("1. 낡은 갑옷       2. 강철 갑옷        3. 무의 갑옷        4. 자하드의 갑옷");
				System.out.println("5. 하급 갑옷       6. 중급 갑옷        7. 상급 갑옷");
				System.out.println("===========================================================");
				System.out.println("장착을 해제하고 싶은 방어구를 선택하세요.");
				System.out.println("");
				System.out.println("0. 뒤로");
				System.out.println("-----------------------------------------------------------");
				String armor_number=scan.next();
				if(armor_number.equals("1")) {//낡은 갑옷
					if(this.방어구장착여부==1) {
						if(낡은갑옷.소유여부==1) {
							for(int i=0; i<60; i++) {
								System.out.println("");
							}
							사운드스레드 장착해제사운드스레드=new 사운드스레드("unmounting.mp3",false);
							장착해제사운드스레드.start();
							System.out.println("-----------------------------------------------------------");
							System.out.println(낡은갑옷.이름+"을(를) 장착 해제하셨습니다.");
							System.out.println("-----------------------------------------------------------");
							this.장착방어구="없음";
							this.방어력-=낡은갑옷.방어력;
							this.무기장착여부=0;
							try {
								Thread.sleep(1500);
							} catch (InterruptedException e) {
								e.printStackTrace();
							}
							break;
						}else {
							for(int i=0; i<60; i++) {
								System.out.println("");
							}
							System.out.println("<아직 해당 방어구는 가지고 있지 않습니다.>");
							System.out.println("");
							try {
								Thread.sleep(1500);
							} catch (InterruptedException e) {
								e.printStackTrace();
							}
						}
					}else {
						for(int i=0; i<60; i++) {
							System.out.println("");
						}
						System.out.println("");
						System.out.println("<장착중인 방어구가 없습니다.>");
						System.out.println("");
						try {
							Thread.sleep(1500);
						} catch (InterruptedException e) {
							e.printStackTrace();
						}
					}
				}else if(armor_number.equals("2")) {//강철 갑옷
					if(this.방어구장착여부==1) {
						if(강철갑옷.소유여부==1) {
							for(int i=0; i<60; i++) {
								System.out.println("");
							}
							사운드스레드 장착해제사운드스레드=new 사운드스레드("unmounting.mp3",false);
							장착해제사운드스레드.start();
							System.out.println("-----------------------------------------------------------");
							System.out.println(강철갑옷.이름+"을(를) 장착 해제하셨습니다.");
							System.out.println("-----------------------------------------------------------");
							this.장착방어구="없음";
							this.방어력-=강철갑옷.방어력;
							this.방어구장착여부=0;
							try {
								Thread.sleep(1500);
							} catch (InterruptedException e) {
								e.printStackTrace();
							}
							break;
						}else {
							for(int i=0; i<60; i++) {
								System.out.println("");
							}
							System.out.println("");
							System.out.println("<아직 해당 방어구는 가지고 있지 않습니다.>");
							System.out.println("");
							try {
								Thread.sleep(1500);
							} catch (InterruptedException e) {
								e.printStackTrace();
							}
						}
					}else {
						for(int i=0; i<60; i++) {
							System.out.println("");
						}
						System.out.println("");
						System.out.println("<장착중인 방어구가 없습니다.>");
						System.out.println("");
						try {
							Thread.sleep(1500);
						} catch (InterruptedException e) {
							e.printStackTrace();
						}
						
					}
				}else if(armor_number.equals("3")) {//무의 갑옷
					if(this.방어구장착여부==1) {
						if(무의갑옷.소유여부==1) {
							for(int i=0; i<60; i++) {
								System.out.println("");
							}
							사운드스레드 장착해제사운드스레드=new 사운드스레드("unmounting.mp3",false);
							장착해제사운드스레드.start();
							System.out.println("-----------------------------------------------------------");
							System.out.println(무의갑옷.이름+"을(를) 장착 해제하셨습니다.");
							System.out.println("-----------------------------------------------------------");
							this.장착방어구="없음";
							this.방어력-=무의갑옷.방어력;
							this.방어구장착여부=0;
							try {
								Thread.sleep(1500);
							} catch (InterruptedException e) {
								e.printStackTrace();
							}
							break;
						}else {
							for(int i=0; i<60; i++) {
								System.out.println("");
							}
							System.out.println("");
							System.out.println("<아직 해당 방어구는 가지고 있지 않습니다.>");
							System.out.println("");
							try {
								Thread.sleep(1500);
							} catch (InterruptedException e) {
								e.printStackTrace();
							}
						}
					}else {
						for(int i=0; i<60; i++) {
							System.out.println("");
						}
						System.out.println("");
						System.out.println("<장착중인 방어구가 없습니다.>");
						System.out.println("");
						try {
							Thread.sleep(1500);
						} catch (InterruptedException e) {
							e.printStackTrace();
						}
						
					}
				}else if(armor_number.equals("4")) {//자하드의 갑옷
					if(this.방어구장착여부==1) {
						if(자하드의갑옷.소유여부==1) {
							for(int i=0; i<60; i++) {
								System.out.println("");
							}
							사운드스레드 장착해제사운드스레드=new 사운드스레드("unmounting.mp3",false);
							장착해제사운드스레드.start();
							System.out.println("-----------------------------------------------------------");
							System.out.println(자하드의갑옷.이름+"을(를) 장착 해제하셨습니다.");
							System.out.println("-----------------------------------------------------------");
							this.장착방어구="없음";
							this.방어력-=자하드의갑옷.방어력;
							this.방어구장착여부=0;
							try {
								Thread.sleep(1500);
							} catch (InterruptedException e) {
								e.printStackTrace();
							}
							break;
						}else {
							for(int i=0; i<60; i++) {
								System.out.println("");
							}
							System.out.println("");
							System.out.println("<아직 해당 방어구는 가지고 있지 않습니다.>");
							System.out.println("");
							try {
								Thread.sleep(1500);
							} catch (InterruptedException e) {
								e.printStackTrace();
							}
						}
					}else {
						for(int i=0; i<60; i++) {
							System.out.println("");
						}
						System.out.println("");
						System.out.println("<장착중인 방어구가 없습니다.>");
						System.out.println("");
						try {
							Thread.sleep(1500);
						} catch (InterruptedException e) {
							e.printStackTrace();
						}
					}
				}else if(armor_number.equals("5")) {//하급 갑옷
					if(this.방어구장착여부==1) {
						if(하급갑옷.소유여부==1) {
							for(int i=0; i<60; i++) {
								System.out.println("");
							}
							사운드스레드 장착해제사운드스레드=new 사운드스레드("unmounting.mp3",false);
							장착해제사운드스레드.start();
							System.out.println("-----------------------------------------------------------");
							System.out.println(하급갑옷.이름+"을(를) 장착 해제하셨습니다.");
							System.out.println("-----------------------------------------------------------");
							this.장착방어구="없음";
							this.방어력-=하급갑옷.방어력;
							this.방어구장착여부=0;
							try {
								Thread.sleep(1500);
							} catch (InterruptedException e) {
								e.printStackTrace();
							}
							break;
						}else {
							for(int i=0; i<60; i++) {
								System.out.println("");
							}
							System.out.println("");
							System.out.println("<아직 해당 방어구는 가지고 있지 않습니다.>");
							System.out.println("");
							try {
								Thread.sleep(1500);
							} catch (InterruptedException e) {
								e.printStackTrace();
							}
						}
					}else {
						for(int i=0; i<60; i++) {
							System.out.println("");
						}
						System.out.println("");
						System.out.println("<장착중인 방어구가 없습니다.>");
						System.out.println("");
						try {
							Thread.sleep(1500);
						} catch (InterruptedException e) {
							e.printStackTrace();
						}
					}
				}else if(armor_number.equals("6")) {//중급 갑옷
					if(this.방어구장착여부==1) {
						if(중급갑옷.소유여부==1) {
							for(int i=0; i<60; i++) {
								System.out.println("");
							}
							사운드스레드 장착해제사운드스레드=new 사운드스레드("unmounting.mp3",false);
							장착해제사운드스레드.start();
							System.out.println("-----------------------------------------------------------");
							System.out.println(중급갑옷.이름+"을(를) 장착 해제하셨습니다.");
							System.out.println("-----------------------------------------------------------");
							this.장착방어구="없음";
							this.방어력-=중급갑옷.방어력;
							this.방어구장착여부=0;
							try {
								Thread.sleep(1500);
							} catch (InterruptedException e) {
								e.printStackTrace();
							}
							break;
						}else {
							for(int i=0; i<60; i++) {
								System.out.println("");
							}
							System.out.println("");
							System.out.println("<아직 해당 방어구는 가지고 있지 않습니다.>");
							System.out.println("");
							try {
								Thread.sleep(1500);
							} catch (InterruptedException e) {
								e.printStackTrace();
							}
						}
					}else {
						for(int i=0; i<60; i++) {
							System.out.println("");
						}
						System.out.println("");
						System.out.println("<장착중인 방어구가 없습니다.>");
						System.out.println("");
						try {
							Thread.sleep(1500);
						} catch (InterruptedException e) {
							e.printStackTrace();
						}
					}
				}else if(armor_number.equals("7")) {//상급 갑옷
					if(this.방어구장착여부==1) {
						if(상급갑옷.소유여부==1) {
							for(int i=0; i<60; i++) {
								System.out.println("");
							}
							사운드스레드 장착해제사운드스레드=new 사운드스레드("unmounting.mp3",false);
							장착해제사운드스레드.start();
							System.out.println("-----------------------------------------------------------");
							System.out.println(상급갑옷.이름+"을(를) 장착 해제하셨습니다.");
							System.out.println("-----------------------------------------------------------");
							this.장착방어구="없음";
							this.방어력-=상급갑옷.방어력;
							this.방어구장착여부=0;
							try {
								Thread.sleep(1500);
							} catch (InterruptedException e) {
								e.printStackTrace();
							}
							break;
						}else {
							for(int i=0; i<60; i++) {
								System.out.println("");
							}
							System.out.println("");
							System.out.println("<아직 해당 방어구는 가지고 있지 않습니다.>");
							System.out.println("");
							try {
								Thread.sleep(1500);
							} catch (InterruptedException e) {
								e.printStackTrace();
							}
						}
					}else {
						for(int i=0; i<60; i++) {
							System.out.println("");
						}
						System.out.println("");
						System.out.println("<장착중인 방어구가 없습니다.>");
						System.out.println("");
						try {
							Thread.sleep(1500);
						} catch (InterruptedException e) {
							e.printStackTrace();
						}
						
					}
				}else if(armor_number.equals("0")) {//뒤로
					break;
		
				}else{
					for(int i=0; i<60; i++) {
						System.out.println("");
					}
					System.out.println("");
					System.out.println("<잘못 입력하셨습니다. 다시 입력해주세요.>");
					System.out.println("");
					try {
						Thread.sleep(1500);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			}	
		}
	}
//--------------------------------------------------------------------------------------
	
//------------------------------------물약복용 메소드-----------------------------------------
	public void 물약복용(hp포션 하급hp포션, hp포션 중급hp포션, hp포션 상급hp포션, mp포션 하급mp포션, mp포션 중급mp포션, mp포션 상급mp포션) {
		while(true) {
			for(int i=0; i<60; i++) {
				System.out.println("");
			}
			System.out.println("보유물약");
			System.out.println("===========================================================");
			하급hp포션.하급hp포션개수();
			System.out.println("1. "+하급hp포션.이름+"(hp회복량: "+(int)하급hp포션.hp회복량+") : "+하급hp포션.개수+"개");
			중급hp포션.중급hp포션개수();
			System.out.println("2. "+중급hp포션.이름+"(hp회복량: "+(int)중급hp포션.hp회복량+"): "+중급hp포션.개수+"개");
			상급hp포션.상급hp포션개수();
			System.out.println("3. "+상급hp포션.이름+"(hp회복량: "+(int)상급hp포션.hp회복량+"): "+상급hp포션.개수+"개");
			System.out.println("");
			하급mp포션.하급mp포션개수();
			System.out.println("4. "+하급mp포션.이름+"(mp회복량: "+(int)하급mp포션.mp회복량+") : "+하급mp포션.개수+"개");
			중급mp포션.중급mp포션개수();
			System.out.println("5. "+중급mp포션.이름+"(mp회복량: "+(int)중급mp포션.mp회복량+"): "+중급mp포션.개수+"개");
			상급mp포션.상급mp포션개수();
			System.out.println("6. "+상급mp포션.이름+"(mp회복량: "+(int)상급hp포션.hp회복량+"): "+상급hp포션.개수+"개");
			System.out.println("===========================================================");
			System.out.println("1. 하급hp포션 사용        2. 중급hp포션 사용        3. 상급hp포션 사용");
			System.out.println("4. 하급mp포션 사용        5. 중급mp포션 사용        6. 상급mp포션 사용");
			System.out.println("-----------------------------------------------------------");
			System.out.println("0. 뒤로");
			System.out.println("");
			System.out.print("사용할 포션을 선택해주세요:");
			String potion_setting=scan.next();
			if(potion_setting.equals("1")) {//하급 hp포션
				if(하급hp포션.개수>0) {
					if(this.hp<this.maxhp) {
						if(this.maxhp-this.hp<하급hp포션.hp회복량) {
							사운드스레드 회복사운드=new 사운드스레드("recovery.mp3",false);
							Thread 회복사운드스레드=new Thread(회복사운드);
							회복사운드스레드.start();
							for(int i=0; i<60; i++) {
								System.out.println("");
							}
							System.out.println("");
							System.out.println("hp를 "+(int)(this.maxhp-this.hp)+"만큼 회복하였습니다.");
							System.out.println("");
							this.hp+=this.maxhp-this.hp;
							하급hp포션.개수-=1;
							try {
								Thread.sleep(1500);
							} catch (InterruptedException e) {
								e.printStackTrace();
							}
						}else {
							사운드스레드 회복사운드=new 사운드스레드("recovery.mp3",false);
							Thread 회복사운드스레드=new Thread(회복사운드);
							회복사운드스레드.start();
							this.hp+=하급hp포션.hp회복량;
							for(int i=0; i<60; i++) {
								System.out.println("");
							}
							System.out.println("");
							System.out.println("hp를 "+(int)하급hp포션.hp회복량+"만큼 회복하였습니다.");
							System.out.println("");
							하급hp포션.개수-=1;
							try {
								Thread.sleep(1500);
							} catch (InterruptedException e) {
								e.printStackTrace();
							}
						}
					}else {
						for(int i=0; i<60; i++) {
							System.out.println("");
						}
						System.out.println("");
						System.out.println("<이미 hp가 최대치입니다.>");
						System.out.println("");
						try {
							Thread.sleep(1500);
						} catch (InterruptedException e) {
							e.printStackTrace();
						}
					}
				}else {
					for(int i=0; i<60; i++) {
						System.out.println("");
					}
					System.out.println("");
					System.out.println("<포션이 없습니다.>");
					System.out.println("");
					try {
						Thread.sleep(1500);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			}else if(potion_setting.equals("2")) {//중급 hp포션
				if(중급hp포션.개수>0) {
					if(this.hp<this.maxhp) {
						if(this.maxhp-this.hp<중급hp포션.hp회복량) {
							사운드스레드 회복사운드=new 사운드스레드("recovery.mp3",false);
							Thread 회복사운드스레드=new Thread(회복사운드);
							회복사운드스레드.start();
							for(int i=0; i<60; i++) {
								System.out.println("");
							}
							System.out.println("");
							System.out.println("hp를 "+(int)(this.maxhp-this.hp)+"만큼 회복하였습니다.");
							System.out.println("");
							this.hp+=this.maxhp-this.hp;
							중급hp포션.개수-=1;
							try {
								Thread.sleep(1500);
							} catch (InterruptedException e) {
								e.printStackTrace();
							}
						}else {
							사운드스레드 회복사운드=new 사운드스레드("recovery.mp3",false);
							Thread 회복사운드스레드=new Thread(회복사운드);
							회복사운드스레드.start();
							this.hp+=중급hp포션.hp회복량;
							for(int i=0; i<60; i++) {
								System.out.println("");
							}
							System.out.println("");
							System.out.println("hp를 "+(int)중급hp포션.hp회복량+"만큼 회복하였습니다.");
							System.out.println("");
							중급hp포션.개수-=1;
							try {
								Thread.sleep(1500);
							} catch (InterruptedException e) {
								e.printStackTrace();
							}
						}
					}else {
						for(int i=0; i<60; i++) {
							System.out.println("");
						}
						System.out.println("");
						System.out.println("<이미 hp가 최대치입니다.>");
						System.out.println("");
						try {
							Thread.sleep(1500);
						} catch (InterruptedException e) {
							e.printStackTrace();
						}
					}
				}else {
					for(int i=0; i<60; i++) {
						System.out.println("");
					}
					System.out.println("");
					System.out.println("<포션이 없습니다.>");
					System.out.println("");
					try {
						Thread.sleep(1500);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			}else if(potion_setting.equals("3")) {
				if(상급hp포션.개수>0) {
					if(this.hp<this.maxhp) {
						if(this.maxhp-this.hp<상급hp포션.hp회복량) {
							사운드스레드 회복사운드=new 사운드스레드("recovery.mp3",false);
							Thread 회복사운드스레드=new Thread(회복사운드);
							회복사운드스레드.start();
							for(int i=0; i<60; i++) {
								System.out.println("");
							}
							System.out.println("");
							System.out.println("hp를 "+(int)(this.maxhp-this.hp)+"만큼 회복하였습니다.");
							System.out.println("");
							this.hp+=this.maxhp-this.hp;
							상급hp포션.개수-=1;
							try {
								Thread.sleep(1500);
							} catch (InterruptedException e) {
								e.printStackTrace();
							}
						}else {
							사운드스레드 회복사운드=new 사운드스레드("recovery.mp3",false);
							Thread 회복사운드스레드=new Thread(회복사운드);
							회복사운드스레드.start();
							this.hp+=상급hp포션.hp회복량;
							for(int i=0; i<60; i++) {
								System.out.println("");
							}
							System.out.println("");
							System.out.println("hp를 "+(int)상급hp포션.hp회복량+"만큼 회복하였습니다.");
							System.out.println("");
							상급hp포션.개수-=1;
							try {
								Thread.sleep(1500);
							} catch (InterruptedException e) {
								e.printStackTrace();
							}
						}
					}else {
						for(int i=0; i<60; i++) {
							System.out.println("");
						}
						System.out.println("");
						System.out.println("<이미 hp가 최대치입니다.>");
						System.out.println("");
						try {
							Thread.sleep(1500);
						} catch (InterruptedException e) {
							e.printStackTrace();
						}
					}
				}else {
					for(int i=0; i<60; i++) {
						System.out.println("");
					}
					System.out.println("");
					System.out.println("<포션이 없습니다.>");
					System.out.println("");
					try {
						Thread.sleep(1500);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			}else if(potion_setting.equals("4")) {
				if(하급mp포션.개수>0) {
					if(this.mp<this.maxmp) {
						if(this.maxmp-this.mp<하급mp포션.mp회복량) {
							사운드스레드 회복사운드=new 사운드스레드("recovery.mp3",false);
							Thread 회복사운드스레드=new Thread(회복사운드);
							회복사운드스레드.start();
							for(int i=0; i<60; i++) {
								System.out.println("");
							}
							System.out.println("");
							System.out.println("mp를 "+(int)(this.maxmp-this.mp)+"만큼 회복하였습니다.");
							System.out.println("");
							this.mp+=this.maxmp-this.mp;
							하급mp포션.개수-=1;
							try {
								Thread.sleep(1500);
							} catch (InterruptedException e) {
								e.printStackTrace();
							}
						}else {
							사운드스레드 회복사운드=new 사운드스레드("recovery.mp3",false);
							Thread 회복사운드스레드=new Thread(회복사운드);
							회복사운드스레드.start();
							this.mp+=하급mp포션.mp회복량;
							for(int i=0; i<60; i++) {
								System.out.println("");
							}
							System.out.println("");
							System.out.println("mp를 "+(int)하급mp포션.mp회복량+"만큼 회복하였습니다.");
							System.out.println("");
							하급mp포션.개수-=1;
							try {
								Thread.sleep(1500);
							} catch (InterruptedException e) {
								e.printStackTrace();
							}
						}
					}else {
						for(int i=0; i<60; i++) {
							System.out.println("");
						}
						System.out.println("");
						System.out.println("<이미 mp가 최대치입니다.>");
						System.out.println("");
						try {
							Thread.sleep(1500);
						} catch (InterruptedException e) {
							e.printStackTrace();
						}
					}
				}else {
					for(int i=0; i<60; i++) {
						System.out.println("");
					}
					System.out.println("");
					System.out.println("<포션이 없습니다.>");
					System.out.println("");
					try {
						Thread.sleep(1500);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			}else if(potion_setting.equals("5")) {
				if(중급mp포션.개수>0) {
					if(this.mp<this.maxmp) {
						if(this.maxmp-this.mp<하급mp포션.mp회복량) {
							사운드스레드 회복사운드=new 사운드스레드("recovery.mp3",false);
							Thread 회복사운드스레드=new Thread(회복사운드);
							회복사운드스레드.start();
							for(int i=0; i<60; i++) {
								System.out.println("");
							}
							System.out.println("");
							System.out.println("mp를 "+(int)(this.maxmp-this.mp)+"만큼 회복하였습니다.");
							System.out.println("");
							this.mp+=this.maxmp-this.mp;
							중급mp포션.개수-=1;
							try {
								Thread.sleep(1500);
							} catch (InterruptedException e) {
								e.printStackTrace();
							}
						}else {
							사운드스레드 회복사운드=new 사운드스레드("recovery.mp3",false);
							Thread 회복사운드스레드=new Thread(회복사운드);
							회복사운드스레드.start();
							this.mp+=중급mp포션.mp회복량;
							for(int i=0; i<60; i++) {
								System.out.println("");
							}
							System.out.println("");
							System.out.println("mp를 "+(int)중급mp포션.mp회복량+"만큼 회복하였습니다.");
							System.out.println("");
							중급mp포션.개수-=1;
							try {
								Thread.sleep(1500);
							} catch (InterruptedException e) {
								e.printStackTrace();
							}
						}
					}else {
						for(int i=0; i<60; i++) {
							System.out.println("");
						}
						System.out.println("");
						System.out.println("<이미 mp가 최대치입니다.>");
						System.out.println("");
						try {
							Thread.sleep(1500);
						} catch (InterruptedException e) {
							e.printStackTrace();
						}
					}
				}else {
					for(int i=0; i<60; i++) {
						System.out.println("");
					}
					System.out.println("");
					System.out.println("<포션이 없습니다.>");
					System.out.println("");
					try {
						Thread.sleep(1500);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			}else if(potion_setting.equals("6")) {
				if(상급mp포션.개수>0) {
					if(this.mp<this.maxmp) {
						if(this.maxmp-this.mp<상급mp포션.mp회복량) {
							사운드스레드 회복사운드=new 사운드스레드("recovery.mp3",false);
							Thread 회복사운드스레드=new Thread(회복사운드);
							회복사운드스레드.start();
							for(int i=0; i<60; i++) {
								System.out.println("");
							}
							System.out.println("");
							System.out.println("mp를 "+(int)(this.maxmp-this.mp)+"만큼 회복하였습니다.");
							System.out.println("");
							this.mp+=this.maxmp-this.mp;
							상급mp포션.개수-=1;
							try {
								Thread.sleep(1500);
							} catch (InterruptedException e) {
								e.printStackTrace();
							}
						}else {
							사운드스레드 회복사운드=new 사운드스레드("recovery.mp3",false);
							Thread 회복사운드스레드=new Thread(회복사운드);
							회복사운드스레드.start();
							this.mp+=상급mp포션.mp회복량;
							for(int i=0; i<60; i++) {
								System.out.println("");
							}
							System.out.println("");
							System.out.println("mp를 "+(int)상급mp포션.mp회복량+"만큼 회복하였습니다.");
							System.out.println("");
							상급mp포션.개수-=1;
							try {
								Thread.sleep(1500);
							} catch (InterruptedException e) {
								e.printStackTrace();
							}
						}
					}else {
						for(int i=0; i<60; i++) {
							System.out.println("");
						}
						System.out.println("");
						System.out.println("<이미 mp가 최대치입니다.>");
						System.out.println("");
						try {
							Thread.sleep(1500);
						} catch (InterruptedException e) {
							e.printStackTrace();
						}
					}
				}else {
					for(int i=0; i<60; i++) {
						System.out.println("");
					}
					System.out.println("");
					System.out.println("<포션이 없습니다.>");
					System.out.println("");
					try {
						Thread.sleep(1500);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			}else if(potion_setting.equals("0")){
				break;
			}else {
				for(int i=0; i<60; i++) {
					System.out.println("");
				}
				System.out.println("");
				System.out.println("<잘못 입력하셨습니다. 다시 입력해주세요.>");
				System.out.println("");
				try {
					Thread.sleep(1500);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}	
		}
	}
//--------------------------------------------------------------------------------------
	
//-------------------------------보스와 싸울 때 모험가 부활 메소드-----------------------------------
	public void 부활_보스(보스 보스) {
		this.hp=0.5*this.maxhp;
		this.mp=0.5*this.maxmp;
		사운드스레드 패배사운드스레드=new 사운드스레드("lose.mp3",false);
		패배사운드스레드.start();
		for(int i=0; i<60; i++) {
			System.out.println("");
		}
		System.out.println(보스.이름+"에게 패배하셨습니다.");
		System.out.println("");
		try {
			Thread.sleep(2500);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
//-----------------------------------------------------------------------------

//---------------------------------몬스터와 싸울 때 모험가 부활 메소드------------------------
	public void 부활_몬스터(몬스터 몬스터) {
		this.hp=0.5*this.maxhp;
		this.mp=0.5*this.maxmp;
		사운드스레드 패배사운드스레드=new 사운드스레드("lose.mp3",false);
		패배사운드스레드.start();
		for(int i=0; i<60; i++) {
			System.out.println("");
		}
		System.out.println(몬스터.이름+"에게 패배하셨습니다.");
		System.out.println("");
		try {
			Thread.sleep(2500);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
	}
//-----------------------------------------------------------------------------

//------------------------------------인벤토리 메소드--------------------------------
	public void 인벤토리(무기 낡은검, 무기 강철검, 무기 무의검, 무기 자하드의검, 무기 하급검, 무기 중급검, 무기 상급검, 방어구 낡은갑옷, 방어구 강철갑옷, 방어구 무의갑옷, 방어구 자하드의갑옷, 방어구 하급갑옷, 방어구 중급갑옷, 방어구 상급갑옷, hp포션 하급hp포션, hp포션 중급hp포션, hp포션 상급hp포션, mp포션 하급mp포션, mp포션 중급mp포션, mp포션 상급mp포션) {
		
		사운드스레드 인벤토리bgm스레드=new 사운드스레드("inventory.mp3",true);
		인벤토리bgm스레드.start();
		
		while(true) {
			for(int i=0; i<60; i++) {
				System.out.println("");
			}
			System.out.println("===========================================================");
			System.out.println("1. 무기        2. 방어구        3. 포션");
			System.out.println("===========================================================");
			System.out.println("0. 뒤로");
			System.out.println("");
			System.out.print("아이템을 선택해주세요:");
			String item_select=scan.next();
			if(item_select.equals("1")) {
				while(true) {
					무기.정보(낡은검, 강철검, 무의검, 자하드의검, 하급검, 중급검, 상급검);
					System.out.println("1. 무기 장착        2. 무기 장착 해제");
					System.out.println("--------------------------------------------------------------------------");
					System.out.println("0. 뒤로");
					System.out.println("");
					System.out.print("취할 행동을 선택해주세요:");
					String weapon_setting=scan.next();
					if(weapon_setting.equals("1")) {//무기 장착
						this.무기장착(낡은검, 강철검, 무의검, 자하드의검, 하급검, 중급검, 상급검);
					}else if(weapon_setting.equals("2")){//무기 장착 해제
						this.무기장착해제(낡은검, 강철검, 무의검, 자하드의검, 하급검, 중급검, 상급검);
					}else if(weapon_setting.equals("0")) {
						break;
					}else {
						for(int i=0; i<60; i++) {
							System.out.println("");
						}
						System.out.println("");
						System.out.println("<잘못 입력하셨습니다. 다시 입력해주세요.>");
						System.out.println("");
						try {
							Thread.sleep(1500);
						} catch (InterruptedException e) {
							e.printStackTrace();
						}
					}	
				}
			}else if(item_select.equals("2")) {
				while(true) {
					방어구.정보(낡은갑옷, 강철갑옷, 무의갑옷, 자하드의갑옷, 하급갑옷, 중급갑옷, 상급갑옷);
					System.out.println("1. 방어구 장착        2. 방어구 장착 해제");
					System.out.println("--------------------------------------------------------------------------");
					System.out.println("0. 뒤로");
					System.out.print("취할 행동을 선택해주세요:");
					String armor_setting=scan.next();
					if(armor_setting.equals("1")) {//방어구 장착
						this.방어구장착(낡은갑옷, 강철갑옷, 무의갑옷, 자하드의갑옷, 하급갑옷, 중급갑옷, 상급갑옷);
					}else if(armor_setting.equals("2")){//방어구 장착 해제
						this.방어구장착해제(낡은갑옷, 강철갑옷, 무의갑옷, 자하드의갑옷, 하급갑옷, 중급갑옷, 상급갑옷);
					}else if(armor_setting.equals("0")) {
						break;
					}else {
						for(int i=0; i<60; i++) {
							System.out.println("");
						}
						System.out.println("");
						System.out.println("<잘못 입력하셨습니다. 다시 입력해주세요.>");
						System.out.println("");
						try {
							Thread.sleep(1500);
						} catch (InterruptedException e) {
							e.printStackTrace();
						}
					}	
				}	
			}else if(item_select.equals("3")){//물약 인벤토리
				this.물약복용(하급hp포션, 중급hp포션, 상급hp포션, 하급mp포션, 중급mp포션, 상급mp포션);		
			}else if(item_select.equals("0")) {
				인벤토리bgm스레드.종료();
				
				break;
			}else {
				for(int i=0; i<60; i++) {
					System.out.println("");
				}
				System.out.println("");
				System.out.println("<잘못 입력하셨습니다. 다시 입력해주세요.>");
				System.out.println("");
				try {
					Thread.sleep(1500);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}		
		}
	}
	
//-----------------------------대전중 인벤토리 메소드-----------------------------------	
public void 대전인벤토리(무기 낡은검, 무기 강철검, 무기 무의검, 무기 자하드의검, 무기 하급검, 무기 중급검, 무기 상급검, 방어구 낡은갑옷, 방어구 강철갑옷, 방어구 무의갑옷, 방어구 자하드의갑옷, 방어구 하급갑옷, 방어구 중급갑옷, 방어구 상급갑옷, hp포션 하급hp포션, hp포션 중급hp포션, hp포션 상급hp포션, mp포션 하급mp포션, mp포션 중급mp포션, mp포션 상급mp포션) {
		while(true) {
			for(int i=0; i<60; i++) {
				System.out.println("");
			}
			System.out.println("===========================================================");
			System.out.println("1. 무기        2. 방어구        3. 포션");
			System.out.println("===========================================================");
			System.out.println("0. 뒤로");
			System.out.println("");
			System.out.print("아이템을 선택해주세요:");
			String item_select=scan.next();
			if(item_select.equals("1")) {
				while(true) {
					무기.정보(낡은검, 강철검, 무의검, 자하드의검, 하급검, 중급검, 상급검);
					System.out.println("1. 무기 장착        2. 무기 장착 해제");
					System.out.println("--------------------------------------------------------------------------");
					System.out.println("0. 뒤로");
					System.out.println("");
					System.out.print("취할 행동을 선택해주세요:");
					String weapon_setting=scan.next();
					if(weapon_setting.equals("1")) {//무기 장착
						this.무기장착(낡은검, 강철검, 무의검, 자하드의검, 하급검, 중급검, 상급검);
					}else if(weapon_setting.equals("2")){//무기 장착 해제
						this.무기장착해제(낡은검, 강철검, 무의검, 자하드의검, 하급검, 중급검, 상급검);
					}else if(weapon_setting.equals("0")) {
						break;
					}else {
						for(int i=0; i<60; i++) {
							System.out.println("");
						}
						System.out.println("");
						System.out.println("<잘못 입력하셨습니다. 다시 입력해주세요.>");
						System.out.println("");
						try {
							Thread.sleep(1500);
						} catch (InterruptedException e) {
							e.printStackTrace();
						}
					}	
				}
			}else if(item_select.equals("2")) {
				while(true) {
					방어구.정보(낡은갑옷, 강철갑옷, 무의갑옷, 자하드의갑옷, 하급갑옷, 중급갑옷, 상급갑옷);
					System.out.println("1. 방어구 장착        2. 방어구 장착 해제");
					System.out.println("--------------------------------------------------------------------------");
					System.out.println("0. 뒤로");
					System.out.print("취할 행동을 선택해주세요:");
					String armor_setting=scan.next();
					if(armor_setting.equals("1")) {//방어구 장착
						this.방어구장착(낡은갑옷, 강철갑옷, 무의갑옷, 자하드의갑옷, 하급갑옷, 중급갑옷, 상급갑옷);
					}else if(armor_setting.equals("2")){//방어구 장착 해제
						this.방어구장착해제(낡은갑옷, 강철갑옷, 무의갑옷, 자하드의갑옷, 하급갑옷, 중급갑옷, 상급갑옷);
					}else if(armor_setting.equals("0")) {
						break;
					}else {
						for(int i=0; i<60; i++) {
							System.out.println("");
						}
						System.out.println("");
						System.out.println("<잘못 입력하셨습니다. 다시 입력해주세요.>");
						System.out.println("");
						try {
							Thread.sleep(1500);
						} catch (InterruptedException e) {
							e.printStackTrace();
						}
					}	
				}	
			}else if(item_select.equals("3")){//물약 인벤토리
				this.물약복용(하급hp포션, 중급hp포션, 상급hp포션, 하급mp포션, 중급mp포션, 상급mp포션);		
			}else if(item_select.equals("0")) {
				break;
			}else {
				for(int i=0; i<60; i++) {
					System.out.println("");
				}
				System.out.println("");
				System.out.println("<잘못 입력하셨습니다. 다시 입력해주세요.>");
				System.out.println("");
				try {
					Thread.sleep(1500);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}		
		}
	}
//-----------------------------------------------------------------------------	
	
	
}