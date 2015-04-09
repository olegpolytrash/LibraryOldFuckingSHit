package com.soft.library.ui.Commands.BookCommands;

import java.util.Scanner;

import com.soft.library.data.Book;
import com.soft.library.ui.CommandCore.ICommand;

/**
 * Created by Oleg on 09.04.2015.
 */
public class GetBookByIdCommand implements ICommand {
    @Override
    public void execute() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter id: ");
        Book.selectById(scanner.nextInt());
    }

    @Override
    public String getName() {
        return "Get book by id";
    }
}
