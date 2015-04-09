package com.soft.library.ui;

import com.soft.library.ui.CommandCore.CommandCollection;
import com.soft.library.ui.CommandCore.MenuCreator;
import com.soft.library.ui.Commands.GetAllAuthorsCommand;
import com.soft.library.ui.Commands.GetAuthorByIdCommand;

/**
 * Class which start program.
 * @author Oles Onyshchak
 * @version 0.1 28/03/2015
 */
public class Main {
    public static void main(String[] args) {
        CommandCollection commandCollection = new CommandCollection();
        commandCollection.addTask(new GetAllAuthorsCommand());
        commandCollection.addTask(new GetAuthorByIdCommand());
        new MenuCreator(commandCollection).runApplication();
    }
}
