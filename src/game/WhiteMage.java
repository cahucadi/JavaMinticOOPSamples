/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package game;

/**
 *
 * @author cahuc
 */
public class WhiteMage extends Mage{

    public WhiteMage(String name) {
        super(name);
    }
    
    @Override
    public void attack() {
        System.out.println("Attack of peace and love");
    }
    
}
