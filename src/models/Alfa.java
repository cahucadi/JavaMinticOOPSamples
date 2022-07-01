/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models;

/**
 *
 * @author cahuc
 */
public class Alfa {

    private int a;
    private double b;

    public Alfa() {
        a = 0;
        b = 0.0;
    }

    public Alfa(int a) {
        this();
        this.a = a;
    }

    public Alfa(double b) {
        this();
        this.b = b;
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }
    
    
}
