/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package game;

/**
 *
 * @author cahuc
 */
public class Mage extends Character {

    private int magicPoints;
    private int spells;

    public Mage(String name) {
        super(name, 1);
        this.magicPoints = 20;
        this.spells = 5;
    }

    @Override
    public void attack() {
        System.out.println("Magic wand!");
    }

    public int getMagicPoints() {
        return magicPoints;
    }

    public void setMagicPoints(int magicPoints) {
        this.magicPoints = magicPoints;
    }

    public int getSpells() {
        return spells;
    }

    public void setSpells(int spells) {
        this.spells = spells;
    }

}
