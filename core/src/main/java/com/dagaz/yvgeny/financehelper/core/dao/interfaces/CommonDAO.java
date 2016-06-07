package com.dagaz.yvgeny.financehelper.core.dao.interfaces;

import java.util.List;

/**
 * Created by yvgeny on 05/06/16.
 */
public interface CommonDAO<T> {

    List<T> getAll();
    T get(long id);
    boolean update(T storage);// boolean - чтобы удостовериться, что операция прошла успешно
    boolean delete(T storage);

}
