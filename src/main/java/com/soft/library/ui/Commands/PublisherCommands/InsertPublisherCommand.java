package com.soft.library.ui.Commands.PublisherCommands;

import com.soft.library.data.Author;
import com.soft.library.ui.CommandCore.ICommand;

/**
 * Created by Oleg on 09.04.2015.
 */
public class InsertPublisherCommand implements ICommand {

    @Override
    public void execute() {
        Author.insert("123");
    }

    @Override
    public String getName() {
        return "Insert an author";
    }
}