package com.soft.library.ui.Commands.DBCommands.AuthorCommands;

import com.soft.library.DataBase.data.Author;
import com.soft.library.ui.CommandCore.ICommand;

import java.util.Scanner;

/**
 * Created by Oleg on 09.04.2015.
 */
public class DeleteAuthorCommand implements ICommand {
    @Override
    public void execute() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter id:");
        Author.removeById(scanner.nextInt());
    }

    @Override
    public String getName() {
        return "Delete author";
    }
}