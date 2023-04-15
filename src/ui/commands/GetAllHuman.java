package ui.commands;

import ui.ConsoleUI;

public class GetAllHuman extends Command{
    public GetAllHuman(ConsoleUI console) {
        super(console);
        specification = "Показать все элементы дерева";
    }
    @Override
    public void execute() {
        console.getHumanList();
    }
}
