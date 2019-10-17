package consolegame;

public class 버프효과스레드 extends Thread{
	스테이지 스테이지;
	모험가 모험가;
	String type;
	boolean 마을버프효과;
	버프효과스레드(모험가 모험가,스테이지 스테이지, String type, boolean 마을버프효과){
		this.모험가=모험가;
		this.스테이지=스테이지;
		this.type=type;
		this.마을버프효과=마을버프효과;
		
	}
	
	public void 마을버프효과(모험가 모험가, 스테이지 스테이지) {
		int 회복량=20;
		int 텀=4000;
		int 텀1=2000;
		while(마을버프효과) {
			if(모험가.hp>=모험가.maxhp && 모험가.mp>=모험가.maxmp) {
				try {
					Thread.sleep(텀);
				} catch (InterruptedException e) {
					break;
				}
				for(int i=0; i<60; i++) {
					System.out.println("");
				}
				사운드스레드 회복사운드스레드=new 사운드스레드("recovery.mp3",false);
				회복사운드스레드.start();
				System.out.println("*************************************************");
				System.out.println(모험가.이름+"의 hp와 mp가 모두 회복되었습니다.");
				System.out.println("*************************************************");
				마을버프효과=false;
				try {
					Thread.sleep(텀1);
				} catch (InterruptedException e) {
					break;
				}
				for(int i=0; i<60; i++) {
					System.out.println("");
				}
				모험가.행동선택(스테이지);
				
			}else if(모험가.hp<모험가.maxhp && 모험가.mp>=모험가.maxmp) {
				if(모험가.maxhp-모험가.hp>=회복량) {
					try {
						Thread.sleep(텀);
					} catch (InterruptedException e) {
						break;
					}
					
					for(int i=0; i<60; i++) {
						System.out.println("");
					}
					사운드스레드 회복사운드스레드=new 사운드스레드("recovery.mp3",false);
					회복사운드스레드.start();
					System.out.println("*************************************************");
					System.out.println(모험가.이름+"의 hp가 "+회복량+"만큼 회복되었습니다.");
					System.out.println(모험가.이름+"의 mp가 모두 회복되었습니다.");
					System.out.println("");
					모험가.hp+=회복량;
					System.out.println("현재 hp: "+(int)모험가.hp+"/"+(int)모험가.maxhp);
					System.out.println("현재 mp: "+(int)모험가.mp+"/"+(int)모험가.maxmp);
					System.out.println("*************************************************");
					try {
						Thread.sleep(텀1);
					} catch (InterruptedException e) {
						break;
					}
					for(int i=0; i<60; i++) {
						System.out.println("");
					}
					모험가.행동선택(스테이지);
					
				}else if(모험가.maxhp-모험가.hp<회복량) {
					try {
						Thread.sleep(텀);
					} catch (InterruptedException e) {
						break;
					}
					
					for(int i=0; i<60; i++) {
						System.out.println("");
					}
					사운드스레드 회복사운드스레드=new 사운드스레드("recovery.mp3",false);
					회복사운드스레드.start();
					System.out.println("*************************************************");
					System.out.println(모험가.이름+"의 hp가 "+(int)(모험가.maxhp-모험가.hp)+"만큼 회복되었습니다.");
					System.out.println(모험가.이름+"의 mp가 모두 회복되었습니다.");
					System.out.println("");
					모험가.hp+=모험가.maxhp-모험가.hp;
					System.out.println("현재 hp: "+(int)모험가.hp+"/"+(int)모험가.maxhp);
					System.out.println("현재 mp: "+(int)모험가.mp+"/"+(int)모험가.maxmp);
					System.out.println("*************************************************");
					try {
						Thread.sleep(텀1);
					} catch (InterruptedException e) {
						break;
					}
					for(int i=0; i<60; i++) {
						System.out.println("");
					}
					모험가.행동선택(스테이지);
					
				}
			}else if(모험가.hp>=모험가.maxhp && 모험가.mp<모험가.maxmp) {
				if(모험가.maxmp-모험가.mp>=회복량) {
					try {
						Thread.sleep(텀);
					} catch (InterruptedException e) {
						break;
					}
					
					for(int i=0; i<60; i++) {
						System.out.println("");
					}
					사운드스레드 회복사운드스레드=new 사운드스레드("recovery.mp3",false);
					회복사운드스레드.start();
					System.out.println("*************************************************");
					System.out.println(모험가.이름+"의 hp가 모두 회복되었습니다.");
					System.out.println(모험가.이름+"의 mp가 "+회복량+"만큼 회복되었습니다.");
					System.out.println("");
					모험가.mp+=회복량;
					System.out.println("현재 hp: "+(int)모험가.hp+"/"+(int)모험가.maxhp);
					System.out.println("현재 mp: "+(int)모험가.mp+"/"+(int)모험가.maxmp);
					System.out.println("*************************************************");
					try {
						Thread.sleep(텀1);
					} catch (InterruptedException e) {
						break;
					}
					for(int i=0; i<60; i++) {
						System.out.println("");
					}
					모험가.행동선택(스테이지);
				
				}else if(모험가.maxmp-모험가.mp<회복량) {
					try {
						Thread.sleep(텀);
					} catch (InterruptedException e) {
						break;
					}
					
					for(int i=0; i<60; i++) {
						System.out.println("");
					}
					사운드스레드 회복사운드스레드=new 사운드스레드("recovery.mp3",false);
					회복사운드스레드.start();
					System.out.println("*************************************************");
					System.out.println(모험가.이름+"의 hp가 모두 회복되었습니다.");
					System.out.println(모험가.이름+"의 mp가 "+(int)(모험가.maxmp-모험가.mp)+"만큼 회복되었습니다.");
					System.out.println("");
					모험가.mp+=모험가.maxmp-모험가.mp;
					System.out.println("현재 hp: "+(int)모험가.hp+"/"+(int)모험가.maxhp);
					System.out.println("현재 mp: "+(int)모험가.mp+"/"+(int)모험가.maxmp);
					System.out.println("*************************************************");
					try {
						Thread.sleep(텀1);
					} catch (InterruptedException e) {
						break;
					}
					for(int i=0; i<60; i++) {
						System.out.println("");
					}
					모험가.행동선택(스테이지);
					
				}
			}else if(모험가.maxhp-모험가.hp<회복량 && 모험가.maxmp-모험가.mp<회복량) {
				
				try {
					Thread.sleep(텀);
				} catch (InterruptedException e) {
					break;
				}
				
				for(int i=0; i<60; i++) {
					System.out.println("");
				}
				사운드스레드 회복사운드스레드=new 사운드스레드("recovery.mp3",false);
				회복사운드스레드.start();
				System.out.println("*************************************************");
				System.out.println(모험가.이름+"의 hp가 "+(int)(모험가.maxhp-모험가.hp)+"만큼 회복되었습니다.");
				System.out.println(모험가.이름+"의 mp가 "+(int)(모험가.maxmp-모험가.mp)+"만큼 회복되었습니다.");
				System.out.println("");
				모험가.hp+=모험가.maxhp-모험가.hp;
				모험가.mp+=모험가.maxmp-모험가.mp;
				System.out.println("현재 hp: "+(int)모험가.hp+"/"+(int)모험가.maxhp);
				System.out.println("현재 mp: "+(int)모험가.mp+"/"+(int)모험가.maxmp);
				System.out.println("*************************************************");
				try {
					Thread.sleep(텀1);
				} catch (InterruptedException e) {
					break;
				}
				for(int i=0; i<60; i++) {
					System.out.println("");
				}
				모험가.행동선택(스테이지);
				
			}else if(모험가.maxhp-모험가.hp<회복량 && 모험가.maxmp-모험가.mp>=회복량) {
				
				try {
					Thread.sleep(텀);
				} catch (InterruptedException e) {
					break;
				}
				
				for(int i=0; i<60; i++) {
					System.out.println("");
				}
				사운드스레드 회복사운드스레드=new 사운드스레드("recovery.mp3",false);
				회복사운드스레드.start();
				System.out.println("*************************************************");
				System.out.println(모험가.이름+"의 hp가 "+(int)(모험가.maxhp-모험가.hp)+"만큼 회복되었습니다.");
				System.out.println(모험가.이름+"의 mp가 "+회복량+"만큼 회복되었습니다.");
				System.out.println("");
				모험가.hp+=모험가.maxhp-모험가.hp;
				모험가.mp+=회복량;
				System.out.println("현재 hp: "+(int)모험가.hp+"/"+(int)모험가.maxhp);
				System.out.println("현재 mp: "+(int)모험가.mp+"/"+(int)모험가.maxmp);
				System.out.println("*************************************************");
				try {
					Thread.sleep(텀1);
				} catch (InterruptedException e) {
					break;
				}
				for(int i=0; i<60; i++) {
					System.out.println("");
				}
				모험가.행동선택(스테이지);
				
			}else if(모험가.maxhp-모험가.hp>=회복량 && 모험가.maxmp-모험가.mp<회복량) {
				
				try {
					Thread.sleep(텀);
				} catch (InterruptedException e) {
					break;
				}
				
				for(int i=0; i<60; i++) {
					System.out.println("");
				}
				사운드스레드 회복사운드스레드=new 사운드스레드("recovery.mp3",false);
				회복사운드스레드.start();
				System.out.println("*************************************************");
				System.out.println(모험가.이름+"의 hp가 "+회복량+"만큼 회복되었습니다.");
				System.out.println(모험가.이름+"의 mp가 "+(int)(모험가.maxmp-모험가.mp)+"만큼 회복되었습니다.");
				System.out.println("");
				모험가.hp+=회복량;
				모험가.mp+=모험가.maxmp-모험가.mp;
				System.out.println("현재 hp: "+(int)모험가.hp+"/"+(int)모험가.maxhp);
				System.out.println("현재 mp: "+(int)모험가.mp+"/"+(int)모험가.maxmp);
				System.out.println("*************************************************");
				try {
					Thread.sleep(텀1);
				} catch (InterruptedException e) {
					break;
				}
				for(int i=0; i<60; i++) {
					System.out.println("");
				}
				모험가.행동선택(스테이지);
				
			}else {
				
				try {
					Thread.sleep(텀);
				} catch (InterruptedException e) {
					break;
				}
				
				for(int i=0; i<60; i++) {
					System.out.println("");
				}
				사운드스레드 회복사운드스레드=new 사운드스레드("recovery.mp3",false);
				회복사운드스레드.start();
				System.out.println("*************************************************");
				System.out.println(모험가.이름+"의 hp가 "+회복량+"만큼 회복되었습니다.");
				System.out.println(모험가.이름+"의 mp가 "+회복량+"만큼 회복되었습니다.");
				System.out.println("");
				모험가.hp+=회복량;
				모험가.mp+=회복량;
				System.out.println("현재 hp: "+(int)모험가.hp+"/"+(int)모험가.maxhp);
				System.out.println("현재 mp: "+(int)모험가.mp+"/"+(int)모험가.maxmp);
				System.out.println("*************************************************");
				try {
					Thread.sleep(텀1);
				} catch (InterruptedException e) {
					break;
				}
				for(int i=0; i<60; i++) {
					System.out.println("");
				}
				모험가.행동선택(스테이지);
			
			}
		}
	}
	
	
	public void 종료() {//다른 메뉴로 진입할 시 버프효과를 종료시키기 위한 메소드
		마을버프효과=false;
		this.interrupt();
	}
	
	
	@Override
	public void run() {
		switch(type) {
		case "마을":
			this.마을버프효과(모험가, 스테이지);
			break;
		}
	}
}
