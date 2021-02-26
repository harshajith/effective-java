package com.harsha.effective.command;

/**
 * Receiver class
 */
public class Light {
    public Light(){};
    public void switchOn(){
        System.out.println("Light is on");
    }

    public void switchOff(){
        System.out.println("Light is off");
    }
}
