package Characters;

import Equipments.Equipment;

import java.util.HashMap;

public class Character {
    public enum PartType {
        WEAPON,
        SHIELD,
        HEAD,
        BODY,
        GLOVE,
        SHOES,
    }
    protected int level;
    protected int exp;
    protected int hp;
    protected int mana;
    protected int attack;
    protected int def;

    protected int runSpeed;
    protected boolean isAlive;

    protected HashMap<PartType,Equipment> equipmentMap ;

    public Character(int level, int hp, int mana, int def, int attack, int runSpeed,HashMap<PartType,Equipment> equipmentMap) {
        this.level = level;
        this.hp = hp;
        this.mana = mana;
        this.exp = 0;
        this.def = def;
        this.attack = attack;
        this.runSpeed = runSpeed;
        this.equipmentMap = equipmentMap;
        for (Equipment equipment : equipmentMap.values()) {
            this.equip(equipment.getType(),equipment);
        }
        this.isAlive =  true;
    }

    public int attack (Character c){
        int hpDecrease = this.attack - c.def;
        if(hpDecrease > 0 ) c.hp -= hpDecrease;
        else hpDecrease = 0;
        return hpDecrease;
    }


    public int levelUp(){
        hp += 10;
        mana += 10;
        return ++level;
    }
    public int getHp(){

        return hp;
    }
    public void setHp(int hp){
        this.hp = hp;
    }


    public int getMana(){

        return mana;
    }

    public int getExp(){

        return exp;
    }
    public void setExp(int exp){
         this.exp = exp;
         if(exp >= 100) {
             level++;
             exp = 0;
         }
    }
    public int getAttack(){

        return attack;
    }
    public int getDef(){

        return def;
    }
    public int getRunSpeed(){
        return runSpeed;
    }

    public void upgrade(PartType type){
        Equipment equipment =  equipmentMap.get(type);
        unequip(type,equipment);
        equipment.upgrade();
        equip(type,equipment);
    };


    public void unequip(PartType type , Equipment equipment) {
        int weight = equipment.getWeight();
        int[] stat = equipment.getStat();

        // Adjust run speed based on equipment weight
        if (weight <= 10) {
            runSpeed += 1;
        } else if (weight <= 20) {
            runSpeed += 2;
        } else if (weight <= 30) {
            runSpeed += 3;
        } else if (weight <= 40) {
            runSpeed += 4;
        } else if (weight <= 50) {
            runSpeed += 5;
        }

        hp -= stat[0];
        mana -= stat[1];
        attack -= stat[2];
        def -= stat[3];
        equipmentMap.put(type, null);
    }
    public void equip( PartType type , Equipment equipment) {
        int weight = equipment.getWeight();
        int[] stat = equipment.getStat();

        // Adjust run speed based on equipment weight
        if (weight <= 10) {
            runSpeed -= 1;
        } else if (weight <= 20) {
            runSpeed -= 2;
        } else if (weight <= 30) {
            runSpeed -= 3;
        } else if (weight <= 40) {
            runSpeed -= 4;
        } else if (weight <= 50) {
            runSpeed -= 5;
        } else {
            runSpeed = 1; // Reset run speed to 1 if weight exceeds 50
        }
        runSpeed += stat[4];
        // Ensure run speed doesn't go below 0
        if (runSpeed < 0) {
            runSpeed = 1;
        }

        // Store the equipment in the equipment map based on its type
        hp += stat[0];
        mana += stat[1];
        attack += stat[2];
        def += stat[3];
        equipmentMap.put(type, equipment);

    }
}