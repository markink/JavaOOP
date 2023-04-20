package ui.commands;

import ui.ConsoleUI;

public class AddChild extends Command{
    public AddChild(ConsoleUI console) {
        super(console);
        specification = "Добавить рёбнка родителям";
    }

    @Override
    public void execute() {
        getConsole().addChild();
    }
}
