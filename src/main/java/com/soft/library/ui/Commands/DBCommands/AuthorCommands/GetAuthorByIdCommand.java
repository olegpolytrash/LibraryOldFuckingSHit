package com.soft.library.ui.Commands.DBCommands.AuthorCommands;

import com.soft.library.data.Author;
import com.soft.library.ui.CommandCore.ICommand;

import java.util.Scanner;

/**
 * Created by Oleg on 09.04.2015.
 */
public class GetAuthorByIdCommand implements ICommand {
    @Override
    public void execute() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter id: ");
        Author.selectById(scanner.nextInt());
    }

    @Override
    public String getName() {
        return "Get author by id";
    }
}
