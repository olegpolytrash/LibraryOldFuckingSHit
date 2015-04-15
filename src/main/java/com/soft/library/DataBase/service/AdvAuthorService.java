/**
 * 
 */
package com.soft.library.DataBase.service;

import com.soft.library.DataBase.DBEntities.Author;

/**
 * @author rd
 *
 */
public class AdvAuthorService {

    public static void addAuthor(String title) {
        Author author = new Author();
        author.setName(title);
        AuthorService as = new AuthorService();
        as.addAuthor(author);
    }

    public static int updateAuthors(String oldName, String newName) {
        AuthorService as = new AuthorService();
        int count = 0;
        for (Author a : as.getAllAuthors()) {
            if (a.getName().equals(oldName)) {
                a.setName(newName);
                as.updateAuthor(a);
                count++;
            }
        }
        return count;
    }

    public static void printAuthors() {
        AuthorService as = new AuthorService();
        System.out.println("\nAll Books:");
        for (Author a : as.getAllAuthors()) {
            System.out.println("author: id=" + a.getId() + " Title="
                    + a.getName());
        }
    }

    public static Author getAuthorById(int authorId) {
        AuthorService as = new AuthorService();
        return as.getAuthorById(authorId);
    }

    public static void deleteAuthor(String author) {
        AuthorService as = new AuthorService();
        for (Author a : as.getAllAuthors()) {
            if (a.getName().equalsIgnoreCase(author)) {
                as.deleteAuthor(a);
                break;
            }
        }

    }
}
