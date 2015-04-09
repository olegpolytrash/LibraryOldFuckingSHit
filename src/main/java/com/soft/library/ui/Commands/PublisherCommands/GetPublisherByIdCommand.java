package com.soft.library.ui.Commands.PublisherCommands;

import java.util.Scanner;

import com.soft.library.data.Publisher;
import com.soft.library.ui.CommandCore.ICommand;

/**
 * Created by Oleg on 09.04.2015.
 */
public class GetPublisherByIdCommand implements ICommand {
    @Override
    public void execute() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter id: ");
        Publisher.selectById(scanner.nextInt());
    }

    @Override
    public String getName() {
        return "Get publisher by id";
    }
}
