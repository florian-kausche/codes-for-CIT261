/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.darkdungeon.control;

import jdk.internal.dynalink.DefaultBootstrapper;

/**
 *
 * @author Greg K, Bill M, Florian K
 */
// Added by Bill M
public class ItemControl {
    public static int useHeal (int health, int itemAmount, int healAmount) {
        if (health < 1 || health > 200) {return -1;}
        if (itemAmount<=0) {return health;}
        else if (health > (200-healAmount) || health > 200) {return health = 200;}
        else { health += healAmount; 
        return health;
        }
    }
   
    
}
