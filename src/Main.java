import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        player a = new player();
//        Scanner s = new Scanner(System.in);
//        System.out.println("Choose a character (Warrior/Mage): ");
//        String job = s.nextLine();
//        a.chooseCharacter(job);


        Warrior warrior = new Warrior("CC", "Knight");
        //สร้างอาวุธของอาชีพขึ้นมา
        Equipment sword = Weapon.createWeapon("EXTREMIN", "Knight", 2, 0, 10, 1);
        Equipment shield = Weapon.createWeapon("LEVIATAN", "Knight", 0, 50000, 0, 5);
        List<Equipment> warriorEquipment = new ArrayList<>();//list ของสวมใส่
        warriorEquipment.add(sword);
        warriorEquipment.add(shield);
        warrior.equipAccessory(warriorEquipment);//ใส่ของสวมใส่ที่เก็บไว้ใน list
        warrior.UpLevel();
        System.out.println("-------------------------------------------");
        System.out.println("Warrior Stats:");
        System.out.println("-------------------------------------------");
        System.out.println("HP: " + warrior.getHp(warrior.getLevel()));
        System.out.println("ATK: " + warrior.getAtk(warrior.getLevel()));
        System.out.println("DEF: " + warrior.getDef(warrior.getLevel()));
        System.out.println("Mana: " + warrior.getMana(warrior.getLevel()));
        System.out.println("Run Speed: " + warrior.getRunSpeed(warrior.getLevel()));
        System.out.println("-------------------------------------------");

        Mage mage = new Mage("PP","Mage");
        Equipment wand = Weapon.createWeapon("CLIGATIAN","Mage",1000,500,10000,2);
        List<Equipment> mageEquipment = new ArrayList<>();
        mageEquipment.add(wand);
        mage.equipAccessory(mageEquipment);
        System.out.println("-------------------------------------------");
        System.out.println("Mage Stats:");
        System.out.println("-------------------------------------------");
        System.out.println("HP: " + mage.getHp(mage.getLevel()));
        System.out.println("ATK: " + mage.getAtk(mage.getLevel()));
        System.out.println("DEF: " + mage.getDef(mage.getLevel()));
        System.out.println("Mana: " + mage.getMana(mage.getLevel()));
        System.out.println("Run Speed: " + mage.getRunSpeed(mage.getLevel()));
        System.out.println("-------------------------------------------");
    }
}