/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.darkdungeon.control;

import java.util.Random;


/**
 *
 * @author Greg K, Bill M, Florian K
 */
// Added by the team
public class BattleControl {
    public static int attack(int min, int max, int defense, int health) {
        if (min > max) {return -1;}
        int power = random(min, max);
        
        if (power < 0 || power > 50) {return -1;}
        if (power > (health+defense)) {
            return 0;
        }
        else if (power<defense) {
            return health;
        }
        else {
        health = (defense + health) - power;   

        return health;
        }
    }

    //Added by Greg
    public static int random(int min, int max) {
        if (min > max) {return -1;}
        if ((min < 0 || min > 200) || (max < 0 || max > 200)) {return -1;}
        Random rand = new Random();
        int randomNum = rand.nextInt((max - min) + 1) + min;
        
        return randomNum;
    }
     //added by Greg
    public static int superAttack(int health, int defense, int damageAmount) {
        if (health < 1) {return -1;} 
        if (damageAmount < 5 || damageAmount > 100) {return -1;}
        if (damageAmount >= (health+defense)) { return 0;}
        else if (damageAmount<defense) {return health;}
        else {health -= (damageAmount-defense);}
        return health;
    }
    public static boolean flee(int min, int max) {
        if (min > max) {return Boolean.FALSE;}
        if ((min < 0 || min > 10) || (max < 0 || max > 10)) {return Boolean.FALSE;}
        int value = random(min, max);
        if (value>= 3) {return Boolean.TRUE;}
        else {return Boolean.TRUE;}
    }
}
