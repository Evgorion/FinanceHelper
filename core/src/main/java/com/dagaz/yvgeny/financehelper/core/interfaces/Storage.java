package com.dagaz.yvgeny.financehelper.core.interfaces;

import com.dagaz.yvgeny.financehelper.core.exceptions.AmountException;
import com.dagaz.yvgeny.financehelper.core.exceptions.CurrencyException;

import java.math.BigDecimal;
import java.util.Currency;
import java.util.List;
import java.util.Map;

/**
 * Created by yvgeny on 29/05/16.
 */

// TODO изменить тип BigDecimal на готовый клаяя по работе с деньгами Money

public interface Storage {

    String getName();       //  обязятельно реализовать свойство name в дочерних классах

    // Получить баланс  (остаток)

    Map<Currency, BigDecimal> getCurrencyAmounts();  // остаток по каждой доступной валюте
    BigDecimal getAmount(Currency currency) throws CurrencyException;         // остаток по указаннйо валюте
    BigDecimal getApproxAmount(Currency currency) throws CurrencyException;   // примерный общий остаток по всем валютам

    // работа с бапансом добавить и убавить

    void changeAmount(BigDecimal amount, Currency currency) throws CurrencyException;    // изменить баланс по указанной валюте
    void addAmount(BigDecimal amount, Currency currency) throws CurrencyException;       // довавить к балансу в указанной валюте
    void expenseAmount(BigDecimal amount, Currency currency) throws CurrencyException, AmountException;   // отнять сумму от указанного баланаса в указанной валюте

    // работа с валютой

    void addCurrency(Currency currency) throws CurrencyException;        // добавить новый тип валюты в хранилеще
    void deleteCurrency(Currency currency) throws CurrencyException;     // удалить тип валюты из хранилеща
    Currency getCurrency(String code) throws CurrencyException;          // получить валюту по коду
    List<Currency> getAvailableCurrencies();    // получить лист всех валют в хранилеще

}
