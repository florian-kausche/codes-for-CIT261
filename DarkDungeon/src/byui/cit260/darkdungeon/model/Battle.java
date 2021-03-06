/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.darkdungeon.model;

import java.io.IOException;
import java.io.Serializable;
import java.util.Objects;
import java.util.Scanner;

/**
 *
 * @author Bill
 */
public class Battle implements Serializable {
    
    //class instance variables
    private Boolean isAlive;

    public Battle() {
    }
        
    public Boolean getIsAlive() {
        return isAlive;
    }

    public void setIsAlive(Boolean isAlive) {
        this.isAlive = isAlive;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 79 * hash + Objects.hashCode(this.isAlive);
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
        final Battle other = (Battle) obj;
        if (!Objects.equals(this.isAlive, other.isAlive)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Battle{" + "isAlive=" + isAlive + '}';
    }
    
    public void battleStart(Player player, Item item, CharacterSelection character, Monster monster) {  
        Monster.newMonsterInstance();
        Scanner input = new Scanner(System.in);
        System.out.println(player.getName() + " has encountered a " + monster.getMonsterName()+ "\n");
        System.out.println("You intiate the Battle with " +monster.getMonsterName() + "(" + character.getStatus() + " / "
                + monster.getStatus() + ")");
        
        while (character.isAlive() && monster.isAlive()) {
            System.out.print("Attack (a) \nHeal (h) \nRun (r) \n");
            String action = input.nextLine();
            if (action.equals("h")) {
                //character.heal();
                if (item.getItemAmount()>0){System.out.println("*  You have used a potion  *\n");System.out.println("  `  `  \\ \\(`^')/ /  '  '\n");}
                int potionAmount = character.heal(item.getItemAmount(),item.getItemHeal());
                item.setItemAmount(potionAmount);
                System.out.println("*  You have " + item.getItemAmount() + " potions left.  *\n");
            } 
            else if (action.equals("a")) {
                monster.defend(character);
            }
            else if(action.equals("r")) {
                System.out.println("\tYou run away from the " + monster.getMonsterName() + "!");
                break;
            }
            else {System.out.println("\tInvalid command!");
            }
            if (monster.isAlive()) {
                character.defend(monster);
            }
            
            else {System.out.println("\tInvalid command!");
            }
            System.out.println("(" + character.getStatus() + " / " + monster.getStatus() + ")");
        }
    }
}
