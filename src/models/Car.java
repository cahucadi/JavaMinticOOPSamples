/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models;

/**
 *
 * @author cahuc
 */
public class Car {

    private String model;
    private Wheel wheels[];
    private double cilinders;

    public Car(String model, int nWheels, int wheelsRadio, int wheelsWidth, double cilinders) {
        this.model = model;
        this.cilinders = cilinders;
  
        this.wheels = new Wheel[nWheels];
        
        for (int i = 0; i < nWheels; i++) {
            this.wheels[i] = new Wheel( wheelsRadio, wheelsWidth);
        }
    }

}
