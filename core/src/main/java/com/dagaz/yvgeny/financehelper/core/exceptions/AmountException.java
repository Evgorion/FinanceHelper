package com.dagaz.yvgeny.financehelper.core.exceptions;

/**
 * Created by yvgeny on 30/05/16.
 */
public class AmountException extends Exception {
    public AmountException() {
    }

    public AmountException(String message) {
        super(message);
    }

    public AmountException(String message, Throwable cause) {
        super(message, cause);
    }

    public AmountException(Throwable cause) {
        super(cause);
    }


}
