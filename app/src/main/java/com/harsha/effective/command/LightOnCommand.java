package com.harsha.effective.command;

public class LightOnCommand implements ICommand {

    private Light light;
    public LightOnCommand(Light light){
        this.light = light;
    }

    @Override
    public void execute() {
        this.light.switchOn();
    }

    @Override
    public void unExecute() {
        this.light.switchOff();
    }
}
