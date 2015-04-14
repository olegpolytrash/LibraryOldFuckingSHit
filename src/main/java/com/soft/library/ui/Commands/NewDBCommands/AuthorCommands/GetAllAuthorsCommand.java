package com.soft.library.ui.Commands.NewDBCommands.AuthorCommands;

import com.soft.library.DataBase.service.AdvAuthorService;
import com.soft.library.ui.CommandCore.ICommand;

/**
 * Created by Oleg on 09.04.2015.
 */
public class GetAllAuthorsCommand implements ICommand {
    @Override
    public void execute() {
        AdvAuthorService.printAuthors();
    }

    @Override
    public String getName() {
        return "Get all authors";
    }
}
