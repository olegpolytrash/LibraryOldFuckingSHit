/**
 * 
 */
package com.soft.library.DataBase.dao;

import java.util.List;

/**
 * @author rd
 *
 */
public interface ElementDao <E> {
    public void addElement(E element);
    public void updateElement(E element);
    public E getElementByID(Long elementId);
    public List<E> getAllElements();
    public void deleteElement(E element);

}
