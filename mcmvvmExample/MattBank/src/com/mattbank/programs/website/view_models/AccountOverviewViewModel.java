
package com.mattbank.programs.website.view_models;

/**
 * Created by barnett on 5/27/16.
 */
public class AccountOverviewViewModel
{
    public final String CustomerName;

    public final long AccountNumber;

    public final double CurrentBalance;

    public AccountOverviewViewModel(String customerName, long accountNumber, double currentBalance)
    {
        CustomerName = customerName;
        AccountNumber = accountNumber;
        CurrentBalance = currentBalance;
    }
}
