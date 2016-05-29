package com.dagaz.yvgeny.financehelper.core;

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

    Map<Currency, BigDecimal> getCurrencyAmount();  // остаток по каждой доступной валюте
    BigDecimal getAmount(Currency currency);        // остаток по указаннйо валюте
    BigDecimal getApproxAmount(Currency currency);  // примерный общий остаток по всем валютам

    // работа с бапансом добавить и убавить

    void changeAmount(BigDecimal amount, Currency currency);    // изменить баланс по указанной валюте
    void addAmount(BigDecimal amount, Currency currency);       // довавить к балансу в указанной валюте
    void expenseAmount(BigDecimal amount, Currency currency);   // отнять сумму от указанного баланаса в указанной валюте

    // работа с валютой

    void addCurrency(Currency currency);        // добавить новый тип валюты в хранилеще
    void deleteCurrency(Currency currency);     // удалить тип валюты из хранилеща
    void getCurrency(String code);              // получить валюту по коду
    List<Currency> getAvalibleCurrencies();     // получить лист всех валют в хранилеще

}
