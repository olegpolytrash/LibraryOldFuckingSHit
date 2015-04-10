package com.soft.library.ui.Commands.DBCommands.AuthorCommands;

import com.soft.library.DataBase.data.Author;
import com.soft.library.ui.CommandCore.ICommand;

import java.util.Scanner;

/**
 * Created by Oleg on 09.04.2015.
 */
public class UpdateAuthorCommand implements ICommand {
    @Override
    public void execute() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Type in Author's id, name: ");
        String name = scanner.nextLine();
        String id = name.substring(0, name.indexOf(','));
        name = name.substring(name.indexOf(' ')).trim();
        Author.updateAuthorName(id, name);
    }

    @Override
    public String getName() {
        return "Update an author";
    }
}
