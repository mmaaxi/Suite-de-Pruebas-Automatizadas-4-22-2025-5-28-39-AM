package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.tc_005Page;

public class tc_005Steps {

    private tc_005Page page;

    public tc_005Steps() {
        page = new tc_005Page();
    }

    @Given("the user exports the data to Excel")
    public void exportDataToExcel() {
        page.exportDataToExcel();
    }

    @When("the user observes the header of the column in the exported Excel")
    public void observeColumnHeaderInExcel() {
        page.loadExportedExcel();
    }

    @Then("the column originally named 'Monto Acumulado Folio OPC' should be renamed to 'Monto Acumulado Folio OPC (2121)'")
    public void validateColumnRenaming() {
        page.verifyColumnRenaming();
    }
}