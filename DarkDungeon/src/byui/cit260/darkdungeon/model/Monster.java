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
    private int defense;
    private int minAttackDamage;
    private int maxAttackDamage;
    private int abilityDamage;

    public Monster() {
    }

    public Monster(String monsterName, int health, int defense, int minAttackDamage, int maxAttackDamage, int abilityDamage) {
        this.monsterName = monsterName;
        this.health = health;
        this.defense = defense;
        this.minAttackDamage = minAttackDamage;
        this.maxAttackDamage = maxAttackDamage;
        this.abilityDamage = abilityDamage;
    }
    
    public static Monster newMonsterInstance() {
        return new Monster("Dragon",70,2,2,2,2);
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

    public int getDefense() {
        return defense;
    }

    public void setDefense(int defense) {
        this.defense = defense;
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
        hash = 71 * hash + this.defense;
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
        if (this.defense != other.defense) {
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
        return "Monster{" + "monsterName=" + monsterName + ", health=" + health + ", defense=" + defense + ", minAttackDamage=" + minAttackDamage + ", maxAttackDamage=" + maxAttackDamage + ", abilityDamage=" + abilityDamage + '}';
    }
    
    public int attack() {
        return Game.rand(minAttackDamage, maxAttackDamage);
    }
    public boolean isAlive() {
        return health > 0;
    }
    
    public String getStatus() {
        return "Monster HP: " + health;
    }
    public void defend(CharacterSelection character) {
        int attackStrength = character.attack();
        if (attackStrength>defense) {
            health = (health > attackStrength) ? health - attackStrength : 0;
            System.out.println(character.getCharacterName()+ " hits "+getMonsterName()+" for "+attackStrength+" HP of damage \n");
            if (health == 0) {
                System.out.println("\t" + character + " transforms the skull of " + getMonsterName()
                        + " into dust to never be seen again");
            }
        }
        else {
            System.out.println("You must be getting tired, your attack missed!! ");
        }
    }
    
    
}
