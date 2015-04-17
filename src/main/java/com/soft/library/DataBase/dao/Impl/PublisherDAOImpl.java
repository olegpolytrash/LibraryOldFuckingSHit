/**
 * 
 */
package com.soft.library.dataBase.dao.impl;

import com.soft.library.dataBase.model.Publisher;
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
