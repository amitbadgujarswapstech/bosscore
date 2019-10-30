Feature: Staticdata Country Add

  Background:
    Given I launch the application "Static Data"
    Then user enters username "Automation5" and password "password@12"
    And user clicks on Login Button
    And user click on Country menu
    And user click on Country Add menu

  @GXB-339 @OPEN
  Scenario: Add country with multiple payment currency
    Given I am connected to database "galaxy_staticdata" using valid credentials
    Then Execute SQL query as "Delete from country where country_code in ('AC')"
    And user enters the values for the below fields
      | Countrycode| CountryName         | Currency |
      | AC         | Germany              | EUR     |
    And user selects the value "<Payment currency>"
      | Payment currency |
      | CHF              |
      | EUR              |
    And user must able to view lookup method as "By Address","By Swift"
    And User enables  "National bank identifier available"
    And user must able to view lookup method as "By Address","By Swift","By Nid"
    And user must click on the "ADD" button
    Then user must view the message as "Country Saved successfully"
    And user click on CurrencyPair menu
    And user click on Country menu
    And user must able to view the below values
      | Countrycode| CountryName         | Currency| Payment currencies |
      | AC         | Germany             | EUR    | CHF,EUR             |

  @ORPHAN
  Scenario: Country code field length validation
        And user enters countrycode as "ABC"
        And clicks on country Name
        Then user must view the error message as "This value should be only 2 characters"

  @ORPHAN
  Scenario: National clearing code field length validation
        And user enters Nationalclearing code as "ABC"
        Then user must view the error message as "This value should be only 2 characters"

  @ORPHAN
  Scenario: Add New country code with National bank indentifier
           Given I am connected to database "galaxy_staticdata" using valid credentials
           Then Execute SQL query as "Delete from country where country_code in ('AA')"    
           And user enters the values for the below fields
              | Countrycode | CountryName | Currency  |Payment Currencies| High Risk Country|
              | AA          | Canada      | EUR       | EUR              | No               |
           And user must able to view lookup method as "By Address","By Swift"
           And User enables  "National bank identifier available"
           And user must able to view lookup method as "By Address","By Swift","By Nid"
           And user must click on the "ADD" button
           Then user must view the message as "Country Saved successfully"

  @ORPHAN
  Scenario: Add New country code with unique bank account in the country
           Given I am connected to database "galaxy_staticdata" using valid credentials
           Then Execute SQL query as "Delete from country where country_code in ('AB')"    
           And user enters the values for the below fields
              | Countrycode | CountryName | Currency  | Payment Currencies  | High Risk Country |Phone number length                   |Phone country code  |
              | AB          | Europe      | USD       | EUR                 | Yes               | 10                                   | 044                |
           And user must able to view lookup method as "By Address","By Swift"
           And User enables  "Bank account is unique in the country"
           And user must able to input bank account identifier name as "IBAN"
           And user must able to view lookup method as "By Address","By Swift","IBAN"
           And user must click on the "ADD" button
           Then user must view the message as "Country Saved successfully"
           And user must able to view the below values
              | Countrycode |CountryName   |Currency   |Payment Currencies| Bank account identifier name  |
              | AB          | Europe       | USD       | EUR              | IBAN                          |

  @ORPHAN
  Scenario: Unique country code validation
        And user enters the values for the below fields
          | Countrycode  | CountryName |Currency  |Payment Currencies| High Risk Country|
          | AA           | Canada      | EUR      | EUR              | No               |
        And user must able to view lookup method as "By Address","By Swift"
        And User enables  "National bank identifier available"
        And user must able to view lookup method as "By Address","By Swift","By Nid"
        And user must click on the "ADD" button
        Then user must view the message as "Country already exists"

  @ORPHAN @CreateTestData
  Scenario: CreateTestData-Country code CA with National bank indentifier
       And user enters the values for the below fields
          | Countrycode  | CountryName |Currency  |Payment Currencies| High Risk Country|
          | CA           | Canada      | CAD      | CAD              | No               |
        And User enables  "National bank identifier available"
        And user must click on the "ADD" button

  @ORPHAN @CreateTestData
  Scenario: CreateTestData-Country code DE with unique bank account
       And user enters the values for the below fields
          | Countrycode |CountryName |Currency  |Payment Currencies |High Risk Country | Phone number length |Phone country code |
          | DE          | Germany    | EUR      | EUR              | Yes                 | 10                | 044               |
        And User enables  "Bank account is unique in the country"

  @ORPHAN @CreateTestData
  Scenario: CreateTestData-Country code GE with multiple payment currency
        And user enters the values for the below fields
          | Countrycode |CountryName          |Currency  |
          | GE          | Georgia             | USD      |
        And user selects the value "<Payment currency>"
          | Payment currency |
          | USD              |
          | INR              |
        And user must click on the "ADD" button
