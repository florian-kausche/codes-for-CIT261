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
 * @author Greg K, Bill M, Florian K
 */
public class ItemControlTest {
    
    public ItemControlTest() {
    }

    /**
     * Test of useHeal method, of class ItemControl. ~~~~ done by Bill
     */
    @Test
    public void testUseHeal() {
        System.out.println("useHeal");
        /*************************************************
         * TEST CASE # 01
         *************************************************/
        System.out.println("\tTest Case 01");
        int health = 150;
        int itemAmount = 3;
        int healAmount = 30;
        int expResult = 180;
        ItemControl heal = new ItemControl(); 
        int result = heal.useHeal(health, itemAmount, healAmount);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        // fail("The test case is a prototype.");
        /*************************************************
         * TEST CASE # 02
         *************************************************/
        System.out.println("\tTest Case 02");
        health = 201;
        itemAmount = 3;
        healAmount = 30;
        expResult = -1; 
        result = heal.useHeal(health, itemAmount, healAmount);
        assertEquals(expResult, result);
        /*************************************************
         * TEST CASE # 03
         *************************************************/
        System.out.println("\tTest Case 03");
        health = -05;
        itemAmount = 3;
        healAmount = 10;
        expResult = -1; 
        result = heal.useHeal(health, itemAmount, healAmount);
        assertEquals(expResult, result);
         System.out.println("\tTest Case 04");
        /*************************************************
         * TEST CASE # 04
         *************************************************/
        health = 150;
        itemAmount = 0;
        healAmount = 30;
        expResult = 150; 
        result = heal.useHeal(health, itemAmount, healAmount);
        assertEquals(expResult, result);
         System.out.println("\tTest Case 05");
        /*************************************************
         * TEST CASE # 05
         *************************************************/
        health = 1;
        itemAmount = 3;
        healAmount = 10;
        expResult = 11; 
        result = heal.useHeal(health, itemAmount, healAmount);
        assertEquals(expResult, result);
         System.out.println("\tTest Case 06");
        /*************************************************
         * TEST CASE # 06
         *************************************************/
        health = 200;
        itemAmount = 3;
        healAmount = 30;
        expResult = 200; 
        result = heal.useHeal(health, itemAmount, healAmount);
        assertEquals(expResult, result);
         System.out.println("\tTest Case 07");
        /*************************************************
         * TEST CASE # 07
         *************************************************/
        health = 150;
        itemAmount = 1;
        healAmount = 50;
        expResult = 200; 
        result = heal.useHeal(health, itemAmount, healAmount);
        assertEquals(expResult, result);
    }
    
    
}
