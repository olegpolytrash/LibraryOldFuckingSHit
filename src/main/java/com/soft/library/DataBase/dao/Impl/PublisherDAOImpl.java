/**
 * 
 */
package com.soft.library.DataBase.dao.Impl;

import com.soft.library.DataBase.DBEntities.Publisher;
import com.soft.library.DataBase.dao.PublisherDAO;

/**
 * @author rd
 *
 */
public class PublisherDAOImpl extends ElementDAOImpl<Publisher> implements PublisherDAO {

    public PublisherDAOImpl() {
        super(Publisher.class);
    }
}
