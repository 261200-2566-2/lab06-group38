package Equipments;

import Characters.Character;
import Equipments.Equipment;

public class Shield extends Equipment {

    public Shield(String name, int level, int weight, int[]stat, Character.PartType type) {
        super(name,level,weight,stat,type);
    }
    /** Upgrade Shield
     * effects: Shield that using this function level += 1
     * effects: Shield that using this function weight -= 3
     * effects: Shield that using this function stat[0] || hp   += 10
     * effects: Shield that using this function stat[1] | mana   += 10
     * effects: Shield that using this function stat[3] | defend += 2
     */
    public void upgrade() {
        this.level++;
        this.weight -= 3;
        this.stat[0] += 10;
        this.stat[1] += 10;
        this.stat[3] += 2;
    }
}
