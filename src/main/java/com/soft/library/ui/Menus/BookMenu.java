package com.soft.library.ui.Menus;

import com.soft.library.ui.CommandCore.CommandCollection;
import com.soft.library.ui.CommandCore.IMenu;
import com.soft.library.ui.CommandCore.Menu;
import com.soft.library.ui.Commands.DBCommands.BookCommands.*;

/**
 * Created by Oleg on 09.04.2015.
 */
public class BookMenu implements IMenu {
    @Override
    public void execute()  {
        CommandCollection bookCommandCollection = new CommandCollection();
        bookCommandCollection.addTask(new GetAllBooksCommand());
        bookCommandCollection.addTask(new GetBookByIdCommand());
        bookCommandCollection.addTask(new UpdateBookCommand());
        bookCommandCollection.addTask(new DeleteBookCommand());
        bookCommandCollection.addTask(new InsertBookCommand());
        
        new Menu(bookCommandCollection).runApplication();
    }

    @Override
    public String getName() {
        return "book commands";
    }
}
