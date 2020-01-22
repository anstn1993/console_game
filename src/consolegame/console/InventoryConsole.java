package consolegame.console;

import consolegame.Main;
import consolegame.item.*;
import consolegame.thread.SoundThread;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class InventoryConsole {
    public void print(Item item) {
        Main.printSpace();
        if (item instanceof Weapon || item instanceof Armor) {
            SoundThread putOnSound = new SoundThread("weapon_armor_equip.mp3", false);
            putOnSound.start();
            System.out.println("-----------------------------------------------------------");
            System.out.println(item.getName() + "을(를) 장착하셨습니다!");
            System.out.println("-----------------------------------------------------------");
            try {
                Thread.sleep(1500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public void printWeapons(ArrayList<Weapon> weapons) {
        for (int i = 0; i < 60; i++) {
            System.out.println("");
        }
        System.out.println("==========================================================================");
        for (int i = 0; i < weapons.size(); i++) {
            Weapon weapon = weapons.get(i);
            System.out.println((i + 1) + ". " + weapon.getName() + "(공격력 " + (int) weapon.getStrength() + ")");
        }
        System.out.println("==========================================================================");
    }

    public void printArmors(ArrayList<Armor> armors) {
        for (int i = 0; i < 60; i++) {
            System.out.println("");
        }
        System.out.println("==========================================================================");
        for (int i = 0; i < armors.size(); i++) {
            Armor armor = armors.get(i);
            System.out.println((i + 1) + ". " + armor.getName() + "(방어력 " + (int) armor.getDefense() + ")");
        }
        System.out.println("==========================================================================");
    }

    public void printPotions(List<HpPotion> lowHpPotions,
                             List<HpPotion> midHpPotions,
                             List<HpPotion> highHpPotions,
                             List<MpPotion> lowMpPotions,
                             List<MpPotion> midMpPotions,
                             List<MpPotion> highMpPotions) {
        Main.printSpace();
        System.out.println("보유물약");
        System.out.println("===========================================================");
        System.out.println("1. 하급 hp포션(hp회복량: 50) : " + lowHpPotions.size() + "개");
        System.out.println("2. 중급 hp포션(hp회복량: 100): " + midHpPotions.size() + "개");
        System.out.println("3. 상급 hp포션(hp회복량: 150): " + highHpPotions.size() + "개");
        System.out.println("");
        System.out.println("4. 하급 mp포션(mp회복량: 50): " + lowMpPotions.size() + "개");
        System.out.println("5. 중급 mp포션(mp회복량: 100): " + midMpPotions.size() + "개");
        System.out.println("6. 상급 mp포션(mp회복량: 150): " + highMpPotions.size() + "개");
        System.out.println("===========================================================");
    }

    public String input(Scanner scan, int scene) {
        if (scene == 0) {//아이템 선택 화면
            Main.printSpace();
            System.out.println("===========================================================");
            System.out.println("1. 무기        2. 방어구        3. 포션");
            System.out.println("===========================================================");
            System.out.println("0. 뒤로");
            System.out.println("");
            System.out.print("아이템을 선택해주세요:");
        } else if (scene == 1) {
            System.out.println("--------------------------------------------------------------------------");
            System.out.println("0. 뒤로");
            System.out.println("");
            System.out.print("장착할 무기를 선택해주세요:");
        } else if (scene == 2) {
            System.out.println("--------------------------------------------------------------------------");
            System.out.println("0. 뒤로");
            System.out.println("");
            System.out.print("장착할 방어구를 선택해주세요:");
        } else if (scene == 3) {
            System.out.println("1. 하급hp포션 사용        2. 중급hp포션 사용        3. 상급hp포션 사용");
            System.out.println("4. 하급mp포션 사용        5. 중급mp포션 사용        6. 상급mp포션 사용");
            System.out.println("-----------------------------------------------------------");
            System.out.println("0. 뒤로");
            System.out.println("");
            System.out.print("사용할 포션을 선택해주세요:");
        }
        return scan.next();
    }
}
