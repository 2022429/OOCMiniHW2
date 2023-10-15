/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oocminihw2;

/**
 *
 * @author sadiq
 */
public class Car extends Vehicle {
    public Car(String make,int numPassengers){
        
        this.make = make;
        this.numPassengers= numPassengers;
        numWheels=4;
        type ="Car";
    }
    public void start(){
        System.out.println("starting the car");
        speed =17;
    }
    public void stop(){
        System.out.println("stopping the car");
        speed=0;
    }
    
}
