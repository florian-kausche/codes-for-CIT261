/*
 *  Dark Dungeon game
 */
package byui.cit260.darkdungeon.model;

import java.io.Serializable;
import java.util.Objects;

/**
 * @authors Greg Kenar, William Murray, Florian Kausche
 * CIT 260  First Assignment
 */

public class CharacterSelection implements Serializable {
    private String characterClass;
    private int health;
    private int minAttackDamage;
    private int maxAttackDamage;
    private int defenseAmount;
    private int manaAmount;
    private int abilityDamage;
    private int elementalDamage;

    public CharacterSelection() {
    }

    public CharacterSelection(String characterClass, int health, int minAttackDamage, int maxAttackDamage, int defenseAmount, int manaAmount, int abilityDamage, int elementalDamage) {
        this.characterClass = characterClass;
        this.health = health;
        this.minAttackDamage = minAttackDamage;
        this.maxAttackDamage = maxAttackDamage;
        this.defenseAmount = defenseAmount;
        this.manaAmount = manaAmount;
        this.abilityDamage = abilityDamage;
        this.elementalDamage = elementalDamage;
    }
    
    public String getCharacterClass() {
        return characterClass;
    }

    public void setCharacterClass(String characterClass) {
        this.characterClass = characterClass;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getMinAttackDamage() {
        return minAttackDamage;
    }

    public void setMinAttackDamage(int minAttackDamage) {
        this.minAttackDamage = minAttackDamage;
    }

    public int getMaxAttackDamage() {
        return maxAttackDamage;
    }

    public void setMaxAttackDamage(int maxAttackDamage) {
        this.maxAttackDamage = maxAttackDamage;
    }

    public int getDefenseAmount() {
        return defenseAmount;
    }

    public void setDefenseAmount(int defenseAmount) {
        this.defenseAmount = defenseAmount;
    }

    public int getManaAmount() {
        return manaAmount;
    }

    public void setManaAmount(int manaAmount) {
        this.manaAmount = manaAmount;
    }

    public int getAbilityDamage() {
        return abilityDamage;
    }

    public void setAbilityDamage(int abilityDamage) {
        this.abilityDamage = abilityDamage;
    }

    public int getElementalDamage() {
        return elementalDamage;
    }

    public void setElementalDamage(int elementalDamage) {
        this.elementalDamage = elementalDamage;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 37 * hash + Objects.hashCode(this.characterClass);
        hash = 37 * hash + this.health;
        hash = 37 * hash + this.minAttackDamage;
        hash = 37 * hash + this.maxAttackDamage;
        hash = 37 * hash + this.defenseAmount;
        hash = 37 * hash + this.manaAmount;
        hash = 37 * hash + this.abilityDamage;
        hash = 37 * hash + this.elementalDamage;
        return hash;
    }

    @Override
    public String toString() {
        return "Character{" + "characterClass=" + characterClass + ", health=" + health + ", minAttackDamage=" + minAttackDamage + ", maxAttackDamage=" + maxAttackDamage + ", defenseAmount=" + defenseAmount + ", manaAmount=" + manaAmount + ", abilityDamage=" + abilityDamage + ", elementalDamage=" + elementalDamage + '}';
    }
    
    

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final CharacterSelection other = (CharacterSelection) obj;
        if (this.health != other.health) {
            return false;
        }
        if (this.minAttackDamage != other.minAttackDamage) {
            return false;
        }
        if (this.maxAttackDamage != other.maxAttackDamage) {
            return false;
        }
        if (this.defenseAmount != other.defenseAmount) {
            return false;
        }
        if (this.manaAmount != other.manaAmount) {
            return false;
        }
        if (this.abilityDamage != other.abilityDamage) {
            return false;
        }
        if (this.elementalDamage != other.elementalDamage) {
            return false;
        }
        if (!Objects.equals(this.characterClass, other.characterClass)) {
            return false;
        }
        return true;
    }
    
    
    
    
    
}

