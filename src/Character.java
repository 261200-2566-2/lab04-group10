import java.util.ArrayList;
import java.util.List;

public class Character implements RPGcharactor{
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
    private int xp = 0,max_xp = 1000;
    private List<Equipment> Equipments;//สร้าง list จองสวมใส่
    private List<Accessory> Accessorys;

    public Character(String name, String Job, int level, int Hp, int Atk, int Def, int mana,int runSpeed) {
        this.name = name;
        this.Job = Job;
        this.level = level;
        this.Hp = Hp;
        this.Atk = Atk;
        this.Def = Def;
        this.mana = mana;
        this.runSpeed = runSpeed;
        this.Equipments = new ArrayList<>();
        this.Accessorys = new ArrayList<>();
    }
    public void equipWeapon(List<Equipment> equipmentList) {//ใส่อุปกรณ์ตาม list
        for (Equipment equipment : equipmentList){
            if (equipment.getJob() == null || !equipment.getJob().equals(this.Job)) {
                System.out.println(this.name + " ใส่ " + equipment.getName() + " ไม่ได้");
            } else {
                this.Equipments.add(equipment);
                System.out.println(this.name + " ใส่ " + equipment.getName() + " ได้แบ้วเย้");
            }
        }
    }
    public void equipAccessory(List<Accessory> equipmentList) {
        for (Accessory equipment : equipmentList){
            this.Accessorys.add(equipment);
            System.out.println(this.name + " ใส่ " + equipment.getName() + " ได้แบ้วเย้");
        }
    }
    public void UpLevel(){
        this.max_xp = 1000*(level);
        while (this.xp >= this.max_xp){
            this.level++;
            this.xp = this.xp-this.max_xp;
            this.max_xp = 1000*(2*level);
        }
    }

    public int getHp(int level) {
        int accessoryHp = 0;
        if(Accessorys != null){
            accessoryHp += Accessorys.stream().mapToInt(Accessory::getHp).sum();
        }
        return Hp + (10 * level) + accessoryHp;
    }

    public int getLevel() {
        return level;
    }

    public int getDef(int level) {
        int accessoryDef = 0;
        if(Accessorys != null){
            accessoryDef += Accessorys.stream().mapToInt(Accessory::getDefense).sum();
        }
        if(Equipments != null){
            accessoryDef += Equipments.stream().mapToInt(Equipment::getDefense).sum();
        }
        return accessoryDef + (10 * level) + Def;
    }

    public int getAtk(int level) {
        int accessoryAtk = Equipments.stream().mapToInt(Equipment::getDamage).sum();
        return accessoryAtk + (10 * level) + Atk;
    }

    public int getMana(int level) {
        int accessoryMana = 0;
        if(Accessorys != null){
            accessoryMana += Accessorys.stream().mapToInt(Accessory::getMana).sum();
        }
        if(Equipments != null){
            accessoryMana += Equipments.stream().mapToInt(Equipment::getMana).sum();
        }
        return accessoryMana + (2 * level) + mana;
    }

    public int getRunSpeed(int level) {
        int Speedplus = 0;
        int accessorySpeed = 0;
        if(Accessorys != null){
            Speedplus += Accessorys.stream().mapToInt(Accessory::getSpeed).sum();
        }
        if(Equipments != null){
            accessorySpeed += Equipments.stream().mapToInt(Equipment::getSpeed).sum();
        }
        return (level) + Speedplus + runSpeed - (accessorySpeed);
    }

    public String getName() {
        return name;
    }

    public String getJob() {
        return Job;
    }

    public int getXp() {
        return xp;
    }

    public int getMax_xp() {
        return max_xp;
    }
    public void test_levelUp(int n){
        xp += n;
        UpLevel();
    }

    public static Character createCharacter(String name, String Job, int level, int Hp, int Atk, int Def, int mana, int runSpeed){
        return new Character(name,Job,level,Hp,Atk,Def,mana,runSpeed);
    }
}