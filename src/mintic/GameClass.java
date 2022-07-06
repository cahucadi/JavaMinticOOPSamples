/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mintic;

import game.Character;
import game.Barbarian;
import game.Mage;
import game.Npc;
import game.WhiteMage;
import game.interfaces.Drawable;
import game.inventory.Item;
import game.locations.Scenario;
import java.util.Random;

/**
 *
 * @author cahuc
 */
public class GameClass {
    
    public static void main(String[] args) {
       
        Random r = new Random();
        
        Character c;
  
        Mage m = new Mage("Merlin");
        Barbarian b = new Barbarian("Conan", 3, 2);
        WhiteMage wm = new WhiteMage("Whitey");
        
        
        Drawable[] list = new Drawable[6];
        list[0] = new Mage("Gandalf");
        list[1] = new WhiteMage("Saruman");
        list[2] = new Scenario();
        list[3] = new Item();
        list[4] = new Barbarian("Carlos", 20, 100);
        list[5] = new Npc();

        int randomIndex;
        
        for (int i = 0; i < 20; i++) {
            randomIndex = r.nextInt(6);
            show( list[randomIndex] );
        }
        
    }
    
    public static void show( Drawable d  ){
        d.draw();
    }
    
    
}
