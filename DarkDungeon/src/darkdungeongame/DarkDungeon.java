/*
 *  Dark Dungeon game
 */
package darkdungeongame;
import byui.cit260.darkdungeon.model.Player;

/**
 * @authors Greg Kenar, William Murray, Florian Kausche
 * CIT 260  First Assignment
 */
public class DarkDungeon {
    public static void main(String[] args) {
    
    Player playerOne = new Player();
    
    playerOne.setName("Goku");
    playerOne.setBestTime(7.00);
    
    String playerInfo = playerOne.toString();
    System.out.println(playerInfo);
    }
}
