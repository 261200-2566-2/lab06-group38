package Equipments;

import Characters.Character;
import Equipments.Interface.Accessory;

import java.util.HashMap;
import java.util.Random;

public class Equipment implements Accessory {
    public static Equipment[] equipmentArray;

    protected  String name;
    protected  int level;

    protected  int weight;

    protected Character.PartType type;

    protected  int[] stat;

    public Equipment(String name, int level, int weight , int[]stat, Character.PartType type) {
        this.name = name;
        this.level = level;
        this.weight = weight;
        this.stat = stat;
        this.type = type;
    }

    public int getLevel() {
        return level;
    }
    public Character.PartType getType() {
        return type;
    }
    public int getWeight() {
        return weight;
    }
    public int[] getStat() {
        return stat;
    }
    public void upgrade() {
        this.level++;
    }

    /**Combine 2 Equipment and Return new Equipment
     @param eq1 Equipment1
     @param eq2 Equipment1
     @return random equipment after combine 2 equipment
     */
    public Equipment combine(Equipment eq1, Equipment eq2) {

        if (eq1 == null || eq2 == null || equipmentArray == null || equipmentArray.length == 0) {
            return null;
        }
        Random random = new Random();
        int randomIndex = random.nextInt(equipmentArray.length);
        return equipmentArray[randomIndex];
    }

    /**Combine 2 Equipment and Return new Equipment
     @param c Character that recycle
     @param type weapon location for recycle
     effects: character exp += 10
     effects: weapon location for character change to null
     */
    public void recycle(Character c , Character.PartType type) {
        HashMap<Character.PartType,Equipment> eqMap =  c.getEquipmentMap();
        Equipment equipment = eqMap.get(type);
        if(equipment != null) {
            int exp = c.getExp();
            c.setExp(exp+=10);
            eqMap.put(type, equipment);
        }
    }

}

