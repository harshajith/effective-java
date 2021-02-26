package com.harsha.effective.command;

public class Client {
    public static void main(String[] args){
        Light light = new Light();
        ICommand lightOnCommand = new LightOnCommand(light);
        ICommand lightOffCommand = new LightOffCommand(light);

        Invoker invoker = new Invoker(lightOnCommand, lightOffCommand);
        invoker.switchOnLight();
        invoker.switchOffLight();
    }
}
