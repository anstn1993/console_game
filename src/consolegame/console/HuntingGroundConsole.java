package consolegame.console;

import consolegame.Main;
import consolegame.Stage;
import consolegame.character.Adventurer;
import consolegame.character.Boss;
import consolegame.character.Monster;
import consolegame.thread.AttackEffectThread;
import consolegame.thread.LevelUpThread;
import consolegame.thread.LoadingThread;
import consolegame.thread.SoundThread;

import java.util.Scanner;

public class HuntingGroundConsole {
    public void print(Adventurer adventurer, Monster monster, int scene) {
        if (scene == 0) {
            SoundThread adventurerDefaultAttackSound = new SoundThread("tourist_attack.mp3", false);//모험가의 기본공격 효과음 스레드 초기화
            adventurerDefaultAttackSound.start();//모험가 기본공격 효과음 시작
            Thread attackEffect = new Thread(new AttackEffectThread("adventurerAttack"));
            attackEffect.start();//모험가 공격효과 스레드 시작
            try {
                attackEffect.join();
            } catch (InterruptedException e1) {
                e1.printStackTrace();
            }
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("");
            System.out.println(adventurer.getName() + "의 " + adventurer.getDefaultAttackName() + "공격!!");//기본공격 효과음과 공격효과까지 다 나온 후 공격 멘트 출력
        } else if (scene == 1) {
            SoundThread skillAttackSound = new SoundThread("tourist_skill.mp3", false);
            skillAttackSound.start();
            Thread skillAttackEffect = new Thread(new AttackEffectThread("adventurerSkill"));
            skillAttackEffect.start();
            try {
                skillAttackEffect.join();
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
            System.out.println(adventurer.getName() + "의 " + adventurer.getSkill().getName() + "!!");
            System.out.println("mp가" + (int) adventurer.getSkill().getMp() + "만큼 감소했다.");

            try {
                Thread.sleep(1500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        } else if (scene == 2) {
            for (int i = 0; i < 60; i++) {
                System.out.println("");
            }
            SoundThread hyperSkillAttackSound = new SoundThread("tourist_hyper_skill.mp3", false);
            hyperSkillAttackSound.start();
            Thread attackEffect = new Thread(new AttackEffectThread("adventurerHyperSkill"));
            attackEffect.start();
            try {
                attackEffect.join();
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
            System.out.println(adventurer.getName() + "의 " + adventurer.getHyperSkill().getName() + "!!");
            System.out.println("mp가" + (int) adventurer.getHyperSkill().getMp() + "만큼 감소했다.");

            try {
                Thread.sleep(1500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        } else if (scene == 3) {
            for (int i = 0; i < 60; i++) {
                System.out.println("");
            }
            System.out.println(monster.getName() + "의 공격이 시작됩니다.");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            Thread monsterAttackSound = new Thread(new SoundThread("monster.mp3", false));
            monsterAttackSound.start();
            Thread attackEffect = new Thread(new AttackEffectThread("monsterAttack"));
            attackEffect.start();
            try {
                attackEffect.join();
            } catch (InterruptedException e1) {
                // TODO Auto-generated catch block
                e1.printStackTrace();
            }
            System.out.println("");
            System.out.println(monster.getName() + "의 " + monster.getDefaultAttackName() + " 공격!");
            int damage = monster.attack(adventurer);
            System.out.println(adventurer.getName() + "의 hp가 " + damage + "만큼 감소했다.");
            try {
                Thread.sleep(1500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        else if(scene == 4){
            SoundThread loseSound = new SoundThread("lose.mp3", false);
            loseSound.start();
            for (int i = 0; i < 60; i++) {
                System.out.println("");
            }
            System.out.println(monster.getName() + "에게 패배하셨습니다.");
            System.out.println("");
            try {
                Thread.sleep(2500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            Thread reviveLoading = new Thread(new LoadingThread("revive"));
            reviveLoading.start();
            try {
                reviveLoading.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }

    public void print(Monster monster) {//몬스터와의 싸움 시작 화면 출력
        Thread fightLoading = new Thread(new LoadingThread("startFighting"));
        fightLoading.start();
        try {
            fightLoading.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        SoundThread huntingGroundSound = new SoundThread("monster_stage.mp3", true);
        huntingGroundSound.start();
        System.out.println("");
        System.out.println("===========================================================");
        System.out.println(monster.getName() + "과(와)의 대결을 하러 왔습니다.");
        System.out.println(monster.getName() + ": " + monster.getScript());
        System.out.println("===========================================================");
        System.out.println(monster.getName() + "과(와)의 싸움이 시작됐습니다.");
        try {
            Thread.sleep(3500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void printDamage(Monster monster, int damage) {
        System.out.println(monster.getName() + "의 hp가 " + damage + "만큼 감소했다.");
        try {
            Thread.sleep(1500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }


    public void print(Monster monster, int potionDropCount) {//몬스터전 승리 후 아이템 보상 화면 출력
        System.out.println(monster.getName() + "를 이겼습니다!");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("");
        for (int i = 0; i < 1; i++) {
            System.out.println("");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("===========================================================");
        System.out.println("보상으로");
        System.out.println("돈: " + (int) monster.getMoney() + "원");
        System.out.println("경험치: " + monster.getExp());
        System.out.println(monster.getHpPotion().getName() + ": " + potionDropCount + "개");
        System.out.println(monster.getMpPotion().getName() + ": " + potionDropCount + "개");
        System.out.println("을(를) 획득하셨습니다!");
        System.out.println("===========================================================");
        System.out.println("");
        for (int i = 0; i < 1; i++) {
            System.out.print("");
            try {
                Thread.sleep(2500);
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }

    }

    public void printLevelUp(Adventurer adventurer) {
        Thread levelUp = new Thread(new LevelUpThread());
        levelUp.start();
        try {
            levelUp.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("===========================================================");
        System.out.println("축하드립니다. 레벨업을 하셨습니다.!!");
        System.out.println("레벨: " + adventurer.getLevel());
        System.out.println("hp: " + (int) adventurer.getHp() + "/" + (int) adventurer.getMaxHp());
        System.out.println("mp: " + (int) adventurer.getMp() + "/" + (int) adventurer.getMaxMp());
        System.out.println("공격력: " + (int) adventurer.getStrength());
        System.out.println("방어력: " + (int) adventurer.getDefense());
        System.out.println("스킬1: " + adventurer.getSkill().getName() + "(숙련도: " + adventurer.getSkill().getLevel() + ")");
        System.out.println("스킬2: " + adventurer.getHyperSkill().getName() + "(숙련도: " + adventurer.getHyperSkill().getLevel() + ")");
        System.out.println("경험치: " + adventurer.getExp() + "/" + adventurer.getMaxExp());
        System.out.println("===========================================================");
        System.out.println("");
        try {
            Thread.sleep(4000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public String input(Scanner scan, Stage stage, int menu) {
        if (menu == 0) {

            System.out.println("============================================================================");
            System.out.println("사냥터에 왔습니다. 현재 사냥터에는 " + stage.getMonster1().getName() + "(LV: " + stage.getMonster1().getLevel() + ")과(와) " + stage.getMonster2().getName() + "(LV: " + stage.getMonster2().getLevel() + ")이 (가) 있습니다.");
            System.out.println("1. " + stage.getMonster1().getName() + "        2. " + stage.getMonster2().getName());
            System.out.println("============================================================================");
            System.out.println("0. 마을로 돌아가기");
            System.out.println("");
            System.out.print("싸울 대상을 선택해주세요:");
        }

        return scan.next();
    }

    public String input(Scanner scan, Adventurer adventurer, Monster monster, int menu) {
        if (menu == 0) {
            Main.printSpace();
            System.out.println("");
            System.out.println("===========================================================");
            System.out.println(adventurer.getName() + "(LV: " + adventurer.getLevel() + ")" + " hp: " + (int) adventurer.getHp() + "/" + (int) adventurer.getMaxHp() + ", mp: " + (int) adventurer.getMp() + "/" + (int) adventurer.getMaxMp());
            System.out.println(monster.getName() + "(LV: " + monster.getLevel() + ")" + " hp: " + (int) monster.getHp() + "/" + (int) monster.getMaxHp());
            System.out.println("===========================================================");
            //---------------------모험가 공격--------------------------------
            System.out.println("1. 공격        2. 인벤토리");
            System.out.println("-----------------------------------------------------------------");

            System.out.print("취할 행동을 선택하세요:");
        }
        return scan.next();
    }

    public String input(Scanner scan, Adventurer adventurer, int menu) {
        if (menu == 0) {
            Main.printSpace();
            System.out.println("================================================");
            System.out.println("1. " + adventurer.getDefaultAttackName() + "        2. " + adventurer.getSkill().getName() + "        3. " + adventurer.getHyperSkill().getName());
            System.out.println("================================================");
            System.out.print("입력: ");
        }
        return scan.next();
    }
}
