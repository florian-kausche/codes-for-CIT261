/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package darkdungeongame;
import byui.cit260.darkdungeon.model.Player;

/**
 *
 * @author gregg
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
