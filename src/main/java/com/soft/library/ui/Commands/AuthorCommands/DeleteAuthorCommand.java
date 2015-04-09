package com.soft.library.ui.Commands.AuthorCommands;

import java.util.Scanner;

import com.soft.library.data.Author;
import com.soft.library.ui.CommandCore.ICommand;

/**
 * Created by Oleg on 09.04.2015.
 */
public class DeleteAuthorCommand implements ICommand {
    @Override
    public void execute() {
        Scanner scanner = new Scanner(System.in);
        Author.removeById(scanner.next());
        scanner.close();
    }

    @Override
    public String getName() {
        return "Delete author";
    }
}
