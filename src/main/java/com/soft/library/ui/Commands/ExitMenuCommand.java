package com.soft.library.ui.Commands;

import com.soft.library.ui.CommandCore.ICommand;

/**
 * Created by Oleg on 09.04.2015.
 */
public class ExitMenuCommand implements ICommand {
    @Override
    public void execute() {
        // not needed for this class
    }

    @Override
    public String getName() {
        return "Exit menu";
    }
}
