package com.soft.library.ui.Commands.DBCommands.BookCommands;

import java.util.List;

import com.soft.library.DataBase.data.Book;
import com.soft.library.ui.CommandCore.ICommand;

/**
 * Created by Oleg on 09.04.2015.
 */
public class GetAllBooksCommand implements ICommand {
    @Override
    public void execute() {
        List<String> books = Book.selectAll();
        for(String i : books){
            System.out.println(i);
        }
    }

    @Override
    public String getName() {
        return "Get all Books";
    }
}
