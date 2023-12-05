import Characters.Archer;
import Characters.Character;
import Characters.Swordman;
import Characters.Wizard;
import Equipments.Equipment;
import Equipments.Sword;

import java.util.HashMap;

public class Lab05 {
    public static void main(String[] args) {
        HashMap<Character.PartType,Equipment> equipmentMap = new HashMap<Character.PartType, Equipment>();

        Character dummy = new Character(1, 10000, 0, 0, 0,0,equipmentMap);
        // Testing Class that implement ranger interface
        Archer archer = new Archer(1, 100, 100, 5, 10,5,equipmentMap);
        archer.doubleShot(dummy);
        System.out.println("Dummy Hp after hit by double shot = " + dummy.getHp());
        archer.increaseSpeed();
        System.out.println("Archer runSpeed after using double shot = " + archer.getRunSpeed());


        //Reset Dummy Health to 100
        dummy.setHp(100);
        System.out.println("-----------------------------------------------------------------------------------------");


        // Testing Class that implement ranger interface
        Wizard wizard = new Wizard(1, 100, 100, 5, 10,5,equipmentMap);


        //Casting MeteorShower to archer character
        wizard.castSpell("meteorShower" , dummy);
        System.out.println("Dummy HP After hit by MeteorShower " + dummy.getHp());

        //Casting Comet to archer character
        wizard.castSpell("comet" , dummy);
        System.out.println("Dummy HP After hit by Comet " + dummy.getHp());

        //Casting ManaShield
        wizard.castSpell("manaShield", null);
        System.out.println("Wizard Defend after using ManaShield = " + wizard.getDef());

        //Casting IncreaseMana
        wizard.increaseMana();
        System.out.println("Wizard RunSpeed after using Increase Mana = " + wizard.getMana());


        //Reset Dummy Health to 100
        dummy.setHp(100);
        System.out.println("-----------------------------------------------------------------------------------------");

        // Testing Class that implement ranger interface
        Swordman swordman = new Swordman(1, 100, 100, 5, 10,5,equipmentMap);
        swordman.boostAttack();
        System.out.println("Swordman attack after using boost attack = " + swordman.getAttack());
        swordman.defend();
        System.out.println("Swordman runSpeed after using defend = " + swordman.getDef());


    }
}