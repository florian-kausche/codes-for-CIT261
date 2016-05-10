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
    //test the player class
    System.out.println("This is a test in for the player class:");    
    Player playerOne = new Player();
    playerOne.setName("Goku");
    playerOne.setBestTime(7.00);
    String playerInfo = playerOne.toString();
    System.out.println(playerInfo+"\n");
    
    //test the character class
    System.out.println("This is a test in for the character class:");
    Characters warrior = new Characters("Warrior",100,10,50,10,30,50,50);
    String characterInfo = warrior.toString();
    System.out.println(characterInfo+"\n");
    }
}
