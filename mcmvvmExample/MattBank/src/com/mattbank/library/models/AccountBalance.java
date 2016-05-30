package com.mattbank.library.models;

/**
 * Created by barnett on 5/27/16.
 */
public class AccountBalance
{
    private double _credits;

    private double _debts;

    public AccountBalance(double credits, double debts)
    {
        _credits = credits;
        _debts = debts;
    }

    public double getBalance()
    {
        return _credits - _debts;
    }
}
