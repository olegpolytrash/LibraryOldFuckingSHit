package com.soft.library.ui.Commands.DBCommands.PublisherCommands;

import java.util.Scanner;

import com.soft.library.data.Publisher;
import com.soft.library.ui.CommandCore.ICommand;

/**
 * Created by Oleg on 09.04.2015.
 */
public class UpdatePublisherCommand implements ICommand {
    @Override
    public void execute() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Type in publisher id, title: ");
        String name = scanner.nextLine();
        String id = name.substring(0, name.indexOf(','));
        name = name.substring(name.indexOf(' ')).trim();
        Publisher.updateAuthorName(id, name);
    }

    @Override
    public String getName() {
        return "Update an publisher";
    }
}
