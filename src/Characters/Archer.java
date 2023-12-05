package Characters;

import Characters.Interface.Ranger;
import Equipments.Equipment;

import java.util.HashMap;

public class Archer extends  Character implements Ranger {

    public Archer(int level, int hp, int mana, int def, int attack, int runSpeed, HashMap<PartType, Equipment> equipmentMap){
        super(level,hp,mana,def,attack,runSpeed,equipmentMap);
    }

   /** Skill that using to attack enemy
   * @param target enemy to attack
   * effects: enemy hp will decrease
   * */
    public void doubleShot(Character target){
        int damage = attack * 2 ;
        target.hp -= damage;
        if(target.getHp() <= 0 ) target.hp = 0;
    };

    /** Skill that using to increase run speed
     * effects: Character run speed increased
     * */
    public void increaseSpeed(){
        runSpeed += 10;
    }
}
