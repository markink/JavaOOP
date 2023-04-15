package ui.commands;

import ui.ConsoleUI;

public abstract class Command {
    ConsoleUI console;
    String specification;

    public Command(ConsoleUI console) {
        this.console = console;
    }

    public ConsoleUI getConsole() {
        return console;
    }

    public String getSpecification() {
        return specification;
    }
    public abstract void execute();
}
