package consolegame.console;

import consolegame.character.Adventurer;
import consolegame.character.Boss;
import consolegame.thread.AttackEffectThread;
import consolegame.thread.LevelUpThread;
import consolegame.thread.LoadingThread;
import consolegame.thread.SoundThread;

import java.util.Random;
import java.util.Scanner;

public class BossStageConsole {

    public void print(Adventurer adventurer, Boss boss, int scene) {
        if (scene == 0) {//싸움 시작 화면
            for (int j = 0; j < 60; j++) {
                System.out.println("");
            }
            System.out.println("=======================================================================");
            System.out.println(boss.getName() + "과(와)의 대결을 하러 왔습니다.");
            if (boss.getName().equals("자하드"))
                System.out.println(adventurer.getName() + ": " + adventurer.getScripts().get("lastStage"));
            if (!boss.getName().equals("자하드"))
                System.out.println(adventurer.getName() + ": " + adventurer.getScripts().get("fight"));
            System.out.println(boss.getName() + ": " + boss.getScript());
            System.out.println("=======================================================================");
            System.out.println(boss.getName() + "과(와)의 싸움이 시작됐습니다.");
            try {
                Thread.sleep(3500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        } else if (scene == 1) {//모험가 기본 공격
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

        } else if (scene == 2) {//모험가 스킬 공격
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
        } else if (scene == 3) {//모험가 궁극기 공격
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
        } else if (scene == 4) {//보스 공격
            for (int i = 0; i < 60; i++) {
                System.out.println("");
            }
            System.out.println(boss.getName() + "의 공격이 시작됩니다.");
            System.out.println("");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            Random random = new Random();
            int attackPercentage = random.nextInt(10) + 1;//공격 타입 확률 결정
            if (boss.getLevel() <= 9) {
                if (attackPercentage >= 5) {//보스 기본공격
                    SoundThread defaultAttackSound = new SoundThread("boss_attack.mp3", false);
                    defaultAttackSound.start();
                    Thread attackEffeck = new Thread(new AttackEffectThread("bossAttack"));
                    attackEffeck.start();
                    try {
                        attackEffeck.join();
                    } catch (InterruptedException e1) {
                        e1.printStackTrace();
                    }
                    System.out.println(boss.getName() + "의" + boss.getDefaultAttackName() + " 공격!");
                    int damage = boss.attack(adventurer);
                    System.out.println(adventurer.getName() + "의 hp가 " + damage + "만큼 감소했다.");


                } else {//보스 공격스킬
                    SoundThread skillAttackSound = new SoundThread("boss_skill.mp3", false);
                    skillAttackSound.start();
                    Thread skillAttack = new Thread(new AttackEffectThread("bossSkill"));
                    skillAttack.start();
                    try {
                        skillAttack.join();
                    } catch (InterruptedException e1) {
                        e1.printStackTrace();
                    }
                    System.out.println(boss.getName() + "의 " + boss.getSkill1().getName());
                    int damage = boss.useSkill(boss.getSkill1(), adventurer);
                    System.out.println(adventurer.getName() + "의 hp가 " + damage + "만큼 감소했다.");

                }
            } else {
                if (attackPercentage >= 8) {//보스 기본공격
                    SoundThread defaultAttackSound = new SoundThread("boss_attack.mp3", false);
                    defaultAttackSound.start();
                    Thread attackEffeck = new Thread(new AttackEffectThread("bossAttack"));
                    attackEffeck.start();
                    try {
                        attackEffeck.join();
                    } catch (InterruptedException e1) {
                        e1.printStackTrace();
                    }
                    System.out.println(boss.getName() + "의" + boss.getDefaultAttackName() + " 공격!");
                    int damage = boss.attack(adventurer);
                    System.out.println(adventurer.getName() + "의 hp가 " + damage + "만큼 감소했다.");

                } else if (attackPercentage >= 5) {//보스 공격스킬
                    SoundThread skillAttackSound = new SoundThread("boss_skill.mp3", false);
                    skillAttackSound.start();
                    Thread skillAttack = new Thread(new AttackEffectThread("bossSkill"));
                    skillAttack.start();
                    try {
                        skillAttack.join();
                    } catch (InterruptedException e1) {
                        e1.printStackTrace();
                    }
                    System.out.println(boss.getName() + "의 " + boss.getSkill1().getName());
                    int damage = boss.useSkill(boss.getSkill1(), adventurer);
                    System.out.println(adventurer.getName() + "의 hp가 " + damage + "만큼 감소했다.");

                } else {//보스 궁극기
                    SoundThread hyperSkillAttackSound = new SoundThread("boss_hyper_skill.mp3", false);
                    hyperSkillAttackSound.start();
                    Thread skillAttack = new Thread(new AttackEffectThread("bossHyperSkill"));
                    skillAttack.start();
                    try {
                        skillAttack.join();
                    } catch (InterruptedException e1) {
                        e1.printStackTrace();
                    }
                    System.out.println(boss.getName() + "의 " + boss.getSkill2().getName());
                    int damage = boss.useSkill(boss.getSkill2(), adventurer);
                    System.out.println(adventurer.getName() + "의 hp가 " + damage + "만큼 감소했다.");
                }
            }
            try {
                Thread.sleep(1500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            try {
                Thread.sleep(1700);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        } else if (scene == 5) {
            SoundThread loseSound = new SoundThread("lose.mp3", false);
            loseSound.start();
            for (int i = 0; i < 60; i++) {
                System.out.println("");
            }
            System.out.println(boss.getName() + "에게 패배하셨습니다.");
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

    public void print(Boss boss, int dropPotionCount) {//보스전 승리 화면 출력
        System.out.println(boss.getName() + "를 이겼습니다!");
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
        System.out.println("돈: " + (int) boss.getMoney() + "원");
        System.out.println("경험치: " + boss.getExp());
        if (!boss.getName().equals("헬조")) {
            System.out.println("무기 :" + boss.getWeapon().getName());
            System.out.println("방어구:" + boss.getArmor().getName());
            System.out.println(boss.getHpPotion().getName() + ": " + dropPotionCount + "개");
            System.out.println(boss.getMpPotion().getName() + ": " + dropPotionCount + "개");
            System.out.println("을(를) 획득하셨습니다!");
        } else {
            System.out.println("특수무기 :" + boss.getWeapon().getName());
            System.out.println(boss.getHpPotion().getName() + ": " + dropPotionCount + "개");
            System.out.println(boss.getMpPotion().getName() + ": " + dropPotionCount + "개");
            System.out.println("을(를) 획득하셨습니다!");
            System.out.println("축하합니다!! '" + boss.getWeapon().getName() + "'은(는) 궁극기 스킬을 쓸 수 있게 해줍니다. 임의로 장착을 해제하거나 팔 수 없는 특수무기입니다.");
        }
        System.out.println("===========================================================");
        for (int i = 0; i < 1; i++) {
            System.out.print("");
            try {
                Thread.sleep(2500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public void print(Adventurer adventurer, int scene) {
        if (scene == 0) {//레벨업 화면 출력
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
        } else if (scene == 1) {//마지막 스테이지 엔딩 출력
            for (int i = 0; i < 60; i++) {
                System.out.println("");
            }
            System.out.println("==========================================================================================");
            System.out.println("자하드: 이럴수가... 내가 패배하다니.. 정말 이 탑엔 새로운 변화가 필요한 것인가...");
            System.out.println(adventurer.getName() + ": " + adventurer.getScripts().get("ending"));
            System.out.println("자하드: 그래..." + adventurer.getName() + "라고 했나? 너라면 탑에 새로운 변화를 불러올 수도 있겠군. 나는 이제 새로운 여정을 떠나야겠다. 너도 잘 해보도록.");
            System.out.println("==========================================================================================");
            System.out.println("");
            System.out.println("축하드립니다!! 자하드와의 싸움에서 승리하셨습니다!!!");
            System.out.println("");
            try {
                Thread.sleep(8000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public void printDamage(Boss boss, int damage) {
        System.out.println(boss.getName() + "의 hp가 " + damage + "만큼 감소했다.");
        try {
            Thread.sleep(1500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }


    public String input(Scanner scan, Adventurer adventurer, Boss boss, int menu) {
        for (int i = 0; i < 60; i++) {
            System.out.println("");
        }
        if (menu == 0) {
            System.out.println("");
            System.out.println("=================================================================");
            System.out.println(adventurer.getName() + "(LV: " + adventurer.getLevel() + ")" + " hp: " + (int) adventurer.getHp() + "/" + (int) adventurer.getMaxHp() + ", mp: " + (int) adventurer.getMp() + "/" + (int) adventurer.getMaxMp());
            System.out.println(boss.getName() + "(LV: " + boss.getLevel() + ")" + " hp: " + (int) boss.getHp() + "/" + (int) boss.getMaxHp());
            System.out.println("=================================================================");
            //---------------------모험가 공격--------------------------------
            System.out.println(adventurer.getName() + "의 턴입니다.");
            System.out.println("1. 공격        2. 인벤토리");
            System.out.println("-----------------------------------------------------------------");
            System.out.print("취할 행동을 선택하세요:");
        } else if (menu == 1) {
            System.out.println("================================================");
            System.out.println("1. " + adventurer.getDefaultAttackName() + "        2. " + adventurer.getSkill().getName() + "        3. " + adventurer.getHyperSkill().getName());
            System.out.println("================================================");
            System.out.print("입력: ");
        }
        return scan.next();
    }


}
