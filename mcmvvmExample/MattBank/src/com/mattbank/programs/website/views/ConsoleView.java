package com.mattbank.programs.website.views;

import com.mattbank.programs.website.view_models.AccountOverviewViewModel;

/**
 * Created by barnett on 5/27/16.
 */
public class ConsoleView
{
    private final AccountOverviewViewModel _vm;

    public ConsoleView(AccountOverviewViewModel vm)
    {
        _vm = vm;
    }

    public void show()
    {
        System.out.println("Hello, " + _vm.CustomerName);

        System.out.println("In account: " + _vm.AccountNumber + " you have a balance of: $" + _vm.CurrentBalance);
    }
}
