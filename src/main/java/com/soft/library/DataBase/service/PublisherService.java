/**
 * 
 */
package com.soft.library.DataBase.service;

import java.util.List;

import com.soft.library.DataBase.DBEntities.Publisher;
import com.soft.library.DataBase.dao.Impl.DaoFactory;

/**
 * @author rd
 *
 */
public class PublisherService {

    public void addPublisher(Publisher publisher) {
        DaoFactory.getInstance().getPublisherDAOImpl().addElement(publisher);
    }

    public void updatePublisher(Publisher publisher) {
        DaoFactory.getInstance().getPublisherDAOImpl().updateElement(publisher);
    }

    public Publisher getPublisherById(Integer publisherId) {
        return DaoFactory.getInstance().getPublisherDAOImpl().getElementByID(publisherId);
    }

    public List<Publisher> getAllPublishers() {
        return DaoFactory.getInstance().getPublisherDAOImpl().getAllElements();
    }

    public void deletePublisher(Publisher publisher) {
        DaoFactory.getInstance().getPublisherDAOImpl().deleteElement(publisher);
    }

}
