package com.soft.library.ui.CommandCore;

import java.util.Map;
import java.util.Scanner;

/**
 * Class which create program menu.
 */
public class MenuCreator {
    class Switcher {
        public void executeCommand(final ICommand command) {
            command.execute();
        }
    }

    private CommandCollection commandCollection = new CommandCollection();

    public MenuCreator(CommandCollection commandCollection) {
        this.setCommandCollection(commandCollection);
    }

    private void printEntryMessages() {
        StringBuilder messageBuilder = new StringBuilder();
        for (Map.Entry<Integer, ICommand> pair : commandCollection.getCommands()) {
            messageBuilder.append(pair.getKey());
            messageBuilder.append(": ");
            messageBuilder.append(pair.getValue().getName());
            messageBuilder.append("\n");
        }

        System.out.println(messageBuilder);
    }

    public void runApplication() {
        Scanner scanner = new Scanner(System.in);
        Switcher switcher = new Switcher();
        printEntryMessages();

        boolean ok = true;
        while (ok) {
            int programType = scanner.nextInt();
            if (programType > 0 && programType < (commandCollection.getSize() + 1)) {
                switcher.executeCommand(commandCollection.getByIndex(programType));
                ok = false;
            } else {
                System.out.println("Please enter 1-" + commandCollection.getSize());
            }
        }
    }

    public CommandCollection getCommandCollection() {
        return commandCollection;
    }

    public void setCommandCollection(CommandCollection commandCollection) {
        this.commandCollection = commandCollection;
    }
}
