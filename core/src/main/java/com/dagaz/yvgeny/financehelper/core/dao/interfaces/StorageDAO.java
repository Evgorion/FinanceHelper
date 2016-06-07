package com.dagaz.yvgeny.financehelper.core.dao.interfaces;

import com.dagaz.yvgeny.financehelper.core.interfaces.Storage;

import java.math.BigDecimal;
import java.util.Currency;

/**
 * Created by yvgeny on 05/06/16.
 */
public interface StorageDAO extends CommonDAO<Storage> {

    // boolean - чтобы удостовериться, что операция прошла успешно
    boolean addCurrency(Storage storage, Currency currency);
    boolean deleteCurrency(Storage storage, Currency currency);
    boolean updateAmount(Storage storage, BigDecimal amount);// сюда входит прибавить, отнять и обновить

}