package com.mattbank.library.models;

/**
 * Created by barnett on 5/27/16.
 */
public class Account
{
    public final Customer Customer;

    public final AccountBalance Balance;

    public final long AccountNumber;

    public Account(Customer customer, AccountBalance balance, long accountNumber)
    {
        Customer = customer;
        Balance = balance;
        AccountNumber = accountNumber;
    }
}
