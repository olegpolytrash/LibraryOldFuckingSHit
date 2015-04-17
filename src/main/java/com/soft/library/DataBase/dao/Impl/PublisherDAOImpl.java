/**
 * 
 */
package com.soft.library.DataBase.dao.Impl;

import com.soft.library.dataBase.DBEntities.Publisher;
import com.soft.library.dataBase.dao.PublisherDAO;

/**
 * @author rd
 *
 */
public class PublisherDAOImpl extends ElementDAOImpl<Publisher> implements PublisherDAO {

    public PublisherDAOImpl() {
        super(Publisher.class);
    }
}
