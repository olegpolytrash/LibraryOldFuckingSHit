package com.soft.library.ui.Commands.DBCommands.BookCommands;

import java.util.Scanner;
import com.soft.library.DataBase.service.AdvBookService;
import com.soft.library.ui.CommandCore.ICommand;

/**
 * Created by Oleg on 09.04.2015.
 */
public class UpdateBookCommand implements ICommand {
    @Override
    public void execute() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Type in Book's old title, new title: ");
        String newName = scanner.nextLine();
        String oldName = newName.substring(0, newName.indexOf(','));
        newName = newName.substring(newName.indexOf(' ')).trim();
        AdvBookService.updateBooks(oldName, newName);
    }

    @Override
    public String getName() {
        return "Update a book";
    }
}
