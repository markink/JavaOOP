package ui.commands;

import ui.ConsoleUI;

public class saveTree extends Command{
    public saveTree(ConsoleUI console) {
        super(console);
        specification = "Сохранить дерево в файл";
    }

    @Override
    public void execute() {
        console.saveTree();
    }
}
