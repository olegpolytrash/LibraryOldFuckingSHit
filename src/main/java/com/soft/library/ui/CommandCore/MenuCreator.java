package com.soft.library.ui.CommandCore;

import com.soft.library.ui.Commands.ExitMenuCommand;

import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;

/**
 * Class which create program menu.
 */
public class MenuCreator {
    private CommandCollection commandCollection = new CommandCollection();

    public MenuCreator(CommandCollection commandCollection) {
        this.setCommandCollection(commandCollection);
        addExitMenuOptionIfAbsent();
    }

    private void addExitMenuOptionIfAbsent() {
        Iterator<Map.Entry<Integer, IMenuOption>> iterator = commandCollection.getCommands().iterator();

        boolean contains = false;

        while (iterator.hasNext()) {
            if (iterator.next().getValue() instanceof ExitMenuCommand) {
                contains = true;
                break;
            }
        }

        if (!contains) {
           commandCollection.addTask(new ExitMenuCommand());
        }
    }

    private void printEntryMessages() {
        StringBuilder messageBuilder = new StringBuilder();
        for (Map.Entry<Integer, IMenuOption> pair : commandCollection.getCommands()) {
            messageBuilder.append(pair.getKey());
            messageBuilder.append(": ");
            messageBuilder.append(pair.getValue().getName());
            messageBuilder.append(System.lineSeparator());
        }

        System.out.println(messageBuilder);
    }

    public void runApplication() {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            printEntryMessages();
            int programType = scanner.nextInt();

            if (programType > 0 && programType < (commandCollection.getSize() + 1)) {
                IMenuOption menuOption = commandCollection.getByIndex(programType);

                if (menuOption instanceof ExitMenuCommand) {
                    break;
                } else {
                    menuOption.execute();
                }

                printEntryMessages();
            } else {
                System.out.println("Please enter 1-" + commandCollection.getSize());
            }
        }
    }

    public void setCommandCollection(CommandCollection commandCollection) {
        this.commandCollection = commandCollection;
    }
}
