/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.darkdungeon.model;

import java.io.Serializable;
import java.util.Objects;

/**
 *
 * @author Bill
 */
public class Monster implements Serializable {
    
    // class instance variables
    private String monsterName;
    private int health;
    private int minAttackDamage;
    private int maxAttackDamage;
    private int abilityDamage;

    public Monster() {
    }
    
    
    public String getMonsterName() {
        return monsterName;
    }

    public void setMonsterName(String monsterName) {
        this.monsterName = monsterName;
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

    public int getAbilityDamage() {
        return abilityDamage;
    }

    public void setAbilityDamage(int abilityDamage) {
        this.abilityDamage = abilityDamage;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 71 * hash + Objects.hashCode(this.monsterName);
        hash = 71 * hash + this.health;
        hash = 71 * hash + this.minAttackDamage;
        hash = 71 * hash + this.maxAttackDamage;
        hash = 71 * hash + this.abilityDamage;
        return hash;
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
        final Monster other = (Monster) obj;
        if (this.health != other.health) {
            return false;
        }
        if (this.minAttackDamage != other.minAttackDamage) {
            return false;
        }
        if (this.maxAttackDamage != other.maxAttackDamage) {
            return false;
        }
        if (this.abilityDamage != other.abilityDamage) {
            return false;
        }
        if (!Objects.equals(this.monsterName, other.monsterName)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Monster{" + "monsterName=" + monsterName + ", health=" + health + ", minAttackDamage=" + minAttackDamage + ", maxAttackDamage=" + maxAttackDamage + ", abilityDamage=" + abilityDamage + '}';
    }
    
    
    
    
}
