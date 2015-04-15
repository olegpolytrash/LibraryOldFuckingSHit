package com.soft.library.ui.Commands.DBCommands.AuthorCommands;

import java.util.Scanner;

import com.soft.library.DataBase.service.AdvAuthorService;
import com.soft.library.ui.CommandCore.ICommand;

/**
 * Created by Oleg on 09.04.2015.
 */
public class GetAuthorByIdCommand implements ICommand {
    @Override
    public void execute() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter id: ");
        int authorId = scanner.nextInt();
        System.out.println(AdvAuthorService.getAuthorById(authorId).getName());
    }

    @Override
    public String getName() {
        return "Get author by id";
    }
}
