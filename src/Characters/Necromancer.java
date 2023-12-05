package Characters;

import Characters.Interface.Mage;
import Equipments.Equipment;

import java.util.HashMap;
import java.util.Scanner;

public class Necromancer extends  Character implements Mage {
    String[] skillTree ;
    String[] minionTree ;
    public Necromancer(int level, int hp, int mana, int def, int attack, int runSpeed, HashMap<PartType, Equipment> equipmentMap){
        super(level,hp,mana,def,attack,runSpeed,equipmentMap);
        skillTree = new String[4];
        minionTree = new String[10];
    }

    /** Skill that using to cast spell
     * @param skillName to be cast
     * @param target enemy to attack
     * effects: Print "Enter the name of the minion to summon:"
     * effects: receive minion name input in command line
     * */
    public void castSpell(String skillName , Character target) {
        if(skillName == "summonMinion") {
            Scanner scanner = new Scanner(System.in);

            System.out.println("Enter the name of the minion to summon:");
            String minionName = scanner.nextLine();

            summonMinion(minionName);
            scanner.close();
        }
        if(skillName == "fireball") fireball();
        if(skillName == "iceBlast") iceBlast();
        if(skillName == "teleport") teleport();
    };

    /** Skill that using to increase mana
     * effects: Character mana increase
     */
    public void increaseMana(){
            mana +=  20;
    };

    /** Skill that using to summon minion*/
    public void summonMinion (String minionName ) {}

    /** Skill fireball to attack enemy*/
    public void fireball () {}
    /** Skill iceBlast to attack enemy*/
    public void iceBlast () {}
    /** Skill teleport to move to another location*/
    public void teleport () {}


}
