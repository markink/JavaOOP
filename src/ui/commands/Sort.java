package ui.commands;

import ui.ConsoleUI;

public class Sort extends Command {
    public Sort(ConsoleUI console) {
        super(console);
        specification = "Сортировать";
    }

    @Override
    public void execute() {
        getConsole().sort();
    }
}
