package com.dagaz.yvgeny.financehelper.core.start;

import com.dagaz.yvgeny.financehelper.core.exceptions.AmountException;
import com.dagaz.yvgeny.financehelper.core.exceptions.CurrencyException;
import com.dagaz.yvgeny.financehelper.core.impls.DefaultStorage;

import java.math.BigDecimal;
import java.util.Currency;

/**
 * Created by yvgeny on 30/05/16.
 */
public class Start {
    public static void main(String[] args) {


        try {
            DefaultStorage storage = new DefaultStorage();
            Currency currencyUSD = Currency.getInstance("USD");
            Currency currencyRUB = Currency.getInstance("RUB");

            storage.addCurrency(currencyUSD);
            storage.addCurrency(currencyRUB);
            storage.addAmount(new BigDecimal(200), currencyUSD);
            storage.addAmount(new BigDecimal(300), currencyRUB);
            storage.expenseAmount(new BigDecimal(20), currencyUSD);

            System.out.println(storage.getAmount(currencyUSD));
            System.out.println(storage.getAmount(currencyRUB));
            System.out.println("storage = " + storage.getAvailableCurrencies());


        } catch (CurrencyException | AmountException e){
            e.printStackTrace();
        }
    }
}
