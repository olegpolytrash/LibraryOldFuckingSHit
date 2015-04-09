package com.soft.library.ui.Commands.AuthorCommands;

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
        Author.selectById(scanner.next());
        scanner.close();
    }

    @Override
    public String getName() {
        return "Get author by id";
    }
}
