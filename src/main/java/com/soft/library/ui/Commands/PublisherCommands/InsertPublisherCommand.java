package com.soft.library.ui.Commands.PublisherCommands;

import java.util.Scanner;

import com.soft.library.data.Publisher;
import com.soft.library.ui.CommandCore.ICommand;

/**
 * Created by Oleg on 09.04.2015.
 */
public class InsertPublisherCommand implements ICommand {

    @Override
    public void execute() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Type a publisher name: ");
        Publisher.insert(scanner.nextLine());
    }

    @Override
    public String getName() {
        return "Insert an publisher";
    }
}
