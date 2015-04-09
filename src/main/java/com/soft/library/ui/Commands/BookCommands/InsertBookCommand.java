package com.soft.library.ui.Commands.BookCommands;

import java.util.Scanner;

import com.soft.library.data.Book;
import com.soft.library.ui.CommandCore.ICommand;

/**
 * Created by Oleg on 09.04.2015.
 */
public class InsertBookCommand implements ICommand {

    @Override
    public void execute() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Type a Book title: ");
        Book.insert(scanner.nextLine());
    }

    @Override
    public String getName() {
        return "Insert Book";
    }
}
