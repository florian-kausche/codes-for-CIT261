/*
 *  Dark Dungeon game
 */
package darkdungeongame;
import byui.cit260.darkdungeon.model.*;

/**
 * @authors Greg Kenar, William Murray, Florian Kausche
 * CIT 260  First Assignment
 */
public class DarkDungeon {
    public static void main(String[] args) {
    //test the player class - Everyone
    System.out.println("This is a test in for the player class:");    
    Player playerOne = new Player();
    playerOne.setName("Goku");
    playerOne.setBestTime(7.00);
    String playerInfo = playerOne.toString();
    System.out.println(playerInfo+"\n");
    
    //test the character class - Greg
    System.out.println("This is a test in for the character class:");
    Characters warrior = new Characters("Warrior",100,10,50,10,30,50,50);
    String characterInfo = warrior.toString();
    System.out.println(characterInfo+"\n");
    
    //test the items class - Greg
    System.out.println("This is a test in for the item class:");
    Items items = new Items("Potion of Life","Potion",0,35,3);
    String itemInfo = items.toString();
    System.out.println(itemInfo+"\n");
    }
}
