package com.soft.library.ui.Menus;

import com.soft.library.ui.CommandCore.CommandCollection;
import com.soft.library.ui.CommandCore.IMenu;
import com.soft.library.ui.CommandCore.Menu;

/**
 * Created by Oleg on 09.04.2015.
 */
public class MainMenu implements IMenu {
    @Override
    public void execute()  {
        CommandCollection menuCollection = new CommandCollection();
        menuCollection.addTask(new BookMenu());
        menuCollection.addTask(new AuthorMenu());
        menuCollection.addTask(new PublisherMenu());

        new Menu(menuCollection).runApplication();
    }

    @Override
    public String getName() {
        return "menu commands";
    }
}
