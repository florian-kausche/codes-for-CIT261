/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.darkdungeon.model;


import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author gregg
 */
public class Game {
    int test = 3; 

    
    
    public void setTest(int test) {
        this.test = test;
    }
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
        boolean run = Boolean.TRUE;
        Player playerOne = new Player();
        Item potion = new Item("A devine glow covers your body", 0,25,3);
        
        // Banner will go here


        // Back story will go here


        // Banner goes here
        System.out.println("\n**************************************"  
                                                +"********************");
        System.out.println("\tWelcome to The Dark Dungeon");
        System.out.println("**************************************"
                                                +"********************/n");	


        // Choose your character starts here than adds in Character class we need 4-5 chars
        System.out.println("====================================");
        System.out.println("|   Please Choose your Name        |");
        System.out.println("====================================");
        System.out.print("Name ~~~>");
        name = nScan.nextLine();
        playerOne.setName(name);
        System.out.println("====================================");
        System.out.println("|   Please Choose your Character   |");
        System.out.println("====================================");
        System.out.println("| Options:                         |");
        System.out.println("|            1. Warrior            |");
        System.out.println("|            2. Paladin            |");
        System.out.println("|            3. Exit               |");
        System.out.println("====================================");
        System.out.print("Make your Selection ~~~>");
        String input = nScan.nextLine();
        // If statement for each character goes here 
        while(!input.equals("1") && !input.equals("2") && !input.equals("3")){
            System.out.println("Invalid command! Please Choose 1, 2 or 3");
            System.out.print("Make your Selection ~~~>");
            input = nScan.nextLine();
        }    
        if(input.equals("1")) {
            warrior = CharacterSelection.warriorCreate(name);
            System.out.println("You have chosen a " + warrior.getCharacterName() +" "+ warrior.getCharacterClass());
            monster = Monster.newMonsterInstance();
            game.battleStart(playerOne, potion, warrior, monster);

        }
        else if (input.equals("2")) {
            warrior = CharacterSelection.paladinCreate(name);
            System.out.println("You have chosen a " + warrior.getCharacterName() +" "+ warrior.getCharacterClass());
            monster = Monster.newMonsterInstance();
            game.battleStart(playerOne, potion, warrior, monster);

        }
        else if (input.equals("3")) {

        }
            
        
        System.out.println("\n**************************************"  
                                                +"********************");
        System.out.println("\t # THANKS FOR PLAYING!!  #");
        System.out.println("**************************************"
                                                +"********************/n");
    }
}


