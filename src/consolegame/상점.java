package consolegame;
import java.util.Scanner;
public class 상점 {
	아이템 아이템;
	Scanner scan=new Scanner(System.in);
	//------------아이템 사기 메소드----------------------------------------
		public void 사기(모험가 모험가, 스테이지 스테이지, 무기 하급검, 무기 중급검, 무기 상급검, 방어구 하급갑옷, 방어구 중급갑옷, 방어구 상급갑옷, hp포션 하급hp포션, hp포션 중급hp포션, hp포션 상급hp포션, mp포션 하급mp포션, mp포션 중급mp포션, mp포션 상급mp포션) {
			while(true) {
				for(int i=0; i<60; i++) {
					System.out.println("");
				}
				System.out.println("===========================================================");
				System.out.println("1. 무기        2. 방어구        3. 포션");
				System.out.println("===========================================================");
				System.out.println("0. 뒤로");
				System.out.println("");
				System.out.print("사고자 하는 아이템을 선택해주세요:");
				String item_select=scan.next();
				if(item_select.equals("1")) {//무기사기
					if(스테이지.층수<=2) {
						while(true) {
							for(int i=0; i<60; i++) {
								System.out.println("");
							}
							System.out.println("무기리스트");
							System.out.println("===========================================================");
							System.out.println("1. "+하급검.이름+"(공격력"+(int)하급검.공격력+"+)--------------------가격: "+하급검.가격+"원");
							System.out.println("===========================================================");
							System.out.println("0. 뒤로");
							System.out.println("");
							System.out.print("구매하고자 하는 무기를 선택해주세요:");
							String weapon_purchase=scan.next();
							if(weapon_purchase.equals("1")) {
								if(하급검.소유여부==0) {
									if (모험가.돈>=하급검.가격) {
										for(int i=0; i<60; i++) {
											System.out.println("");
										}
										사운드스레드 돈사운드스레드=new 사운드스레드("money.mp3",false);
										돈사운드스레드.start();
										System.out.println("");
										System.out.println("구매에 성공하셨습니다!");
										System.out.println("");
										try {
											Thread.sleep(1500);
										} catch (InterruptedException e) {
											e.printStackTrace();
										}
										모험가.돈-=하급검.가격;
										하급검.소유여부=1;
									}else {
										for(int i=0; i<60; i++) {
											System.out.println("");
										}
										System.out.println("");
										System.out.println("<돈이 부족합니다.>");
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
									System.out.println("<이미 보유하고 있는 무기입니다.>");
									System.out.println("");
									try {
										Thread.sleep(1500);
									} catch (InterruptedException e) {
										e.printStackTrace();
									}
								}
							}else if(weapon_purchase.equals("0")) {
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
					}else if(스테이지.층수==3) {
						while(true) {
							for(int i=0; i<60; i++) {
								System.out.println("");
							}
							System.out.println("무기리스트");
							System.out.println("===========================================================");
							System.out.println("1. "+하급검.이름+"(공격력"+(int)하급검.공격력+"+)--------------------가격: "+하급검.가격+"원");
							System.out.println("2. "+중급검.이름+"(공격력"+(int)중급검.공격력+"+)--------------------가격: "+중급검.가격+"원");
							System.out.println("===========================================================");
							System.out.println("0. 뒤로");
							System.out.println("");
							System.out.print("구매하고자 하는 무기를 선택해주세요:");
							String weapon_purchase=scan.next();
							if(weapon_purchase.equals("1")) {
								if(하급검.소유여부==0) {
									if (모험가.돈>=하급검.가격) {
										for(int i=0; i<60; i++) {
											System.out.println("");
										}
										사운드스레드 돈사운드스레드=new 사운드스레드("money.mp3",false);
										돈사운드스레드.start();
										System.out.println("");
										System.out.println("구매에 성공하셨습니다!");
										System.out.println("");
										try {
											Thread.sleep(1500);
										} catch (InterruptedException e) {
											e.printStackTrace();
										}
										모험가.돈-=하급검.가격;
										하급검.소유여부=1;
									}else {
										for(int i=0; i<60; i++) {
											System.out.println("");
										}
										System.out.println("");
										System.out.println("<돈이 부족합니다.>");
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
									System.out.println("<이미 보유하고 있는 무기입니다.>");
									System.out.println("");
									try {
										Thread.sleep(1500);
									} catch (InterruptedException e) {
										e.printStackTrace();
									}
								}
							}else if(weapon_purchase.equals("2")) {
								if(중급검.소유여부==0) {
									if (모험가.돈>=중급검.가격) {
										for(int i=0; i<60; i++) {
											System.out.println("");
										}
										사운드스레드 돈사운드스레드=new 사운드스레드("money.mp3",false);
										돈사운드스레드.start();
										System.out.println("");
										System.out.println("구매에 성공하셨습니다!");
										System.out.println("");
										try {
											Thread.sleep(1500);
										} catch (InterruptedException e) {
											e.printStackTrace();
										}
										모험가.돈-=중급검.가격;
										중급검.소유여부=1;
									}else {
										for(int i=0; i<60; i++) {
											System.out.println("");
										}
										System.out.println("");
										System.out.println("<돈이 부족합니다.>");
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
									System.out.println("<이미 보유하고 있는 무기입니다.>");
									System.out.println("");
									try {
										Thread.sleep(1500);
									} catch (InterruptedException e) {
										e.printStackTrace();
									}
								}
							}else if(weapon_purchase.equals("0")){
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
					}else if(스테이지.층수>3) {
						while(true) {
							for(int i=0; i<60; i++) {
								System.out.println("");
							}
							System.out.println("무기리스트");
							System.out.println("===========================================================");
							System.out.println("1. "+하급검.이름+"(공격력"+(int)하급검.공격력+"+)--------------------가격: "+하급검.가격+"원");
							System.out.println("2. "+중급검.이름+"(공격력"+(int)중급검.공격력+"+)--------------------가격: "+중급검.가격+"원");
							System.out.println("3. "+상급검.이름+"(공격력"+(int)상급검.공격력+"+)--------------------가격: "+상급검.가격+"원");
							System.out.println("===========================================================");
							System.out.println("0. 뒤로");
							System.out.println("");
							System.out.print("구매하고자 하는 무기를 선택해주세요:");
							String weapon_purchase=scan.next();
							if(weapon_purchase.equals("1")) {
								if(하급검.소유여부==0) {
									if (모험가.돈>=하급검.가격) {
										for(int i=0; i<60; i++) {
											System.out.println("");
										}
										사운드스레드 돈사운드스레드=new 사운드스레드("money.mp3",false);
										돈사운드스레드.start();
										System.out.println("");
										System.out.println("구매에 성공하셨습니다!");
										System.out.println("");
										try {
											Thread.sleep(1500);
										} catch (InterruptedException e) {
											e.printStackTrace();
										}
										모험가.돈-=하급검.가격;
										하급검.소유여부=1;
									}else {
										for(int i=0; i<60; i++) {
											System.out.println("");
										}
										System.out.println("");
										System.out.println("<돈이 부족합니다.>");
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
									System.out.println("<이미 보유하고 있는 무기입니다.>");
									System.out.println("");
									try {
										Thread.sleep(1500);
									} catch (InterruptedException e) {
										e.printStackTrace();
									}
								}
							}else if(weapon_purchase.equals("2")) {
								if(중급검.소유여부==0) {
									if (모험가.돈>=중급검.가격) {
										for(int i=0; i<60; i++) {
											System.out.println("");
										}
										사운드스레드 돈사운드스레드=new 사운드스레드("money.mp3",false);
										돈사운드스레드.start();
										System.out.println("");
										System.out.println("구매에 성공하셨습니다!");
										System.out.println("");
										try {
											Thread.sleep(1500);
										} catch (InterruptedException e) {
											e.printStackTrace();
										}
										모험가.돈-=중급검.가격;
										중급검.소유여부=1;
									}else {
										for(int i=0; i<60; i++) {
											System.out.println("");
										}
										System.out.println("");
										System.out.println("<돈이 부족합니다.>");
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
									System.out.println("<이미 보유하고 있는 무기입니다.>");
									System.out.println("");
									try {
										Thread.sleep(1500);
									} catch (InterruptedException e) {
										e.printStackTrace();
									}
								}
							}else if(weapon_purchase.equals("3")){
								if(중급검.소유여부==0) {
									if (모험가.돈>=상급검.가격) {
										for(int i=0; i<60; i++) {
											System.out.println("");
										}
										사운드스레드 돈사운드스레드=new 사운드스레드("money.mp3",false);
										돈사운드스레드.start();
										System.out.println("");
										System.out.println("구매에 성공하셨습니다!");
										System.out.println("");
										try {
											Thread.sleep(1500);
										} catch (InterruptedException e) {
											e.printStackTrace();
										}
										모험가.돈-=상급검.가격;
										상급검.소유여부=1;
									}else {
										for(int i=0; i<60; i++) {
											System.out.println("");
										}
										System.out.println("");
										System.out.println("<돈이 부족합니다.>");
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
									System.out.println("<이미 보유하고 있는 무기입니다.>");
									System.out.println("");
									try {
										Thread.sleep(1500);
									} catch (InterruptedException e) {
										e.printStackTrace();
									}
								}
							}else if(weapon_purchase.equals("0")){
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
				}else if(item_select.equals("2")) {//방어구사기
					if(스테이지.층수<=2) {
						while(true) {
							for(int i=0; i<60; i++) {
								System.out.println("");
							}
							System.out.println("방어구리스트");
							System.out.println("===========================================================");
							System.out.println("1. "+하급갑옷.이름+"(방어력"+(int)하급갑옷.방어력+"+)--------------------가격: "+하급갑옷.가격+"원");
							System.out.println("===========================================================");
							System.out.println("0. 뒤로");
							System.out.println("");
							System.out.print("구매하고자 하는 방어구를 선택해주세요:");
							String armor_purchase=scan.next();
							if(armor_purchase.equals("1")) {
								if(하급갑옷.소유여부==0) {
									if (모험가.돈>=하급갑옷.가격) {
										for(int i=0; i<60; i++) {
											System.out.println("");
										}
										사운드스레드 돈사운드스레드=new 사운드스레드("money.mp3",false);
										돈사운드스레드.start();
										System.out.println("");
										System.out.println("구매에 성공하셨습니다!");
										System.out.println("");
										try {
											Thread.sleep(1500);
										} catch (InterruptedException e) {
											e.printStackTrace();
										}
										모험가.돈-=하급갑옷.가격;
										하급갑옷.소유여부=1;
									}else {
										for(int i=0; i<60; i++) {
											System.out.println("");
										}
										System.out.println("");
										System.out.println("<돈이 부족합니다.>");
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
									System.out.println("<이미 보유하고 있는 무기입니다.>");
									System.out.println("");
									try {
										Thread.sleep(1500);
									} catch (InterruptedException e) {
										e.printStackTrace();
									}
								}
							}else if(armor_purchase.equals("0")) {
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
					}else if(스테이지.층수==3) {
						while(true) {
							for(int i=0; i<60; i++) {
								System.out.println("");
							}
							System.out.println("방어구리스트");
							System.out.println("===========================================================");
							System.out.println("1. "+하급갑옷.이름+"(방어력"+(int)하급갑옷.방어력+"+)--------------------가격: "+하급갑옷.가격+"원");
							System.out.println("2. "+중급갑옷.이름+"(방어력"+(int)중급갑옷.방어력+"+)--------------------가격: "+중급갑옷.가격+"원");
							System.out.println("===========================================================");
							System.out.println("0. 뒤로");
							System.out.println("");
							System.out.print("구매하고자 하는 방어구를 선택해주세요:");
							String armor_purchase=scan.next();
							if(armor_purchase.equals("1")) {
								if(하급갑옷.소유여부==0) {
									if (모험가.돈>=하급갑옷.가격) {
										for(int i=0; i<60; i++) {
											System.out.println("");
										}
										사운드스레드 돈사운드스레드=new 사운드스레드("money.mp3",false);
										돈사운드스레드.start();
										System.out.println("");
										System.out.println("구매에 성공하셨습니다!");
										System.out.println("");
										try {
											Thread.sleep(1500);
										} catch (InterruptedException e) {
											e.printStackTrace();
										}
										모험가.돈-=하급갑옷.가격;
										하급갑옷.소유여부=1;
									}else {
										for(int i=0; i<60; i++) {
											System.out.println("");
										}
										System.out.println("");
										System.out.println("<돈이 부족합니다.>");
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
									System.out.println("<이미 보유하고 있는 무기입니다.>");
									System.out.println("");
									try {
										Thread.sleep(1500);
									} catch (InterruptedException e) {
										e.printStackTrace();
									}
								}
							}else if(armor_purchase.equals("2")) {
								if(중급갑옷.소유여부==0) {
									if (모험가.돈>=중급갑옷.가격) {
										for(int i=0; i<60; i++) {
											System.out.println("");
										}
										사운드스레드 돈사운드스레드=new 사운드스레드("money.mp3",false);
										돈사운드스레드.start();
										System.out.println("");
										System.out.println("구매에 성공하셨습니다!");
										System.out.println("");
										try {
											Thread.sleep(1500);
										} catch (InterruptedException e) {
											e.printStackTrace();
										}
										모험가.돈-=중급갑옷.가격;
										중급갑옷.소유여부=1;
									}else {
										for(int i=0; i<60; i++) {
											System.out.println("");
										}
										System.out.println("");
										System.out.println("<돈이 부족합니다.>");
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
									System.out.println("<이미 보유하고 있는 무기입니다.>");
									System.out.println("");
									try {
										Thread.sleep(1500);
									} catch (InterruptedException e) {
										e.printStackTrace();
									}
								}
							}else if(armor_purchase.equals("0")){
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
					}else if(스테이지.층수>3) {
						while(true) {
							for(int i=0; i<60; i++) {
								System.out.println("");
							}
							System.out.println("방어구리스트");
							System.out.println("===========================================================");
							System.out.println("1. "+하급갑옷.이름+"(공격력"+(int)하급갑옷.방어력+"+)--------------------가격: "+하급갑옷.가격+"원");
							System.out.println("2. "+중급갑옷.이름+"(공격력"+(int)중급갑옷.방어력+"+)--------------------가격: "+중급갑옷.가격+"원");
							System.out.println("3. "+상급갑옷.이름+"(공격력"+(int)상급갑옷.방어력+"+)--------------------가격: "+상급갑옷.가격+"원");
							System.out.println("===========================================================");
							System.out.println("0. 뒤로");
							System.out.println("");
							System.out.print("구매하고자 하는 방어구를 선택해주세요:");
							String armor_purchase=scan.next();
							if(armor_purchase.equals("1")) {
								if(하급갑옷.소유여부==0) {
									if (모험가.돈>=하급갑옷.가격) {
										for(int i=0; i<60; i++) {
											System.out.println("");
										}
										사운드스레드 돈사운드스레드=new 사운드스레드("money.mp3",false);
										돈사운드스레드.start();
										System.out.println("");
										System.out.println("구매에 성공하셨습니다!");
										System.out.println("");
										try {
											Thread.sleep(1500);
										} catch (InterruptedException e) {
											e.printStackTrace();
										}
										모험가.돈-=하급갑옷.가격;
										하급갑옷.소유여부=1;
									}else {
										for(int i=0; i<60; i++) {
											System.out.println("");
										}
										System.out.println("");
										System.out.println("<돈이 부족합니다.>");
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
									System.out.println("<이미 보유하고 있는 무기입니다.>");
									System.out.println("");
									try {
										Thread.sleep(1500);
									} catch (InterruptedException e) {
										e.printStackTrace();
									}
								}
							}else if(armor_purchase.equals("2")) {
								if(중급갑옷.소유여부==0) {
									if (모험가.돈>=중급갑옷.가격) {
										for(int i=0; i<60; i++) {
											System.out.println("");
										}
										사운드스레드 돈사운드스레드=new 사운드스레드("money.mp3",false);
										돈사운드스레드.start();
										System.out.println("");
										System.out.println("구매에 성공하셨습니다!");
										System.out.println("");
										try {
											Thread.sleep(1500);
										} catch (InterruptedException e) {
											e.printStackTrace();
										}
										모험가.돈-=중급갑옷.가격;
										중급갑옷.소유여부=1;
									}else {
										for(int i=0; i<60; i++) {
											System.out.println("");
										}
										System.out.println("");
										System.out.println("<돈이 부족합니다.>");
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
									System.out.println("<이미 보유하고 있는 무기입니다.>");
									System.out.println("");
									try {
										Thread.sleep(1500);
									} catch (InterruptedException e) {
										e.printStackTrace();
									}
								}
							}else if(armor_purchase.equals("3")){
								if(상급갑옷.소유여부==0) {
									if (모험가.돈>=상급갑옷.가격) {
										for(int i=0; i<60; i++) {
											System.out.println("");
										}
										사운드스레드 돈사운드스레드=new 사운드스레드("money.mp3",false);
										돈사운드스레드.start();
										System.out.println("");
										System.out.println("구매에 성공하셨습니다!");
										System.out.println("");
										try {
											Thread.sleep(1500);
										} catch (InterruptedException e) {
											e.printStackTrace();
										}
										모험가.돈-=상급갑옷.가격;
										상급갑옷.소유여부=1;
									}else {
										for(int i=0; i<60; i++) {
											System.out.println("");
										}
										System.out.println("");
										System.out.println("<돈이 부족합니다.>");
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
									System.out.println("<이미 보유하고 있는 무기입니다.>");
									System.out.println("");
									try {
										Thread.sleep(1500);
									} catch (InterruptedException e) {
										e.printStackTrace();
									}
								}
							}else if(armor_purchase.equals("0")){
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
				}else if(item_select.equals("3")) {//포션사기(포션의 경우 포션의 개수를 입력할 때 숫자가 아닌 문자열을 입력하면 예외처리가 가능하게 try/catch문을 사용함)
					if(스테이지.층수<=2) {
						while(true) {
							for(int i=0; i<60; i++) {
								System.out.println("");
							}
							System.out.println("포션리스트");
							System.out.println("===========================================================");
							System.out.println("1. "+하급hp포션.이름+"(hp "+(int)하급hp포션.hp회복량+"회복)--------------------가격: "+하급hp포션.가격+"원");
							System.out.println("2. "+하급mp포션.이름+"(mp "+(int)하급mp포션.mp회복량+"회복)--------------------가격: "+하급mp포션.가격+"원");
							System.out.println("===========================================================");
							System.out.println("0. 뒤로");
							System.out.println("");
							System.out.print("구매하고자 하는 포션을 선택해주세요:");
							String potion_purchase=scan.next();
							if(potion_purchase.equals("1")) {
								try {
									while(true) {
										System.out.println("");
										System.out.print("수량을 입력해주세요(취소: 0):");
										int potion_count=scan.nextInt();
										if(potion_count==0) {
											break;
										}else {
											if(모험가.돈>=하급hp포션.가격*potion_count) {
												for(int i=0; i<60; i++) {
													System.out.println("");
												}
												사운드스레드 돈사운드스레드=new 사운드스레드("money.mp3",false);
												돈사운드스레드.start();
												System.out.println("");
												System.out.println("구매에 성공하셨습니다.");
												System.out.println("");
												try {
													Thread.sleep(1500);
												} catch (InterruptedException e) {
													e.printStackTrace();
												}
												모험가.돈-=하급hp포션.가격*potion_count;
												하급hp포션.개수+=potion_count;
												break;
											}else {
												for(int i=0; i<60; i++) {
													System.out.println("");
												}
												System.out.println("");
												System.out.println("<돈이 부족합니다.>");
												System.out.println("");
												try {
													Thread.sleep(1500);
												} catch (InterruptedException e) {
													e.printStackTrace();
												}
												for(int i=0; i<60; i++) {
													System.out.println("");
												}
											}
											
										}
									}
								}catch(Exception e) {
									for(int i=0; i<60; i++) {
										System.out.println("");
									}
									System.out.println("");
									System.out.println("<잘못 입력하셨습니다. 다시 입력해주세요.>");
									System.out.println("");
									try {
										Thread.sleep(1500);
									} catch (InterruptedException e1) {
										e1.printStackTrace();
									}
								}
							}else if(potion_purchase.equals("2")){
								try {
									while(true) {
										System.out.println("");
										System.out.print("수량을 입력해주세요(취소: 0):");
										int potion_count=scan.nextInt();
										if(potion_count==0) {
											break;
										}else {
											if(모험가.돈>=하급mp포션.가격*potion_count) {
												for(int i=0; i<60; i++) {
													System.out.println("");
												}
												사운드스레드 돈사운드스레드=new 사운드스레드("money.mp3",false);
												돈사운드스레드.start();
												System.out.println("");
												System.out.println("구매에 성공하셨습니다.");
												System.out.println("");
												try {
													Thread.sleep(1500);
												} catch (InterruptedException e) {
													e.printStackTrace();
												}
												모험가.돈-=하급mp포션.가격*potion_count;
												하급mp포션.개수+=potion_count;
												break;
											}else {
												for(int i=0; i<60; i++) {
													System.out.println("");
												}
												System.out.println("");
												System.out.println("<돈이 부족합니다.>");
												System.out.println("");
												try {
													Thread.sleep(1500);
												} catch (InterruptedException e) {
													e.printStackTrace();
												}
												for(int i=0; i<60; i++) {
													System.out.println("");
												}
											}
										}
								}
								}catch(Exception e) {
									for(int i=0; i<60; i++) {
										System.out.println("");
									}
									System.out.println("");
									System.out.println("<잘못 입력하셨습니다. 다시 입력해주세요.>");
									System.out.println("");
									try {
										Thread.sleep(1500);
									} catch (InterruptedException e1) {
										e1.printStackTrace();
									}
								}
							}else if(potion_purchase.equals("0")){
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
					}else if(스테이지.층수==3) {
						while(true) {
							for(int i=0; i<60; i++) {
								System.out.println("");
							}
							System.out.println("포션리스트");
							System.out.println("===========================================================");
							System.out.println("1. "+하급hp포션.이름+"(hp "+(int)하급hp포션.hp회복량+"회복)---------------------가격: "+하급hp포션.가격+"원");
							System.out.println("2. "+중급hp포션.이름+"(hp "+(int)중급hp포션.hp회복량+"회복)--------------------가격: "+중급hp포션.가격+"원");
							System.out.println("3. "+하급mp포션.이름+"(mp "+(int)하급mp포션.mp회복량+"회복)---------------------가격: "+하급mp포션.가격+"원");
							System.out.println("4. "+중급mp포션.이름+"(mp "+(int)중급mp포션.mp회복량+"회복)--------------------가격: "+중급mp포션.가격+"원");
							System.out.println("===========================================================");
							System.out.println("0. 뒤로");
							System.out.println("");
							System.out.print("구매하고자 하는 포션을 선택해주세요:");
							String potion_purchase=scan.next();
							if(potion_purchase.equals("1")) {
								try {
									while(true) {
										System.out.println("");
										System.out.print("수량을 입력해주세요(취소: 0):");
										int potion_count=scan.nextInt();
										if(potion_count==0) {
											break;
										}else {
											if(모험가.돈>=하급hp포션.가격*potion_count) {
												for(int i=0; i<60; i++) {
													System.out.println("");
												}
												사운드스레드 돈사운드스레드=new 사운드스레드("money.mp3",false);
												돈사운드스레드.start();
												System.out.println("");
												System.out.println("구매에 성공하셨습니다.");
												System.out.println("");
												try {
													Thread.sleep(1500);
												} catch (InterruptedException e) {
													e.printStackTrace();
												}
												모험가.돈-=하급hp포션.가격*potion_count;
												하급hp포션.개수+=potion_count;
												break;
											}else {
												for(int i=0; i<60; i++) {
													System.out.println("");
												}
												System.out.println("");
												System.out.println("<돈이 부족합니다.>");
												System.out.println("");
												try {
													Thread.sleep(1500);
												} catch (InterruptedException e) {
													e.printStackTrace();
												}
												for(int i=0; i<60; i++) {
													System.out.println("");
												}
											}
										}
									}
								}catch(Exception e) {
									for(int i=0; i<60; i++) {
										System.out.println("");
									}
									System.out.println("");
									System.out.println("<잘못 입력하셨습니다. 다시 입력해주세요.>");
									System.out.println("");
									try {
										Thread.sleep(1500);
									} catch (InterruptedException e1) {
										e1.printStackTrace();
									}
								}
							}else if(potion_purchase.equals("2")){
								try {
									while(true) {
										System.out.println("");
										System.out.print("수량을 입력해주세요(취소: 0):");
										int potion_count=scan.nextInt();
										if(potion_count==0) {
											break;
										}else {
											if(모험가.돈>=중급hp포션.가격*potion_count) {
												for(int i=0; i<60; i++) {
													System.out.println("");
												}
												사운드스레드 돈사운드스레드=new 사운드스레드("money.mp3",false);
												돈사운드스레드.start();
												System.out.println("");
												System.out.println("구매에 성공하셨습니다.");
												System.out.println("");
												try {
													Thread.sleep(1500);
												} catch (InterruptedException e) {
													e.printStackTrace();
												}
												모험가.돈-=중급hp포션.가격*potion_count;
												중급hp포션.개수+=potion_count;
												break;
											}else {
												for(int i=0; i<60; i++) {
													System.out.println("");
												}
												System.out.println("");
												System.out.println("<돈이 부족합니다.>");
												System.out.println("");
												try {
													Thread.sleep(1500);
												} catch (InterruptedException e) {
													e.printStackTrace();
												}
												for(int i=0; i<60; i++) {
													System.out.println("");
												}
											}
										}
									}
								}catch(Exception e) {
									for(int i=0; i<60; i++) {
										System.out.println("");
									}
									System.out.println("");
									System.out.println("<잘못 입력하셨습니다. 다시 입력해주세요.>");
									System.out.println("");
									try {
										Thread.sleep(1500);
									} catch (InterruptedException e1) {
										e1.printStackTrace();
									}
								}
							}else if(potion_purchase.equals("3")){
								try{
									while(true) {
										System.out.println("");
										System.out.print("수량을 입력해주세요(취소: 0):");
										int potion_count=scan.nextInt();
										if(potion_count==0) {
											break;
										}else {
											if(모험가.돈>=하급mp포션.가격*potion_count) {
												for(int i=0; i<60; i++) {
													System.out.println("");
												}
												사운드스레드 돈사운드스레드=new 사운드스레드("money.mp3",false);
												돈사운드스레드.start();
												System.out.println("");
												System.out.println("구매에 성공하셨습니다.");
												System.out.println("");
												try {
													Thread.sleep(1500);
												} catch (InterruptedException e) {
													e.printStackTrace();
												}
												모험가.돈-=하급mp포션.가격*potion_count;
												하급mp포션.개수+=potion_count;
												break;
											}else {
												for(int i=0; i<60; i++) {
													System.out.println("");
												}
												System.out.println("");
												System.out.println("<돈이 부족합니다.>");
												System.out.println("");
												try {
													Thread.sleep(1500);
												} catch (InterruptedException e) {
													e.printStackTrace();
												}
												for(int i=0; i<60; i++) {
													System.out.println("");
												}
												
											}
										}
									}
								}catch(Exception e) {
									for(int i=0; i<60; i++) {
										System.out.println("");
									}
									System.out.println("");
									System.out.println("<잘못 입력하셨습니다. 다시 입력해주세요.>");
									System.out.println("");
									try {
										Thread.sleep(1500);
									} catch (InterruptedException e1) {
										e1.printStackTrace();
									}
								}
							}else if(potion_purchase.equals("4")) {
								try {
									while(true) {
										System.out.println("");
										System.out.print("수량을 입력해주세요(취소: 0):");
										int potion_count=scan.nextInt();
										if(potion_count==0) {
											break;
										}else {
											if(모험가.돈>=중급mp포션.가격*potion_count) {
												for(int i=0; i<60; i++) {
													System.out.println("");
												}
												사운드스레드 돈사운드스레드=new 사운드스레드("money.mp3",false);
												돈사운드스레드.start();
												System.out.println("");
												System.out.println("구매에 성공하셨습니다.");
												System.out.println("");
												try {
													Thread.sleep(1500);
												} catch (InterruptedException e) {
													e.printStackTrace();
												}
												모험가.돈-=중급mp포션.가격*potion_count;
												중급mp포션.개수+=potion_count;
												break;
											}else {
												for(int i=0; i<60; i++) {
													System.out.println("");
												}
												System.out.println("");
												System.out.println("<돈이 부족합니다.>");
												System.out.println("");
												try {
													Thread.sleep(1500);
												} catch (InterruptedException e) {
													e.printStackTrace();
												}
												for(int i=0; i<60; i++) {
													System.out.println("");
												}
											}
										}
									}
								}catch(Exception e) {
									for(int i=0; i<60; i++) {
										System.out.println("");
									}
									System.out.println("");
									System.out.println("<잘못 입력하셨습니다. 다시 입력해주세요.>");
									System.out.println("");
									try {
										Thread.sleep(1500);
									} catch (InterruptedException e1) {
										e1.printStackTrace();
									}
								}
							}else if(potion_purchase.equals("0")) {
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
					}else if(스테이지.층수>3) {
						while(true) {
							for(int i=0; i<60; i++) {
								System.out.println("");
							}
							System.out.println("포션리스트");
							System.out.println("===========================================================");
							System.out.println("1. "+하급hp포션.이름+"(hp "+(int)하급hp포션.hp회복량+"회복)---------------------가격: "+하급hp포션.가격+"원");
							System.out.println("2. "+중급hp포션.이름+"(hp "+(int)중급hp포션.hp회복량+"회복)--------------------가격: "+중급hp포션.가격+"원");
							System.out.println("3. "+상급hp포션.이름+"(hp "+(int)상급hp포션.hp회복량+"회복)--------------------가격: "+상급hp포션.가격+"원");
							System.out.println("4. "+하급mp포션.이름+"(mp "+(int)하급mp포션.mp회복량+"회복)---------------------가격: "+하급mp포션.가격+"원");
							System.out.println("5. "+중급mp포션.이름+"(mp "+(int)중급mp포션.mp회복량+"회복)--------------------가격: "+중급mp포션.가격+"원");
							System.out.println("6. "+상급mp포션.이름+"(mp "+(int)상급mp포션.mp회복량+"회복)--------------------가격: "+상급mp포션.가격+"원");
							System.out.println("===========================================================");
							System.out.println("0. 뒤로");
							System.out.println("");
							System.out.print("구매하고자 하는 포션을 선택해주세요:");
							String potion_purchase=scan.next();
							if(potion_purchase.equals("1")) {
								try {
									while(true) {
										System.out.println("");
										System.out.print("수량을 입력해주세요(취소: 0):");
										int potion_count=scan.nextInt();
										if(potion_count==0) {
											break;
										}else {
											if(모험가.돈>=하급hp포션.가격*potion_count) {
												for(int i=0; i<60; i++) {
													System.out.println("");
												}
												사운드스레드 돈사운드스레드=new 사운드스레드("money.mp3",false);
												돈사운드스레드.start();
												System.out.println("");
												System.out.println("구매에 성공하셨습니다.");
												System.out.println("");
												try {
													Thread.sleep(1500);
												} catch (InterruptedException e) {
													e.printStackTrace();
												}
												모험가.돈-=하급hp포션.가격*potion_count;
												하급hp포션.개수+=potion_count;
												break;
											}else {
												for(int i=0; i<60; i++) {
													System.out.println("");
												}
												System.out.println("");
												System.out.println("<돈이 부족합니다.>");
												System.out.println("");
												try {
													Thread.sleep(1500);
												} catch (InterruptedException e) {
													e.printStackTrace();
												}
												for(int i=0; i<60; i++) {
													System.out.println("");
												}
											}
										}
									}
								}catch(Exception e) {
									for(int i=0; i<60; i++) {
										System.out.println("");
									}
									System.out.println("");
									System.out.println("<잘못 입력하셨습니다. 다시 입력해주세요.>");
									System.out.println("");
									try {
										Thread.sleep(1500);
									} catch (InterruptedException e1) {
										e1.printStackTrace();
									}
								}
							}else if(potion_purchase.equals("2")){
								try {
									while(true) {
										System.out.println("");
										System.out.print("수량을 입력해주세요(취소: 0):");
										int potion_count=scan.nextInt();
										if(potion_count==0) {
											break;
										}else {
											if(모험가.돈>=중급hp포션.가격*potion_count) {
												for(int i=0; i<60; i++) {
													System.out.println("");
												}
												사운드스레드 돈사운드스레드=new 사운드스레드("money.mp3",false);
												돈사운드스레드.start();
												System.out.println("");
												System.out.println("구매에 성공하셨습니다.");
												System.out.println("");
												try {
													Thread.sleep(1500);
												} catch (InterruptedException e) {
													e.printStackTrace();
												}
												모험가.돈-=중급hp포션.가격*potion_count;
												중급hp포션.개수+=potion_count;
												break;
											}else {
												for(int i=0; i<60; i++) {
													System.out.println("");
												}
												System.out.println("");
												System.out.println("<돈이 부족합니다.>");
												System.out.println("");
												try {
													Thread.sleep(1500);
												} catch (InterruptedException e) {
													e.printStackTrace();
												}
												for(int i=0; i<60; i++) {
													System.out.println("");
												}
											}
										}
									}
								}catch(Exception e) {
									for(int i=0; i<60; i++) {
										System.out.println("");
									}
									System.out.println("");
									System.out.println("<잘못 입력하셨습니다. 다시 입력해주세요.>");
									System.out.println("");
									try {
										Thread.sleep(1500);
									} catch (InterruptedException e1) {
										e1.printStackTrace();
									}
								}
							}else if(potion_purchase.equals("3")){
								try {
									while(true) {
										System.out.println("");
										System.out.print("수량을 입력해주세요(취소: 0):");
										int potion_count=scan.nextInt();
										if(potion_count==0) {
											break;
										}else {
											if(모험가.돈>=상급hp포션.가격*potion_count) {
												for(int i=0; i<60; i++) {
													System.out.println("");
												}
												사운드스레드 돈사운드스레드=new 사운드스레드("money.mp3",false);
												돈사운드스레드.start();
												System.out.println("구매에 성공하셨습니다.");
												try {
													Thread.sleep(1500);
												} catch (InterruptedException e) {
													e.printStackTrace();
												}
												모험가.돈-=상급hp포션.가격*potion_count;
												상급hp포션.개수+=potion_count;
												break;
											}else {
												for(int i=0; i<60; i++) {
													System.out.println("");
												}
												System.out.println("");
												System.out.println("<돈이 부족합니다.>");
												System.out.println("");
												try {
													Thread.sleep(1500);
												} catch (InterruptedException e) {
													e.printStackTrace();
												}
												for(int i=0; i<60; i++) {
													System.out.println("");
												}
											}
										}
									}
								}catch(Exception e) {
									for(int i=0; i<60; i++) {
										System.out.println("");
									}
									System.out.println("");
									System.out.println("<잘못 입력하셨습니다. 다시 입력해주세요.>");
									System.out.println("");
									try {
										Thread.sleep(1500);
									} catch (InterruptedException e1) {
										e1.printStackTrace();
									}
								}
							}else if(potion_purchase.equals("4")) {
								try {
									while(true) {
										System.out.println("");
										System.out.print("수량을 입력해주세요(취소: 0):");
										int potion_count=scan.nextInt();
										if(potion_count==0) {
											break;
										}else {
											if(모험가.돈>=하급mp포션.가격*potion_count) {
												for(int i=0; i<60; i++) {
													System.out.println("");
												}
												사운드스레드 돈사운드스레드=new 사운드스레드("money.mp3",false);
												돈사운드스레드.start();
												System.out.println("");
												System.out.println("구매에 성공하셨습니다.");
												System.out.println("");
												try {
													Thread.sleep(1500);
												} catch (InterruptedException e) {
													e.printStackTrace();
												}
												모험가.돈-=하급mp포션.가격*potion_count;
												하급mp포션.개수+=potion_count;
												break;
											}else {
												for(int i=0; i<60; i++) {
													System.out.println("");
												}
												System.out.println("");
												System.out.println("<돈이 부족합니다.>");
												System.out.println("");
												try {
													Thread.sleep(1500);
												} catch (InterruptedException e) {
													e.printStackTrace();
												}
												for(int i=0; i<60; i++) {
													System.out.println("");
												}
											}
										}
									}
								}catch(Exception e) {
									for(int i=0; i<60; i++) {
										System.out.println("");
									}
									System.out.println("");
									System.out.println("<잘못 입력하셨습니다. 다시 입력해주세요.>");
									System.out.println("");
									try {
										Thread.sleep(1500);
									} catch (InterruptedException e1) {
										e1.printStackTrace();
									}
								}
							}else if(potion_purchase.equals("5")) {
								try {
									while(true) {
										System.out.println("");
										System.out.print("수량을 입력해주세요(취소: 0):");
										int potion_count=scan.nextInt();
										if(potion_count==0) {
											break;
										}else {
											if(모험가.돈>=중급mp포션.가격*potion_count) {
												for(int i=0; i<60; i++) {
													System.out.println("");
												}
												사운드스레드 돈사운드스레드=new 사운드스레드("money.mp3",false);
												돈사운드스레드.start();
												System.out.println("");
												System.out.println("구매에 성공하셨습니다.");
												System.out.println("");
												try {
													Thread.sleep(1500);
												} catch (InterruptedException e) {
													e.printStackTrace();
												}
												모험가.돈-=중급mp포션.가격*potion_count;
												중급mp포션.개수+=potion_count;
												break;
											}else {
												for(int i=0; i<60; i++) {
													System.out.println("");
												}
												System.out.println("");
												System.out.println("<돈이 부족합니다.>");
												System.out.println("");
												try {
													Thread.sleep(1500);
												} catch (InterruptedException e) {
													e.printStackTrace();
												}
												for(int i=0; i<60; i++) {
													System.out.println("");
												}
											}
										}
									}
								}catch(Exception e) {
									for(int i=0; i<60; i++) {
										System.out.println("");
									}
									System.out.println("");
									System.out.println("<잘못 입력하셨습니다. 다시 입력해주세요.>");
									System.out.println("");
									try {
										Thread.sleep(1500);
									} catch (InterruptedException e1) {
										e1.printStackTrace();
									}
								}
							}else if(potion_purchase.equals("6")) {
								try {
									while(true) {
										System.out.println("");
										System.out.print("수량을 입력해주세요(취소: 0):");
										int potion_count=scan.nextInt();
										if(potion_count==0) {
											break;
										}else {
											if(모험가.돈>=상급mp포션.가격*potion_count) {
												for(int i=0; i<60; i++) {
													System.out.println("");
												}
												사운드스레드 돈사운드스레드=new 사운드스레드("money.mp3",false);
												돈사운드스레드.start();
												System.out.println("");
												System.out.println("구매에 성공하셨습니다.");
												System.out.println("");
												try {
													Thread.sleep(1500);
												} catch (InterruptedException e) {
													e.printStackTrace();
												}
												모험가.돈-=상급mp포션.가격*potion_count;
												상급mp포션.개수+=potion_count;
												break;
											}else {
												for(int i=0; i<60; i++) {
													System.out.println("");
												}
												System.out.println("");
												System.out.println("<돈이 부족합니다.>");
												System.out.println("");
												try {
													Thread.sleep(1500);
												} catch (InterruptedException e) {
													e.printStackTrace();
												}
												for(int i=0; i<60; i++) {
													System.out.println("");
												}
											}
										}
									}
								}catch(Exception e) {
									for(int i=0; i<60; i++) {
										System.out.println("");
									}
									System.out.println("");
									System.out.println("<잘못 입력하셨습니다. 다시 입력해주세요.>");
									System.out.println("");
									try {
										Thread.sleep(1500);
									} catch (InterruptedException e1) {
										e1.printStackTrace();
									}
								}
							}else if(potion_purchase.equals("0")) {
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
		
		//-------------------------아이템 팔기 메소드----------------------------------
		public void 팔기(모험가 모험가, 스테이지 스테이지,무기 낡은검, 무기 강철검, 무기 무의검, 무기 자하드의검, 무기 하급검, 무기 중급검, 무기 상급검, 방어구 낡은갑옷, 방어구 강철갑옷, 방어구 무의갑옷, 방어구 자하드의갑옷, 방어구 하급갑옷, 방어구 중급갑옷, 방어구 상급갑옷, hp포션 하급hp포션, hp포션 중급hp포션, hp포션 상급hp포션, mp포션 하급mp포션, mp포션 중급mp포션, mp포션 상급mp포션) {
			while(true) {
				for(int i=0; i<60; i++) {
					System.out.println("");
				}
				System.out.println("==========================================================================");
				System.out.println("1. 무기        2. 방어구        3. 포션");
				System.out.println("==========================================================================");
				System.out.println("0. 뒤로");
				System.out.println("");
				System.out.print("팔고자 하는  아이템을 선택해주세요:");
				String item_select=scan.next();
				if(item_select.equals("1")) {//무기팔기
						while(true) {
							for(int i=0; i<60; i++) {
								System.out.println("");
							}
							System.out.println("무기리스트");
							System.out.println("==========================================================================");
							System.out.println("1. "+낡은검.이름+"(가격: "+낡은검.가격+"원)------------------------------보유여부:"+낡은검.보유무기(낡은검.소유여부));
							System.out.println("2. "+강철검.이름+"(가격: "+강철검.가격+"원)------------------------------보유여부:"+강철검.보유무기(강철검.소유여부));
							System.out.println("3. "+무의검.이름+"(가격: "+무의검.가격+"원)-----------------------------보유여부:"+무의검.보유무기(무의검.소유여부));
							System.out.println("4. "+자하드의검.이름+"(가격: "+자하드의검.가격+"원)---------------------------보유여부:"+자하드의검.보유무기(자하드의검.소유여부));
							System.out.println("5. "+하급검.이름+"(가격: "+하급검.가격+"원)------------------------------보유여부:"+하급검.보유무기(하급검.소유여부));
							System.out.println("6. "+중급검.이름+"(가격: "+중급검.가격+"원)------------------------------보유여부:"+중급검.보유무기(중급검.소유여부));
							System.out.println("7. "+상급검.이름+"(가격: "+상급검.가격+"원)------------------------------보유여부:"+상급검.보유무기(상급검.소유여부));
							System.out.println("==========================================================================");
							System.out.println("0. 뒤로");
							System.out.println("");
							System.out.print("판매하고 싶은 무기를 선택해주세요:");
							String weapon_purchase=scan.next();
							if(weapon_purchase.equals("1")) {
								if(낡은검.소유여부==1) {//낡은검 팔기
									낡은검.소유여부=0;
									모험가.돈+=낡은검.가격;
									for(int i=0; i<60; i++) {
										System.out.println("");
									}
									사운드스레드 돈사운드스레드=new 사운드스레드("money.mp3",false);
									돈사운드스레드.start();
									System.out.println("");
									System.out.println("판매에 성공하셨습니다.");
									System.out.println(낡은검.가격+"원을 획득하셨습니다.");
									System.out.println("");
									try {
										Thread.sleep(1500);
									} catch (InterruptedException e) {
										e.printStackTrace();
									}
								}else {
									for(int i=0; i<60; i++) {
										System.out.println("");
									}
									System.out.println("");
									System.out.println("<해당 무기는 보유하고 있지 않습니다.>");
									System.out.println("");
									try {
										Thread.sleep(1500);
									} catch (InterruptedException e) {
										e.printStackTrace();
									}
								}
							}else if(weapon_purchase.equals("2")) {
								if(강철검.소유여부==1) {//강철검 팔기
									강철검.소유여부=0;
									모험가.돈+=강철검.가격;
									for(int i=0; i<60; i++) {
										System.out.println("");
									}
									사운드스레드 돈사운드스레드=new 사운드스레드("money.mp3",false);
									돈사운드스레드.start();
									System.out.println("");
									System.out.println("판매에 성공하셨습니다.");
									System.out.println(강철검.가격+"원을 획득하셨습니다.");
									System.out.println("");
									try {
										Thread.sleep(1500);
									} catch (InterruptedException e) {
										e.printStackTrace();
									}
								}else {
									for(int i=0; i<60; i++) {
										System.out.println("");
									}
									System.out.println("");
									System.out.println("<해당 무기는 보유하고 있지 않습니다.>");
									System.out.println("");
									try {
										Thread.sleep(1500);
									} catch (InterruptedException e) {
										e.printStackTrace();
									}
								}
							}else if(weapon_purchase.equals("3")){
								if(무의검.소유여부==1) {//무의검 팔기
									무의검.소유여부=0;
									모험가.돈+=무의검.가격;
									for(int i=0; i<60; i++) {
										System.out.println("");
									}
									사운드스레드 돈사운드스레드=new 사운드스레드("money.mp3",false);
									돈사운드스레드.start();
									System.out.println("");
									System.out.println("판매에 성공하셨습니다.");
									System.out.println(무의검.가격+"원을 획득하셨습니다.");
									System.out.println("");
									try {
										Thread.sleep(1500);
									} catch (InterruptedException e) {
										e.printStackTrace();
									}
								}else {
									for(int i=0; i<60; i++) {
										System.out.println("");
									}
									System.out.println("");
									System.out.println("<해당 무기는 보유하고 있지 않습니다.>");
									System.out.println("");
									try {
										Thread.sleep(1500);
									} catch (InterruptedException e) {
										e.printStackTrace();
									}
								}
							}else if(weapon_purchase.equals("4")){
								if(자하드의검.소유여부==1) {//자하드의검 팔기
									자하드의검.소유여부=0;
									모험가.돈+=자하드의검.가격;
									for(int i=0; i<60; i++) {
										System.out.println("");
									}
									사운드스레드 돈사운드스레드=new 사운드스레드("money.mp3",false);
									돈사운드스레드.start();
									System.out.println("");
									System.out.println("판매에 성공하셨습니다.");
									System.out.println(자하드의검.가격+"원을 획득하셨습니다.");
									System.out.println("");
									try {
										Thread.sleep(1500);
									} catch (InterruptedException e) {
										e.printStackTrace();
									}
								}else {
									for(int i=0; i<60; i++) {
										System.out.println("");
									}
									System.out.println("");
									System.out.println("<해당 무기는 보유하고 있지 않습니다.>");
									System.out.println("");
									try {
										Thread.sleep(1500);
									} catch (InterruptedException e) {
										e.printStackTrace();
									}
								}
							}else if(weapon_purchase.equals("5")){
								if(하급검.소유여부==1) {//하급검 팔기
									하급검.소유여부=0;
									모험가.돈+=하급검.가격;
									for(int i=0; i<60; i++) {
										System.out.println("");
									}
									사운드스레드 돈사운드스레드=new 사운드스레드("money.mp3",false);
									돈사운드스레드.start();
									System.out.println("");
									System.out.println("판매에 성공하셨습니다.");
									System.out.println(하급검.가격+"원을 획득하셨습니다.");
									System.out.println("");
									try {
										Thread.sleep(1500);
									} catch (InterruptedException e) {
										e.printStackTrace();
									}
								}else {
									for(int i=0; i<60; i++) {
										System.out.println("");
									}
									System.out.println("");
									System.out.println("<해당 무기는 보유하고 있지 않습니다.>");
									System.out.println("");
									try {
										Thread.sleep(1500);
									} catch (InterruptedException e) {
										e.printStackTrace();
									}
								}
							}else if(weapon_purchase.equals("6")){
								if(중급검.소유여부==1) {//중급검 팔기
									중급검.소유여부=0;
									모험가.돈+=중급검.가격;
									for(int i=0; i<60; i++) {
										System.out.println("");
									}
									사운드스레드 돈사운드스레드=new 사운드스레드("money.mp3",false);
									돈사운드스레드.start();
									System.out.println("");
									System.out.println("판매에 성공하셨습니다.");
									System.out.println(중급검.가격+"원을 획득하셨습니다.");
									System.out.println("");
									try {
										Thread.sleep(1500);
									} catch (InterruptedException e) {
										e.printStackTrace();
									}
								}else {
									for(int i=0; i<60; i++) {
										System.out.println("");
									}
									System.out.println("");
									System.out.println("<해당 무기는 보유하고 있지 않습니다.>");
									System.out.println("");
									try {
										Thread.sleep(1500);
									} catch (InterruptedException e) {
										e.printStackTrace();
									}
								}
							}else if(weapon_purchase.equals("7")){
								if(상급검.소유여부==1) {//상급검 팔기
									상급검.소유여부=0;
									모험가.돈+=상급검.가격;
									for(int i=0; i<60; i++) {
										System.out.println("");
									}
									사운드스레드 돈사운드스레드=new 사운드스레드("money.mp3",false);
									돈사운드스레드.start();
									System.out.println("");
									System.out.println("판매에 성공하셨습니다.");
									System.out.println(상급검.가격+"원을 획득하셨습니다.");
									System.out.println("");
									try {
										Thread.sleep(1500);
									} catch (InterruptedException e) {
										e.printStackTrace();
									}
								}else {
									for(int i=0; i<60; i++) {
										System.out.println("");
									}
									System.out.println("");
									System.out.println("<해당 무기는 보유하고 있지 않습니다.>");
									System.out.println("");
									try {
										Thread.sleep(1500);
									} catch (InterruptedException e) {
										e.printStackTrace();
									}
								}
							}else if(weapon_purchase.equals("0")){//뒤로
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
				}else if(item_select.equals("2")) {//방어구팔기
					while(true) {
						for(int i=0; i<60; i++) {
							System.out.println("");
						}
						System.out.println("방어구리스트");
						System.out.println("==========================================================================");
						System.out.println("1. "+낡은갑옷.이름+"(가격: "+낡은갑옷.가격+"원)------------------------------보유여부:"+낡은갑옷.보유방어구(낡은갑옷.소유여부));
						System.out.println("2. "+강철갑옷.이름+"(가격: "+강철갑옷.가격+"원)------------------------------보유여부:"+강철갑옷.보유방어구(강철갑옷.소유여부));
						System.out.println("3. "+무의갑옷.이름+"(가격: "+무의갑옷.가격+"원)-----------------------------보유여부:"+무의갑옷.보유방어구(무의갑옷.소유여부));
						System.out.println("4. "+자하드의갑옷.이름+"(가격: "+자하드의갑옷.가격+"원)---------------------------보유여부:"+자하드의갑옷.보유방어구(자하드의갑옷.소유여부));
						System.out.println("5. "+하급갑옷.이름+"(가격: "+하급갑옷.가격+"원)------------------------------보유여부:"+하급갑옷.보유방어구(하급갑옷.소유여부));
						System.out.println("6. "+중급갑옷.이름+"(가격: "+중급갑옷.가격+"원)------------------------------보유여부:"+중급갑옷.보유방어구(중급갑옷.소유여부));
						System.out.println("7. "+상급갑옷.이름+"(가격: "+상급갑옷.가격+"원)------------------------------보유여부:"+상급갑옷.보유방어구(상급갑옷.소유여부));
						System.out.println("==========================================================================");
						System.out.println("0. 뒤로");
						System.out.println("");
						System.out.print("판매하고 싶은 방어구를 선택해주세요:");
						String weapon_purchase=scan.next();
						if(weapon_purchase.equals("1")) {
							if(낡은갑옷.소유여부==1) {
								낡은갑옷.소유여부=0;
								모험가.돈+=낡은갑옷.가격;
								for(int i=0; i<60; i++) {
									System.out.println("");
								}
								사운드스레드 돈사운드스레드=new 사운드스레드("money.mp3",false);
								돈사운드스레드.start();
								System.out.println("");
								System.out.println("판매에 성공하셨습니다.");
								System.out.println(낡은갑옷.가격+"원을 획득하셨습니다.");
								System.out.println("");
								try {
									Thread.sleep(1500);
								} catch (InterruptedException e) {
									e.printStackTrace();
								}
							}else {
								for(int i=0; i<60; i++) {
									System.out.println("");
								}
								System.out.println("");
								System.out.println("<해당 무기는 보유하고 있지 않습니다.>");
								System.out.println("");
								try {
									Thread.sleep(1500);
								} catch (InterruptedException e) {
									e.printStackTrace();
								}
							}
						}else if(weapon_purchase.equals("2")) {
							if(강철갑옷.소유여부==1) {
								강철갑옷.소유여부=0;
								모험가.돈+=강철갑옷.가격;
								for(int i=0; i<60; i++) {
									System.out.println("");
								}
								사운드스레드 돈사운드스레드=new 사운드스레드("money.mp3",false);
								돈사운드스레드.start();
								System.out.println("");
								System.out.println("판매에 성공하셨습니다.");
								System.out.println(강철갑옷.가격+"원을 획득하셨습니다.");
								System.out.println("");
								try {
									Thread.sleep(1500);
								} catch (InterruptedException e) {
									e.printStackTrace();
								}
							}else {
								for(int i=0; i<60; i++) {
									System.out.println("");
								}
								System.out.println("");
								System.out.println("<해당 무기는 보유하고 있지 않습니다.>");
								System.out.println("");
								try {
									Thread.sleep(1500);
								} catch (InterruptedException e) {
									e.printStackTrace();
								}
							}
						}else if(weapon_purchase.equals("3")){
							if(무의갑옷.소유여부==1) {
								무의갑옷.소유여부=0;
								모험가.돈+=무의갑옷.가격;
								for(int i=0; i<60; i++) {
									System.out.println("");
								}
								사운드스레드 돈사운드스레드=new 사운드스레드("money.mp3",false);
								돈사운드스레드.start();
								System.out.println("");
								System.out.println("판매에 성공하셨습니다.");
								System.out.println(무의갑옷.가격+"원을 획득하셨습니다.");
								System.out.println("");
								try {
									Thread.sleep(1500);
								} catch (InterruptedException e) {
									e.printStackTrace();
								}
							}else {
								for(int i=0; i<60; i++) {
									System.out.println("");
								}
								System.out.println("");
								System.out.println("<해당 무기는 보유하고 있지 않습니다.>");
								System.out.println("");
								try {
									Thread.sleep(1500);
								} catch (InterruptedException e) {
									e.printStackTrace();
								}
							}
						}else if(weapon_purchase.equals("4")){
							if(자하드의갑옷.소유여부==1) {
								자하드의갑옷.소유여부=0;
								모험가.돈+=자하드의갑옷.가격;
								for(int i=0; i<60; i++) {
									System.out.println("");
								}
								사운드스레드 돈사운드스레드=new 사운드스레드("money.mp3",false);
								돈사운드스레드.start();
								System.out.println("");
								System.out.println("판매에 성공하셨습니다.");
								System.out.println(자하드의갑옷.가격+"원을 획득하셨습니다.");
								System.out.println("");
								try {
									Thread.sleep(1500);
								} catch (InterruptedException e) {
									e.printStackTrace();
								}
							}else {
								for(int i=0; i<60; i++) {
									System.out.println("");
								}
								System.out.println("");
								System.out.println("<해당 무기는 보유하고 있지 않습니다.>");
								System.out.println("");
								try {
									Thread.sleep(1500);
								} catch (InterruptedException e) {
									e.printStackTrace();
								}
							}
						}else if(weapon_purchase.equals("5")){
							if(하급갑옷.소유여부==1) {
								하급갑옷.소유여부=0;
								모험가.돈+=하급갑옷.가격;
								for(int i=0; i<60; i++) {
									System.out.println("");
								}
								사운드스레드 돈사운드스레드=new 사운드스레드("money.mp3",false);
								돈사운드스레드.start();
								System.out.println("");
								System.out.println("판매에 성공하셨습니다.");
								System.out.println(하급갑옷.가격+"원을 획득하셨습니다.");
								System.out.println("");
								try {
									Thread.sleep(1500);
								} catch (InterruptedException e) {
									e.printStackTrace();
								}
							}else {
								for(int i=0; i<60; i++) {
									System.out.println("");
								}
								System.out.println("");
								System.out.println("<해당 무기는 보유하고 있지 않습니다.>");
								System.out.println("");
								try {
									Thread.sleep(1500);
								} catch (InterruptedException e) {
									e.printStackTrace();
								}
							}
						}else if(weapon_purchase.equals("6")){
							if(중급갑옷.소유여부==1) {
								중급갑옷.소유여부=0;
								모험가.돈+=중급갑옷.가격;
								for(int i=0; i<60; i++) {
									System.out.println("");
								}
								사운드스레드 돈사운드스레드=new 사운드스레드("money.mp3",false);
								돈사운드스레드.start();
								System.out.println("");
								System.out.println("판매에 성공하셨습니다.");
								System.out.println(중급갑옷.가격+"원을 획득하셨습니다.");
								System.out.println("");
								try {
									Thread.sleep(1500);
								} catch (InterruptedException e) {
									e.printStackTrace();
								}
							}else {
								for(int i=0; i<60; i++) {
									System.out.println("");
								}
								System.out.println("");
								System.out.println("<해당 무기는 보유하고 있지 않습니다.>");
								System.out.println("");
								try {
									Thread.sleep(1500);
								} catch (InterruptedException e) {
									e.printStackTrace();
								}
							}
						}else if(weapon_purchase.equals("7")){
							if(상급갑옷.소유여부==1) {
								상급갑옷.소유여부=0;
								모험가.돈+=상급갑옷.가격;
								for(int i=0; i<60; i++) {
									System.out.println("");
								}
								사운드스레드 돈사운드스레드=new 사운드스레드("money.mp3",false);
								돈사운드스레드.start();
								System.out.println("");
								System.out.println("판매에 성공하셨습니다.");
								System.out.println(상급갑옷.가격+"원을 획득하셨습니다.");
								System.out.println("");
								try {
									Thread.sleep(1500);
								} catch (InterruptedException e) {
									e.printStackTrace();
								}
							}else {
								for(int i=0; i<60; i++) {
									System.out.println("");
								}
								System.out.println("");
								System.out.println("<해당 무기는 보유하고 있지 않습니다.>");
								System.out.println("");
								try {
									Thread.sleep(1500);
								} catch (InterruptedException e) {
									e.printStackTrace();
								}
							}
						}else if(weapon_purchase.equals("0")){
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
				}else if(item_select.equals("3")) {//포션팔기(포션의 경우 포션의 개수를 입력할 때 숫자가 아닌 문자열을 입력하면 예외처리가 가능하게 try/catch문을 사용함)
						while(true) {
							for(int i=0; i<60; i++) {
								System.out.println("");
							}
							System.out.println("포션리스트");
							System.out.println("===========================================================");
							System.out.println("1. "+하급hp포션.이름+"(가격: "+하급hp포션.가격+"원)---------------------보유개수: "+하급hp포션.개수+"개");
							System.out.println("2. "+중급hp포션.이름+"(가격: "+중급hp포션.가격+"원)--------------------보유개수: "+중급hp포션.개수+"개");
							System.out.println("3. "+상급hp포션.이름+"(가격: "+상급hp포션.가격+"원)--------------------보유개수: "+상급hp포션.개수+"개");
							System.out.println("4. "+하급mp포션.이름+"(가격: "+하급mp포션.가격+"원)---------------------보유개수: "+하급mp포션.개수+"개");
							System.out.println("5. "+중급mp포션.이름+"(가격: "+중급mp포션.가격+"원)--------------------보유개수: "+중급mp포션.개수+"개");
							System.out.println("6. "+상급mp포션.이름+"(가격: "+상급mp포션.가격+"원)--------------------보유개수: "+상급mp포션.개수+"개");
							System.out.println("===========================================================");
							System.out.println("0. 뒤로");
							System.out.println("");
							System.out.print("판매하고 싶은 포션을 선택하세요:");
							String potion_purchase=scan.next();
							if(potion_purchase.equals("1")) {
								try {
									while(true) {
										System.out.println("");
										System.out.print("수량을 입력해주세요:");
										int potion_count=scan.nextInt();
										if(하급hp포션.개수>=potion_count) {
											모험가.돈+=하급hp포션.가격*potion_count;
											하급hp포션.개수-=potion_count;
											for(int i=0; i<60; i++) {
												System.out.println("");
											}
											사운드스레드 돈사운드스레드=new 사운드스레드("money.mp3",false);
											돈사운드스레드.start();
											System.out.println("");
											System.out.println("판매에 성공하셨습니다.");
											System.out.println("남은 하급 hp포션의 개수: "+하급hp포션.개수+"개");
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
											System.out.println("");
											System.out.println("<포션이 부족합니다.>");
											System.out.println("");
											try {
												Thread.sleep(1500);
											} catch (InterruptedException e) {
												e.printStackTrace();
											}
											break;
										}
									}
								}catch(Exception e) {
									for(int i=0; i<60; i++) {
										System.out.println("");
									}
									System.out.println("");
									System.out.println("<잘못 입력하셨습니다. 다시 입력해주세요.>");
									System.out.println("");
									try {
										Thread.sleep(1500);
									} catch (InterruptedException e1) {
										e1.printStackTrace();
									}
								}
							}else if(potion_purchase.equals("2")){
								try {
									while(true) {
										System.out.println("");
										System.out.print("수량을 입력해주세요:");
										int potion_count=scan.nextInt();
										if(중급hp포션.개수>=potion_count) {
											모험가.돈+=중급hp포션.가격*potion_count;
											중급hp포션.개수-=potion_count;
											for(int i=0; i<60; i++) {
												System.out.println("");
											}
											사운드스레드 돈사운드스레드=new 사운드스레드("money.mp3",false);
											돈사운드스레드.start();
											System.out.println("");
											System.out.println("판매에 성공하셨습니다.");
											System.out.println("남은 중급 hp포션의 개수: "+중급hp포션.개수+"개");
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
											System.out.println("");
											System.out.println("<포션이 부족합니다.>");
											System.out.println("");
											try {
												Thread.sleep(1500);
											} catch (InterruptedException e) {
												e.printStackTrace();
											}
											break;
										}
									}
								}catch(Exception e) {
									for(int i=0; i<60; i++) {
										System.out.println("");
									}
									System.out.println("");
									System.out.println("<잘못 입력하셨습니다. 다시 입력해주세요.>");
									System.out.println("");
									try {
										Thread.sleep(1500);
									} catch (InterruptedException e1) {
										e1.printStackTrace();
									}
								}
							}else if(potion_purchase.equals("3")){
								try {
									while(true) {
										System.out.println("");
										System.out.print("수량을 입력해주세요:");
										int potion_count=scan.nextInt();
										if(상급hp포션.개수>=potion_count) {
											모험가.돈+=상급hp포션.가격*potion_count;
											상급hp포션.개수-=potion_count;
											for(int i=0; i<60; i++) {
												System.out.println("");
											}
											사운드스레드 돈사운드스레드=new 사운드스레드("money.mp3",false);
											돈사운드스레드.start();
											System.out.println("");
											System.out.println("판매에 성공하셨습니다.");
											System.out.println("남은 상급 hp포션의 개수: "+상급hp포션.개수+"개");
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
											System.out.println("");
											System.out.println("<포션이 부족합니다.>");
											System.out.println("");
											try {
												Thread.sleep(1500);
											} catch (InterruptedException e) {
												e.printStackTrace();
											}
											break;
										}
									}
								}catch(Exception e) {
									for(int i=0; i<60; i++) {
										System.out.println("");
									}
									System.out.println("");
									System.out.println("<잘못 입력하셨습니다. 다시 입력해주세요.>");
									System.out.println("");
									try {
										Thread.sleep(1500);
									} catch (InterruptedException e1) {
										e1.printStackTrace();
									}
								}
							}else if(potion_purchase.equals("4")){
								try {
									while(true) {
										System.out.println("");
										System.out.print("수량을 입력해주세요:");
										int potion_count=scan.nextInt();
										if(하급mp포션.개수>=potion_count) {
											모험가.돈+=하급mp포션.가격*potion_count;
											하급mp포션.개수-=potion_count;
											for(int i=0; i<60; i++) {
												System.out.println("");
											}
											사운드스레드 돈사운드스레드=new 사운드스레드("money.mp3",false);
											돈사운드스레드.start();
											System.out.println("");
											System.out.println("판매에 성공하셨습니다.");
											System.out.println("남은 하급 mp포션의 개수: "+하급mp포션.개수+"개");
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
											System.out.println("");
											System.out.println("<포션이 부족합니다.>");
											System.out.println("");
											try {
												Thread.sleep(1500);
											} catch (InterruptedException e) {
												e.printStackTrace();
											}
											break;
										}
									}
								}catch(Exception e) {
									for(int i=0; i<60; i++) {
										System.out.println("");
									}
									System.out.println("");
									System.out.println("<잘못 입력하셨습니다. 다시 입력해주세요.>");
									System.out.println("");
									try {
										Thread.sleep(1500);
									} catch (InterruptedException e1) {
										e1.printStackTrace();
									}
								}
							}else if(potion_purchase.equals("5")){
								try {
									while(true) {
										System.out.println("");
										System.out.print("수량을 입력해주세요:");
										int potion_count=scan.nextInt();
										if(중급mp포션.개수>=potion_count) {
											모험가.돈+=중급mp포션.가격*potion_count;
											중급mp포션.개수-=potion_count;
											for(int i=0; i<60; i++) {
												System.out.println("");
											}
											사운드스레드 돈사운드스레드=new 사운드스레드("money.mp3",false);
											돈사운드스레드.start();
											System.out.println("");
											System.out.println("판매에 성공하셨습니다.");
											System.out.println("남은 중급 mp포션의 개수: "+중급mp포션.개수+"개");
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
											System.out.println("");
											System.out.println("<포션이 부족합니다.>");
											System.out.println("");
											try {
												Thread.sleep(1500);
											} catch (InterruptedException e) {
												e.printStackTrace();
											}
											break;
										}
									}
								}catch(Exception e) {
									for(int i=0; i<60; i++) {
										System.out.println("");
									}
									System.out.println("");
									System.out.println("<잘못 입력하셨습니다. 다시 입력해주세요.>");
									System.out.println("");
									try {
										Thread.sleep(1500);
									} catch (InterruptedException e1) {
										e1.printStackTrace();
									}
								}
							}else if(potion_purchase.equals("6")){
								try {
									while(true) {
										System.out.println("");
										System.out.print("수량을 입력해주세요:");
										int potion_count=scan.nextInt();
										if(상급mp포션.개수>=potion_count) {
											모험가.돈+=상급mp포션.가격*potion_count;
											상급mp포션.개수-=potion_count;
											for(int i=0; i<60; i++) {
												System.out.println("");
											}
											사운드스레드 돈사운드스레드=new 사운드스레드("money.mp3",false);
											돈사운드스레드.start();
											System.out.println("");
											System.out.println("판매에 성공하셨습니다.");
											System.out.println("남은 상급 mp포션의 개수: "+상급mp포션.개수+"개");
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
											System.out.println("");
											System.out.println("<포션이 부족합니다.>");
											System.out.println("");
											try {
												Thread.sleep(1500);
											} catch (InterruptedException e) {
												e.printStackTrace();
											}
											break;
										}
									}
								}catch(Exception e) {
									for(int i=0; i<60; i++) {
										System.out.println("");
									}
									System.out.println("");
									System.out.println("<잘못 입력하셨습니다. 다시 입력해주세요.>");
									System.out.println("");
									try {
										Thread.sleep(1500);
									} catch (InterruptedException e1) {
										e1.printStackTrace();
									}
								}
							}else if(potion_purchase.equals("0")){
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
	
		
		
}
