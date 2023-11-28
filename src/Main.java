import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        //สร้างอาชีพ knight และกำหนดค่า status เริ่มต้น
        Warrior warrior = new Warrior("สุดหล่อ", "Knight", 100, 100, 20, 15, 50, 50, 20);
        //สร้างอาวุธของอาชีพขึ้นมา
        Equipment sword = Weapon.createWeapon("ดาบโง่ๆ", "Knight", 2, 0, 10, 1);
        Equipment shield = Weapon.createWeapon("โล่กากๆ", "Knight", 0, 50000, 0, 5);
        List<Equipment> warriorEquipment = new ArrayList<>();//list ของสวมใส่
        warriorEquipment.add(sword);
        warriorEquipment.add(shield);
        warrior.equipAccessory(warriorEquipment);//ใส่ของสวมใส่ที่เก็บไว้ใน list

        System.out.println("-------------------------------------------");
        System.out.println("Warrior Stats:");
        System.out.println("-------------------------------------------");
        System.out.println("HP: " + warrior.getHp(warrior.getLevel()));
        System.out.println("ATK: " + warrior.getAtk(warrior.getLevel()));
        System.out.println("DEF: " + warrior.getDef(warrior.getLevel()));
        System.out.println("Mana: " + warrior.getMana(warrior.getLevel()));
        System.out.println("Run Speed: " + warrior.getRunSpeed(warrior.getLevel()));
        System.out.println("-------------------------------------------");

        Mage mage = new Mage("อุเกว","Mage",120,100,30,5,100,30,25);
        Equipment staff = Weapon.createWeapon("ก๋วยเตี๋ยว","Mage",5000,0,10000,2);
        List<Equipment> mageEquipment = new ArrayList<>();
        mageEquipment.add(staff);
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