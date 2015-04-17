/**
 * 
 */
package com.soft.library.dataBase.service;

import com.soft.library.dataBase.model.Author;
import com.soft.library.dataBase.dao.AuthorDAO;
import com.soft.library.dataBase.dao.impl.DaoFactory;

/**
 * @author rd
 *
 */
public class AdvAuthorService {
    private AuthorDAO authorDAO;

    public AdvAuthorService() {
        authorDAO = DaoFactory.getInstance().getAuthorDAOImpl();
    }

    public void addAuthor(String title) {
        Author author = new Author();
        author.setName(title);
        authorDAO.save(author);
    }

    public int updateAuthors(String oldName, String newName) {
        int count = 0;
        for (Author a : authorDAO.getAll()) {
            if (a.getName().equals(oldName)) {
                a.setName(newName);
                authorDAO.update(a);
                count++;
            }
        }
        return count;
    }

    public void printAuthors() {
        System.out.println("\nAll Authors:");
        for (Author a : authorDAO.getAll()) {
            System.out.println("authorDAO: id=" + a.getId() + " Title="
                    + a.getName());
        }
    }

    public Author getAuthorById(int authorDAOId) {
        return authorDAO.findById(authorDAOId);
    }

    public void deleteAuthor(String name) {
        for (Author a : authorDAO.getAll()) {
            if (a.getName().equalsIgnoreCase(name)) {
                authorDAO.remove(a);
                break;
            }
        }
    }
}
