import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Character warrior = Character.createCharacter("ตัวตึง", "Warrior", 100, 100, 20, 10, 50, 5);
        Weapon sword = Weapon.createWeapon("ดาบโง่ๆ", "Warrior", 150000, 0, 0, 50);
        Weapon armor = Weapon.createWeapon("เกราะโนเกีย","Warrior",0,1000000,0,100);
        Accessoryy ring = Accessoryy.createAccessory("แหวน",500,500,500,500);
        warrior.UpLevel();
        List<Accessory> accessorieList = new ArrayList<>();
        List<Equipment> equipmentList = new ArrayList<>();
        equipmentList.add(sword);
        equipmentList.add(armor);
        accessorieList.add(ring);
        warrior.equipWeapon(equipmentList);
        System.out.println("--------------------------------------------------------");
        System.out.println("ชื่อ: " + warrior.getName());
        System.out.println("อาชีพ: " + warrior.getJob());
        System.out.println("Level: " + warrior.getLevel());
        System.out.println("HP: " + warrior.getHp(warrior.getLevel()));
        System.out.println("Attack: " + warrior.getAtk(warrior.getLevel()));
        System.out.println("Defense: " + warrior.getDef(warrior.getLevel()));
        System.out.println("Mana: " + warrior.getMana(warrior.getLevel()));
        System.out.println("Run Speed: " + warrior.getRunSpeed(warrior.getLevel()));
        System.out.println("Xp: " + warrior.getXp());
        System.out.println("Max xp: " + warrior.getMax_xp());
        System.out.println("--------------------------------------------------------");
        warrior.UpLevel();
        warrior.test_levelUp(500000);
        warrior.UpLevel();
        warrior.equipAccessory(accessorieList);
        System.out.println("LevelUp Test");
        System.out.println("--------------------------------------------------------");
        System.out.println("ชื่อ: " + warrior.getName());
        System.out.println("อาชีพ: " + warrior.getJob());
        System.out.println("Level: " + warrior.getLevel());
        System.out.println("HP: " + warrior.getHp(warrior.getLevel()));
        System.out.println("Attack: " + warrior.getAtk(warrior.getLevel()));
        System.out.println("Defense: " + warrior.getDef(warrior.getLevel()));
        System.out.println("Mana: " + warrior.getMana(warrior.getLevel()));
        System.out.println("Run Speed: " + warrior.getRunSpeed(warrior.getLevel()));
        System.out.println("Xp: " + warrior.getXp());
        System.out.println("Max xp: " + warrior.getMax_xp());
        System.out.println("--------------------------------------------------------");

        Character kiana = Character.createCharacter("Kiana herrscher of the void", "god", 2000, 500, 200, 100, 500, 10);
        Weapon kianagun = Weapon.createWeapon("Domain of the void","god",5000000,0,5000,500);
        Weapon kianaStigma = Weapon.createWeapon("Honkai queen","god",999999,999999,999999,0);

        List<Equipment> kianaEquipmentlist = new ArrayList<>();
        kianaEquipmentlist.add(kianaStigma);
        kianaEquipmentlist.add(kianagun);
        kiana.UpLevel();
        kiana.equipWeapon(kianaEquipmentlist);
        System.out.println("--------------------------------------------------------");
        System.out.println("ชื่อ: " + kiana.getName());
        System.out.println("อาชีพ: " + kiana.getJob());
        System.out.println("Level: " + kiana.getLevel());
        System.out.println("HP: " + kiana.getHp(kiana.getLevel()));
        System.out.println("Attack: " + kiana.getAtk(kiana.getLevel()));
        System.out.println("Defense: " + kiana.getDef(kiana.getLevel()));
        System.out.println("Mana: " + kiana.getMana(kiana.getLevel()));
        System.out.println("Run Speed: " + kiana.getRunSpeed(kiana.getLevel()));
        System.out.println("Xp: " + kiana.getXp());
        System.out.println("Max xp: " + kiana.getMax_xp());
        System.out.println("--------------------------------------------------------");






    }
}