package com.soft.library.ui.Commands.DBCommands.AuthorCommands;

import com.soft.library.DataBase.data.Author;
import com.soft.library.ui.CommandCore.ICommand;

import java.util.List;

/**
 * Created by Oleg on 09.04.2015.
 */
public class GetAllAuthorsCommand implements ICommand {
    @Override
    public void execute() {
        List<String> authors = Author.selectAll();
        for(String i : authors){
            System.out.println(i);
        }
    }

    @Override
    public String getName() {
        return "Get all authors";
    }
}
