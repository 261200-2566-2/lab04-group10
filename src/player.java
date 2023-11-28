//import java.util.ArrayList;
//import java.util.List;
//import java.util.Scanner;
//
//public class  player {
//    public void chooseCharacter (String input) {
//        Scanner s = new Scanner(System.in);
//        if (input.equals("Warrior")) {
//            System.out.println("What's your name?");
//            String name = s.nextLine();
//            Warrior warrior = new Warrior(name,"Warrior");
//            System.out.println("Do you want use weapon? [Y/N]");
//            String Ans = s.nextLine();
//            if(Ans.equals("Y")){
//                System.out.println("pls create your weapon...[Name]");
//                String name1 = s.nextLine();
//                System.out.println("what's AtkUp....[number]");
//                int atkUp1 = s.nextInt();
//                System.out.println("what's DefUp....[number]");
//                int defUp1 = s.nextInt();
//                System.out.println("what's Max_manaUp....[number]");
//                int manaUp1 = s.nextInt();
//                System.out.println("How much do you want to downSpeed? [number]");
//                int downSpeed1 = s.nextInt();
//                Equipment weaponFirst = Weapon.createWeapon(name1,"Warrior",atkUp1,defUp1,manaUp1,downSpeed1);
//                System.out.println("Do you want create weapon more? [Y/N]");
//                String ans = s.nextLine();
//                if(ans.equals("Y")){
//                    System.out.println("pls create your weapon...[Name]");
//                    String name2 = s.nextLine();
//                    System.out.println("what's AtkUp....[number]");
//                    int atkUp2 = s.nextInt();
//                    System.out.println("what's DefUp....[number]");
//                    int defUp2 = s.nextInt();
//                    System.out.println("what's Max_manaUp....[number]");
//                    int manaUp2 = s.nextInt();
//                    System.out.println("How much do you want to downSpeed? [number]");
//                    int downSpeed2 = s.nextInt();
//                    Equipment weaponSecond = Weapon.createWeapon(name2,"Warrior",atkUp2,defUp2,manaUp2,downSpeed2);
//                    List<Equipment> warriorEquipment = new ArrayList<>();
//                    warriorEquipment.add(weaponFirst);
//                    warriorEquipment.add(weaponSecond);
//                    warrior.equipAccessory(warriorEquipment);
//                    warrior.display(name,"Worrior");
//                }else if(Ans.equals(("N"))) {
//                    List<Equipment> warriorEquipment = new ArrayList<>();
//                    warriorEquipment.add(weaponFirst);
//                    warrior.equipAccessory(warriorEquipment);
//                    warrior.display(name,"Worrior");
//                }
//            }else if(Ans.equals(("N"))){
//                warrior.display(name,"Worrior");
//            }
//        } else if (input.equals("Mage")) {
//            System.out.println("What's your name?");
//            String name = s.nextLine();
//            Mage mage = new Mage(name,"Mage");
//            System.out.println("Do you want use weapon? [Y/N]");
//            String Ans = s.nextLine();
//            if(Ans.equals("Y")){
//                System.out.println("pls create your weapon...[Name]");
//                String name1 = s.nextLine();
//                System.out.println("what's AtkUp....[number]");
//                int atkUp1 = s.nextInt();
//                System.out.println("what's DefUp....[number]");
//                int defUp1 = s.nextInt();
//                System.out.println("what's Max_manaUp....[number]");
//                int manaUp1 = s.nextInt();
//                System.out.println("How much do you want to downSpeed? [number]");
//                int downSpeed1 = s.nextInt();
//                Equipment weaponFirst = Weapon.createWeapon(name1,"Mage",atkUp1,defUp1,manaUp1,downSpeed1);
//                System.out.println("Do you want create weapon more? [Y/N]");
//                String ans = s.nextLine();
//                if(ans.equals("Y")){
//                    System.out.println("pls create your weapon...[Name]");
//                    String name2 = s.nextLine();
//                    System.out.println("what's AtkUp....[number]");
//                    int atkUp2 = s.nextInt();
//                    System.out.println("what's DefUp....[number]");
//                    int defUp2 = s.nextInt();
//                    System.out.println("what's Max_manaUp....[number]");
//                    int manaUp2 = s.nextInt();
//                    System.out.println("How much do you want to downSpeed? [number]");
//                    int downSpeed2 = s.nextInt();
//                    Equipment weaponSecond = Weapon.createWeapon(name2,"Mage",atkUp2,defUp2,manaUp2,downSpeed2);
//                    List<Equipment> mageEquipment = new ArrayList<>();
//                    mageEquipment.add(weaponFirst);
//                    mageEquipment.add(weaponSecond);
//                    mage.equipAccessory(mageEquipment);
//                    mage.display(name,"Mage");
//                }else if(Ans.equals(("N"))) {
//                    List<Equipment> mageEquipment = new ArrayList<>();
//                    mageEquipment.add(weaponFirst);
//                    mage.equipAccessory(mageEquipment);
//                    mage.display(name,"Mage");
//                }
//            }else if(Ans.equals(("N"))){
//                mage.display(name,"Mage");
//            }
//        }
//        s.close();
//    }
//}
