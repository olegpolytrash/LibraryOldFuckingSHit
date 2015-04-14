package com.soft.library.ui.Commands.NewDBCommands.AuthorCommands;

import java.util.Scanner;

import com.soft.library.DataBase.service.AdvAuthorService;
import com.soft.library.ui.CommandCore.ICommand;

/**
 * Created by Oleg on 09.04.2015.
 */
public class DeleteAuthorCommand implements ICommand {
    @Override
    public void execute() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Author's name:");
        AdvAuthorService.deleteAuthor(scanner.nextLine());
    }

    @Override
    public String getName() {
        return "Delete author";
    }
}
