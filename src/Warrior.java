import java.util.ArrayList;
import java.util.List;

public class Warrior {
    //สร้างคลาสแล้วใส่ว่าจะให้คลาสนี้มีค่าอะไรบ้าง
    private String name;
    private String Job;
    private int level;
    private int Hp;
    private int Atk;
    private int Def;
    private int mana;
    private int stamina;
    private int runSpeed;
    private List<Equipment> Equipments;//สร้าง list จองสวมใส่

    public Warrior(String name, String Job, int level, int Hp, int Atk, int Def, int mana, int stamina, int runSpeed) {
        this.name = name;
        this.Job = Job;
        this.level = level;
        this.Hp = Hp;
        this.Atk = Atk;
        this.Def = Def;
        this.mana = mana;
        this.stamina = stamina;
        this.runSpeed = runSpeed;
        this.Equipments = new ArrayList<>();
    }
    public void equipAccessory(List<Equipment> equipmentList) {//ใส่อุปกรณ์ตาม list
        for (Equipment equipment : equipmentList) {
            if (equipment.getJob() == null || !equipment.getJob().equals(this.Job)) {
                System.out.println(this.name + " ใส่ " + equipment.getName() + " ไม่ได้");
            } else {
                this.Equipments.add(equipment);
                System.out.println(this.name + " ใส่ " + equipment.getName() + " ได้แบ้วเย้");
            }
        }
    }

    public int getHp(int level) {
        return Hp + (10 * level);
    }

    public int getLevel() {
        return level;
    }

    public int getDef(int level) {
        int accessoryDef = Equipments.stream().mapToInt(Equipment::getDefense).sum();
        return accessoryDef + (10 * level) + Def;
    }

    public int getAtk(int level) {
        int accessoryAtk = Equipments.stream().mapToInt(Equipment::getDamage).sum();
        return accessoryAtk + (10 * level) + Atk;
    }

    public int getMana(int level) {
        int accessoryMana = Equipments.stream().mapToInt(Equipment::getMana).sum();
        return accessoryMana + (2 * level) + mana;
    }

    public int getRunSpeed(int level) {
        int accessorySpeed = Equipments.stream().mapToInt(Equipment::getSpeed).sum();
        return (level) + runSpeed - (accessorySpeed);
    }
}
