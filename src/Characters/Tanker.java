package Characters;

import Characters.Interface.Fighter;
import Characters.Interface.Mage;
import Equipments.Equipment;

import java.util.HashMap;

public class Tanker extends Character implements Fighter {

    public Tanker(int level, int hp, int mana, int def, int attack, int runSpeed, HashMap<Character.PartType, Equipment> equipmentMap){
        super(level,hp,mana,def,attack,runSpeed,equipmentMap);
    }

    /**Increase Tanker attack
    *effects : Increase Attack for Tanker */
    public void boostAttack(){
        attack += 10;
    }
    /**Increase Tanker defend
     *effects : Increase Defend for Tanker */
    public void defend() {
        def += 20;
    }
}
