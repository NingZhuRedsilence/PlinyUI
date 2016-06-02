package com.mattbank.programs.website;

import com.mattbank.library.models.Account;
import com.mattbank.library.models.AccountBalance;
import com.mattbank.programs.website.view_models.AccountOverviewViewModel;
import com.mattbank.programs.website.views.ConsoleView;

import java.util.List;

/**
 * Created by barnett on 5/27/16.
 */
public class Controller
{
    private List<Account> _openAccounts;


    Controller(List<Account> openAccounts)
    {
        _openAccounts = openAccounts;
    }

    public void showForCustomer(String firstName, String lastName)
    {
        for(Account account : _openAccounts)
        {
            if(account.Customer.FirstName.equals(firstName) && account.Customer.LastName.equals(lastName))
            {
                String customerName = account.Customer.FirstName + " " + account.Customer.LastName;
                double accountBalance = account.Balance.getBalance();
                long accountNumber = account.AccountNumber;
                AccountOverviewViewModel vm = new AccountOverviewViewModel(customerName, accountNumber, accountBalance);

                new ConsoleView(vm).show();
            }
        }
    }

}
