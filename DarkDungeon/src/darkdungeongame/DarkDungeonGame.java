/*
 *  Dark Dungeon game
 */
package darkdungeongame;
import byui.cit260.darkdungeon.model.Monster;
import byui.cit260.darkdungeon.model.*;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * @authors Greg Kenar, William Murray, Florian Kausche
 * CIT 260  First Assignment
 */
public class DarkDungeonGame {
    public static void main(String[] args) {
    /*
    //test the player class - Greg and Bill.
    System.out.println("This is a test in for the player class:");    
    Player playerOne = new Player();
    playerOne.setName("Goku");
    playerOne.setBestTime(7.00);
    String playerInfo = playerOne.toString();
    System.out.println(playerInfo+"\n");
    
    //test the character class moved to CharacterSeelection class- Greg
    System.out.println("This is a test in for the character class:");
    CharacterSelection warrior = new CharacterSelection("Test Name","Warrior",100,10,50,10,30,50,50);
    String characterInfo = warrior.toString();
    System.out.println(characterInfo+"\n");
    
    //test the items class - Greg
    System.out.println("This is a test in for the item class:");
    Item items = new Item("Potion of Life","Potion",0,35,3);
    String itemInfo = items.toString();
    System.out.println(itemInfo+"\n");
    
    //test the monster class - Bill
    System.out.println("This is a test in for the monster class:");    
    
    Monster wight = Monster.newMonsterInstance();
    Monster monsterStat = new Monster();
    monsterStat.setMonsterName("Wight");
    monsterStat.setHealth(50);
    monsterStat.setMinAttackDamage(5);
    monsterStat.setMaxAttackDamage(50);
    monsterStat.setAbilityDamage(8);
    String monsterInfo = monsterStat.toString();
    System.out.println(monsterInfo+"\n");
    
    //test battle class - Bill
    System.out.println("This is a test in for the battle class:");    
    Battle fight = new Battle();
    fight.setIsAlive(Boolean.FALSE);
    String battleInfo = fight.toString();
    System.out.println(battleInfo+"\n");
    
    //test scene class - Bill
    System.out.println("This is a test in for the scene class:");
    Scene roomFormat = new Scene();
    roomFormat.setDescription("Chapel");
    roomFormat.setTrapboolean(Boolean.TRUE);
    roomFormat.setChestboolean(Boolean.TRUE);
    roomFormat.setRandomMonsterEncounter(Boolean.TRUE);
    String sceneInfo = roomFormat.toString();
    System.out.println(sceneInfo+"\n");
    
    //test Map class - Florian
    System.out.println("This is a test in for the map class:");
    Map map = new Map();
    map.setLocationX(Boolean.TRUE);
    map.setLocationY(Boolean.TRUE);
    String mapInfo = map.toString();
    System.out.println(mapInfo+"\n");
    //test Map class - Florian
    System.out.println("This is a test in for the location class:");
    Location location = new Location();
    location.setCurrentRoom("Dungeon");
    location.setCurrentX(2.5);
    location.setCurrentY(4.5);
    String locationInfo = location.toString();
    System.out.println(locationInfo+"\n");
      
    // test the random selector - Greg
    System.out.println("This is a test for the Random in the Game Class:");
    int numOne=0;
    int numTwo=10;
    
    int answerRandom = Game.rand(numOne, numTwo);
    System.out.println(answerRandom);
    */
    Game game = new Game();
    game.enter();
    
    }
    
}
