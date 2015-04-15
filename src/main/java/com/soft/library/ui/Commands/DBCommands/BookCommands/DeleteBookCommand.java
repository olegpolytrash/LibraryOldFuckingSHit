package com.soft.library.ui.Commands.DBCommands.BookCommands;

import java.util.Scanner;

import com.soft.library.DataBase.data.Book;
import com.soft.library.DataBase.service.AdvAuthorService;
import com.soft.library.DataBase.service.AdvBookService;
import com.soft.library.ui.CommandCore.ICommand;

/**
 * Created by Oleg on 09.04.2015.
 */
public class DeleteBookCommand implements ICommand {
    @Override
    public void execute() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter title:");
        AdvBookService.deleteBook(scanner.nextLine());
    }
       
    @Override
    public String getName() {
        return "Delete book";
    }
}
