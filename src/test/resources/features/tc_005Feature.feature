Feature: Validate renaming of 'Monto Acumulado Folio OPC' column

  Scenario: Renaming column in exported Excel
    Given the user exports the data to Excel
    When the user observes the header of the column in the exported Excel
    Then the column originally named 'Monto Acumulado Folio OPC' should be renamed to 'Monto Acumulado Folio OPC (2121)'