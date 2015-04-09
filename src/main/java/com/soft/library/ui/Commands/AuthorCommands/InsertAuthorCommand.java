package com.soft.library.ui.Commands.AuthorCommands;

import com.soft.library.data.Author;
import com.soft.library.ui.CommandCore.ICommand;

/**
 * Created by Oleg on 09.04.2015.
 */
public class InsertAuthorCommand implements ICommand {

    @Override
    public void execute() {
<<<<<<< HEAD
        Author.insert("petjka");
=======
        Author.insert("123");
>>>>>>> branch 'master' of https://github.com/olegpolytrash/Library.git
    }

    @Override
    public String getName() {
        return "Insert an author";
    }
}
