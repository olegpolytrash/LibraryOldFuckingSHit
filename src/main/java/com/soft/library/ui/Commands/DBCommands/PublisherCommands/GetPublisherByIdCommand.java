package com.soft.library.ui.Commands.DBCommands.PublisherCommands;

import java.util.Scanner;

import com.soft.library.DataBase.service.AdvPublisherService;
import com.soft.library.ui.CommandCore.ICommand;

/**
 * Created by Oleg on 09.04.2015.
 */
public class GetPublisherByIdCommand implements ICommand {
    @Override
    public void execute() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter id: ");
        int publisherId = scanner.nextInt();
        System.out.println(AdvPublisherService.getPublisherById(publisherId).getName());
    }

    @Override
    public String getName() {
        return "Get publisher by id";
    }
}
