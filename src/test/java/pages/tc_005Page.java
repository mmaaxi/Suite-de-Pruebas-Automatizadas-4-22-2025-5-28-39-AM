package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import util.ExcelUtil;

public class tc_005Page {

    private WebDriver driver;
    private static final String EXPORTED_FILE_PATH = "path/to/exported/excel/file.xlsx";
    private static final String COLUMN_HEADER_ORIGINAL = "Monto Acumulado Folio OPC";
    private static final String COLUMN_HEADER_EXPECTED = "Monto Acumulado Folio OPC (2121)";
    
    public tc_005Page(WebDriver driver) {
        this.driver = driver;
    }
    
    public void exportDataToExcel() {
        // Code to trigger the export to Excel from the web application
        driver.findElement(By.id("exportExcelButton")).click();
    }
    
    public void loadExportedExcel() {
        // Code to initialize the ExcelUtil for reading the exported file
        ExcelUtil.open(EXPORTED_FILE_PATH);
    }
    
    public void verifyColumnRenaming() {
        // Code to verify if the column has been renamed correctly
        String header = ExcelUtil.getHeader("A");
        if (!COLUMN_HEADER_EXPECTED.equals(header)) {
            throw new AssertionError("Column header does not match expected name. Found: " + header);
        }
    }
}