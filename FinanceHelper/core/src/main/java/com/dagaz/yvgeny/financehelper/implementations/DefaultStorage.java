package com.dagaz.yvgeny.financehelper.implementations;

import com.dagaz.yvgeny.financehelper.interfaces.Storage;

import java.math.BigDecimal;
import java.util.Currency;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by yvgeny on 03/05/16.
 */
public class DefaultStorage implements Storage {

    private String name;
    private Map<Currency, BigDecimal> currencyAmounts = new HashMap<>();
    private List<Currency>


    public Map<Currency, BigDecimal> getCurrencyAmounts() {
        return currencyAmounts;
    }

    public void setCurrencyAmounts(Map<Currency, BigDecimal> currencyAmounts) {
        this.currencyAmounts = currencyAmounts;
    }


    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public Map<Currency, BigDecimal> getCurrencyAmount() {
        return null;
    }

    @Override
    public BigDecimal getAmount(Currency currency) {
        return null;
    }

    @Override
    public BigDecimal getApproxAmount(Currency currency) {
        return null;
    }

    @Override
    public void changeAmount(BigDecimal amount, Currency currency) {

    }

    @Override
    public void addAmount(BigDecimal amount, Currency currency) {

    }

    @Override
    public void expenseAmount(BigDecimal amount, Currency currency) {

    }

    @Override
    public void addCurrency(Currency currency) {

    }

    @Override
    public void deleteCurrency(Currency currency) {

    }

    @Override
    public void getCurrency(String code) {

    }

    @Override
    public List<Currency> getAvalibleCurrencies() {
        return null;
    }
}
