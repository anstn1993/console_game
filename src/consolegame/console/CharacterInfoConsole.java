package consolegame.console;

import consolegame.character.Adventurer;

public class CharacterInfoConsole {
    public void print(final Adventurer adventurer) {
        for (int i = 0; i < 60; i++) {
            System.out.println("");
        }
        System.out.println("==========================케릭터 정보 ==========================");
        System.out.println("이름: " + adventurer.getName());
        System.out.println("레벨: " + adventurer.getLevel());
        System.out.println("hp: " + (int) adventurer.getHp() + "/" + (int) adventurer.getMaxHp());
        System.out.println("mp: " + (int) adventurer.getMp() + "/" + (int) adventurer.getMaxMp());
        System.out.println("공격력: " + (int) adventurer.getStrength());
        System.out.println("방어력: " + (int) adventurer.getDefense());
        System.out.println("기본공격: " + adventurer.getDefaultAttackName());
        System.out.println("스킬1: " + adventurer.getSkill().getName() + "(숙련도: " + adventurer.getSkill().getLevel() + ")");
        System.out.println("스킬2: " + adventurer.getHyperSkill().getName() + "(숙련도: " + adventurer.getHyperSkill().getLevel() + ")");
        System.out.println("돈: " + adventurer.getMoney() + "원");
        System.out.println("경험치: " + adventurer.getExp() + "/" + adventurer.getMaxExp());
        System.out.println("무기: " + ((adventurer.getWeapon() != null) ? adventurer.getWeapon().getName() : "장착x"));
        System.out.println("방어구: " + ((adventurer.getArmor() != null) ? adventurer.getArmor().getName() : "장착x"));
        System.out.println("특수무기: " + ((adventurer.getSpecialWeapon() != null) ? adventurer.getSpecialWeapon().getName() : "장착x"));
        System.out.println("===========================================================");
    }
}
