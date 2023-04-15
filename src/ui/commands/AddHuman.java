package ui.commands;

import ui.ConsoleUI;

public class AddHuman extends Command{
    public AddHuman(ConsoleUI console) {
        super(console);
        specification = "Добавить человека в дерево";
    }


    public void execute(){
        getConsole().addHuman();
    }

}
