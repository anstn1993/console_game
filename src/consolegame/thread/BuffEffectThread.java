package consolegame.thread;

import consolegame.Stage;
import consolegame.character.Adventurer;

public class BuffEffectThread extends Thread {
    private Stage stage;
    private Adventurer adventurer;
    private boolean isActicated;

    public BuffEffectThread(Adventurer adventurer, Stage stage, boolean isActicated) {
        this.adventurer = adventurer;
        this.stage = stage;
        this.isActicated = isActicated;

    }

    public void execute() {
        int recovery = 20;
        int term1 = 4000;
        int term2 = 2000;
        while (isActicated) {
            try {
                Thread.sleep(term1);
            } catch (InterruptedException e) {
                break;
            }
            for (int i = 0; i < 60; i++) {
                System.out.println("");
            }
            SoundThread recoverySound = new SoundThread("recovery.mp3", false);
            recoverySound.start();
            if (adventurer.getHp() >= adventurer.getMaxHp() && adventurer.getMp() >= adventurer.getMaxMp()) {

                System.out.println("*************************************************");
                System.out.println(adventurer.getName() + "의 hp와 mp가 모두 회복되었습니다.");
                System.out.println("*************************************************");
                isActicated = false;


            } else if (adventurer.getHp() < adventurer.getMaxHp() && adventurer.getMp() >= adventurer.getMaxMp()) {

                System.out.println("*************************************************");
                if (adventurer.getMaxHp() - adventurer.getHp() >= recovery) {
                    adventurer.setHp(adventurer.getHp() + recovery);
                    System.out.println(adventurer.getName() + "의 hp가 " + recovery + "만큼 회복되었습니다.");
                } else if (adventurer.getMaxHp() - adventurer.getHp() < recovery) {
                    double recovery_ = adventurer.getMaxHp() - adventurer.getHp();
                    adventurer.setHp(adventurer.getHp() + recovery_);
                    System.out.println(adventurer.getName() + "의 hp가 " + (int) recovery_ + "만큼 회복되었습니다.");
                }
                System.out.println(adventurer.getName() + "의 mp가 모두 회복되었습니다.");

            } else if (adventurer.getHp() >= adventurer.getMaxHp() && adventurer.getMp() < adventurer.getMaxMp()) {
                if (adventurer.getMaxMp() - adventurer.getMp() >= recovery) {

                    adventurer.setMp(adventurer.getMp() + recovery);
                    System.out.println("*************************************************");
                    System.out.println(adventurer.getName() + "의 hp가 모두 회복되었습니다.");
                    System.out.println(adventurer.getName() + "의 mp가 " + recovery + "만큼 회복되었습니다.");
                } else if (adventurer.getMaxMp() - adventurer.getMp() < recovery) {
                    double recovery_ = adventurer.getMaxMp() - adventurer.getMp();
                    adventurer.setMp(adventurer.getMp() + recovery_);
                    System.out.println("*************************************************");
                    System.out.println(adventurer.getName() + "의 hp가 모두 회복되었습니다.");
                    System.out.println(adventurer.getName() + "의 mp가 " + (int) recovery_ + "만큼 회복되었습니다.");
                }
            } else if (adventurer.getMaxHp() - adventurer.getHp() < recovery && adventurer.getMaxMp() - adventurer.getMp() < recovery) {
                double hpRecovery_ = adventurer.getMaxHp() - adventurer.getHp();
                double mpRecovery_ = adventurer.getMaxMp() - adventurer.getMp();
                adventurer.setHp(adventurer.getHp() + hpRecovery_);
                adventurer.setMp(adventurer.getMp() + mpRecovery_);
                System.out.println("*************************************************");
                System.out.println(adventurer.getName() + "의 hp가 " + (int) hpRecovery_ + "만큼 회복되었습니다.");
                System.out.println(adventurer.getName() + "의 mp가 " + (int) mpRecovery_ + "만큼 회복되었습니다.");

            } else if (adventurer.getMaxMp() - adventurer.getHp() < recovery && adventurer.getMaxMp() - adventurer.getMp() >= recovery) {
                double hpRecovery_ = adventurer.getMaxHp() - adventurer.getHp();
                adventurer.setHp(adventurer.getHp() + hpRecovery_);
                adventurer.setMp(adventurer.getMp() + recovery);
                System.out.println("*************************************************");
                System.out.println(adventurer.getName() + "의 hp가 " + (int) hpRecovery_ + "만큼 회복되었습니다.");
                System.out.println(adventurer.getName() + "의 mp가 " + recovery + "만큼 회복되었습니다.");

            } else if (adventurer.getMaxHp() - adventurer.getHp() >= recovery && adventurer.getMaxMp() - adventurer.getMp() < recovery) {
                adventurer.setHp(adventurer.getHp() + recovery);
                double mpRecovery = adventurer.getMaxMp() - adventurer.getMp();
                adventurer.setMp(adventurer.getMp() + mpRecovery);
                System.out.println("*************************************************");
                System.out.println(adventurer.getName() + "의 hp가 " + recovery + "만큼 회복되었습니다.");
                System.out.println(adventurer.getName() + "의 mp가 " + (int) mpRecovery + "만큼 회복되었습니다.");

            } else {
                adventurer.setHp(adventurer.getHp() + recovery);
                adventurer.setMp(adventurer.getMp() + recovery);
                System.out.println("*************************************************");
                System.out.println(adventurer.getName() + "의 hp가 " + recovery + "만큼 회복되었습니다.");
                System.out.println(adventurer.getName() + "의 mp가 " + recovery + "만큼 회복되었습니다.");
            }

            System.out.println("");
            System.out.println("현재 hp: " + (int) adventurer.getHp() + "/" + (int) adventurer.getMaxHp());
            System.out.println("현재 mp: " + (int) adventurer.getMp() + "/" + (int) adventurer.getMaxMp());
            System.out.println("*************************************************");
            try {
                Thread.sleep(term2);
            } catch (InterruptedException e) {
                break;
            }
            for (int i = 0; i < 60; i++) {
                System.out.println("");
            }
            System.out.println("================================================================");
            System.out.println("1. " + stage.getBoss().getName() + "(" + stage.getFloor() + ")과(와)의 대결        2. 사냥터 입장        3. 인벤토리        4. 상점 입장        5. 케릭터 정보");
            System.out.println("================================================================");
            System.out.println("0. 게임종료");
            System.out.println("");
            System.out.print("취할 행동을 선택해주세요:");
        }
    }


    public void finish() {//다른 메뉴로 진입할 시 버프효과를 종료시키기 위한 메소드
        isActicated = false;
        this.interrupt();
    }


    @Override
    public void run() {
        execute();
    }
}
