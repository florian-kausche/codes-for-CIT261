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
 * @author Bill
 */
public class ItemControlTest {
    
    public ItemControlTest() {
    }

    /**
     * Test of useHeal method, of class ItemControl.
     */
    @Test
    public void testUseHeal() {
        System.out.println("useHeal");
        System.out.println("Test Case 01");
        /*************************************************
         * TEST CASE # 01
         *************************************************/
        int health = 150;
        int itemAmount = 3;
        int healAmount = 30;
        int expResult = 180;
        ItemControl heal = new ItemControl(); 
        int result = heal.useHeal(health, itemAmount, healAmount);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        // fail("The test case is a prototype.");
        System.out.println("Test Case 02");
        /*************************************************
         * TEST CASE # 02
         *************************************************/
        health = 201;
        itemAmount = 3;
        healAmount = 30;
        expResult = -1; 
        result = heal.useHeal(health, itemAmount, healAmount);
        assertEquals(expResult, result);
         System.out.println("Test Case 03");
        /*************************************************
         * TEST CASE # 03
         *************************************************/
        health = -05;
        itemAmount = 3;
        healAmount = 10;
        expResult = -1; 
        result = heal.useHeal(health, itemAmount, healAmount);
        assertEquals(expResult, result);
         System.out.println("Test Case 04");
        /*************************************************
         * TEST CASE # 04
         *************************************************/
        health = 150;
        itemAmount = 0;
        healAmount = 30;
        expResult = 150; 
        result = heal.useHeal(health, itemAmount, healAmount);
        assertEquals(expResult, result);
         System.out.println("Test Case 05");
        /*************************************************
         * TEST CASE # 05
         *************************************************/
        health = 1;
        itemAmount = 3;
        healAmount = 10;
        expResult = 11; 
        result = heal.useHeal(health, itemAmount, healAmount);
        assertEquals(expResult, result);
         System.out.println("Test Case 06");
        /*************************************************
         * TEST CASE # 06
         *************************************************/
        health = 200;
        itemAmount = 3;
        healAmount = 30;
        expResult = 200; 
        result = heal.useHeal(health, itemAmount, healAmount);
        assertEquals(expResult, result);
         System.out.println("Test Case 07");
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
