package consolegame;

import consolegame.character.Adventurer;
import consolegame.character.Boss;
import consolegame.character.Monster;
import consolegame.console.*;
import consolegame.item.*;
import consolegame.thread.BuffEffectThread;
import consolegame.thread.LoadingThread;
import consolegame.thread.OpeningThread;
import consolegame.thread.SoundThread;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void printSpace() {
        for (int i = 0; i < 60; i++) {
            System.out.println("");
        }
    }

    public static void printWrongInputMessage() {
        printSpace();
        System.out.println("<잘못 입력하셨습니다. 다시 입력해주세요.>");
        System.out.println("");
    }

    public static void finishGame(Scanner scan) {

        while (true) {
            for (int i = 0; i < 60; i++) {
                System.out.println("");
            }
            System.out.println("게임을 종료하시겠습니까?");
            System.out.println("1. 네        2. 아니오");
            System.out.println("");
            System.out.print("입력:");
            String real_ending = scan.next();
            if (real_ending.equals("1")) {
                printSpace();

                Thread finishGame = new Thread(new LoadingThread("finishGame"));
                finishGame.start();
                try {
                    finishGame.join();
                } catch (InterruptedException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
                scan.close();
                System.exit(0);
            } else if (real_ending.equals("2")) {
                break;
            } else {
                printWrongInputMessage();
                try {
                    Thread.sleep(1500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);


        Adventurer adventurer = null;//사용자 케릭터
        HashMap<String, String> scripts = new HashMap<>();//케릭터 대사 리스트

        //포션
        Item lowHpPotion = new HpPotion("하급 hp포션", 50, 50);
        Item midHpPotion = new HpPotion("중급 hp포션", 100, 100);
        Item highHpPotion = new HpPotion("중급 hp포션", 150, 150);
        Item lowMpPotion = new MpPotion("하급 mp포션", 50, 50);
        Item midMpPotion = new MpPotion("중급 mp포션", 100, 100);
        Item highMpPotion = new MpPotion("상급 mp포션", 150, 150);

        //무기
        Item sword1 = new Weapon("낡은 검", 3000, 20);
        Item sword2 = new Weapon("하급 검", 4000, 15);
        Item sword3 = new Weapon("강철 검", 5000, 30);
        Item sword4 = new Weapon("중급 검", 5000, 35);
        Item sword5 = new Weapon("상급 검", 9000, 50);
        Item sword6 = new Weapon("무의 검", 10000, 60);
        Item sword7 = new Weapon("자하드의 검", 20000, 100);

        //특수무기
        Item specialWeapon = new SpecialWeapon("특수 무기", 0, 100, 100, 50, 50);

        //방어구
        Item armor1 = new Armor("낡은 갑옷", 3000, 20);
        Item armor2 = new Armor("하급 갑옷", 4000, 15);
        Item armor3 = new Armor("강철 갑옷", 5000, 30);
        Item armor4 = new Armor("중급 갑옷", 5000, 35);
        Item armor5 = new Armor("상급 갑옷", 9000, 50);
        Item armor6 = new Armor("무의 갑옷", 10000, 60);
        Item armor7 = new Armor("자하드의 갑옷", 20000, 100);


        //몬스터
        //1층
        Monster monster1 = new Monster(
                "파란 원숭이",
                350,
                350,
                140,
                105,
                100,
                100,
                1,
                "할퀴기",
                (HpPotion) lowHpPotion,
                (MpPotion) lowMpPotion,
                "끽~~~끽끽~~~!!!!");
        Monster monster2 = new Monster(
                "빨간 원숭이",
                370,
                370,
                190,
                155,
                200,
                200,
                2,
                "분노의 펀치",
                (HpPotion) lowHpPotion,
                (MpPotion) lowMpPotion,
                "끽~~~끽끽~~~!!!!");
        //2층
        Monster monster3 = new Monster(
                "노네임드 몬스터",
                450,
                450,
                240,
                220,
                400,
                200,
                3,
                "돌진하기",
                (HpPotion) lowHpPotion,
                (MpPotion) lowMpPotion,
                "너의 이름을 빼앗아야겠어!!!!!");
        Monster monster4 = new Monster(
                "네임드 몬스터",
                480,
                480,
                300,
                260,
                600,
                250,
                4,
                "네임드 어택",
                (HpPotion) lowHpPotion,
                (MpPotion) lowMpPotion,
                "너의 이름을 걸고 싸워라!!");
        //3층
        Monster monster5 = new Monster(
                "거충 야두",
                530,
                530,
                380,
                300,
                800,
                300,
                5,
                "절단",
                (HpPotion) midHpPotion,
                (MpPotion) midMpPotion,
                "크르릉.....");
        Monster monster6 = new Monster(
                "날개 거충 야두",
                550,
                550,
                430,
                360,
                1000,
                400,
                6,
                "날개 치기",
                (HpPotion) midHpPotion,
                (MpPotion) midMpPotion,
                "푸드드득~~~");
        //4층
        Monster monster7 = new Monster(
                "칼라반의 병사",
                800,
                800,
                530,
                470,
                1300,
                450,
                8,
                "대검의 관통",
                (HpPotion) midHpPotion,
                (MpPotion) midMpPotion,
                "칼라반님의 층에 무단으로 침입하면 어떻게 되는지 보여주마!");
        Monster monster8 = new Monster(
                "칼라바의 호위무사",
                1000,
                1000,
                750,
                580,
                1500,
                500,
                10,
                "칼라반류 검술",
                (HpPotion) midHpPotion,
                (MpPotion) midMpPotion,
                "칼라반님께 가려거든 나를 먼저 쓰러뜨리고 가라!!");
        //5층
        Monster monster9 = new Monster(
                "자하드의 호위병사",
                1100,
                1100,
                800,
                630,
                2000,
                600,
                11,
                "자하드식 검술",
                (HpPotion) midHpPotion,
                (MpPotion) midMpPotion,
                "자하드님께 충성을!!!");
        Monster monster10 = new Monster(
                "자하드가의 왕자",
                1400,
                1400,
                950,
                950,
                2500,
                800,
                13,
                "자하드식 공파술 금강장",
                (HpPotion) highHpPotion,
                (MpPotion) highMpPotion,
                "새로운 변화라.. 아버님께서 들으시면 크게 노하실터.. 여기서 널 멈춰야겠다.");

        //보스
        //1층
        Boss boss1 = new Boss(
                "헤돈",
                650,
                650,
                260,
                210,
                5000,
                800,
                3,
                "봉찌르기",
                (HpPotion) lowHpPotion,
                (MpPotion) lowMpPotion,
                1000000000,
                1000000000,
                new Skill("심판의 일격", 1, 0, 260 * 1.2),
                null,
                (Weapon) sword1,
                (Armor) armor1,
                "가능하다면 해보시지요. 저는 모험가들이 다음층으로 갈 수 있는지 평가하는 자. 다른 악감정은 없습니다!");
        //2층
        Boss boss2 = new Boss(
                "카이저",
                800,
                800,
                450,
                350,
                8000,
                1000,
                6,
                "인비지블 니들",
                (HpPotion) lowHpPotion,
                (MpPotion) lowMpPotion,
                1000000000,
                1000000000,
                new Skill("늑대의 이빨", 1, 0, 450 * 1.3),
                null,
                (Weapon) sword3,
                (Armor) armor3,
                "1층에선 그냥 올려보냈지만 여기선 어림없다. 난 이곳에서 1000년을 군림한 자. 너역시 내 희생양에 불과하다!");
        //3층
        Boss boss3 = new Boss(
                "헬조",
                1200,
                1200,
                650,
                550,
                12000,
                1500,
                9,
                "헬조의 광선",
                (HpPotion) midHpPotion,
                (MpPotion) midMpPotion,
                1000000000,
                1000000000,
                new Skill("붉은바리의 광선", 1, 0, 450 * 1.3),
                null,
                (SpecialWeapon) specialWeapon,
                null,
                "죽음의 층에 오다니...겁이 없구나");
        //4층
        Boss boss4 = new Boss(
                "칼라반",
                1400,
                1400,
                900,
                900,
                20000,
                2000,
                12,
                "정권찌르기",
                (HpPotion) highHpPotion,
                (MpPotion) highMpPotion,
                1000000000,
                1000000000,
                new Skill("빅봄버", 1, 0, 900 * 1.4),
                new Skill("칼라반류 궁극기 무의 정수", 1, 0, 900 * 1.9),
                (Weapon) sword6,
                (Armor) armor6,
                "난 자하드군의 군단장 칼라반이다. 감히 자하드님께 반기를 들다니. 넌 내선에서 처리해주마!!!");
        //5층
        Boss boss5 = new Boss(
                "자하드",
                1500,
                1500,
                1050,
                850,
                20000,
                3000,
                15,
                "자하드류 공파술 금강장",
                (HpPotion) highHpPotion,
                (MpPotion) highMpPotion,
                1000000000,
                1000000000,
                new Skill("자하드류 살인기 광란", 1, 0, 1050 * 1.5),
                new Skill("자하드류 궁극기 신원류", 1, 0, 1050 * 2.9),
                (Weapon) sword7,
                (Armor) armor7,
                "여기까지 온 걸 보면 꽤나 실력이 대단한가보구나. 과연 니가 이 탑에 변화를 몰고 올 능력이 있는지 궁금하구나!!");

        //상점
        //1층, 2층
        ArrayList<Weapon> lowFloorWeapons = new ArrayList<>();
        lowFloorWeapons.add((Weapon) sword2);
        ArrayList<Armor> lowFloorArmors = new ArrayList<>();
        lowFloorArmors.add((Armor) armor2);
        ArrayList<HpPotion> lowFloorHpPotions = new ArrayList<>();
        lowFloorHpPotions.add((HpPotion) lowHpPotion);
        ArrayList<MpPotion> lowFloorMpPotions = new ArrayList<>();
        lowFloorMpPotions.add((MpPotion) lowMpPotion);

        Shop lowFloorshop = new Shop(lowFloorWeapons, lowFloorArmors, lowFloorHpPotions, lowFloorMpPotions);
        //3층
        ArrayList<Weapon> midFloorWeapons = new ArrayList<>();
        midFloorWeapons.add((Weapon) sword2);
        midFloorWeapons.add((Weapon) sword4);
        ArrayList<Armor> midFloorArmors = new ArrayList<>();
        midFloorArmors.add((Armor) armor2);
        midFloorArmors.add((Armor) armor4);
        ArrayList<HpPotion> midFloorHpPotions = new ArrayList<>();
        midFloorHpPotions.add((HpPotion) lowHpPotion);
        midFloorHpPotions.add((HpPotion) midHpPotion);
        ArrayList<MpPotion> midFloorMpPotions = new ArrayList<>();
        midFloorMpPotions.add((MpPotion) lowMpPotion);
        midFloorMpPotions.add((MpPotion) midMpPotion);

        Shop midFloorshop = new Shop(midFloorWeapons, midFloorArmors, midFloorHpPotions, midFloorMpPotions);
        //4, 5층
        ArrayList<Weapon> highFloorWeapons = new ArrayList<>();
        highFloorWeapons.add((Weapon) sword2);
        highFloorWeapons.add((Weapon) sword4);
        highFloorWeapons.add((Weapon) sword5);
        ArrayList<Armor> highFloorArmors = new ArrayList<>();
        highFloorArmors.add((Armor) armor2);
        highFloorArmors.add((Armor) armor4);
        highFloorArmors.add((Armor) armor5);
        ArrayList<HpPotion> highFloorHpPotions = new ArrayList<>();
        highFloorHpPotions.add((HpPotion) lowHpPotion);
        highFloorHpPotions.add((HpPotion) midHpPotion);
        highFloorHpPotions.add((HpPotion) highHpPotion);
        ArrayList<MpPotion> highFloorMpPotions = new ArrayList<>();
        highFloorMpPotions.add((MpPotion) lowMpPotion);
        highFloorMpPotions.add((MpPotion) midMpPotion);
        highFloorMpPotions.add((MpPotion) highMpPotion);

        Shop highFloorshop = new Shop(highFloorWeapons, highFloorArmors, highFloorHpPotions, highFloorMpPotions);

        //스테이지
        Stage stage1 = new Stage(1, monster1, monster2, boss1, lowFloorshop);//스테이지1
        Stage stage2 = new Stage(2, monster3, monster4, boss2, lowFloorshop);//스테이지2
        Stage stage3 = new Stage(3, monster5, monster6, boss3, midFloorshop);//스테이지3
        Stage stage4 = new Stage(4, monster7, monster8, boss4, highFloorshop);//스테이지4
        Stage stage5 = new Stage(5, monster9, monster10, boss5, highFloorshop);//스테이지5

        List<Stage> stages = new ArrayList<>();
        stages.add(stage1);
        stages.add(stage2);
        stages.add(stage3);
        stages.add(stage4);
        stages.add(stage5);


        //화면 출력 담당 콘솔
        BossStageConsole bossStageConsole = new BossStageConsole();
        InventoryConsole inventoryConsole = new InventoryConsole();
        HuntingGroundConsole huntingGroundConsole = new HuntingGroundConsole();
        CharacterInfoConsole characterInfoConsole = new CharacterInfoConsole();
        ShopConsole shopConsole = new ShopConsole();

//----------------------------초기화면-------------------------------------------

        Thread opening = new Thread(new OpeningThread());
        SoundThread openingSound = new SoundThread("opening.mp3", false);
        openingSound.start();
        opening.start();
        try {
            opening.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        openingSound.finish();

        Thread loading = new Thread(new LoadingThread("loading"));
        loading.start();
        try {
            loading.join();
        } catch (Exception e) {
            e.printStackTrace();
        }

        SoundThread characterChoiceSound = new SoundThread("character_choice.mp3", true);
        characterChoiceSound.start();

        while (true) {
            printSpace();

            System.out.println("===========================================================");
            System.out.println("게임을 시작하셨습니다.");
            System.out.println("탑의 정상에 올라 탑에 새로운 변화를 불러오려는 세 명의 모험가가 여러분을 기다리고 있습니다.");
            System.out.println("한명의 케릭터를 골라 탑을 올라가세요!");
            System.out.println("===========================================================");
            System.out.println("1. 스물다섯번째 밤        2. 쿤 아게로 아그니스        3.라크 레크레이셔");
            System.out.println("");
            System.out.print("케릭터를 선택해주세요:");
//--------------------------------------케릭터 선택----------------------------------------
            String characterSelect = scan.next();//케릭터 선택 스캐너
            if (characterSelect.equals("1")) {//밤 선택
                scripts.put("fight", "당신을 넘어 반드시 다음층으로 가겠습니다!");
                scripts.put("lastStage", "자하드씨 당신만 행복한 탑은 의미가 없습니다. 이제 새로운 변화를 받아들이시죠. 당신을 쓰러뜨리고 탑에 변화를 몰고 오겠습니다!!!");
                scripts.put("ending", "자하드씨. 이 탑은 이제 변화가 필요합니다. 더 이상 당신만을 위한 탑이 아닌 모두가 행복한 탑이 될 겁니다. 이제 그만 물러나시죠.");
                adventurer = new Adventurer(//사용자 케릭터 객체 초기화
                        "스물다섯번째 밤",
                        400000,//400
                        400000,//400
                        20000,//200
                        20000,//200
                        1500,//150
                        300,//100
                        1000000,//10000
                        0,
                        3000,//300
                        15,
                        "에너지볼",
                        null,
                        null,
                        null,
                        new Skill("극익화접공파술", 1, 200, 2000),
                        new Skill("스물다섯번째 밤류 궁극기 장천", 1, 200, 2500),
                        new ArrayList<>(),
                        new ArrayList<>(),
                        new ArrayList<HpPotion>(),
                        new ArrayList<HpPotion>(),
                        new ArrayList<HpPotion>(),
                        new ArrayList<MpPotion>(),
                        new ArrayList<MpPotion>(),
                        new ArrayList<MpPotion>(),
                        scripts
                );

            } else if (characterSelect.equals("2")) {//쿤 선택
                scripts.put("fight", "어차피 나한테 질 거 그냥 포기하는 게 어때? 시간낭비 하지 말자고.");
                scripts.put("lastStage", "이봐 자하드. 탑에서 너로 인해 고통받는 사람들을 보니까 화가 나서 말이야. 이제 그만 그 자리에서 내려와주겠어?");
                scripts.put("ending", "이봐 탑의 왕이라더니 별거 아니잖아? 그 실력으로 지금까지 왕노릇을 한 거야? 더는 못 봐주겠으니 이제 꺼지라고. 이 탑은 모두를 위한 탑이 될 거야.");
                adventurer = new Adventurer(//사용자 케릭터 객체 초기화
                        "쿤 아게로 아그니스",
                        420,
                        420,
                        130,
                        130,
                        140,
                        110,
                        10000,
                        0,
                        300,
                        1,
                        "단검날리기",
                        null,
                        null,
                        null,
                        new Skill("아이스스피어", 0, 0, 0),
                        new Skill("쿤 아게로 아그니스류 궁극기 전창술", 0, 0, 0),
                        new ArrayList<>(),
                        new ArrayList<>(),
                        new ArrayList<HpPotion>(),
                        new ArrayList<HpPotion>(),
                        new ArrayList<HpPotion>(),
                        new ArrayList<MpPotion>(),
                        new ArrayList<MpPotion>(),
                        new ArrayList<MpPotion>(),
                        scripts
                );

            } else if (characterSelect.equals("3")) {//라크 선택
                scripts.put("fight", "넌 내 사냥감이다! 잡아먹어주마!!");
                scripts.put("lastStage", "왕거북이!! 넌 내 사냥감이다! 잡아먹어주마!!!");
                scripts.put("ending", "이봐! 왕거북이!! 패배를 인정하고 꺼져라! 이 탑은 이제 나의 사냥감들로 채울 것이니!!");
                adventurer = new Adventurer(//사용자 케릭터 객체 초기화
                        "라크 레크레이셔",
                        450,
                        450,
                        110,
                        110,
                        130,
                        120,
                        10000,
                        0,
                        300,
                        1,
                        "맨손치기",
                        null,
                        null,
                        null,
                        new Skill("스톤오브", 0, 0, 0),
                        new Skill("라크 레크레이셔류 궁극기 매드쇼크", 0, 0, 0),
                        new ArrayList<>(),
                        new ArrayList<>(),
                        new ArrayList<HpPotion>(),
                        new ArrayList<HpPotion>(),
                        new ArrayList<HpPotion>(),
                        new ArrayList<MpPotion>(),
                        new ArrayList<MpPotion>(),
                        new ArrayList<MpPotion>(),
                        scripts
                );

            } else {
                printWrongInputMessage();
                try {
                    Thread.sleep(1500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                continue;
            }

            characterChoiceSound.finish();
            Thread initCharacter = new Thread(new LoadingThread("initCharacter"));
            initCharacter.start();
            try {
                initCharacter.join();
            } catch (Exception e) {
                e.printStackTrace();
            }

            SoundThread characterInfoSound = new SoundThread("character_information.mp3", false);
            characterInfoSound.start();

            characterInfoConsole.print(adventurer);//케릭터 정보 화면 출력
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
            break;

        }

//-------------------------메인 메뉴-----------------------------------------------------------------------------
        int stageFloor = 1;
        loop1:
        while (stageFloor <= stages.size()) {

            Stage stage = stages.get(stageFloor - 1);

            SoundThread entranceSound = new SoundThread("stage_entrance.mp3", false);
            entranceSound.start();
            printSpace();
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("");
            System.out.println("==============================================================");
            if (stage.getFloor() != 5) {
                System.out.println("탑의 " + stage.getFloor() + "층에 입장하셨습니다. " + stage.getFloor() + "층의 지배자인 " + stage.getBoss().getName() + "을(를) 무찌르고 다음 층으로 올라가세요!");
            } else {
                System.out.println("탑의 " + stage.getFloor() + "층에 입장하셨습니다. " + stage.getFloor() + "층의 지배자인 " + stage.getBoss().getName() + "을(를) 무찌르고 탑에 새로운 변화를 불러오세요!!!");
            }
            System.out.println("==============================================================");
            try {
                Thread.sleep(2500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            entranceSound.finish();

            loop2:
            while (true) {
                SoundThread downtownSound = new SoundThread("main_menu.mp3", true);
                downtownSound.start();
                BuffEffectThread buffEffect = new BuffEffectThread(adventurer, stage, true);
                buffEffect.setDaemon(true);
                if (adventurer.getHp() < adventurer.getMaxHp() || adventurer.getMp() < adventurer.getMaxMp()) {
                    buffEffect.start();
                } else {
                    buffEffect.finish();
                }
                printSpace();
                System.out.println("================================================================");
                System.out.println("1. " + stage.getBoss().getName() + "과(와)의 대결        2. 사냥터 입장        3. 인벤토리        4. 상점 입장        5. 케릭터 정보");
                System.out.println("================================================================");
                System.out.println("0. 게임종료");
                System.out.println("");
                System.out.print("취할 행동을 선택해주세요:");
                String characterAction = scan.next();

//-------------------------------------보스와 싸우기 메뉴---------------------------------------------
                if (characterAction.equals("1")) {//보스와 싸우기
                    SoundThread bossStageSound = new SoundThread("boss_stage.mp3", true);
                    if (adventurer.getLevel() < stage.getBoss().getLevel()) {
                        downtownSound.finish();
                        SoundThread blockSound = new SoundThread("block.mp3", false);
                        blockSound.start();
                        buffEffect.finish();
                        printSpace();
                        System.out.println("===========================================================");
                        System.out.println("아직 " + stage.getBoss().getName() + "과(와) 싸우기엔 실력이 부족합니다. 레벨 " + stage.getBoss().getLevel() + "을 만들고 오세요.");
                        System.out.println("===========================================================");
                        System.out.println("");
                        try {
                            Thread.sleep(1500);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        continue;
                    } else {
                        downtownSound.finish();
                        buffEffect.finish();
                        Thread fightLoading = new Thread(new LoadingThread("startFighting"));
                        fightLoading.start();
                        try {
                            fightLoading.join();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        bossStageSound.start();
                    }

                    bossStageConsole.print(adventurer, stage.getBoss(), 0);//싸움 시작 화면 출력

                    loop3:
                    while (true) {
                        String fightAction = bossStageConsole.input(scan, adventurer, stage.getBoss(), 0);//1. 공격, 2. 인벤토리
                        if (fightAction.equals("1")) {//1. 공격 선택
                            loop4:
                            while (true) {
                                String attackType = bossStageConsole.input(scan, adventurer, stage.getBoss(), 1);//1. 기본 공격, 2.스킬, 3. 궁극기
                                if (attackType.equals("1")) {//기본공격
                                    bossStageConsole.print(adventurer, stage.getBoss(), 1);//모험가 기본 공격화면 출력
                                    int damage = adventurer.attack(stage.getBoss());
                                    bossStageConsole.printDamage(stage.getBoss(), damage);
                                    break;
                                } else if (attackType.equals("2")) {//공격스킬
                                    if (adventurer.getMp() >= adventurer.getSkill().getMp()) {//mp가 공격스킬을 사용할 때 소모되는 mp보다 많거나 같을 때
                                        if (adventurer.getSkill().getLevel() == 0) {//숙련도 0일 때는 스킬을 사용할 수 없음.
                                            printSpace();
                                            System.out.println("");
                                            System.out.println("<해당스킬은 아직 사용할 수 없습니다.>");
                                            System.out.println("");
                                            try {
                                                Thread.sleep(1500);
                                            } catch (InterruptedException e) {
                                                e.printStackTrace();
                                            }
                                            continue;
                                        } else {//숙련도가 1 이상일 때 기본공격과 같은 과정으로 진행
                                            bossStageConsole.print(adventurer, stage.getBoss(), 2);//스킬 공격 화면 출력
                                            int damage = adventurer.useSkill(adventurer.getSkill(), stage.getBoss());
                                            adventurer.setMp(adventurer.getMp() - adventurer.getSkill().getMp());
                                            bossStageConsole.printDamage(stage.getBoss(), damage);
                                            break;
                                        }
                                    } else {//mp가 공격스킬을 사용할 때 소모되는 mp보다 적을 때
                                        printSpace();
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
                                } else if (attackType.equals("3")) {//궁극기
                                    if (adventurer.getMp() >= adventurer.getHyperSkill().getMp()) {//mp가 궁극기를 사용할 때 소모되는 mp보다 많거나 같을 때
                                        if (adventurer.getHyperSkill().getLevel() == 0) {//숙련도 0일 때는 궁극기를 사용할 수 없음.
                                            printSpace();
                                            System.out.println("");
                                            System.out.println("<해당스킬은 아직 사용할 수 없습니다.>");
                                            System.out.println("");
                                            try {
                                                Thread.sleep(1500);
                                            } catch (InterruptedException e) {
                                                e.printStackTrace();
                                            }
                                            continue;
                                        } else {//숙련도가 1 이상일 때
                                            if (adventurer.getSpecialWeapon() != null) {//특수무기를 장착하고 있는 경우로 이 경우 기본공격과 공격스킬과 같은 흐름으로 진행
                                                bossStageConsole.print(adventurer, stage.getBoss(), 3);//궁극기 스킬 공격 호면 출력
                                                int damage = adventurer.useSkill(adventurer.getHyperSkill(), stage.getBoss());
                                                adventurer.setMp(adventurer.getMp() - adventurer.getHyperSkill().getMp());
                                                bossStageConsole.printDamage(stage.getBoss(), damage);
                                                break;
                                            } else {//특수무기를 장착하지 않아서 궁극기를 사용할 수 없음
                                                printSpace();
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
                                    } else {////mp가 궁극기를 사용할 때 소모되는 mp보다 적을 때
                                        printSpace();
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
                                } else {
                                    printWrongInputMessage();
                                }
                                try {
                                    Thread.sleep(1500);
                                } catch (InterruptedException e) {
                                    e.printStackTrace();
                                }
                            }

                            if (stage.getBoss().getHp() <= 0) {
                                int potionDropCount = stage.getBoss().dropItem(adventurer);//포션, 아이템, 경험치, 돈 획득
                                bossStageConsole.print(stage.getBoss(), potionDropCount);//스테이지 클리어 화면 출력(보상)
                                if (adventurer.getExp() >= adventurer.getMaxExp()) {
                                    adventurer.levelUp();//레벨업
                                    bossStageConsole.print(adventurer, 0);//레벨업 화면 출력
                                }
                                if (stageFloor != 5) {//마지막 층이 아닌 경우
                                    bossStageSound.finish();
                                    System.out.println("");
                                    Thread moveToNextStage = new Thread(new LoadingThread("moveToNextStage"));//다음 스테이지로 이동
                                    moveToNextStage.start();
                                    try {
                                        moveToNextStage.join();
                                    } catch (Exception e) {
                                        e.printStackTrace();
                                    }
                                    stage.getBoss().setHp(stage.getBoss().getMaxHp());//hp다시 원상복구
                                    stageFloor++;
                                } else {//마지막 층인 경우
                                    bossStageConsole.print(adventurer, 1);//엔딩 화면 출력
                                    bossStageSound.finish();
                                    finishGame(scan);
                                }
                                break loop2;
                                //---------------보스 공격-------------------------------------
                            } else {
                                bossStageConsole.print(adventurer, stage.getBoss(), 4);//보스 공격 화면 출력

                                if (adventurer.getHp() <= 0) {//모험가가 죽으면 메인메뉴로 부활하는 구문
                                    bossStageSound.finish();
                                    bossStageConsole.print(adventurer, stage.getBoss(), 5);//부활 화면 출력
                                    //hp, mp 50%회복
                                    adventurer.setHp(0.5 * adventurer.getMaxHp());
                                    adventurer.setMp(0.5 * adventurer.getMaxMp());
                                    break loop2;
                                }
                            }
                            //---------------------보스전 인벤토리-----------------------------------
                        } else if (fightAction.equals("2")) {//2. 인벤토리 선택
                            while (true) {
                                String itemSelect = inventoryConsole.input(scan, 0);//1. 무기, 2. 방어구, 3. 포션
                                if (itemSelect.equals("1")) {
                                    while (true) {
                                        inventoryConsole.printWeapons((ArrayList<Weapon>) adventurer.getWeapons());//보유 무기 출력
                                        String weapon_setting = inventoryConsole.input(scan, 1);//1~n. 무기 선택, 0.취소
                                        if (weapon_setting.equals("0")) {//무기 장착
                                            break;
                                        } else {
                                            int weaponNum = 0;
                                            try {
                                                weaponNum = Integer.parseInt(weapon_setting) - 1;
                                            } catch (Exception e) {
                                                printSpace();
                                                printWrongInputMessage();
                                                try {
                                                    Thread.sleep(1500);
                                                } catch (InterruptedException E) {
                                                    E.printStackTrace();
                                                }
                                                continue;
                                            }

                                            if (weaponNum >= 0 && weaponNum < adventurer.getWeapons().size()) {
                                                inventoryConsole.print(adventurer.getWeapons().get(weaponNum));//무기 장착 완료 화면 출력
                                                adventurer.setWeapon(adventurer.getWeapons().get(weaponNum));//무기 장착
                                            } else {
                                                printSpace();
                                                printWrongInputMessage();
                                                try {
                                                    Thread.sleep(1500);
                                                } catch (InterruptedException e) {
                                                    e.printStackTrace();
                                                }
                                            }
                                        }
                                    }
                                } else if (itemSelect.equals("2")) {
                                    while (true) {
                                        inventoryConsole.printArmors((ArrayList<Armor>) adventurer.getArmors());//보유 무기 출력
                                        String armorSetting = inventoryConsole.input(scan, 2);//1~n. 방어구 선택, 0.취소
                                        if (armorSetting.equals("0")) {//방어구 장착
                                            break;
                                        } else {
                                            int armorNum = 0;
                                            try {
                                                armorNum = Integer.parseInt(armorSetting) - 1;
                                            } catch (Exception e) {
                                                printSpace();
                                                printWrongInputMessage();
                                                try {
                                                    Thread.sleep(1500);
                                                } catch (InterruptedException E) {
                                                    E.printStackTrace();
                                                }
                                                continue;
                                            }
                                            if (armorNum >= 0 && armorNum < adventurer.getArmors().size()) {
                                                inventoryConsole.print(adventurer.getArmors().get(armorNum));//방어구 장착 완료 화면 출력
                                                adventurer.setArmor(adventurer.getArmors().get(armorNum));//방어구 장착
                                            } else {
                                                printSpace();
                                                printWrongInputMessage();
                                                try {
                                                    Thread.sleep(1500);
                                                } catch (InterruptedException e) {
                                                    e.printStackTrace();
                                                }
                                            }
                                        }
                                    }
                                } else if (itemSelect.equals("3")) {//물약 인벤토리
                                    while (true) {
                                        inventoryConsole.printPotions(
                                                adventurer.getLowHpPotions(),
                                                adventurer.getMidHpPotions(),
                                                adventurer.getHighHpPotions(),
                                                adventurer.getLowMpPotions(),
                                                adventurer.getMidMpPotions(),
                                                adventurer.getHighMpPotions());//물약 리스트 화면 출력
                                        String potionNum_ = inventoryConsole.input(scan, 3);//사용할 물약 input
                                        if (potionNum_.equals("0")) {
                                            break;

                                        } else {
                                            int potionNum = 0;
                                            try {
                                                potionNum = Integer.parseInt(potionNum_);
                                                printSpace();
                                                printWrongInputMessage();
                                                try {
                                                    Thread.sleep(1500);
                                                } catch (InterruptedException e) {
                                                    e.printStackTrace();
                                                }
                                                continue;
                                            } catch (Exception e) {

                                            }
                                            if (potionNum <= 3 && adventurer.getHp() == adventurer.getMaxHp()) {
                                                printSpace();
                                                System.out.println("");
                                                System.out.println("<이미 hp가 최대치입니다.>");
                                                System.out.println("");
                                                try {
                                                    Thread.sleep(1500);
                                                } catch (InterruptedException e) {
                                                    e.printStackTrace();
                                                }
                                                continue;
                                            }

                                            if ((potionNum == 1 && adventurer.getLowHpPotions().size() == 0) ||
                                                    (potionNum == 2 && adventurer.getMidHpPotions().size() == 0) ||
                                                    (potionNum == 3 && adventurer.getHighHpPotions().size() == 0) ||
                                                    (potionNum == 4 && adventurer.getLowMpPotions().size() == 0) ||
                                                    (potionNum == 5 && adventurer.getMidMpPotions().size() == 0) ||
                                                    (potionNum == 6 && adventurer.getHighMpPotions().size() == 0)) {
                                                printSpace();
                                                System.out.println("");
                                                System.out.println("<포션이 없습니다.>");
                                                System.out.println("");
                                                try {
                                                    Thread.sleep(1500);
                                                } catch (InterruptedException e) {
                                                    e.printStackTrace();
                                                }
                                                continue;
                                            }

                                            Thread recoverySound = new Thread(new SoundThread("recovery.mp3", false));
                                            recoverySound.start();
                                            printSpace();
                                            System.out.println("");
                                            if (potionNum == 1) {
                                                if (adventurer.getMaxHp() - adventurer.getHp() > ((HpPotion) lowHpPotion).getHp()) {
                                                    System.out.println("hp를 " + ((HpPotion) lowHpPotion).getHp() + "만큼 회복하였습니다.");
                                                } else {
                                                    System.out.println("hp를 " + (int) (adventurer.getMaxHp() - adventurer.getHp()) + "만큼 회복하였습니다.");
                                                }

                                                adventurer.getLowHpPotions().remove(0);//하급 포션 리스트에서 하나 삭제
                                            } else if (potionNum == 2) {
                                                if (adventurer.getMaxHp() - adventurer.getHp() > ((HpPotion) midHpPotion).getHp()) {
                                                    System.out.println("hp를 " + ((HpPotion) midHpPotion).getHp() + "만큼 회복하였습니다.");
                                                } else {
                                                    System.out.println("hp를 " + (int) (adventurer.getMaxHp() - adventurer.getHp()) + "만큼 회복하였습니다.");
                                                }

                                                adventurer.getMidHpPotions().remove(0);//하급 포션 리스트에서 하나 삭제
                                            } else if (potionNum == 3) {
                                                if (adventurer.getMaxHp() - adventurer.getHp() > ((HpPotion) highHpPotion).getHp()) {
                                                    System.out.println("hp를 " + ((HpPotion) highHpPotion).getHp() + "만큼 회복하였습니다.");
                                                } else {
                                                    System.out.println("hp를 " + (int) (adventurer.getMaxHp() - adventurer.getHp()) + "만큼 회복하였습니다.");
                                                }

                                                adventurer.getHighHpPotions().remove(0);//하급 포션 리스트에서 하나 삭제
                                            } else if (potionNum == 4) {
                                                if (adventurer.getMaxMp() - adventurer.getMp() > ((MpPotion) lowMpPotion).getMp()) {
                                                    System.out.println("mp를 " + ((MpPotion) lowMpPotion).getMp() + "만큼 회복하였습니다.");
                                                } else {
                                                    System.out.println("mp를 " + (int) (adventurer.getMaxMp() - adventurer.getMp()) + "만큼 회복하였습니다.");
                                                }

                                                adventurer.getLowMpPotions().remove(0);//하급 포션 리스트에서 하나 삭제
                                            } else if (potionNum == 5) {
                                                if (adventurer.getMaxMp() - adventurer.getMp() > ((MpPotion) midMpPotion).getMp()) {
                                                    System.out.println("mp를 " + ((MpPotion) midMpPotion).getMp() + "만큼 회복하였습니다.");
                                                } else {
                                                    System.out.println("mp를 " + (int) (adventurer.getMaxMp() - adventurer.getMp()) + "만큼 회복하였습니다.");
                                                }

                                                adventurer.getMidMpPotions().remove(0);//하급 포션 리스트에서 하나 삭제
                                            } else if (potionNum == 6) {
                                                if (adventurer.getMaxMp() - adventurer.getMp() > ((MpPotion) highMpPotion).getMp()) {
                                                    System.out.println("mp를 " + ((MpPotion) highMpPotion).getMp() + "만큼 회복하였습니다.");
                                                } else {
                                                    System.out.println("mp를 " + (int) (adventurer.getMaxMp() - adventurer.getMp()) + "만큼 회복하였습니다.");
                                                }

                                                adventurer.getHighMpPotions().remove(0);//하급 포션 리스트에서 하나 삭제
                                            }
                                            System.out.println("");
                                            try {
                                                Thread.sleep(1500);
                                            } catch (InterruptedException e) {
                                                e.printStackTrace();
                                            }
                                        }
                                    }
                                } else if (itemSelect.equals("0")) {
                                    break;
                                } else {
                                    printSpace();
                                    printWrongInputMessage();
                                    try {
                                        Thread.sleep(1500);
                                    } catch (InterruptedException e) {
                                        e.printStackTrace();
                                    }
                                }
                            }
                        } else {
                            printSpace();
                            printWrongInputMessage();
                            try {
                                Thread.sleep(1500);
                            } catch (InterruptedException e) {
                                e.printStackTrace();
                            }
                        }
                    }
//------------------------------------사냥터 메뉴-----------------------------------------------------------------------
                } else if (characterAction.equals("2")) {//사냥터
                    downtownSound.finish();
                    buffEffect.finish();
                    SoundThread huntingGroundSound = new SoundThread("monster_stage.mp3", true);
                    huntingGroundSound.start();

                    while (true) {
                        printSpace();
                        String selectedMonster = huntingGroundConsole.input(scan, stage, 0);//1. 몬스터1, 2. 몬스터2
                        if (selectedMonster.equals("1")) {//상대적으로 약한 몬스터와의 대결을 선택하는 변수
                            huntingGroundSound.finish();
                            huntingGroundConsole.print(stage.getMonster1());//싸움 시작 화면 출력
                            loop4:
                            while (true) {
                                String fightAction = huntingGroundConsole.input(scan, adventurer, stage.getMonster1(), 0);//1. 공격, 2. 인벤토리
                                if (fightAction.equals("1")) {//1. 공격 선택
                                    while (true) {
                                        String attackType = huntingGroundConsole.input(scan, adventurer, 0);
                                        if (attackType.equals("1")) {//기본공격
                                            huntingGroundConsole.print(adventurer, stage.getMonster1(), 0);//모험가 기본 공격화면 출력
                                            int damage = adventurer.attack(stage.getMonster1());
                                            huntingGroundConsole.printDamage(stage.getMonster1(), damage);
                                            break;
                                        } else if (attackType.equals("2")) {//공격스킬
                                            if (adventurer.getMp() >= adventurer.getSkill().getMp()) {//mp가 공격스킬을 사용할 때 소모되는 mp보다 많거나 같을 때
                                                if (adventurer.getSkill().getLevel() == 0) {//숙련도 0일 때는 스킬을 사용할 수 없음.
                                                    printSpace();
                                                    System.out.println("");
                                                    System.out.println("<해당스킬은 아직 사용할 수 없습니다.>");
                                                    System.out.println("");
                                                    try {
                                                        Thread.sleep(1500);
                                                    } catch (InterruptedException e) {
                                                        e.printStackTrace();
                                                    }
                                                    continue;
                                                } else {//숙련도가 1 이상일 때 기본공격과 같은 과정으로 진행
                                                    huntingGroundConsole.print(adventurer, stage.getMonster1(), 1);//스킬 공격 화면 출력
                                                    int damage = adventurer.useSkill(adventurer.getSkill(), stage.getMonster1());
                                                    adventurer.setMp(adventurer.getMp() - adventurer.getSkill().getMp());
                                                    huntingGroundConsole.printDamage(stage.getMonster1(), damage);
                                                    break;
                                                }
                                            } else {//mp가 공격스킬을 사용할 때 소모되는 mp보다 적을 때
                                                printSpace();
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
                                        } else if (attackType.equals("3")) {//궁극기
                                            if (adventurer.getMp() >= adventurer.getHyperSkill().getMp()) {//mp가 궁극기를 사용할 때 소모되는 mp보다 많거나 같을 때
                                                if (adventurer.getHyperSkill().getLevel() == 0) {//숙련도 0일 때는 궁극기를 사용할 수 없음.
                                                    printSpace();
                                                    System.out.println("");
                                                    System.out.println("<해당스킬은 아직 사용할 수 없습니다.>");
                                                    System.out.println("");
                                                    try {
                                                        Thread.sleep(1500);
                                                    } catch (InterruptedException e) {
                                                        e.printStackTrace();
                                                    }
                                                    continue;
                                                } else {//숙련도가 1 이상일 때
                                                    if (adventurer.getSpecialWeapon() != null) {//특수무기를 장착하고 있는 경우로 이 경우 기본공격과 공격스킬과 같은 흐름으로 진행
                                                        huntingGroundConsole.print(adventurer, stage.getMonster1(), 2);//궁극기 스킬 공격 호면 출력
                                                        int damage = adventurer.useSkill(adventurer.getHyperSkill(), stage.getMonster1());
                                                        adventurer.setMp(adventurer.getMp() - adventurer.getHyperSkill().getMp());
                                                        huntingGroundConsole.printDamage(stage.getMonster1(), damage);
                                                        break;
                                                    } else {//특수무기를 장착하지 않아서 궁극기를 사용할 수 없음
                                                        printSpace();
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
                                            } else {////mp가 궁극기를 사용할 때 소모되는 mp보다 적을 때
                                                printSpace();
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
                                        } else {
                                            printWrongInputMessage();
                                        }
                                        try {
                                            Thread.sleep(1500);
                                        } catch (InterruptedException e) {
                                            e.printStackTrace();
                                        }
                                    }

                                    if (stage.getMonster1().getHp() <= 0) {
                                        int potionDropCount = stage.getMonster1().dropItem(adventurer);//포션, 경험치, 돈 drop
                                        huntingGroundConsole.print(stage.getMonster1(), potionDropCount);
                                        if (adventurer.getExp() >= adventurer.getMaxExp()) {
                                            adventurer.levelUp();//레벨업
                                            huntingGroundConsole.printLevelUp(adventurer);//레벨업 화면 출력
                                        }
                                        stage.getMonster1().setHp(stage.getMonster1().getMaxHp());//몬스터 체력 원상 복구
                                        huntingGroundSound.finish();

                                        Thread moveToTown = new Thread(new LoadingThread("moveToTown"));
                                        moveToTown.start();
                                        try {
                                            moveToTown.join();
                                        } catch (InterruptedException e) {
                                            e.printStackTrace();
                                        }
                                        break loop2;

                                        //---------------몬스터 공격-------------------------------------
                                    } else {
                                        huntingGroundConsole.print(adventurer, stage.getMonster1(), 3);
                                        if (adventurer.getHp() <= 0) {//몬스터와 싸우다 죽으면 모험가가 메인으로 부활하는 구문
                                            huntingGroundSound.finish();
                                            huntingGroundConsole.print(adventurer, stage.getMonster1(), 4);//부활 화면 출력
                                            //hp, mp 50%회복
                                            adventurer.setHp(0.5 * adventurer.getMaxHp());
                                            adventurer.setMp(0.5 * adventurer.getMaxMp());
                                            break loop2;
                                        }
                                    }
                                    //---------------------사냥터 인벤토리-----------------------------------
                                } else if (fightAction.equals("2")) {//인벤토리
                                    while (true) {
                                        String itemSelect = inventoryConsole.input(scan, 0);//1. 무기, 2. 방어구, 3. 포션
                                        if (itemSelect.equals("1")) {
                                            while (true) {
                                                inventoryConsole.printWeapons((ArrayList<Weapon>) adventurer.getWeapons());//보유 무기 출력
                                                String weaponNum_ = inventoryConsole.input(scan, 1);//1~n. 무기 선택, 0.취소
                                                if (weaponNum_.equals("0")) {//무기 장착
                                                    break;
                                                } else {
                                                    int weaponNum = 0;
                                                    try {
                                                        weaponNum = Integer.parseInt(weaponNum_) - 1;
                                                    } catch (Exception e) {
                                                        printSpace();
                                                        printWrongInputMessage();
                                                        try {
                                                            Thread.sleep(1500);
                                                        } catch (InterruptedException E) {
                                                            E.printStackTrace();
                                                        }
                                                        continue;
                                                    }
                                                    if (weaponNum >= 0 && weaponNum < adventurer.getWeapons().size()) {
                                                        inventoryConsole.print(adventurer.getWeapons().get(weaponNum));//무기 장착 완료 화면 출력
                                                        adventurer.setWeapon(adventurer.getWeapons().get(weaponNum));//무기 장착
                                                    } else {
                                                        printSpace();
                                                        printWrongInputMessage();
                                                        try {
                                                            Thread.sleep(1500);
                                                        } catch (InterruptedException e) {
                                                            e.printStackTrace();
                                                        }
                                                    }
                                                }
                                            }
                                        } else if (itemSelect.equals("2")) {
                                            while (true) {
                                                inventoryConsole.printArmors((ArrayList<Armor>) adventurer.getArmors());//보유 무기 출력
                                                String armorSetting = inventoryConsole.input(scan, 2);//1~n. 방어구 선택, 0.취소
                                                if (armorSetting.equals("0")) {//방어구 장착
                                                    break;
                                                } else {
                                                    int armorNum = 0;
                                                    try {
                                                        armorNum = Integer.parseInt(armorSetting) - 1;
                                                    } catch (Exception e) {
                                                        printSpace();
                                                        printWrongInputMessage();
                                                        try {
                                                            Thread.sleep(1500);
                                                        } catch (InterruptedException E) {
                                                            E.printStackTrace();
                                                        }
                                                        continue;
                                                    }
                                                    if (armorNum >= 0 && armorNum < adventurer.getArmors().size()) {
                                                        inventoryConsole.print(adventurer.getArmors().get(armorNum));//방어구 장착 완료 화면 출력
                                                        adventurer.setArmor(adventurer.getArmors().get(armorNum));//방어구 장착
                                                    } else {
                                                        printSpace();
                                                        printWrongInputMessage();
                                                        try {
                                                            Thread.sleep(1500);
                                                        } catch (InterruptedException e) {
                                                            e.printStackTrace();
                                                        }
                                                    }
                                                }
                                            }
                                        } else if (itemSelect.equals("3")) {//물약 인벤토리
                                            while (true) {
                                                inventoryConsole.printPotions(
                                                        adventurer.getLowHpPotions(),
                                                        adventurer.getMidHpPotions(),
                                                        adventurer.getHighHpPotions(),
                                                        adventurer.getLowMpPotions(),
                                                        adventurer.getMidMpPotions(),
                                                        adventurer.getHighMpPotions());//물약 리스트 화면 출력
                                                String potionNum_ = inventoryConsole.input(scan, 3);//사용할 물약 input
                                                if (potionNum_.equals("0")) {
                                                    break;
                                                } else {
                                                    int potionNum = 0;
                                                    try {
                                                        potionNum = Integer.parseInt(potionNum_);
                                                    } catch (Exception e) {
                                                        printSpace();
                                                        printWrongInputMessage();
                                                        try {
                                                            Thread.sleep(1500);
                                                        } catch (InterruptedException E) {
                                                            E.printStackTrace();
                                                        }
                                                        continue;
                                                    }
                                                    if (potionNum <= 3 && adventurer.getHp() == adventurer.getMaxHp()) {
                                                        printSpace();
                                                        System.out.println("");
                                                        System.out.println("<이미 hp가 최대치입니다.>");
                                                        System.out.println("");
                                                        try {
                                                            Thread.sleep(1500);
                                                        } catch (InterruptedException e) {
                                                            e.printStackTrace();
                                                        }
                                                        continue;
                                                    }

                                                    if ((potionNum == 1 && adventurer.getLowHpPotions().size() == 0) ||
                                                            (potionNum == 2 && adventurer.getMidHpPotions().size() == 0) ||
                                                            (potionNum == 3 && adventurer.getHighHpPotions().size() == 0) ||
                                                            (potionNum == 4 && adventurer.getLowMpPotions().size() == 0) ||
                                                            (potionNum == 5 && adventurer.getMidMpPotions().size() == 0) ||
                                                            (potionNum == 6 && adventurer.getHighMpPotions().size() == 0)) {
                                                        printSpace();
                                                        System.out.println("");
                                                        System.out.println("<포션이 없습니다.>");
                                                        System.out.println("");
                                                        try {
                                                            Thread.sleep(1500);
                                                        } catch (InterruptedException e) {
                                                            e.printStackTrace();
                                                        }
                                                        continue;
                                                    }

                                                    Thread recoverySound = new Thread(new SoundThread("recovery.mp3", false));
                                                    recoverySound.start();
                                                    printSpace();
                                                    System.out.println("");
                                                    if (potionNum == 1) {
                                                        if (adventurer.getMaxHp() - adventurer.getHp() > ((HpPotion) lowHpPotion).getHp()) {
                                                            System.out.println("hp를 " + ((HpPotion) lowHpPotion).getHp() + "만큼 회복하였습니다.");
                                                        } else {
                                                            System.out.println("hp를 " + (int) (adventurer.getMaxHp() - adventurer.getHp()) + "만큼 회복하였습니다.");
                                                        }

                                                        adventurer.getLowHpPotions().remove(0);//하급 포션 리스트에서 하나 삭제
                                                    } else if (potionNum == 2) {
                                                        if (adventurer.getMaxHp() - adventurer.getHp() > ((HpPotion) midHpPotion).getHp()) {
                                                            System.out.println("hp를 " + ((HpPotion) midHpPotion).getHp() + "만큼 회복하였습니다.");
                                                        } else {
                                                            System.out.println("hp를 " + (int) (adventurer.getMaxHp() - adventurer.getHp()) + "만큼 회복하였습니다.");
                                                        }

                                                        adventurer.getMidHpPotions().remove(0);//하급 포션 리스트에서 하나 삭제
                                                    } else if (potionNum == 3) {
                                                        if (adventurer.getMaxHp() - adventurer.getHp() > ((HpPotion) highHpPotion).getHp()) {
                                                            System.out.println("hp를 " + ((HpPotion) highHpPotion).getHp() + "만큼 회복하였습니다.");
                                                        } else {
                                                            System.out.println("hp를 " + (int) (adventurer.getMaxHp() - adventurer.getHp()) + "만큼 회복하였습니다.");
                                                        }

                                                        adventurer.getHighHpPotions().remove(0);//하급 포션 리스트에서 하나 삭제
                                                    } else if (potionNum == 4) {
                                                        if (adventurer.getMaxMp() - adventurer.getMp() > ((MpPotion) lowMpPotion).getMp()) {
                                                            System.out.println("mp를 " + ((MpPotion) lowMpPotion).getMp() + "만큼 회복하였습니다.");
                                                        } else {
                                                            System.out.println("mp를 " + (int) (adventurer.getMaxMp() - adventurer.getMp()) + "만큼 회복하였습니다.");
                                                        }

                                                        adventurer.getLowMpPotions().remove(0);//하급 포션 리스트에서 하나 삭제
                                                    } else if (potionNum == 5) {
                                                        if (adventurer.getMaxMp() - adventurer.getMp() > ((MpPotion) midMpPotion).getMp()) {
                                                            System.out.println("mp를 " + ((MpPotion) midMpPotion).getMp() + "만큼 회복하였습니다.");
                                                        } else {
                                                            System.out.println("mp를 " + (int) (adventurer.getMaxMp() - adventurer.getMp()) + "만큼 회복하였습니다.");
                                                        }

                                                        adventurer.getMidMpPotions().remove(0);//하급 포션 리스트에서 하나 삭제
                                                    } else if (potionNum == 6) {
                                                        if (adventurer.getMaxMp() - adventurer.getMp() > ((MpPotion) highMpPotion).getMp()) {
                                                            System.out.println("mp를 " + ((MpPotion) highMpPotion).getMp() + "만큼 회복하였습니다.");
                                                        } else {
                                                            System.out.println("mp를 " + (int) (adventurer.getMaxMp() - adventurer.getMp()) + "만큼 회복하였습니다.");
                                                        }

                                                        adventurer.getHighMpPotions().remove(0);//하급 포션 리스트에서 하나 삭제
                                                    }
                                                    System.out.println("");
                                                    try {
                                                        Thread.sleep(1500);
                                                    } catch (InterruptedException e) {
                                                        e.printStackTrace();
                                                    }
                                                }
                                            }
                                        } else if (itemSelect.equals("0")) {
                                            break;
                                        } else {
                                            printSpace();
                                            printWrongInputMessage();
                                            try {
                                                Thread.sleep(1500);
                                            } catch (InterruptedException e) {
                                                e.printStackTrace();
                                            }
                                        }
                                    }
                                } else {
                                    printSpace();
                                    printWrongInputMessage();
                                    try {
                                        Thread.sleep(1500);
                                    } catch (InterruptedException e) {
                                        e.printStackTrace();
                                    }
                                }
                            }
                        } else if (selectedMonster.equals("2")) {//상대적으로 강한 몬스터와의 싸움 선택
                            huntingGroundSound.finish();
                            huntingGroundConsole.print(stage.getMonster2());//싸움 시작 화면 출력

                            loop4:
                            while (true) {
                                String fightAction = huntingGroundConsole.input(scan, adventurer, stage.getMonster2(), 0);//1. 공격, 2. 인벤토리
                                if (fightAction.equals("1")) {//1. 공격 선택
                                    while (true) {
                                        String attackType = huntingGroundConsole.input(scan, adventurer, 0);
                                        if (attackType.equals("1")) {//기본공격
                                            huntingGroundConsole.print(adventurer, stage.getMonster2(), 0);//모험가 기본 공격화면 출력
                                            int damage = adventurer.attack(stage.getMonster2());
                                            huntingGroundConsole.printDamage(stage.getMonster2(), damage);
                                            break;
                                        } else if (attackType.equals("2")) {//공격스킬
                                            if (adventurer.getMp() >= adventurer.getSkill().getMp()) {//mp가 공격스킬을 사용할 때 소모되는 mp보다 많거나 같을 때
                                                if (adventurer.getSkill().getLevel() == 0) {//숙련도 0일 때는 스킬을 사용할 수 없음.
                                                    printSpace();
                                                    System.out.println("");
                                                    System.out.println("<해당스킬은 아직 사용할 수 없습니다.>");
                                                    System.out.println("");
                                                    try {
                                                        Thread.sleep(1500);
                                                    } catch (InterruptedException e) {
                                                        e.printStackTrace();
                                                    }
                                                    continue;
                                                } else {//숙련도가 1 이상일 때 기본공격과 같은 과정으로 진행
                                                    huntingGroundConsole.print(adventurer, stage.getMonster2(), 1);//스킬 공격 화면 출력
                                                    int damage = adventurer.useSkill(adventurer.getSkill(), stage.getMonster2());
                                                    adventurer.setMp(adventurer.getMp() - adventurer.getSkill().getMp());
                                                    huntingGroundConsole.printDamage(stage.getMonster2(), damage);
                                                    break;
                                                }
                                            } else {//mp가 공격스킬을 사용할 때 소모되는 mp보다 적을 때
                                                printSpace();
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
                                        } else if (attackType.equals("3")) {//궁극기
                                            if (adventurer.getMp() >= adventurer.getHyperSkill().getMp()) {//mp가 궁극기를 사용할 때 소모되는 mp보다 많거나 같을 때
                                                if (adventurer.getHyperSkill().getLevel() == 0) {//숙련도 0일 때는 궁극기를 사용할 수 없음.
                                                    printSpace();
                                                    System.out.println("");
                                                    System.out.println("<해당스킬은 아직 사용할 수 없습니다.>");
                                                    System.out.println("");
                                                    try {
                                                        Thread.sleep(1500);
                                                    } catch (InterruptedException e) {
                                                        e.printStackTrace();
                                                    }
                                                    continue;
                                                } else {//숙련도가 1 이상일 때
                                                    if (adventurer.getSpecialWeapon() != null) {//특수무기를 장착하고 있는 경우로 이 경우 기본공격과 공격스킬과 같은 흐름으로 진행
                                                        huntingGroundConsole.print(adventurer, stage.getMonster2(), 2);//궁극기 스킬 공격 호면 출력
                                                        int damage = adventurer.useSkill(adventurer.getHyperSkill(), stage.getMonster2());
                                                        adventurer.setMp(adventurer.getMp() - adventurer.getHyperSkill().getMp());
                                                        huntingGroundConsole.printDamage(stage.getMonster2(), damage);
                                                        break;
                                                    } else {//특수무기를 장착하지 않아서 궁극기를 사용할 수 없음
                                                        printSpace();
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
                                            } else {////mp가 궁극기를 사용할 때 소모되는 mp보다 적을 때
                                                printSpace();
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
                                        } else {
                                            printSpace();
                                            printWrongInputMessage();
                                        }
                                        try {
                                            Thread.sleep(1500);
                                        } catch (InterruptedException e) {
                                            e.printStackTrace();
                                        }
                                    }

                                    if (stage.getMonster2().getHp() <= 0) {
                                        int potionDropCount = stage.getMonster2().dropItem(adventurer);//포션, 경험치, 돈 drop
                                        huntingGroundConsole.print(stage.getMonster2(), potionDropCount);
                                        if (adventurer.getExp() >= adventurer.getMaxExp()) {
                                            adventurer.levelUp();//레벨업
                                            huntingGroundConsole.printLevelUp(adventurer);//레벨업 화면 출력
                                        }
                                        stage.getMonster2().setHp(stage.getMonster2().getMaxHp());//몬스터 체력 원상 복구

                                        huntingGroundSound.finish();

                                        Thread moveToTown = new Thread(new LoadingThread("moveToTown"));
                                        moveToTown.start();
                                        try {
                                            moveToTown.join();
                                        } catch (InterruptedException e) {
                                            e.printStackTrace();
                                        }
                                        break loop2;

                                        //---------------몬스터 공격-------------------------------------
                                    } else {
                                        huntingGroundConsole.print(adventurer, stage.getMonster2(), 3);
                                        if (adventurer.getHp() <= 0) {//몬스터와 싸우다 죽으면 모험가가 메인으로 부활하는 구문
                                            huntingGroundSound.finish();
                                            huntingGroundConsole.print(adventurer, stage.getMonster2(), 4);//부활 화면 출력
                                            //hp, mp 50%회복
                                            adventurer.setHp(0.5 * adventurer.getMaxHp());
                                            adventurer.setMp(0.5 * adventurer.getMaxMp());
                                            break loop2;
                                        }
                                    }
                                    //---------------------사냥터 인벤토리-----------------------------------
                                } else if (fightAction.equals("2")) {//인벤토리
                                    while (true) {
                                        String itemSelect = inventoryConsole.input(scan, 0);//1. 무기, 2. 방어구, 3. 포션
                                        if (itemSelect.equals("1")) {
                                            while (true) {
                                                inventoryConsole.printWeapons((ArrayList<Weapon>) adventurer.getWeapons());//보유 무기 출력
                                                String weaponNum_ = inventoryConsole.input(scan, 1);//1~n. 무기 선택, 0.취소
                                                if (weaponNum_.equals("0")) {//무기 장착
                                                    break;
                                                } else {
                                                    int weaponNum = 0;
                                                    try {
                                                        weaponNum = Integer.parseInt(weaponNum_) - 1;
                                                    } catch (Exception e) {
                                                        printSpace();
                                                        printWrongInputMessage();
                                                        try {
                                                            Thread.sleep(1500);
                                                        } catch (InterruptedException E) {
                                                            E.printStackTrace();
                                                        }
                                                        continue;
                                                    }
                                                    if (weaponNum >= 0 && weaponNum < adventurer.getWeapons().size()) {
                                                        inventoryConsole.print(adventurer.getWeapons().get(weaponNum));//무기 장착 완료 화면 출력
                                                        adventurer.setWeapon(adventurer.getWeapons().get(weaponNum));//무기 장착
                                                    } else {
                                                        printSpace();
                                                        printWrongInputMessage();
                                                        try {
                                                            Thread.sleep(1500);
                                                        } catch (InterruptedException e) {
                                                            e.printStackTrace();
                                                        }
                                                    }
                                                }
                                            }
                                        } else if (itemSelect.equals("2")) {
                                            while (true) {
                                                inventoryConsole.printArmors((ArrayList<Armor>) adventurer.getArmors());//보유 무기 출력
                                                String armorSetting = inventoryConsole.input(scan, 2);//1~n. 방어구 선택, 0.취소
                                                if (armorSetting.equals("0")) {//방어구 장착
                                                    break;
                                                } else {
                                                    int armorNum = 0;
                                                    try {
                                                        armorNum = Integer.parseInt(armorSetting) - 1;
                                                    } catch (Exception e) {
                                                        printSpace();
                                                        printWrongInputMessage();
                                                        try {
                                                            Thread.sleep(1500);
                                                        } catch (InterruptedException E) {
                                                            E.printStackTrace();
                                                        }
                                                        continue;
                                                    }
                                                    if (armorNum >= 0 && armorNum < adventurer.getWeapons().size()) {
                                                        inventoryConsole.print(adventurer.getArmors().get(armorNum));//방어구 장착 완료 화면 출력
                                                        adventurer.setArmor(adventurer.getArmors().get(armorNum));//방어구 장착
                                                    } else {
                                                        printSpace();
                                                        printWrongInputMessage();
                                                        try {
                                                            Thread.sleep(1500);
                                                        } catch (InterruptedException e) {
                                                            e.printStackTrace();
                                                        }
                                                    }
                                                }
                                            }
                                        } else if (itemSelect.equals("3")) {//물약 인벤토리
                                            while (true) {
                                                inventoryConsole.printPotions(
                                                        adventurer.getLowHpPotions(),
                                                        adventurer.getMidHpPotions(),
                                                        adventurer.getHighHpPotions(),
                                                        adventurer.getLowMpPotions(),
                                                        adventurer.getMidMpPotions(),
                                                        adventurer.getHighMpPotions());//물약 리스트 화면 출력
                                                String potionNum_ = inventoryConsole.input(scan, 3);//사용할 물약 input
                                                if (potionNum_.equals("0")) {
                                                    break;
                                                } else {
                                                    int potionNum = 0;
                                                    try {
                                                        potionNum = Integer.parseInt(potionNum_);
                                                    } catch (Exception e) {
                                                        printSpace();
                                                        printWrongInputMessage();
                                                        try {
                                                            Thread.sleep(1500);
                                                        } catch (InterruptedException E) {
                                                            E.printStackTrace();
                                                        }
                                                        continue;
                                                    }
                                                    if (potionNum <= 3 && adventurer.getHp() == adventurer.getMaxHp()) {
                                                        printSpace();
                                                        System.out.println("");
                                                        System.out.println("<이미 hp가 최대치입니다.>");
                                                        System.out.println("");
                                                        try {
                                                            Thread.sleep(1500);
                                                        } catch (InterruptedException e) {
                                                            e.printStackTrace();
                                                        }
                                                        continue;
                                                    }

                                                    if ((potionNum == 1 && adventurer.getLowHpPotions().size() == 0) ||
                                                            (potionNum == 2 && adventurer.getMidHpPotions().size() == 0) ||
                                                            (potionNum == 3 && adventurer.getHighHpPotions().size() == 0) ||
                                                            (potionNum == 4 && adventurer.getLowMpPotions().size() == 0) ||
                                                            (potionNum == 5 && adventurer.getMidMpPotions().size() == 0) ||
                                                            (potionNum == 6 && adventurer.getHighMpPotions().size() == 0)) {
                                                        printSpace();
                                                        System.out.println("");
                                                        System.out.println("<포션이 없습니다.>");
                                                        System.out.println("");
                                                        try {
                                                            Thread.sleep(1500);
                                                        } catch (InterruptedException e) {
                                                            e.printStackTrace();
                                                        }
                                                        continue;
                                                    }

                                                    Thread recoverySound = new Thread(new SoundThread("recovery.mp3", false));
                                                    recoverySound.start();
                                                    printSpace();
                                                    System.out.println("");
                                                    if (potionNum == 1) {
                                                        if (adventurer.getMaxHp() - adventurer.getHp() > ((HpPotion) lowHpPotion).getHp()) {
                                                            System.out.println("hp를 " + ((HpPotion) lowHpPotion).getHp() + "만큼 회복하였습니다.");
                                                        } else {
                                                            System.out.println("hp를 " + (int) (adventurer.getMaxHp() - adventurer.getHp()) + "만큼 회복하였습니다.");
                                                        }

                                                        adventurer.getLowHpPotions().remove(0);//하급 포션 리스트에서 하나 삭제
                                                    } else if (potionNum == 2) {
                                                        if (adventurer.getMaxHp() - adventurer.getHp() > ((HpPotion) midHpPotion).getHp()) {
                                                            System.out.println("hp를 " + ((HpPotion) midHpPotion).getHp() + "만큼 회복하였습니다.");
                                                        } else {
                                                            System.out.println("hp를 " + (int) (adventurer.getMaxHp() - adventurer.getHp()) + "만큼 회복하였습니다.");
                                                        }

                                                        adventurer.getMidHpPotions().remove(0);//하급 포션 리스트에서 하나 삭제
                                                    } else if (potionNum == 3) {
                                                        if (adventurer.getMaxHp() - adventurer.getHp() > ((HpPotion) highHpPotion).getHp()) {
                                                            System.out.println("hp를 " + ((HpPotion) highHpPotion).getHp() + "만큼 회복하였습니다.");
                                                        } else {
                                                            System.out.println("hp를 " + (int) (adventurer.getMaxHp() - adventurer.getHp()) + "만큼 회복하였습니다.");
                                                        }

                                                        adventurer.getHighHpPotions().remove(0);//하급 포션 리스트에서 하나 삭제
                                                    } else if (potionNum == 4) {
                                                        if (adventurer.getMaxMp() - adventurer.getMp() > ((MpPotion) lowMpPotion).getMp()) {
                                                            System.out.println("mp를 " + ((MpPotion) lowMpPotion).getMp() + "만큼 회복하였습니다.");
                                                        } else {
                                                            System.out.println("mp를 " + (int) (adventurer.getMaxMp() - adventurer.getMp()) + "만큼 회복하였습니다.");
                                                        }

                                                        adventurer.getLowMpPotions().remove(0);//하급 포션 리스트에서 하나 삭제
                                                    } else if (potionNum == 5) {
                                                        if (adventurer.getMaxMp() - adventurer.getMp() > ((MpPotion) midMpPotion).getMp()) {
                                                            System.out.println("mp를 " + ((MpPotion) midMpPotion).getMp() + "만큼 회복하였습니다.");
                                                        } else {
                                                            System.out.println("mp를 " + (int) (adventurer.getMaxMp() - adventurer.getMp()) + "만큼 회복하였습니다.");
                                                        }

                                                        adventurer.getMidMpPotions().remove(0);//하급 포션 리스트에서 하나 삭제
                                                    } else if (potionNum == 6) {
                                                        if (adventurer.getMaxMp() - adventurer.getMp() > ((MpPotion) highMpPotion).getMp()) {
                                                            System.out.println("mp를 " + ((MpPotion) highMpPotion).getMp() + "만큼 회복하였습니다.");
                                                        } else {
                                                            System.out.println("mp를 " + (int) (adventurer.getMaxMp() - adventurer.getMp()) + "만큼 회복하였습니다.");
                                                        }

                                                        adventurer.getHighMpPotions().remove(0);//하급 포션 리스트에서 하나 삭제
                                                    }
                                                    System.out.println("");
                                                    try {
                                                        Thread.sleep(1500);
                                                    } catch (InterruptedException e) {
                                                        e.printStackTrace();
                                                    }
                                                }
                                            }
                                        } else if (itemSelect.equals("0")) {
                                            break;
                                        } else {
                                            try {
                                                Thread.sleep(1500);
                                            } catch (InterruptedException e) {
                                                e.printStackTrace();
                                            }
                                        }
                                    }
                                } else {
                                    printSpace();
                                    printWrongInputMessage();
                                    try {
                                        Thread.sleep(1500);
                                    } catch (InterruptedException e) {
                                        e.printStackTrace();
                                    }
                                }
                            }
                        } else if (selectedMonster.equals("0")) {
                            huntingGroundSound.finish();
                            break;
                        } else {
                            printSpace();
                            printWrongInputMessage();
                            try {
                                Thread.sleep(1500);
                            } catch (InterruptedException e) {
                                e.printStackTrace();
                            }
                        }
                    }
//------------------------------------메인 인벤토리------------------------------------------------------------------------
                } else if (characterAction.equals("3")) {//인벤토리
                    downtownSound.finish();
                    buffEffect.finish();
                    while (true) {
                        String itemSelect = inventoryConsole.input(scan, 0);//1. 무기, 2. 방어구, 3. 포션
                        if (itemSelect.equals("1")) {
                            while (true) {
                                inventoryConsole.printWeapons((ArrayList<Weapon>) adventurer.getWeapons());//보유 무기 출력
                                String weaponNum_ = inventoryConsole.input(scan, 1);//1~n. 무기 선택, 0.취소
                                if (weaponNum_.equals("0")) {//무기 장착
                                    break;
                                } else {
                                    int weaponNum = 0;
                                    try {
                                        weaponNum = Integer.parseInt(weaponNum_) - 1;
                                    } catch (Exception e) {
                                        printSpace();
                                        printWrongInputMessage();
                                        try {
                                            Thread.sleep(1500);
                                        } catch (InterruptedException E) {
                                            E.printStackTrace();
                                        }
                                        continue;
                                    }
                                    if (weaponNum >= 0 && weaponNum < adventurer.getWeapons().size()) {
                                        inventoryConsole.print(adventurer.getWeapons().get(weaponNum));//무기 장착 완료 화면 출력
                                        adventurer.setWeapon(adventurer.getWeapons().get(weaponNum));//무기 장착
                                    } else {
                                        printSpace();
                                        printWrongInputMessage();
                                        try {
                                            Thread.sleep(1500);
                                        } catch (InterruptedException e) {
                                            e.printStackTrace();
                                        }
                                    }
                                }
                            }
                        } else if (itemSelect.equals("2")) {
                            while (true) {
                                inventoryConsole.printArmors((ArrayList<Armor>) adventurer.getArmors());//보유 무기 출력
                                String armorSetting = inventoryConsole.input(scan, 2);//1~n. 방어구 선택, 0.취소
                                if (armorSetting.equals("0")) {//방어구 장착
                                    break;
                                } else {
                                    int armorNum = 0;
                                    try {
                                        armorNum = Integer.parseInt(armorSetting) - 1;
                                    } catch (Exception e) {
                                        printSpace();
                                        printWrongInputMessage();
                                        try {
                                            Thread.sleep(1500);
                                        } catch (InterruptedException E) {
                                            E.printStackTrace();
                                        }
                                        continue;
                                    }
                                    if (armorNum >= 0 && armorNum < adventurer.getArmors().size()) {
                                        inventoryConsole.print(adventurer.getArmors().get(armorNum));//방어구 장착 완료 화면 출력
                                        adventurer.setArmor(adventurer.getArmors().get(armorNum));//방어구 장착
                                    } else {
                                        printSpace();
                                        printWrongInputMessage();
                                        try {
                                            Thread.sleep(1500);
                                        } catch (InterruptedException e) {
                                            e.printStackTrace();
                                        }
                                    }
                                }
                            }
                        } else if (itemSelect.equals("3")) {//물약 인벤토리
                            while (true) {
                                inventoryConsole.printPotions(
                                        adventurer.getLowHpPotions(),
                                        adventurer.getMidHpPotions(),
                                        adventurer.getHighHpPotions(),
                                        adventurer.getLowMpPotions(),
                                        adventurer.getMidMpPotions(),
                                        adventurer.getHighMpPotions());//물약 리스트 화면 출력
                                String potionNum_ = inventoryConsole.input(scan, 3);//사용할 물약 input
                                if (potionNum_.equals("0")) {
                                    break;
                                } else {
                                    int potionNum = 0;
                                    try {
                                        potionNum = Integer.parseInt(potionNum_);
                                    } catch (Exception e) {
                                        printSpace();
                                        printWrongInputMessage();
                                        try {
                                            Thread.sleep(1500);
                                        } catch (InterruptedException E) {
                                            E.printStackTrace();
                                        }
                                        continue;
                                    }
                                    if (potionNum <= 3 && adventurer.getHp() == adventurer.getMaxHp()) {
                                        printSpace();
                                        System.out.println("");
                                        System.out.println("<이미 hp가 최대치입니다.>");
                                        System.out.println("");
                                        try {
                                            Thread.sleep(1500);
                                        } catch (InterruptedException e) {
                                            e.printStackTrace();
                                        }
                                        continue;
                                    }

                                    if ((potionNum == 1 && adventurer.getLowHpPotions().size() == 0) ||
                                            (potionNum == 2 && adventurer.getMidHpPotions().size() == 0) ||
                                            (potionNum == 3 && adventurer.getHighHpPotions().size() == 0) ||
                                            (potionNum == 4 && adventurer.getLowMpPotions().size() == 0) ||
                                            (potionNum == 5 && adventurer.getMidMpPotions().size() == 0) ||
                                            (potionNum == 6 && adventurer.getHighMpPotions().size() == 0)) {
                                        printSpace();
                                        System.out.println("");
                                        System.out.println("<포션이 없습니다.>");
                                        System.out.println("");
                                        try {
                                            Thread.sleep(1500);
                                        } catch (InterruptedException e) {
                                            e.printStackTrace();
                                        }
                                        continue;
                                    }

                                    Thread recoverySound = new Thread(new SoundThread("recovery.mp3", false));
                                    recoverySound.start();
                                    printSpace();
                                    System.out.println("");
                                    if (potionNum == 1) {
                                        if (adventurer.getMaxHp() - adventurer.getHp() > ((HpPotion) lowHpPotion).getHp()) {
                                            System.out.println("hp를 " + ((HpPotion) lowHpPotion).getHp() + "만큼 회복하였습니다.");
                                        } else {
                                            System.out.println("hp를 " + (int) (adventurer.getMaxHp() - adventurer.getHp()) + "만큼 회복하였습니다.");
                                        }

                                        adventurer.getLowHpPotions().remove(0);//하급 포션 리스트에서 하나 삭제
                                    } else if (potionNum == 2) {
                                        if (adventurer.getMaxHp() - adventurer.getHp() > ((HpPotion) midHpPotion).getHp()) {
                                            System.out.println("hp를 " + ((HpPotion) midHpPotion).getHp() + "만큼 회복하였습니다.");
                                        } else {
                                            System.out.println("hp를 " + (int) (adventurer.getMaxHp() - adventurer.getHp()) + "만큼 회복하였습니다.");
                                        }

                                        adventurer.getMidHpPotions().remove(0);//하급 포션 리스트에서 하나 삭제
                                    } else if (potionNum == 3) {
                                        if (adventurer.getMaxHp() - adventurer.getHp() > ((HpPotion) highHpPotion).getHp()) {
                                            System.out.println("hp를 " + ((HpPotion) highHpPotion).getHp() + "만큼 회복하였습니다.");
                                        } else {
                                            System.out.println("hp를 " + (int) (adventurer.getMaxHp() - adventurer.getHp()) + "만큼 회복하였습니다.");
                                        }

                                        adventurer.getHighHpPotions().remove(0);//하급 포션 리스트에서 하나 삭제
                                    } else if (potionNum == 4) {
                                        if (adventurer.getMaxMp() - adventurer.getMp() > ((MpPotion) lowMpPotion).getMp()) {
                                            System.out.println("mp를 " + ((MpPotion) lowMpPotion).getMp() + "만큼 회복하였습니다.");
                                        } else {
                                            System.out.println("mp를 " + (int) (adventurer.getMaxMp() - adventurer.getMp()) + "만큼 회복하였습니다.");
                                        }

                                        adventurer.getLowMpPotions().remove(0);//하급 포션 리스트에서 하나 삭제
                                    } else if (potionNum == 5) {
                                        if (adventurer.getMaxMp() - adventurer.getMp() > ((MpPotion) midMpPotion).getMp()) {
                                            System.out.println("mp를 " + ((MpPotion) midMpPotion).getMp() + "만큼 회복하였습니다.");
                                        } else {
                                            System.out.println("mp를 " + (int) (adventurer.getMaxMp() - adventurer.getMp()) + "만큼 회복하였습니다.");
                                        }

                                        adventurer.getMidMpPotions().remove(0);//하급 포션 리스트에서 하나 삭제
                                    } else if (potionNum == 6) {
                                        if (adventurer.getMaxMp() - adventurer.getMp() > ((MpPotion) highMpPotion).getMp()) {
                                            System.out.println("mp를 " + ((MpPotion) highMpPotion).getMp() + "만큼 회복하였습니다.");
                                        } else {
                                            System.out.println("mp를 " + (int) (adventurer.getMaxMp() - adventurer.getMp()) + "만큼 회복하였습니다.");
                                        }

                                        adventurer.getHighMpPotions().remove(0);//하급 포션 리스트에서 하나 삭제
                                    }
                                    System.out.println("");
                                    try {
                                        Thread.sleep(1500);
                                    } catch (InterruptedException e) {
                                        e.printStackTrace();
                                    }
                                }
                            }
                        } else if (itemSelect.equals("0")) {
                            break;
                        } else {
                            try {
                                Thread.sleep(1500);
                            } catch (InterruptedException e) {
                                e.printStackTrace();
                            }
                        }
                    }
//----------------------------------------상점메뉴---------------------------------------------------------
                } else if (characterAction.equals("4")) {//상점
                    downtownSound.finish();
                    buffEffect.finish();
                    SoundThread shopSound = new SoundThread("shop.mp3", true);
                    shopSound.start();
                    shopConsole.print(stage.getShop(), 0);//상점 입장 화면 출력

                    while (true) {
                        String shopAction = shopConsole.output(scan, stage.getShop(), 0);//1. 아이템 사기, 2. 아이템 팔기
                        if (shopAction.equals("1")) {//아이템 사기
                            while (true) {
                                String selectedItem = shopConsole.output(scan, stage.getShop(), 1);//1. 무기, 2. 방어구, 3. 포션
                                if (selectedItem.equals("1")) {//무기 사기
                                    while (true) {
                                        String selectedWeapon_ = shopConsole.output(scan, stage.getShop(), 2);
                                        if (selectedWeapon_.equals("0")) {
                                            break;
                                        } else {
                                            int selectedWeapon = 0;
                                            try {
                                                selectedWeapon = Integer.parseInt(selectedWeapon_) - 1;
                                            } catch (Exception e) {
                                                printSpace();
                                                printWrongInputMessage();
                                                try {
                                                    Thread.sleep(1500);
                                                } catch (InterruptedException E) {
                                                    E.printStackTrace();
                                                }
                                                continue;
                                            }

                                            if (selectedWeapon < 0 || selectedWeapon >= stage.getShop().getWeapons().size()) {//무기 리스트 index의 범위를 벗어나는 번호를 누른 경우
                                                printSpace();
                                                printWrongInputMessage();
                                                try {
                                                    Thread.sleep(1500);
                                                } catch (InterruptedException e) {
                                                    e.printStackTrace();
                                                }
                                                continue;
                                            }

                                            if (stage.getShop().getWeapons().get(selectedWeapon).getPrice() > adventurer.getMoney()) {
                                                shopConsole.print(0);//돈 부족 메세지 출력
                                                try {
                                                    Thread.sleep(1500);
                                                } catch (InterruptedException e) {
                                                    e.printStackTrace();
                                                }
                                                continue;
                                            }


                                            SoundThread purchaseSound = new SoundThread("money.mp3", false);
                                            purchaseSound.start();
                                            shopConsole.print(1);//구매 성공 메세지 출력
                                            adventurer.buyItem(stage.getShop().getWeapons().get(selectedWeapon));//케릭터 무기 인벤토리에 무기 추가
                                            try {
                                                Thread.sleep(1500);
                                            } catch (InterruptedException e) {
                                                e.printStackTrace();
                                            }
                                        }
                                    }
                                } else if (selectedItem.equals("2")) {//방어구 사기
                                    while (true) {
                                        String selectedArmor_ = shopConsole.output(scan, stage.getShop(), 3);
                                        if (selectedArmor_.equals("0")) {
                                            break;
                                        } else {
                                            int selectedArmor = 0;
                                            try {
                                                selectedArmor = Integer.parseInt(selectedArmor_) - 1;
                                            } catch (Exception e) {
                                                printSpace();
                                                printWrongInputMessage();
                                                try {
                                                    Thread.sleep(1500);
                                                } catch (InterruptedException E) {
                                                    E.printStackTrace();
                                                }
                                                continue;
                                            }
                                            if (selectedArmor < 0 || selectedArmor >= stage.getShop().getWeapons().size()) {//무기 리스트 index의 범위를 벗어나는 번호를 누른 경우
                                                printSpace();
                                                printWrongInputMessage();
                                                try {
                                                    Thread.sleep(1500);
                                                } catch (InterruptedException e) {
                                                    e.printStackTrace();
                                                }
                                                continue;
                                            }

                                            if (stage.getShop().getArmors().get(selectedArmor).getPrice() > adventurer.getMoney()) {
                                                shopConsole.print(0);//돈 부족 메세지 출력
                                                try {
                                                    Thread.sleep(1500);
                                                } catch (InterruptedException e) {
                                                    e.printStackTrace();
                                                }
                                                continue;
                                            }


                                            SoundThread purchaseSound = new SoundThread("money.mp3", false);
                                            purchaseSound.start();
                                            shopConsole.print(1);//구매 성공 메세지 출력
                                            adventurer.buyItem(stage.getShop().getArmors().get(selectedArmor));//케릭터 무기 인벤토리에 무기 추가
                                            try {
                                                Thread.sleep(1500);
                                            } catch (InterruptedException e) {
                                                e.printStackTrace();
                                            }
                                        }
                                    }
                                } else if (selectedItem.equals("3")) {//포션 사기
                                    while (true) {
                                        String selectedPotion_ = shopConsole.output(scan, stage.getShop(), 4);
                                        if (selectedPotion_.equals("0")) {
                                            break;
                                        } else {
                                            int selectedPotion = 0;
                                            try {
                                                selectedPotion = Integer.parseInt(selectedPotion_) - 1;
                                            } catch (Exception e) {
                                                printSpace();
                                                printWrongInputMessage();
                                                try {
                                                    Thread.sleep(1500);
                                                } catch (InterruptedException E) {
                                                    E.printStackTrace();
                                                }
                                                continue;
                                            }

                                            if ((stageFloor <= 2 && selectedPotion >= 2)
                                                    || (stageFloor == 3 && selectedPotion >= 4)
                                                    || (stageFloor >= 4 && selectedPotion >= 6)) {
                                                printWrongInputMessage();
                                                try {
                                                    Thread.sleep(1500);
                                                } catch (InterruptedException e) {
                                                    e.printStackTrace();
                                                }
                                                continue;
                                            }

                                            while (true) {
                                                String count_ = shopConsole.output(scan, stage.getShop(), 5);//수량
                                                if (count_.equals("0")) {
                                                    break;
                                                }

                                                int count = 0;
                                                try {
                                                    count = Integer.parseInt(count_);

                                                } catch (Exception e) {
                                                    printSpace();
                                                    printWrongInputMessage();
                                                    try {
                                                        Thread.sleep(1500);
                                                    } catch (InterruptedException E) {
                                                        E.printStackTrace();
                                                    }
                                                    continue;
                                                }

                                                if (count > 0) {
                                                    if (stageFloor <= 2 && selectedPotion == 0) {//2층 이하인 경우 && hp포션
                                                        adventurer.buyItem(stage.getShop().getHpPotions().get(0), count, "low");
                                                    } else if (stageFloor <= 2 && selectedPotion == 1) {
                                                        adventurer.buyItem(stage.getShop().getMpPotions().get(0), count, "low");
                                                    } else if (stageFloor == 3 && selectedPotion == 0) {
                                                        adventurer.buyItem(stage.getShop().getHpPotions().get(0), count, "low");
                                                    } else if (stageFloor == 3 && selectedPotion == 1) {
                                                        adventurer.buyItem(stage.getShop().getHpPotions().get(1), count, "mid");
                                                    } else if (stageFloor == 3 && selectedPotion == 2) {
                                                        adventurer.buyItem(stage.getShop().getMpPotions().get(0), count, "low");
                                                    } else if (stageFloor == 3 && selectedPotion == 3) {
                                                        adventurer.buyItem(stage.getShop().getMpPotions().get(1), count, "mid");
                                                    } else if (stageFloor >= 4 && selectedPotion == 0) {
                                                        adventurer.buyItem(stage.getShop().getMpPotions().get(0), count, "low");
                                                    } else if (stageFloor >= 4 && selectedPotion == 1) {
                                                        adventurer.buyItem(stage.getShop().getMpPotions().get(1), count, "mid");
                                                    } else if (stageFloor >= 4 && selectedPotion == 2) {
                                                        adventurer.buyItem(stage.getShop().getMpPotions().get(2), count, "high");
                                                    } else if (stageFloor >= 4 && selectedPotion == 3) {
                                                        adventurer.buyItem(stage.getShop().getMpPotions().get(0), count, "low");
                                                    } else if (stageFloor >= 4 && selectedPotion == 4) {
                                                        adventurer.buyItem(stage.getShop().getMpPotions().get(1), count, "mid");
                                                    } else if (stageFloor >= 4 && selectedPotion == 5) {
                                                        adventurer.buyItem(stage.getShop().getMpPotions().get(2), count, "high");
                                                    }
                                                    shopConsole.print(1);//구매 성공 메세지 출력
                                                }

                                            }
                                        }

                                    }
                                } else if (selectedItem.equals("0")) {//뒤로
                                    break;
                                } else {
                                    printWrongInputMessage();
                                    try {
                                        Thread.sleep(1500);
                                    } catch (InterruptedException e) {
                                        e.printStackTrace();
                                    }
                                }
                            }
                        } else if (shopAction.equals("2")) {//아이템 팔기
                            while (true) {
                                String selectedItem = shopConsole.output(scan, stage.getShop(), 6);//1. 무기, 2. 방어구, 3. 포션
                                if (selectedItem.equals("1")) {//무기 팔기
                                    while (true) {
                                        String selectedWeapon_ = shopConsole.output(scan, adventurer, 0);//무기 리스트
                                        if (selectedWeapon_.equals("0")) {
                                            break;
                                        }
                                        int selectedWeapon = 0;
                                        try {
                                            selectedWeapon = Integer.parseInt(selectedWeapon_) - 1;
                                        } catch (Exception e) {
                                            printSpace();
                                            printWrongInputMessage();
                                            try {
                                                Thread.sleep(1500);
                                            } catch (InterruptedException E) {
                                                E.printStackTrace();
                                            }
                                            continue;
                                        }

                                        if (selectedWeapon >= 0 && selectedWeapon < adventurer.getWeapons().size()) {
                                            shopConsole.print(2);//판매 성공 메세지 출력
                                            adventurer.setMoney(adventurer.getMoney() + adventurer.getWeapons().get(selectedWeapon).getPrice());//돈 추가
                                            adventurer.getWeapons().remove(selectedWeapon);//무기 인벤토리에서 판매한 무기 삭제
                                        }
                                    }
                                } else if (selectedItem.equals("2")) {//방어구 팔기
                                    while (true) {
                                        String selectedArmor_ = shopConsole.output(scan, adventurer, 1);//방어구 리스트
                                        if (selectedArmor_.equals("0")) {
                                            break;
                                        }
                                        int selectedArmor = 0;
                                        try {
                                            selectedArmor = Integer.parseInt(selectedArmor_) - 1;
                                        } catch (Exception e) {
                                            printSpace();
                                            printWrongInputMessage();
                                            try {
                                                Thread.sleep(1500);
                                            } catch (InterruptedException E) {
                                                E.printStackTrace();
                                            }
                                            continue;
                                        }

                                        if (selectedArmor >= 0 && selectedArmor < adventurer.getArmors().size()) {
                                            shopConsole.print(2);//판매 성공 메세지 출력
                                            adventurer.setMoney(adventurer.getMoney() + adventurer.getArmors().get(selectedArmor).getPrice());//돈 추가
                                            adventurer.getArmors().remove(selectedArmor);//무기 인벤토리에서 판매한 무기 삭제
                                        }
                                    }
                                } else if (selectedItem.equals("3")) {//포션 팔기
                                    while (true) {
                                        String selectedPotion_ = shopConsole.output(scan, adventurer, 2);
                                        if (selectedPotion_.equals("0")) {
                                            break;
                                        }
                                        int selectedPotion = 0;
                                        try {
                                            selectedPotion = Integer.parseInt(selectedPotion_);
                                        } catch (Exception e) {
                                            printSpace();
                                            printWrongInputMessage();
                                            try {
                                                Thread.sleep(1500);
                                            } catch (InterruptedException E) {
                                                E.printStackTrace();
                                            }
                                            continue;
                                        }
                                        if (selectedPotion <= 0 || selectedPotion > 6) {
                                            printSpace();
                                            printWrongInputMessage();
                                            try {
                                                Thread.sleep(1500);
                                            } catch (InterruptedException E) {
                                                E.printStackTrace();
                                            }
                                            continue;
                                        }

                                        while (true) {
                                            String count_ = shopConsole.output(scan, stage.getShop(), 5);
                                            if (count_.equals("0")) {
                                                break;
                                            }
                                            int count = 0;
                                            try {
                                                count = Integer.parseInt(count_);
                                            } catch (Exception e) {
                                                printSpace();
                                                printWrongInputMessage();
                                                try {
                                                    Thread.sleep(1500);
                                                } catch (InterruptedException E) {
                                                    E.printStackTrace();
                                                }
                                                continue;
                                            }
                                            switch (selectedPotion) {
                                                case 1://하급 hp포션
                                                    if (count > adventurer.getLowHpPotions().size()) {
                                                        shopConsole.print(3);
                                                        continue;
                                                    }
                                                    shopConsole.print(2);//판매 성공 메세지 출력
                                                    adventurer.setMoney(adventurer.getMoney() + count * lowHpPotion.getPrice());//판매한 포션 금액만큼 돈 추가
                                                    for (int i = 0; i < count; i++) {//count만큼 포션 리스트에서 포션 제거
                                                        adventurer.getLowHpPotions().remove(0);
                                                    }
                                                    break;
                                                case 2://중급 hp포션
                                                    if (count > adventurer.getMidHpPotions().size()) {
                                                        shopConsole.print(3);
                                                        continue;
                                                    }
                                                    shopConsole.print(2);//판매 성공 메세지 출력
                                                    adventurer.setMoney(adventurer.getMoney() + count * midHpPotion.getPrice());//판매한 포션 금액만큼 돈 추가
                                                    for (int i = 0; i < count; i++) {//count만큼 포션 리스트에서 포션 제거
                                                        adventurer.getMidHpPotions().remove(0);
                                                    }
                                                    break;
                                                case 3://상급 hp포션
                                                    if (count > adventurer.getHighHpPotions().size()) {
                                                        shopConsole.print(3);
                                                        continue;
                                                    }
                                                    shopConsole.print(2);//판매 성공 메세지 출력
                                                    adventurer.setMoney(adventurer.getMoney() + count * highHpPotion.getPrice());//판매한 포션 금액만큼 돈 추가
                                                    for (int i = 0; i < count; i++) {//count만큼 포션 리스트에서 포션 제거
                                                        adventurer.getHighHpPotions().remove(0);
                                                    }
                                                    break;
                                                case 4://하급 mp포션
                                                    if (count > adventurer.getLowMpPotions().size()) {
                                                        shopConsole.print(3);
                                                        continue;
                                                    }
                                                    shopConsole.print(2);//판매 성공 메세지 출력
                                                    adventurer.setMoney(adventurer.getMoney() + count * lowMpPotion.getPrice());//판매한 포션 금액만큼 돈 추가
                                                    for (int i = 0; i < count; i++) {//count만큼 포션 리스트에서 포션 제거
                                                        adventurer.getLowMpPotions().remove(0);
                                                    }
                                                    break;
                                                case 5://중급 mp포션
                                                    if (count > adventurer.getMidMpPotions().size()) {
                                                        shopConsole.print(3);
                                                        continue;
                                                    }
                                                    shopConsole.print(2);//판매 성공 메세지 출력
                                                    adventurer.setMoney(adventurer.getMoney() + count * midMpPotion.getPrice());//판매한 포션 금액만큼 돈 추가
                                                    for (int i = 0; i < count; i++) {//count만큼 포션 리스트에서 포션 제거
                                                        adventurer.getMidMpPotions().remove(0);
                                                    }
                                                    break;
                                                case 6://상급 mp포션
                                                    if (count > adventurer.getHighMpPotions().size()) {
                                                        shopConsole.print(3);
                                                        continue;
                                                    }
                                                    shopConsole.print(2);//판매 성공 메세지 출력
                                                    adventurer.setMoney(adventurer.getMoney() + count * highHpPotion.getPrice());//판매한 포션 금액만큼 돈 추가
                                                    for (int i = 0; i < count; i++) {//count만큼 포션 리스트에서 포션 제거
                                                        adventurer.getHighMpPotions().remove(0);
                                                    }
                                                    break;
                                            }
                                        }
                                    }
                                } else if (selectedItem.equals("0")) {
                                    break;
                                } else {
                                    printSpace();
                                    printWrongInputMessage();
                                    try {
                                        Thread.sleep(1500);
                                    } catch (InterruptedException e) {
                                        e.printStackTrace();
                                    }
                                }

                            }
                        } else if (shopAction.equals("0")) {
                            shopSound.finish();
                            break;
                        } else {
                            printSpace();
                            printWrongInputMessage();
                            try {
                                Thread.sleep(1500);
                            } catch (InterruptedException e) {
                                e.printStackTrace();
                            }
                        }
                    }
//----------------------------------------케릭터 정보 메뉴----------------------------------------------------
                } else if (characterAction.equals("5")) {//케릭터 정보
                    downtownSound.finish();
                    buffEffect.finish();
                    SoundThread characterInfoSound = new SoundThread("character_choice.mp3", true);
                    characterInfoSound.start();
                    characterInfoConsole.print(adventurer);//케릭터 정보 화면 출력
                    while (true) {
                        System.out.println("0. 뒤로");
                        System.out.println("");
                        System.out.print("취할 행동을 선택해주세요:");
                        String goback1 = scan.next();
                        if (goback1.equals("0")) {
                            characterInfoSound.finish();
                            break;
                        } else {
                            printWrongInputMessage();
                        }
                    }
//-----------------------------------------종료메뉴	---------------------------------
                } else if (characterAction.equals("0")) {//종료
                    downtownSound.finish();
                    buffEffect.finish();
                    Main.finishGame(scan);
                } else {
                    downtownSound.finish();
                    buffEffect.finish();
                    printSpace();
                    printWrongInputMessage();
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

