package Characters;

import Characters.Interface.Fighter;
import Equipments.Equipment;

import java.util.HashMap;

public class Swordman extends Character implements Fighter {
    public Swordman(int level, int hp, int mana, int def, int attack, int runSpeed, HashMap<PartType, Equipment> equipmentMap){
        super(level,hp,mana,def,attack,runSpeed,equipmentMap);
    }


    /**Increase Swordman attack
     *effects : Increase Attack for Swordman
     * */
    public void boostAttack(){
        attack += 10;
    }

    /**Increase Character defend
     *effects : Increase Defend for Swordman
     * */
    public void defend() {
        def += 10;
    }
}
