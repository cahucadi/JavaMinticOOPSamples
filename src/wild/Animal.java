/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package wild;

/**
 *
 * @author cahuc
 */
public class Animal {

    private char sex;

    public char getSex() {
        return sex;
    }

    public void setSex(char sex) {
        this.sex = sex;
    }

    public void feedTheirOffspring() {
        System.out.println( this.getClass().getSimpleName() + " FEEDING...");
    }

}
