/**
 * 
 */
package com.soft.library.DataBase.service;

import java.util.List;

import com.soft.library.DataBase.DBEntities.Publisher;
import com.soft.library.DataBase.dao.DaoFactory;

/**
 * @author rd
 *
 */
public class PublisherService {

    public void addPublisher(Publisher publisher) {
        DaoFactory.getInstance().getPublisherDAO().addElement(publisher);
    }

    public void updatePublisher(Publisher publisher) {
        DaoFactory.getInstance().getPublisherDAO().updateElement(publisher);
    }

    public Publisher getPublisherById(Long publisherId) {
        return DaoFactory.getInstance().getPublisherDAO().getElementByID(publisherId);
    }

    public List<Publisher> getAllPublishers() {
        return DaoFactory.getInstance().getPublisherDAO().getAllElements();
    }

    public void deletePublisher(Publisher publisher) {
        DaoFactory.getInstance().getPublisherDAO().deleteElement(publisher);
    }

}
