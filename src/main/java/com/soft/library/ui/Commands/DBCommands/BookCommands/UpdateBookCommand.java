package com.soft.library.ui.Commands.DBCommands.BookCommands;

import java.util.Scanner;

import com.soft.library.data.Book;
import com.soft.library.ui.CommandCore.ICommand;

/**
 * Created by Oleg on 09.04.2015.
 */
public class UpdateBookCommand implements ICommand {
    @Override
    public void execute() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Type in Book id, title: ");
        String name = scanner.nextLine();
        String id = name.substring(0, name.indexOf(','));
        name = name.substring(name.indexOf(' ')).trim();
        Book.updateAuthorName(id, name);
    }

    @Override
    public String getName() {
        return "Update a book";
    }
}
