package com.soft.library.ui.Commands.AuthorCommands;

import java.util.List;

import com.soft.library.data.Author;
import com.soft.library.ui.CommandCore.ICommand;

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
