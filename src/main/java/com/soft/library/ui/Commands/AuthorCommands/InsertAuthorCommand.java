package com.soft.library.ui.Commands.AuthorCommands;

import com.soft.library.data.Author;
import com.soft.library.ui.CommandCore.ICommand;

import java.util.Scanner;

/**
 * Created by Oleg on 09.04.2015.
 */
public class InsertAuthorCommand implements ICommand {

    @Override
    public void execute() {
        Scanner scanner = new Scanner(System.in);
        Author.insert(scanner.next());
        scanner.close();
    }

    @Override
    public String getName() {
        return "Insert an author";
    }
}
