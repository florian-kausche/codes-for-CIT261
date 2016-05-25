/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.darkdungeon.control;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author gregg
 */
public class BattleControlTest {
    
    public BattleControlTest() {
    }

    /**
     * Test of attack method, of class BattleControl.
     */
    @Test
    public void testAttack() {
        System.out.println("attack");
        /*******************************
         * Test case #1
         *******************************/
        System.out.println("\tTest case #1");
        int min = 35;
        int max = 35;
        int defense = 5;
        int health = 100;
        int expResult = 70;
        BattleControl test = new BattleControl();
        int result = test.attack(min, max, defense, health);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
        /*******************************
         * Test case #2
         *******************************/
        System.out.println("\tTest case #2");
        min = 10;
        max = 10;
        defense = 20;
        health = 40;
        expResult = 40;
        result = test.attack(min, max, defense, health);
        assertEquals(expResult, result);
        /*******************************
         * Test case #3
         *******************************/
        System.out.println("\tTest case #3");
        min = -5;
        max = -5;
        defense = 0;
        health = 40;
        expResult = -1;
        result = test.attack(min, max, defense, health);
        assertEquals(expResult, result);
        /*******************************
         * Test case #4
         *******************************/
        System.out.println("\tTest case #4");
        min = 40;
        max = 40;
        defense = 5;
        health = 5;
        expResult = 0;
        result = test.attack(min, max, defense, health);
        assertEquals(expResult, result);
        /*******************************
         * Test case #5
         *******************************/
        System.out.println("\tTest case #5");
        min = 50;
        max = 50;
        defense = 10;
        health = 40;
        expResult = 0;
        result = test.attack(min, max, defense, health);
        assertEquals(expResult, result);
        /*******************************
         * Test case #6
         *******************************/
        System.out.println("\tTest case #6");
        min = 10;
        max = 10;
        defense = 10;
        health = 200;
        expResult = 200;
        result = test.attack(min, max, defense, health);
        assertEquals(expResult, result);
        /*******************************
         * Test case #7
         *******************************/
        System.out.println("\tTest case #7");
        min = 1;
        max = 1;
        defense = 0;
        health = 1;
        expResult = 0;
        result = test.attack(min, max, defense, health);
        assertEquals(expResult, result);
    }

    /**
     * Test of random method, of class BattleControl.
     */
    @Test
    public void testRandom() {
        System.out.println("random");
        int min = 35;
        int max = 35;
        int expResult = 35;
        BattleControl test2 = new BattleControl();
        int result = test2.random(min, max);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
