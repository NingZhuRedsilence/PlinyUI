package com.mattbank.programs.website;

import com.mattbank.library.models.Account;
import com.mattbank.library.models.AccountBalance;
import com.mattbank.library.models.Customer;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by barnett on 5/27/16.
 */
public class MattBankAccountDisplay
{
    public static void main(String[] args)
    {
        Customer matt = new Customer("Matt", "Barnett");
        AccountBalance mattBalance = new AccountBalance(1000000, 300);
        List<Account> openAccounts = new LinkedList<>(Arrays.asList(new Account(matt, mattBalance, 8)));

        new Controller(openAccounts).showForCustomer("Matt", "Barnett");
    }
}
