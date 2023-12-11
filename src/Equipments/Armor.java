package Equipments;

import Equipments.Interface.Accessory;
import Characters.Character;
class Armor extends Equipment  {


    public Armor(String name, int level, int weight, int[]stat, Character.PartType type) {
        super(name,level,weight,stat , type);
    }

    /** Upgrade Armor
     * effects: armor that using this function level += 1
     * effects: armor that using this function weight -= 3
     * effects: armor that using this function stat[0] || hp   += 20
     * effects: armor that using this function stat[1] | mana   += 20
     * effects: armor that using this function stat[3] | defend += 4
      */

    public void upgrade() {
        this.level++;
        this.weight -= 3;
        if(weight <= 0 ) weight = 0;
        this.stat[0] += 20;
        this.stat[1] += 20;
        this.stat[3] += 4;
    }


}
