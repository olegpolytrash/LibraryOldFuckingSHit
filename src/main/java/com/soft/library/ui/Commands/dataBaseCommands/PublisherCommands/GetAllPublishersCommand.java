package com.soft.library.ui.commands.dataBaseCommands.publisherCommands;

import com.soft.library.ui.commandCore.Command;

/**
 * Created by Oleg on 09.04.2015.
 */
public class GetAllPublishersCommand implements Command {
    @Override
    public void execute() {
//        AdvPublisherService.printPublishers();
    }

    @Override
    public String getName() {
        return "Get all publishers";
    }
}
