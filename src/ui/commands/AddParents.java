package ui.commands;

import ui.ConsoleUI;

public class AddParents extends Command{
    public AddParents(ConsoleUI console) {
        super(console);
        specification = "Добавить родителей человеку";
    }

    @Override
    public void execute() {
        getConsole().addParents();
    }
}
