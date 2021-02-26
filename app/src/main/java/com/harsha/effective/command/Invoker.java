package com.harsha.effective.command;

/**
 * Concrete class wiring all commands.
 */
public class Invoker {
    private ICommand switchOnCommand;
    private ICommand switchOffCommand;


    public Invoker(ICommand switchOnCommand, ICommand switchOffCommand){
        this.switchOnCommand = switchOnCommand;
        this.switchOffCommand = switchOffCommand;
    }

    public void switchOnLight(){
        switchOnCommand.execute();
    }

    public void switchOffLight(){
        switchOffCommand.execute();
    }
}
