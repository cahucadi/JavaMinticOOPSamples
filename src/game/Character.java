/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package game;

/**
 *
 * @author cahuc
 */
public class Character {

    protected String name;
    protected int level;
    protected int hitPoints;
    protected int attackValue;
    protected int attackPower;
    protected int armorValue;
    protected char gender;

    public Character(String name) {
        this.name = name;
        this.level = 1;
        this.hitPoints = 100;
        this.attackValue = 10;
        this.attackPower = 1;
        this.armorValue = 10;
        this.gender = 'M';
    }

    public Character(String name, int level) {
        this(name);
        this.level = level;
    }

    public void levelUp() {
        this.level++;
    }

    public void attack() {
        System.out.println("ATTACK!");
    }

    public void receiveDamage(int dmg) {
        hitPoints = hitPoints - dmg;
        System.out.println("Hit points: "+hitPoints);
    }

    // Getters and Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public int getHitPoints() {
        return hitPoints;
    }

    public void setHitPoints(int hitPoints) {
        this.hitPoints = hitPoints;
    }

    public int getAttackValue() {
        return attackValue;
    }

    public void setAttackValue(int attackValue) {
        this.attackValue = attackValue;
    }

    public int getAttackPower() {
        return attackPower;
    }

    public void setAttackPower(int attackPower) {
        this.attackPower = attackPower;
    }

    public int getArmorValue() {
        return armorValue;
    }

    public void setArmorValue(int armorValue) {
        this.armorValue = armorValue;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

}
