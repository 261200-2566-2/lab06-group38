package Equipments.Interface;

import Characters.Character;
import Equipments.Equipment;

public interface Accessory {
    public void upgrade();
    public Equipment combine(Equipment eq1, Equipment eq2);
    public void recycle(Character c);
}
