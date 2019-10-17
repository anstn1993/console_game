package consolegame;

import java.util.Scanner;

import javazoom.jl.player.Player;

import java.io.FileInputStream;
import java.util.Random;

public class 메인 {
	
	public static void 게임종료() {
		Scanner scan=new Scanner(System.in);
		while(true) {
			for(int i=0; i<60; i++) {
				System.out.println("");
			}
			System.out.println("게임을 종료하시겠습니까?");
			System.out.println("1. 네        2. 아니오");
			System.out.println("");
			System.out.print("입력:");
			String real_ending=scan.next();
			if(real_ending.equals("1")) {
				for(int i=0; i<60; i++) {
					System.out.println("");
				}
				
				로딩스레드 게임종료=new 로딩스레드("게임종료");
				Thread 게임종료스레드=new Thread(게임종료);
				게임종료스레드.start();
				try {
					게임종료스레드.join();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				System.exit(0);
			}else if(real_ending.equals("2")){
				break;
			}else {
				System.out.println("<잘못 입력하셨습니다. 다시 입력해주세요.>");
			}
		}
	}
		
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		Random random=new Random();
	//----------케릭터--------------------- 	
		모험가 모험가=new 모험가();
		보스 보스=new 보스();
		몬스터 몬스터=new 몬스터();
		몬스터 몬스터1=new 몬스터();
	//----------스킬----------------------	
		스킬 모험가공격스킬=new 스킬();
		스킬 보스공격스킬=new 스킬();
		스킬 모험가궁극기=new 스킬();
		스킬 보스궁극기=new 스킬();
	//------------아이템-----------------
		아이템 아이템=new 아이템();
	//---------무기-----------------------
		
		//보스 드롭 무기-----------------------
		무기 낡은검=new 무기("낡은 검",3000,20,0);
		무기 강철검=new 무기("강철 검",5000,30,0);
		특수무기 특수무기=new 특수무기();
		무기 무의검=new 무기("무의 검",10000,60,0);
		무기 자하드의검=new 무기("자하드의 검",20000,100,0);
		//-------------------------------
		//상점 판매 무기-----------------------
		무기 하급검=new 무기("하급 검",4000,15,0);
		무기 중급검=new 무기("중급 검",5000,35,0);
		무기 상급검=new 무기("상급 검",9000,50,0);
	
	//----------방어구------------------------
		
		//보스 드롭 방어구
		방어구 낡은갑옷=new 방어구("낡은 갑옷",3000,20,0);
		방어구 강철갑옷=new 방어구("강철 갑옷",5000,30,0);
		방어구 무의갑옷=new 방어구("무의 갑옷",10000,60,0);
		방어구 자하드의갑옷=new 방어구("자하드의 갑옷",20000,100,0);
		//상점 판매 방어구
		방어구 하급갑옷=new 방어구("하급 갑옷",4000,15,0);
		방어구 중급갑옷=new 방어구("중급 갑옷",5000,35,0);
		방어구 상급갑옷=new 방어구("상급 갑옷",9000,50,0);
	//----------포션----------------	
		//hp포션
		hp포션 하급hp포션=new hp포션("하급 hp포션",50,50,0);
		hp포션 중급hp포션=new hp포션("중급 hp포션",100,100,0);
		hp포션 상급hp포션=new hp포션("상급 hp포션",150,150,0);
		//mp포션
		mp포션 하급mp포션=new mp포션("하급 mp포션",50,50,0);
		mp포션 중급mp포션=new mp포션("중급 mp포션",100,100,0);
		mp포션 상급mp포션=new mp포션("상급 mp포션",150,150,0);
	//----------상점----------------
		상점 상점=new 상점();
		
	//----------스테이지 층수----------	
		스테이지 스테이지=new 스테이지(4);
	
//----------------------------초기화면-------------------------------------------
	
		오프닝스레드 오프닝 = new 오프닝스레드();
		Thread 오프닝스레드=new Thread(오프닝);
		사운드스레드 오프닝bgm스레드=new 사운드스레드("opening.mp3",false);
		오프닝bgm스레드.start();
		오프닝스레드.start();
		try {
			오프닝스레드.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		오프닝bgm스레드.종료();
	
		로딩스레드 로딩_=new 로딩스레드("로딩");
		Thread 로딩스레드=new Thread(로딩_);	
		로딩스레드.start();
			try {
				로딩스레드.join();
			}catch (Exception e) {
				e.printStackTrace();
			}
	
		사운드스레드 케릭터선택bgm스레드=new 사운드스레드("character_choice.mp3",true);
		케릭터선택bgm스레드.start();
		
		while(true) {
			for(int i=0; i<60; i++) {
				System.out.println("");
			}

			System.out.println("===========================================================");
			System.out.println("게임을 시작하셨습니다.");
			System.out.println("탑의 정상에 올라 탑에 새로운 변화를 불러오려는 세 명의 모험가가 여러분을 기다리고 있습니다.");
			System.out.println("한명의 케릭터를 골라 탑을 올라가세요!");
			System.out.println("===========================================================");	
			System.out.println("1. 스물다섯번째 밤        2. 쿤 아게로 아그니스        3.라크 레크레이셔");
			System.out.println("");
			System.out.print("케릭터를 선택해주세요:");
//--------------------------------------케릭터 선택----------------------------------------		
			String character_select=scan.next();//케릭터 선택 스캐너
			if(character_select.equals("1")) {//밤 선택
				케릭터선택bgm스레드.종료();
				로딩스레드 케릭터정보생성=new 로딩스레드("케릭터정보생성");
				Thread 케릭터정보생성스레드=new Thread(케릭터정보생성);
				케릭터정보생성스레드.start();
				try {
					케릭터정보생성스레드.join();
				} catch (Exception e) {
					e.printStackTrace();					
				}
				사운드스레드 케릭터정보사운드스레드=new 사운드스레드("character_information.mp3",false);
				케릭터정보사운드스레드.start();
				모험가.밤선택(특수무기, 모험가공격스킬, 모험가궁극기);
				break;
			}else if(character_select.equals("2")){//쿤 선택
				케릭터선택bgm스레드.종료();
				로딩스레드 케릭터정보생성=new 로딩스레드("케릭터정보생성");
				Thread 케릭터정보생성스레드=new Thread(케릭터정보생성);
				케릭터정보생성스레드.start();
				try {
					케릭터정보생성스레드.join();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				사운드스레드 케릭터정보사운드스레드=new 사운드스레드("character_information.mp3",false);
				케릭터정보사운드스레드.start();
				모험가.쿤선택(특수무기, 모험가공격스킬, 모험가궁극기);
				break;
			}else if(character_select.equals("3")){//라크 선택
				케릭터선택bgm스레드.종료();
				
				로딩스레드 케릭터정보생성=new 로딩스레드("케릭터정보생성");
				Thread 케릭터정보생성스레드=new Thread(케릭터정보생성);
				케릭터정보생성스레드.start();
				try {
					케릭터정보생성스레드.join();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				사운드스레드 케릭터정보사운드스레드=new 사운드스레드("character_information.mp3",false);
				케릭터정보사운드스레드.start();
				모험가.라크선택(특수무기, 모험가공격스킬, 모험가궁극기);
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
		
//-------------------------메인 메뉴-----------------------------------------------------------------------------		
		loop1:while(스테이지.층수<=5) {
				//--------------------보스정보입력--------------------------------  	
				if(스테이지.지배자이름(스테이지.층수).equals("헤돈")) {
					보스.헤돈정보(보스공격스킬);//헤돈의 정보 입력
				}else if(스테이지.지배자이름(스테이지.층수).equals("카이저")) {
					보스.카이저정보(보스공격스킬);//카이저의 정보 입력
				}else if(스테이지.지배자이름(스테이지.층수).equals("헬조")) {
					보스.헬조정보(보스공격스킬, 모험가, 특수무기);//헬조의 정보 입력
				}else if(스테이지.지배자이름(스테이지.층수).equals("칼라반")) {
					보스.칼라반정보(보스공격스킬, 보스궁극기);//칼라반의 정보 입력
				}else if(스테이지.지배자이름(스테이지.층수).equals("자하드")){
					보스.자하드정보(보스공격스킬, 보스궁극기);//자하드의 정보 입력
				}	
				스테이지.입장멘트(보스);//새로운 스테이지로 들어갈 때 나오는 멘트를 담고 있음
				loop2: while(true) {
					사운드스레드 마을bgm스레드=new 사운드스레드("main_menu.mp3",true);
					마을bgm스레드.start();
					버프효과스레드 마을버프효과스레드=new 버프효과스레드(모험가, 스테이지, "마을", true);
					마을버프효과스레드.setDaemon(true);
					if(모험가.hp<모험가.maxhp || 모험가.mp<모험가.maxmp) {
						마을버프효과스레드.start();
					}else {
						마을버프효과스레드.종료();
					}
					for(int i=0; i<60; i++) {
						System.out.println("");
					}
				
				System.out.println("================================================================");
				System.out.println("1. "+스테이지.지배자이름(스테이지.층수)+"과(와)의 대결        2. 사냥터 입장        3. 인벤토리        4. 상점 입장        5. 케릭터 정보");
				System.out.println("================================================================");
				System.out.println("0. 게임종료");
				System.out.println("");
				System.out.print("취할 행동을 선택해주세요:");
				String character_action=scan.next();
				
//-------------------------------------보스와 싸우기 메뉴---------------------------------------------				
				if(character_action.equals("1")) {//보스와 싸우기
						사운드스레드 보스스테이지bgm스레드=new 사운드스레드("boss_stage.mp3",true);
						if(모험가.레벨<보스.레벨) {
							마을bgm스레드.종료();
							사운드스레드 블라킹효과음스레드=new 사운드스레드("block.mp3",false);
							블라킹효과음스레드.start();
							마을버프효과스레드.종료();
							for(int i=0; i<60; i++) {
								System.out.println("");
							}
							System.out.println("===========================================================");
							System.out.println("아직 "+보스.이름+"과(와) 싸우기엔 실력이 부족합니다. 레벨 "+보스.레벨+"을 만들고 오세요.");
							System.out.println("===========================================================");
							System.out.println("");
							try {
								Thread.sleep(1500);
							} catch (InterruptedException e) {
								e.printStackTrace();
							}
							continue;
						}else {
							마을bgm스레드.종료();
							마을버프효과스레드.종료();
							로딩스레드 전장로딩=new 로딩스레드("전장");
							Thread 전장로딩스레드=new Thread(전장로딩);
							전장로딩스레드.start();
							try {
								전장로딩스레드.join();
							} catch (InterruptedException e) {
								e.printStackTrace();
							}
							보스스테이지bgm스레드.start();
						}
						for(int i=0; i<60; i++) {
							System.out.println("");
						}
							System.out.println("=======================================================================");	
							System.out.println(보스.이름+"과(와)의 대결을 하러 왔습니다.");
							System.out.println(모험가.이름+": "+보스.이름+모험가.시작대사);
							System.out.println(보스.이름+": "+보스.시작대사);
							System.out.println("=======================================================================");	
							System.out.println(보스.이름+"과(와)의 싸움이 시작됐습니다.");
							try {
								Thread.sleep(3500);
							} catch (InterruptedException e) {
								e.printStackTrace();
							}
						loop3: while(true) {
							for(int i=0; i<60; i++) {
								System.out.println("");
							}
								System.out.println("");
								System.out.println("=================================================================");
								System.out.println(모험가.이름+"(LV: "+모험가.레벨+")"+" hp: "+(int)모험가.hp+"/"+(int)모험가.maxhp+", mp: "+(int)모험가.mp+"/"+(int)모험가.maxmp);
								System.out.println(스테이지.지배자이름(스테이지.층수)+"(LV: "+보스.레벨+")"+" hp: "+(int)보스.hp+"/"+(int)보스.maxhp);
								System.out.println("=================================================================");
					//---------------------모험가 공격--------------------------------
								System.out.println(모험가.이름+"의 턴입니다.");
								System.out.println("1. 공격        2. 인벤토리");
								System.out.println("-----------------------------------------------------------------");
								System.out.print("취할 행동을 선택하세요:");
								String fight_action=scan.next();
								if(fight_action.equals("1")) {//1. 공격 선택
									모험가.모험가턴(보스, 모험가공격스킬, 모험가궁극기);
									try {
										Thread.sleep(1700);
									} catch (InterruptedException e) {
										e.printStackTrace();
									}
									if(보스.hp<=0) {
										System.out.println(스테이지.지배자이름(스테이지.층수)+"를 이겼습니다!");
										try {
											Thread.sleep(2000);
										} catch (InterruptedException e) {
											e.printStackTrace();
										}
										보스.보상(모험가, 하급hp포션, 중급hp포션, 상급hp포션, 하급mp포션, 중급mp포션, 상급mp포션, 특수무기, 낡은검, 강철검, 무의검, 자하드의검, 낡은갑옷, 강철갑옷, 무의갑옷, 자하드의갑옷, 스테이지);//모험가가 보스를 잡으면 주는 보상 메소드
										모험가.레벨업(모험가공격스킬, 모험가궁극기);//레벨업을 했을 때 스텟의 변화를 반영하는 메소드
										if(스테이지.층수<5) {
											보스스테이지bgm스레드.종료();
											System.out.println("");
											
											로딩스레드 스테이지이동=new 로딩스레드("스테이지이동");
											Thread 스테이지이동로딩스레드=new Thread(스테이지이동);
											스테이지이동로딩스레드.start();
											try {
												스테이지이동로딩스레드.join();
											} catch (Exception e) {
												e.printStackTrace();
											}
											스테이지.층수++;
											break loop2;
										} else {
											for(int i=0; i<60; i++) {
												System.out.println("");
											}
											System.out.println("==========================================================================================");
											System.out.println("자하드: 이럴수가... 내가 패배하다니.. 정말 이 탑엔 새로운 변화가 필요한 것인가...");
											System.out.println(모험가.이름+": "+모험가.앤딩대사);
											System.out.println("자하드: 그래..."+모험가.이름+"라고 했나? 너라면 탑에 새로운 변화를 불러올 수도 있겠군. 나는 이제 새로운 여정을 떠나야겠다. 너도 잘 해보도록.");
											System.out.println("==========================================================================================");
											System.out.println("");
											System.out.println("축하드립니다!! 자하드와의 싸움에서 승리하셨습니다!!!");
											System.out.println("");
											try {
												Thread.sleep(8000);
											} catch (InterruptedException e) {
												e.printStackTrace();
											}
											보스스테이지bgm스레드.종료();
											while(true) { 
												for(int i=0; i<60; i++) {
													System.out.println("");
												}
												System.out.println("게임을 계속하시겠습니까?");
												System.out.println("1. 네        2. 아니오");
												System.out.println("");
												System.out.print("입력:");
												String ending_select=scan.next();
												if(ending_select.equals("1")) {
													
													로딩스레드 계속로딩=new 로딩스레드("로딩");
													Thread 로딩스레드1=new Thread(계속로딩);
													로딩스레드1.start();
														try {
															로딩스레드1.join();
														}catch (Exception e) {
															e.printStackTrace();
														}
													보스.자하드정보(보스공격스킬, 보스궁극기);//자하드의 정보 입력
													몬스터.자하드의호위병정보();//자하드의 몬스터 정보 입력
													몬스터1.자하드가의왕자정보();//자하드의 몬스터1 정보 입력
													break loop2;
												}else if(ending_select.equals("2")) {
													메인.게임종료();
												}
											}
										}
									
							//---------------보스 공격-------------------------------------			
									}else {
										보스.보스턴(모험가, 스테이지, 보스공격스킬, 보스궁극기);//보스의 공격
										try {
											Thread.sleep(1700);
										} catch (InterruptedException e) {
											e.printStackTrace();
										}
										if(모험가.hp<=0) {//모험가가 죽으면 메인메뉴로 부활하는 구문
											보스스테이지bgm스레드.종료();
											모험가.부활_보스(보스);
											
											로딩스레드 부활로딩=new 로딩스레드("부활");
											Thread 부활로딩스레드=new Thread(부활로딩);
											부활로딩스레드.start();
											try {
												부활로딩스레드.join();
											} catch (InterruptedException e) {
												e.printStackTrace();
											}
											break loop2;
										}
									}
                         //---------------------보스전 인벤토리-----------------------------------									
						    	}else if(fight_action.equals("2")) {//2. 인벤토리 선택
						    		모험가.대전인벤토리(낡은검, 강철검, 무의검, 자하드의검, 하급검, 중급검, 상급검, 낡은갑옷, 강철갑옷, 무의갑옷, 자하드의갑옷, 하급갑옷, 중급갑옷, 상급갑옷, 하급hp포션, 중급hp포션, 상급hp포션, 하급mp포션, 중급mp포션, 상급mp포션);	
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
//------------------------------------사냥터 메뉴-----------------------------------------------------------------------						
					}else if(character_action.equals("2")) {//사냥터
						마을bgm스레드.종료();
						마을버프효과스레드.종료();
						사운드스레드 사냥터bgm스레드=new 사운드스레드("monster_stage.mp3",true);
						사냥터bgm스레드.start();
						//--------------------몬스터정보입력--------------------------------  	
						if(스테이지.몬스터이름(스테이지.층수).equals("파란 원숭이")) {
							몬스터.파란원숭이정보();
							몬스터1.빨간원숭이정보();
						}else if(스테이지.몬스터이름(스테이지.층수).equals("노네임드 몬스터")) {
							몬스터.노네임드몬스터정보();
							몬스터1.네임드몬스터정보();
						}else if(스테이지.몬스터이름(스테이지.층수).equals("거충 야두")) {
							몬스터.거충야두정보();
							몬스터1.날개거충야두정보();
						}else if(스테이지.몬스터이름(스테이지.층수).equals("칼라반의 병사")) {
							몬스터.칼라반의병사정보();
							몬스터1.칼라반의호위무사정보();
						}else if(스테이지.몬스터이름(스테이지.층수).equals("자하드의 호위병")){
							몬스터.자하드의호위병정보();
							몬스터1.자하드가의왕자정보();
						}	
						while(true) {
							for(int i=0; i<60; i++) {
								System.out.println("");
							}
							System.out.println("============================================================================");	
							System.out.println("사냥터에 왔습니다. 현재 사냥터에는 "+몬스터.이름+"(LV: "+몬스터.레벨+")과(와) "+몬스터1.이름+"(LV: "+몬스터1.레벨+")이 (가) 있습니다.");
							System.out.println("1. "+몬스터.이름+"        2. "+몬스터1.이름);
							System.out.println("============================================================================");
							System.out.println("0. 마을로 돌아가기");
							System.out.println("");
							System.out.print("싸울 대상을 선택해주세요:");
							String monster_object=scan.next();
							if(monster_object.equals("1")){//상대적으로 약한 몬스터와의 대결을 선택하는 변수
								사냥터bgm스레드.종료();
								
								로딩스레드 전장로딩=new 로딩스레드("전장");
								Thread 전장로딩스레드=new Thread(전장로딩);
								전장로딩스레드.start();
								try {
									전장로딩스레드.join();
								} catch (InterruptedException e) {
									e.printStackTrace();
								}
								사운드스레드 사냥터bgm스레드1=new 사운드스레드("monster_stage.mp3",true);
								사냥터bgm스레드1.start();
								System.out.println("");
								System.out.println("===========================================================");	
								System.out.println(스테이지.몬스터이름(스테이지.층수)+"과(와)의 대결을 하러 왔습니다.");
								System.out.println(몬스터.이름+": "+몬스터.시작대사);
								System.out.println("===========================================================");	
								System.out.println(스테이지.몬스터이름(스테이지.층수)+"과(와)의 싸움이 시작됐습니다.");
								try {
									Thread.sleep(3500);
								} catch (InterruptedException e) {
									e.printStackTrace();
								}
								loop4:while(true) {
									for(int i=0; i<60; i++) {
										System.out.println("");
									}
										System.out.println("");
										System.out.println("===========================================================");
										System.out.println(모험가.이름+"(LV: "+모험가.레벨+")"+" hp: "+(int)모험가.hp+"/"+(int)모험가.maxhp+", mp: "+(int)모험가.mp+"/"+(int)모험가.maxmp);
										System.out.println(스테이지.몬스터이름(스테이지.층수)+"(LV: "+몬스터.레벨+")"+" hp: "+(int)몬스터.hp+"/"+(int)몬스터.maxhp);
										System.out.println("===========================================================");
									//---------------------모험가 공격--------------------------------
										System.out.println("1. 공격        2. 인벤토리");
										System.out.println("-----------------------------------------------------------------");

										System.out.print("취할 행동을 선택하세요:");
										String fight_action=scan.next();
										if(fight_action.equals("1")) {//1. 공격 선택
											모험가.몬스터전모험가턴(몬스터, 모험가공격스킬, 모험가궁극기);
											try {
												Thread.sleep(1700);
											} catch (InterruptedException e) {
												e.printStackTrace();
											}
											if(몬스터.hp<=0) {
												System.out.println(몬스터.이름+"를 이겼습니다!");
												몬스터.보상(모험가, 하급hp포션, 중급hp포션, 상급hp포션, 하급mp포션, 중급mp포션, 상급mp포션, 스테이지);
												모험가.레벨업(모험가공격스킬, 모험가궁극기);//레벨업을 했을 때 스텟의 변화를 반영하는 메소드
												System.out.println("");
												사냥터bgm스레드1.종료();
												
												로딩스레드 마을이동로딩=new 로딩스레드("마을이동");
												Thread 마을이동로딩스레드=new Thread(마을이동로딩);
												마을이동로딩스레드.start();
												try {
													마을이동로딩스레드.join();
												} catch (InterruptedException e) {
													e.printStackTrace();
												}
												break loop2;
												
									//---------------몬스터 공격-------------------------------------			
											}else {
												몬스터.몬스터턴(모험가, 스테이지);//몬스터의 공격
												try {
													Thread.sleep(1700);
												} catch (InterruptedException e) {
													e.printStackTrace();
												}
												if(모험가.hp<=0) {//몬스터와 싸우다 죽으면 모험가가 메인으로 부활하는 구문
													사냥터bgm스레드1.종료();
													모험가.부활_몬스터(몬스터);
													사냥터bgm스레드1.종료();
												
													로딩스레드 부활로딩=new 로딩스레드("부활");
													Thread 부활로딩스레드=new Thread(부활로딩);
													부활로딩스레드.start();
													try {
														부활로딩스레드.join();
													} catch(Exception e) {
														e.printStackTrace();
													}
													break loop2;
												}
											}
					                         //---------------------사냥터 인벤토리-----------------------------------									
											    	}else if(fight_action.equals("2")) {//인벤토리
											    		모험가.대전인벤토리(낡은검, 강철검, 무의검, 자하드의검, 하급검, 중급검, 상급검, 낡은갑옷, 강철갑옷, 무의갑옷, 자하드의갑옷, 하급갑옷, 중급갑옷, 상급갑옷, 하급hp포션, 중급hp포션, 상급hp포션, 하급mp포션, 중급mp포션, 상급mp포션);
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
								}else if(monster_object.equals("2")){//상대적으로 강한 몬스터와의 싸움 선택
									사냥터bgm스레드.종료();
							
									로딩스레드 전장로딩=new 로딩스레드("전장");
									Thread 전장로딩스레드=new Thread(전장로딩);
									전장로딩스레드.start();
									try {
										전장로딩스레드.join();
									} catch (InterruptedException e) {
										e.printStackTrace();
									}
									사운드스레드 사냥터bgm스레드1=new 사운드스레드("monster_stage.mp3",true);
									사냥터bgm스레드1.start();
									System.out.println("===========================================================");	
									System.out.println(스테이지.몬스터1이름(스테이지.층수)+"과(와)의 대결을 하러 왔습니다.");
									System.out.println(몬스터1.이름+": "+몬스터1.시작대사);
									System.out.println("===========================================================");	
									System.out.println(스테이지.몬스터1이름(스테이지.층수)+"과(와)의 싸움이 시작됐습니다.");
									try {
										Thread.sleep(3500);
									} catch (InterruptedException e) {
										e.printStackTrace();
									}

									loop4:while(true) {
										for(int i=0; i<60; i++) {
											System.out.println("");
										}
											System.out.println("===========================================================");
											System.out.println(모험가.이름+"(LV: "+모험가.레벨+")"+" hp: "+(int)모험가.hp+"/"+(int)모험가.maxhp+", mp: "+(int)모험가.mp+"/"+(int)모험가.maxmp);
											System.out.println(스테이지.몬스터1이름(스테이지.층수)+"(LV: "+몬스터1.레벨+")"+" hp: "+(int)몬스터1.hp+"/"+(int)몬스터1.maxhp);
											System.out.println("===========================================================");
										//---------------------모험가 공격--------------------------------
											System.out.println("1. 공격        2. 인벤토리");
											System.out.println("-----------------------------------------------------------------");

											System.out.print("취할 행동을 선택하세요:");
											String fight_action=scan.next();
											if(fight_action.equals("1")) {//1. 공격 선택
												모험가.몬스터전모험가턴(몬스터1, 모험가공격스킬, 모험가궁극기);
												try {
													Thread.sleep(1700);
												} catch (InterruptedException e) {
													e.printStackTrace();
												}
												if(몬스터1.hp<=0) {
													System.out.println(몬스터1.이름+"를 이겼습니다!");
													몬스터1.보상(모험가, 하급hp포션, 중급hp포션, 상급hp포션, 하급mp포션, 중급mp포션, 상급mp포션, 스테이지);
													모험가.레벨업(모험가공격스킬, 모험가궁극기);//레벨업을 했을 때 스텟의 변화를 반영하는 메소드
													System.out.println("");
													사냥터bgm스레드1.종료();
													
													로딩스레드 마을이동로딩=new 로딩스레드("마을이동");
													Thread 마을이동로딩스레드=new Thread(마을이동로딩);
													마을이동로딩스레드.start();
													try {
														마을이동로딩스레드.join();
													} catch (InterruptedException e) {
														e.printStackTrace();
													}
													
													System.out.println("");
													break loop2;
												
										//---------------몬스터1 공격-------------------------------------			
												}else {
													몬스터1.몬스터턴(모험가, 스테이지);//몬스터의 공격
													try {
														Thread.sleep(1700);
													} catch (InterruptedException e) {
														e.printStackTrace();
													}
													if(모험가.hp<=0) {//몬스터와 싸우다 죽으면 모험가가 메인으로 부활하는 구문
														사냥터bgm스레드1.종료();
														모험가.부활_몬스터(몬스터1);
														
														로딩스레드 부활로딩=new 로딩스레드("부활");
														Thread 부활로딩스레드=new Thread(부활로딩);
														부활로딩스레드.start();
														try {
															부활로딩스레드.join();
														} catch (InterruptedException e) {
															e.printStackTrace();
														}
														break loop2;
													}
												}
						                         //---------------------사냥터 인벤토리-----------------------------------									
											}else if(fight_action.equals("2")) {//인벤토리
												모험가.대전인벤토리(낡은검, 강철검, 무의검, 자하드의검, 하급검, 중급검, 상급검, 낡은갑옷, 강철갑옷, 무의갑옷, 자하드의갑옷, 하급갑옷, 중급갑옷, 상급갑옷, 하급hp포션, 중급hp포션, 상급hp포션, 하급mp포션, 중급mp포션, 상급mp포션);
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

								}else if(monster_object.equals("0")){
									사냥터bgm스레드.종료();
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
						}
//------------------------------------메인 인벤토리------------------------------------------------------------------------				
					}else if(character_action.equals("3")) {//인벤토리
						마을bgm스레드.종료();
						마을버프효과스레드.종료();
						모험가.인벤토리(낡은검, 강철검, 무의검, 자하드의검, 하급검, 중급검, 상급검, 낡은갑옷, 강철갑옷, 무의갑옷, 자하드의갑옷, 하급갑옷, 중급갑옷, 상급갑옷, 하급hp포션, 중급hp포션, 상급hp포션, 하급mp포션, 중급mp포션, 상급mp포션);
//----------------------------------------상점메뉴---------------------------------------------------------						
					}else if(character_action.equals("4")) {//상점
						마을bgm스레드.종료();
						마을버프효과스레드.종료();
						사운드스레드 상점bgm스레드=new 사운드스레드("shop.mp3",true);
						상점bgm스레드.start();
						for(int i=0; i<60; i++) {
							System.out.println("");
						}
						System.out.println("===========================================================");
						System.out.println("상점에 입장하셨습니다.");
						System.out.println("===========================================================");
						try {
							Thread.sleep(1500);
						} catch (InterruptedException e) {
							e.printStackTrace();
						}
						while(true) {
							for(int i=0; i<60; i++) {
								System.out.println("");
							}
							System.out.println("===========================================================");
							System.out.println("1. 아이템 사기        2. 아이템 팔기");
							System.out.println("===========================================================");
							System.out.println("0. 뒤로");
							System.out.println("");
							System.out.print("취할 행동을 선택해주세요:");
							String shop_action=scan.next();
							if(shop_action.equals("1")) {//아이템 사기
								상점.사기(모험가, 스테이지, 하급검, 중급검, 상급검, 하급갑옷, 중급갑옷, 상급갑옷, 하급hp포션, 중급hp포션, 상급hp포션, 하급mp포션, 중급mp포션, 상급mp포션);
							}else if(shop_action.equals("2")) {//아이템 팔기
								상점.팔기(모험가, 스테이지, 낡은검, 강철검, 무의검, 자하드의검, 하급검, 중급검, 상급검, 낡은갑옷, 강철갑옷, 무의갑옷, 자하드의갑옷, 하급갑옷, 중급갑옷, 상급갑옷, 하급hp포션, 중급hp포션, 상급hp포션, 하급mp포션, 중급mp포션, 상급mp포션);
							}else if(shop_action.equals("0")) {
								상점bgm스레드.종료();
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
//----------------------------------------케릭터 정보 메뉴----------------------------------------------------						
					}else if(character_action.equals("5")) {//케릭터 정보
						마을bgm스레드.종료();
						마을버프효과스레드.종료();
						사운드스레드 케릭터선택bgm스레드1=new 사운드스레드("character_choice.mp3",true);
						케릭터선택bgm스레드1.start();
						모험가.케릭터정보(모험가공격스킬, 모험가궁극기);
						while(true) {
							System.out.println("0. 뒤로");
							System.out.println("");
							System.out.print("취할 행동을 선택해주세요:");
							String goback1=scan.next();
							if(goback1.equals("0")) {
								케릭터선택bgm스레드1.종료();
								break; 
							}else {
								System.out.println("");
								System.out.println("<잘못 입력하셨습니다. 다시 입력해주세요.>");
								System.out.println("");
							}
						}
//-----------------------------------------종료메뉴	---------------------------------					
					}else if(character_action.equals("0")){//종료
						마을bgm스레드.종료();
						마을버프효과스레드.종료();
						메인.게임종료();
					}else {
						마을bgm스레드.종료();
						마을버프효과스레드.종료();
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

	
}	

	