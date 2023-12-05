package Equipments;

import Characters.Character;
import Equipments.Equipment;

public class Sword extends Equipment {

    public Sword(String name, int level, int weight, int[]stat, Character.PartType type) {
        super(name,level,weight,stat,type);
    }


    /** Upgrade Sword
     * effects: Sword that using this function level += 1
     * effects: Sword that using this function weight -= 2
     * effects: Sword that using this function stat[0] || hp   += 5
     * effects: Sword that using this function stat[1] | mana   += 5
     * effects: Sword that using this function stat[2] | attack += 10
     */
    public void upgrade() {
        this.level++;
        this.weight -= 2;
        if(weight <= 0 ) weight = 1;
        this.stat[0] += 5;
        this.stat[1] += 5;
        this.stat[2] += 10;
    }
}
