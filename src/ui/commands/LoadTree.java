package ui.commands;

import ui.ConsoleUI;

public class LoadTree extends Command{
    public LoadTree(ConsoleUI console) {
        super(console);
        specification = "Загрузить дерево из файла";
    }

    @Override
    public void execute() {
        console.loadTree();
    }
}
