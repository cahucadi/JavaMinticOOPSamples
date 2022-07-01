/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models;

/**
 *
 * @author cahuc
 */
public class Beta extends Alfa {

    private int c;

    public Beta() {
        super(100);
        this.c = 10;
    }

    public Beta(int c) {
        super(c * 1.2);
        this.c = c;
    }

    public int getC() {
        return c;
    }

    public void setC(int c) {
        this.c = c;
    }
    
    
}
