package com.soft.library.ui.Commands.DBCommands.PublisherCommands;

import java.util.List;

import com.soft.library.data.Publisher;
import com.soft.library.ui.CommandCore.ICommand;

/**
 * Created by Oleg on 09.04.2015.
 */
public class GetAllPublishersCommand implements ICommand {
    @Override
    public void execute() {
        List<String> publisher = Publisher.selectAll();
        for(String i : publisher){
            System.out.println(i);
        }
    }

    @Override
    public String getName() {
        return "Get all publishers";
    }
}
