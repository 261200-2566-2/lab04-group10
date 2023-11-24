import java.util.List;

public class Warrior {
    private String name;
    private String Job;
    private int level;
    private int Hp;
    private int Atk;
    private int Def;
    private int mana;
    private int stamina;
    private int runSpeed;
    private List<Equipment> Equipments;

    public Warrior(String name,String Job,int level,int Hp,int Atk,int Def,int mana,int stamina,int runSpeed){
        this.name = name;
        this.Job = Job;
        this.level = level;
        this.Hp = Hp;
        this.Atk = Atk;
        this.Def = Def;
        this.mana = mana;
        this.stamina = stamina;
        this.runSpeed = runSpeed;
    }
    public void equipAccessory(Equipment equipment) {
        if(equipment.getJob() != null || !equipment.getJob().contains(this.Job)){
            System.out.println(this.name + " ใส่ไม่ได้ " + equipment.getName());
            return;
        }
        this.Equipments.add(equipment);
        System.out.println(this.name + " ใส่ได้แบ้วเย้ " + equipment.getName());
    }
    public int getDef(int level,Equipment equipment){
        int accessoryDef = Equipments.stream().mapToInt(Equipment::getDefense).sum();
        return accessoryDef + (10*level) + Def;
    }
    public int getAtk(int level,Equipment equipment){
        int accessoryAtk = Equipments.stream().mapToInt(Equipment::getDamage).sum();
        return accessoryAtk + (10*level) + Atk;
    }
    public int getMana(int level,Equipment equipment){
        int accessoryMana = Equipments.stream().mapToInt(Equipment::getMana).sum();
        return accessoryMana + (2*level) + mana;
    }
    public int getRunSpeed(int level,Equipment equipment){
        int accessorySpeed = Equipments.stream().mapToInt(Equipment::getSpeed).sum();
        return  (10*level) + runSpeed - accessorySpeed;
    }
}
