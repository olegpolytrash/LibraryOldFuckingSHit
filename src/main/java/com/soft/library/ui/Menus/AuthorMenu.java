package com.soft.library.ui.Menus;

import com.soft.library.ui.CommandCore.CommandCollection;
import com.soft.library.ui.CommandCore.IMenu;
import com.soft.library.ui.CommandCore.MenuCreator;
import com.soft.library.ui.Commands.AuthorCommands.*;

/**
 * Created by Oleg on 09.04.2015.
 */
public class AuthorMenu implements IMenu {
    @Override
    public void execute()  {
        CommandCollection authorCommandCollection = new CommandCollection();
        authorCommandCollection.addTask(new GetAllAuthorsCommand());
        authorCommandCollection.addTask(new GetAuthorByIdCommand());
        authorCommandCollection.addTask(new DeleteAuthorCommand());
        authorCommandCollection.addTask(new UpdateAuthorCommand());
        authorCommandCollection.addTask(new InsertAuthorCommand());

        new MenuCreator(authorCommandCollection).runApplication();
    }

    @Override
    public String getName() {
        return "author commands";
    }
}
