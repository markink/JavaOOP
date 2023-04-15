package ui;

import ui.commands.*;

import java.util.ArrayList;
import java.util.List;


public class Menu {
    private List<Command> commands;

    public Menu(ConsoleUI console) {
        commands = new ArrayList<>();
        commands.add(new AddHuman(console));
        commands.add(new Stop(console));
        commands.add(new saveTree(console));
        commands.add(new LoadTree(console));
        commands.add(new GetAllHuman(console));
    }

    public void execute(int choice) {
        commands.get(choice - 1).execute();
    }

    public String printMenu() {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < commands.size(); i++) {
            stringBuilder.append(i + 1);
            stringBuilder.append(") ");
            stringBuilder.append(commands.get(i).getSpecification());
            stringBuilder.append("\n");
        }
        return stringBuilder.toString();
    }
}
