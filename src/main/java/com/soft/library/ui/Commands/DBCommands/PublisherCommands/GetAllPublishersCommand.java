package com.soft.library.ui.Commands.DBCommands.PublisherCommands;

import com.soft.library.ui.CommandCore.ICommand;

/**
 * Created by Oleg on 09.04.2015.
 */
public class GetAllPublishersCommand implements ICommand {
    @Override
    public void execute() {
//        AdvPublisherService.printPublishers();
    }

    @Override
    public String getName() {
        return "Get all publishers";
    }
}
