package consolegame.console;

import consolegame.Main;
import consolegame.Shop;
import consolegame.character.Adventurer;
import consolegame.thread.SoundThread;

import java.util.Scanner;

public class ShopConsole {
    public void print(final Shop shop, final int scene) {
        if (scene == 0) {
            Main.printSpace();
            System.out.println("===========================================================");
            System.out.println("상점에 입장하셨습니다.");
            System.out.println("===========================================================");
            try {
                Thread.sleep(1500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public void print(int occation) {
        if (occation == 0) {
            Main.printSpace();
            System.out.println("");
            System.out.println("<돈이 부족합니다.>");
            System.out.println("");
        } else if (occation == 1) {
            Main.printSpace();
            System.out.println("");
            System.out.println("구매에 성공하셨습니다!");
            System.out.println("");
        } else if (occation == 2) {
            SoundThread moneySound = new SoundThread("money.mp3", false);
            moneySound.start();
            System.out.println("");
            System.out.println("판매에 성공하셨습니다.");
            System.out.println("");
            try {
                Thread.sleep(1500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        } else if (occation == 3) {
            Main.printSpace();
            System.out.println("");
            System.out.println("<포션이 부족합니다.>");
            System.out.println("");
            try {
                Thread.sleep(1500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public String output(Scanner scan, final Shop shop, final int menu) {
        if (menu == 0) {//아이템 사기, 팔기 화면 출력
            Main.printSpace();
            System.out.println("===========================================================");
            System.out.println("1. 아이템 사기        2. 아이템 팔기");
            System.out.println("===========================================================");
            System.out.println("0. 뒤로");
            System.out.println("");
            System.out.print("취할 행동을 선택해주세요:");
        } else if (menu == 1) {
            Main.printSpace();
            System.out.println("===========================================================");
            System.out.println("1. 무기        2. 방어구        3. 포션");
            System.out.println("===========================================================");
            System.out.println("0. 뒤로");
            System.out.println("");
            System.out.print("사고자 하는 아이템을 선택해주세요:");
        } else if (menu == 2) {
            Main.printSpace();
            System.out.println("무기리스트");
            System.out.println("===========================================================");
            for (int i = 0; i < shop.getWeapons().size(); i++) {
                System.out.println((i + 1) + ". " + shop.getWeapons().get(i).getName() + "(공격력" + (int) shop.getWeapons().get(i).getStrength() + "+)--------------------가격: " + shop.getWeapons().get(i).getPrice() + "원");
            }
            System.out.println("===========================================================");
            System.out.println("0. 뒤로");
            System.out.println("");
            System.out.print("구매하고자 하는 무기를 선택해주세요:");
        } else if (menu == 3) {
            Main.printSpace();
            System.out.println("방어구리스트");
            System.out.println("===========================================================");
            for (int i = 0; i < shop.getArmors().size(); i++) {
                System.out.println((i + 1) + ". " + shop.getArmors().get(i).getName() + "(방어력" + (int) shop.getArmors().get(i).getDefense() + "+)--------------------가격: " + shop.getArmors().get(i).getPrice() + "원");
            }
            System.out.println("===========================================================");
            System.out.println("0. 뒤로");
            System.out.println("");
            System.out.print("구매하고자 하는 방어구를 선택해주세요:");
        } else if (menu == 4) {
            Main.printSpace();
            System.out.println("포션리스트");
            System.out.println("===========================================================");
            for (int i = 0; i < shop.getHpPotions().size(); i++) {
                System.out.println("1. " + shop.getHpPotions().get(i).getName() + "(hp " + (int) shop.getHpPotions().get(i).getHp() + "회복)--------------------가격: " + shop.getHpPotions().get(i).getPrice() + "원");
            }
            for (int i = 0; i < shop.getMpPotions().size(); i++) {
                System.out.println("2. " + shop.getMpPotions().get(i).getName() + "(mp " + (int) shop.getMpPotions().get(i).getMp() + "회복)--------------------가격: " + shop.getMpPotions().get(i).getPrice() + "원");
            }
            System.out.println("===========================================================");
            System.out.println("0. 뒤로");
            System.out.println("");
            System.out.print("구매하고자 하는 포션을 선택해주세요:");
        } else if (menu == 5) {
            System.out.println("");
            System.out.print("수량을 입력해주세요(취소: 0):");
        } else if (menu == 6) {
            Main.printSpace();
            System.out.println("==========================================================================");
            System.out.println("1. 무기        2. 방어구        3. 포션");
            System.out.println("==========================================================================");
            System.out.println("0. 뒤로");
            System.out.println("");
            System.out.print("팔고자 하는  아이템을 선택해주세요:");

        }
        return scan.next();
    }

    public String output(Scanner scan, Adventurer adventurer, int menu) {
        if (menu == 0) {
            Main.printSpace();
            System.out.println("무기리스트");
            System.out.println("==========================================================================");
            for (int i = 0; i < adventurer.getWeapons().size(); i++) {
                System.out.println((i + 1) + ". " + adventurer.getWeapons().get(i).getName() + "(가격: " + adventurer.getWeapons().get(i).getName() + "원)");
            }
            System.out.println("==========================================================================");
            System.out.println("0. 뒤로");
            System.out.println("");
            System.out.print("판매하고 싶은 무기를 선택해주세요:");
        } else if (menu == 1) {
            Main.printSpace();
            System.out.println("방어구리스트");
            System.out.println("==========================================================================");
            for (int i = 0; i < adventurer.getArmors().size(); i++) {
                System.out.println((i + 1) + ". " + adventurer.getArmors().get(i).getName() + "(가격: " + adventurer.getArmors().get(i).getPrice() + "원)");
            }
            System.out.println("==========================================================================");
            System.out.println("0. 뒤로");
            System.out.println("");
            System.out.print("판매하고 싶은 방어구를 선택해주세요:");
        } else if (menu == 2) {
            Main.printSpace();
            System.out.println("포션리스트");
            System.out.println("===========================================================");
            System.out.println("1. 하급 hp포션(가격: 50원)---------------------보유개수: " + adventurer.getLowHpPotions().size() + "개");
            System.out.println("2. 중급 hp포션(가격: 100원)--------------------보유개수: " + adventurer.getMidHpPotions().size() + "개");
            System.out.println("3. 상급 hp포션(가격: 150원)--------------------보유개수: " + adventurer.getHighHpPotions().size() + "개");
            System.out.println("4. 하급 mp포션(가격: 50원)---------------------보유개수: " + adventurer.getLowMpPotions().size() + "개");
            System.out.println("5. 중급 mp포션(가격: 100원)--------------------보유개수: " + adventurer.getMidMpPotions().size() + "개");
            System.out.println("6. 상급 mp포션(가격: 150원)--------------------보유개수: " + adventurer.getHighMpPotions().size() + "개");
            System.out.println("===========================================================");
            System.out.println("0. 뒤로");
            System.out.println("");
            System.out.print("판매하고 싶은 포션을 선택하세요:");
        }
        return scan.next();
    }
}
