package com.soft.library.ui.Commands.DBCommands.BookCommands;

import java.util.Scanner;

import com.soft.library.dataBase.service.AdvBookService;
import com.soft.library.ui.CommandCore.ICommand;

/**
 * Created by Oleg on 09.04.2015.
 */
public class GetBookByIdCommand implements ICommand {
    @Override
    public void execute() {
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Enter id: ");
//        int bookId = scanner.nextInt();
//        System.out.println(AdvBookService.getBookById(bookId).getName());
    }

    @Override
    public String getName() {
        return "Get book by id";
    }
}
