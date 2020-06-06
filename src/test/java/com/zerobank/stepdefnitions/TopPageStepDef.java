package com.zerobank.stepdefnitions;

import com.zerobank.utilities.Pages;
import io.cucumber.java.en.Then;

public class TopPageStepDef {

    Pages pages = new Pages();
    @Then("the {string} page should be displayed")
    public void the_Account_Activity_page_should_be_displayed(String pageTitleName) {
        pages.loginPage().verifyToTitle("Zero - "+pageTitleName);
    }

    @Then("the user navigate to {string} tab")
    public void the_user_navigate_to_tab(String tabName) {
       pages.accountActivity().navigateToTab(tabName);
    }



}