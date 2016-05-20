/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.darkdungeon.model;

import java.io.IOException;
import java.util.Random;
import java.util.Scanner;
/**
 *
 * @author gregg
 */
public class Game {
    // added for global random generation
    public static int rand(int min, int max) {
        Random rand = new Random();
        int randomNum = rand.nextInt((max - min) + 1) + min;
        return randomNum;
    }
    
    public void enter() {
        Scanner nScan = new Scanner(System.in);
        CharacterSelection warrior = new CharacterSelection();
        Monster monster = new Monster();
        Battle game = new Battle();
        System.out.println("You are in a new game");
        String name;
        // Banner will go here


        // Back story will go here


        // Banner goes here
        System.out.println("\n**************************************"  
                                                +"********************");
        System.out.println("\tWelcome to The Dark Dungeon");
        System.out.println("**************************************"
                                                +"********************/n");	


        // Choose your character starts here than adds in Character class we need 4-5 chars
        System.out.println("\tPlease choose your characters name.");
        name = nScan.nextLine();

        System.out.println("\tPlease choose a character");
        System.out.println("\t1. Warrior");
        System.out.println("\t2. Paladin");
        String input = nScan.nextLine();
        // If statement for each character goes here 
        if(input.equals("1")) {
            warrior = CharacterSelection.warriorCreate(name);
        }
        else if (input.equals("2")) {
            warrior = CharacterSelection.paladinCreate(name);
        }
        System.out.println("You have chosen a " + warrior.getCharacterName() +" "+ warrior.getCharacterClass());
        monster = Monster.newMonsterInstance();
        game.battleStart(warrior, monster);
        
                
                
        				
        System.out.println("\n**************************************"  
                                                +"********************");
        System.out.println("\t # THANKS FOR PLAYING!!  #");
        System.out.println("**************************************"
                                                +"********************/n");
    }
}

