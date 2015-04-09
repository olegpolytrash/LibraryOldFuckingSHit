package com.soft.library.ui.Menus;

import com.soft.library.ui.CommandCore.CommandCollection;
import com.soft.library.ui.CommandCore.IMenu;
import com.soft.library.ui.CommandCore.MenuCreator;
import com.soft.library.ui.Commands.AuthorCommands.*;
import com.soft.library.ui.Commands.PublisherCommands.*;

/**
 * Created by Oleg on 09.04.2015.
 */
public class PublisherMenu implements IMenu {
    @Override
    public void execute()  {
        CommandCollection publisherCommandCollection = new CommandCollection();
        publisherCommandCollection.addTask(new GetAllPublishersCommand());
        publisherCommandCollection.addTask(new GetPublisherByIdCommand());
        publisherCommandCollection.addTask(new DeletePublisherCommand());
        publisherCommandCollection.addTask(new UpdatePublisherCommand());
        publisherCommandCollection.addTask(new InsertPublisherCommand());

        new MenuCreator(publisherCommandCollection).runApplication();
    }

    @Override
    public String getName() {
        return "publisher commands";
    }
}
