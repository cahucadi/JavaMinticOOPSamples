/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mintic;

import game.Barbarian;
import game.Mage;
import game.Npc;

/**
 *
 * @author cahuc
 */
public class GameClass {
    
    public static void main(String[] args) {
        
        Barbarian b1 = new Barbarian("Dave" , 1, 2);
        b1.receiveDamage(15);
        
        Mage m1 = new Mage("Merlin");
        m1.receiveDamage(15);
        
        Npc n1 = new Npc();
        n1.receiveDamage(15);
        
    }
    
}
