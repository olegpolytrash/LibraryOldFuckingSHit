package com.soft.library.ui.Commands.DBCommands.AuthorCommands;

import java.util.Scanner;

import com.soft.library.dataBase.service.AdvAuthorService;
import com.soft.library.ui.CommandCore.ICommand;

/**
 * Created by Oleg on 09.04.2015.
 */
public class DeleteAuthorCommand implements ICommand {
    @Override
    public void execute() {
        AdvAuthorService aas = new AdvAuthorService();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Author's name:");
        aas.deleteAuthor(scanner.nextLine());
    }

    @Override
    public String getName() {
        return "Delete author";
    }
}
