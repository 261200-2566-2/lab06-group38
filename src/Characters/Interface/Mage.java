package Characters.Interface;

import Characters.Character;

public interface Mage {
    public void increaseMana();
    public void castSpell(String skillName, Character c );
}
