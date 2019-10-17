package consolegame;
import java.util.Scanner;
public class 스테이지 {
	Scanner scan=new Scanner(System.in);
	int 층수;
	스테이지(){}
	스테이지(int 층수){
		this.층수=층수;
	}
	
//--------------층별 지배자 출력 메소드-------------------	
	public String 지배자이름(int 층수) {
		if(층수==1) {
			return "헤돈";
		}else if(층수==2) {
			return "카이저";
		}else if(층수==3) {
			return "헬조";
		}else if(층수==4) {
			return "칼라반";
		}else {
			return "자하드";
		}
	}
	
//------------------층별 몬스터 출력 메소드------------------
	public String 몬스터이름(int 층수) {
		if(층수==1) {
			return "파란 원숭이";
		}else if(층수==2) {
			return "노네임드 몬스터";
		}else if(층수==3) {
			return "거충 야두";
		}else if(층수==4) {
			return "칼라반의 병사";
		}else {
			return "자하드의 호위병";
		}
	}
//------------------층별 몬스터1 출력 메소드
	public String 몬스터1이름(int 층수) {
		if(층수==1) {
			return "빨간 원숭이";
		}else if(층수==2) {
			return "네임드 몬스터";
		}else if(층수==3) {
			return "날개 거충 야두";
		}else if(층수==4) {
			return "칼라반의 호위무사";
		}else {
			return "자하드가의 왕자";
		}
	}
//-------------------층별 입장시 멘트 출력 메소드-----------------
	public void 입장멘트(보스 보스) {
		if(this.층수<=4) {
			사운드스레드 스테이지입장사운드스레드=new 사운드스레드("stage_entrance.mp3",false);
			스테이지입장사운드스레드.start();
			for(int i=0; i<60; i++) {
				System.out.println("");
			}
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("");
			System.out.println("==============================================================");	
			System.out.println("탑의 "+this.층수+"층에 입장하셨습니다. "+this.층수+"층의 지배자인 "+this.지배자이름(this.층수)+"을(를) 무찌르고 다음 층으로 올라가세요!");
			System.out.println("==============================================================");
			try {
				Thread.sleep(2500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			스테이지입장사운드스레드.종료();
		}else {
			사운드스레드 스테이지입장사운드스레드=new 사운드스레드("stage_entrance.mp3",false);
			스테이지입장사운드스레드.start();
			for(int i=0; i<60; i++) {
				System.out.println("");
			}
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("");
			System.out.println("==============================================================");	
			System.out.println("탑의 "+this.층수+"층에 입장하셨습니다. "+this.층수+"층의 지배자인 "+this.지배자이름(this.층수)+"을(를) 무찌르고 탑에 새로운 변화를 불러오세요!!!");
			System.out.println("==============================================================");
			try {
				Thread.sleep(2500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			스테이지입장사운드스레드.종료();
		}
	}
	
	public void 버프효과_3층(모험가 모험가) {
		while(this.층수==3) {
			if(모험가.mp>0) {
				try {
					Thread.sleep(10000);
				} catch (InterruptedException e) {
					break;
				}
				for(int i=0; i<5; i++) {
					System.out.println("");
				}
				System.out.println("*************************************************");
				System.out.println(this.층수+"층의 이상한 기운이 "+모험가.이름+"의 mp를 10만큼 감소시켰습니다.");
				모험가.mp-=10;
				System.out.println("남은 mp: "+(int)모험가.mp+"/"+(int)모험가.maxmp);
				System.out.println("*************************************************");
			}else {
				try {
					Thread.sleep(10000);
				} catch (InterruptedException e) {
					break;
				}
				for(int i=0; i<5; i++) {
					System.out.println("");
				}
				System.out.println("*************************************************");
				System.out.println("mp가 없습니다. 물약을 복용하세요.");
				System.out.println("*************************************************");
			}
		}
	}
	
	public void 버프효과_5층(모험가 모험가) {
		while(this.층수==5) {
			if(모험가.hp>0) {
				if(모험가.mp>0) {
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						break;
					}
					for(int i=0; i<5; i++) {
						System.out.println("");
					}
					System.out.println("*************************************************");
					System.out.println("자하드의 강력한 기운이 "+모험가.이름+"의 hp를 50만큼, mp를 30만큼 감소시켰습니다.");
					System.out.println("체력이 0이 되면 죽습니다. hp포션을 복용하여 hp를 회복하세요!");
					모험가.hp-=50;
					모험가.mp-=50;
					System.out.println("");
					System.out.println("남은 hp: "+(int)모험가.hp+"/"+(int)모험가.maxhp);
					System.out.println("남은 mp: "+(int)모험가.mp+"/"+(int)모험가.maxmp);
					System.out.println("*************************************************");
				}else {
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						break;
					}
					for(int i=0; i<5; i++) {
						System.out.println("");
					}
					System.out.println("*************************************************");
					System.out.println("자하드의 강력한 기운이 "+모험가.이름+"의 hp를 50만큼 감소시켰습니다.");
					System.out.println("체력이 0이 되면 죽습니다. hp포션을 복용하여 hp를 회복하세요!");
					모험가.hp-=50;
					System.out.println("");
					System.out.println("남은 hp: "+(int)모험가.hp+"/"+(int)모험가.maxhp);
					System.out.println("mp가 없습니다. 물약을 복용하세요.");
					System.out.println("*************************************************");
				}
			}else {
				for(int i=0; i<5; i++) {
					System.out.println("");
				}
				System.out.println("*************************************************");
				System.out.println("자하드의 강력한 기운으로 인해"+모험가.이름+"이 죽었습니다.");
				System.out.println("마을에서 부활합니다.");
				System.out.println("*************************************************");
				try {
					Thread.sleep(2000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				모험가.hp=0.5*모험가.maxhp;
				모험가.mp=0.5*모험가.maxmp;
				break;
			}
		}
	}
	
	
		
}


