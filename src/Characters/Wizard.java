package Characters;

import Characters.Interface.Mage;
import Equipments.Equipment;

import java.util.HashMap;

public class Wizard extends  Character implements Mage {
    public Wizard(int level, int hp, int mana, int def, int attack, int runSpeed, HashMap<PartType, Equipment> equipmentMap){
        super(level,hp,mana,def,attack,runSpeed,equipmentMap);
    }


    /** Skill that using to cast spell
     * @param skillName skill name to be cast
     * @param target enemy to attack
     * effects meteorShower  skill will be call"
     * effects comet skill  will be call
     * effects manaShield skill  will be call
     * */
    public void castSpell(String skillName , Character target) {
        if(skillName == "meteorShower") meteorShower(target);
        if(skillName == "comet") comet(target);
        if(skillName == "manaShield") manaShield();
    };

    /** Skill that using to increase mana
     * effects: Character mana increase
     */
    public void increaseMana(){
        mana+= 20;
    };

    /** Skill meteorShower that using to attack enemy
     * effects: enemy hp decrease
     * effects: Print "Casting MeteorShower!!!" in command line
     */
    public void meteorShower(Character target ){
        int trueDamage = this.level * 50;
        target.hp -= trueDamage;
        if(target.hp <= 0 ) target.hp = 0 ;
        System.out.println("Casting MeteorShower!!!");
    }

    /** Skill comet that using to attack enemy
     * effects: enemy hp decrease
     * effects: Print "Casting Comet!!!" in command line
     */
    public void comet(Character target){
        int trueDamage = this.level * 100;
        target.hp -= trueDamage;
        if(target.hp <= 0 ) target.hp = 0 ;
        System.out.println("Casting Comet!!!");
    }
    /** Skill that using to increase mana
     * effects: Character def increase
     * effects: Print "Casting ManaShield!!!" in command line
     */
    public void manaShield(){
        def += 20;
        System.out.println("Casting ManaShield!!!");
    }
}
