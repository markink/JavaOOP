package ui.commands;

import ui.ConsoleUI;

public class Stop extends Command{
    public Stop(ConsoleUI console) {
        super(console);
        specification = "Выйти из меню";
    }

    @Override
    public void execute() {
        console.stopConsole();
    }
}
