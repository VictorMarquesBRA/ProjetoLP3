package com.nabrasa.persistence;

import java.util.List;

/**
 *
 * @author 
 * @param <E>
 */
public interface GenericDAO<E> {
    public void create(E e);
    
    public List<E> readAll();
    public E readById(long id);
    
    public void update(E e);
    
    public void remove(E e);
}
