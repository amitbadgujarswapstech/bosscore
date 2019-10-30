Feature: BOSS_Payment_New

  New Payment

  Background:
    Given launch the application "https://qa3.swapstech.net/sso/login?service=https%3A%2F%2Fqa3.swapstech.net%2FbossPortal%2Fj_spring_cas_security_check"
    And user enters username "Testuser1" and password "Password@1"
    And user clicks on Login button
    And user clicks on Payment module

  @ORPHAN
  Scenario: Same currency payment for same day delivery method.
    And user click on New Payment sub-module
      | From Account      | To Account     | Amount | Delivery Method   | Purpose of Payment| Correspondent Bank Fees paid by |
      | DDA account       | beneficiaryUSD | 12000.87| Same Day Payment| USD Payment       | Beneficairy                      |
      | EUR Client account| Beneficiary EUR| 12      | Same Day Payment| EUR Payment       | Beneficairy                      |
      | CAD client account| CAD bene       | 127     | Same Day Payment| USD Payment         | Beneficairy                    |
    And user click on confirm payment button
    And user page redirect to payment confirmation screen
    And user able to view the below details
      | Transaction Number| From Account |To Account| Fee   | Amount     | Payment Date      | Purpose of Payment |
    And user click on Manage payment button

  @ORPHAN
  Scenario: Same currency payment for next day delivery method
    And user clicks on New Payment sub-module
      | From Account      | To Account     | Amount | Delivery Method   | Purpose of Payment| Correspondent Bank Fees paid by |
      | DDA account       | beneficiaryUSD | 12000.87| Next Day Payment| USD Payment       | Beneficairy                      |
      | EUR Client account| Beneficiary EUR| 12      | Next Day Payment| EUR Payment       | Beneficairy                      |
      | CAD client account| CAD bene       | 127     | Next Day Payment| USD Payment         | Beneficairy                    |
    And user clicks on confirm payment button
    And user page redirect to payment confirmation screen
    And user able to view the below details
      | Transaction Number| From Account| To Account| Fee | Amount| Payment Date| Purpose of Payment |
    And user click on Manage payment button

  @ORPHAN
  Scenario: Same currency payment for Spot delivery method
    And user clicks on New Payment sub-module
      | From Account      | To Account     | Amount | Delivery Method      | Purpose of Payment| Correspondent Bank Fees paid by |
      | DDA account       | beneficiaryUSD | 12000.87| Standard/Spot Payment| USD Payment       | Beneficairy                      |
      | EUR Client account| Beneficiary EUR| 12      | Standard/Spot Payment| EUR Payment       | Beneficairy                      |
      | CAD client account| CAD bene       | 127     | Standard/Spot Payment|USD Payment        | Beneficairy                    |
    And user clicks on confirm payment button
    And user page redirect to payment confirmation screen
    And user able to view the below details
     | Transaction Number| From Account |To Account| Fee | Amount| Payment Date | Purpose of Payment |
    And user click on Manage payment button

  @ORPHAN
  Scenario: Same currency payment for Future  delivery method
    And user clicks on New Payment sub-module
      | From Account      | To Account     | Amount | Delivery Method           | Payment Date                   | Purpose of Payment           | Correspondent Bank Fees paid by |
      | DDA account       | beneficiaryUSD | 12000.87| Future Payment            | 05/01/2020                     | USD Payment                    | Beneficairy                    |
      | EUR Client account| Beneficiary EUR| 12      | Future Payment            | 05/01/2020                     | EUR Payment                    | Beneficairy                    |
      | CAD client account| CAD bene       | 127     | Future Payment            |05/01/2020                      | USD Payment                    | Beneficairy                    |
    And user clicks on confirm payment button
    And user page redirect to payment confirmation screen
    And user able to view the below details
      | Transaction Number| From Account| To Account| Fee | Amount| Payment Date | Purpose of Payment |
     And user click on Manage payment button

  @ORPHAN
  Scenario: Different currency payment for Spot delivery method
    And user clicks on New Payment sub-module
      | From Account       | To Account      | Delivery Method       | Purpose of Payment  | Correspondent Bank Fees paid by|Amount| Pay Equivalent |
      | DDA account        | Beneficiary EUR |Standard/Spot Payment  |Notes to the client  | Beneficiary                    | 1000 | EUR            |
      | DDA account        | Beneficiary EUR |Standard/Spot Payment  |Notes to the client  | Beneficiary                    | 1000 | USD            |
      | DDA account        | CAD Bene        | Standard/Spot Payment | Notes to the client | Beneficiary                    | 1000 | CAD            |
      | DDA account        | CAD Bene        | Standard/Spot Payment |Notes to the client  | Beneficiary                    | 1000 | USD            |
      | EUR client account | BeneficiaryUSD  | Standard/Spot Payment |Notes to the client  | Beneficiary                    | 1000 | EUR            |
      | EUR client account | BeneficiaryUSD  | Standard/Spot Payment |Notes to the client  | Beneficiary                    | 1000 | USD            |
      | CAD client account | BeneficiaryUSD  | Standard/Spot Payment | Notes to the client | Beneficiary                    | 1000 | CAD            |
      | CAD client account | BeneficiaryUSD  | Standard/Spot Payment | Notes to the client | Beneficiary                    | 1000 | USD            |
    And user click on Get Rate button
    And user click on Accept button
    And click on Confirm Payment
    Then system book the trade successfully
    And Generate payment confirmation details as
      | Transaction Number| From Account| To Account| Amount| Fee| Payment Date |Purpose of Payment |
     And click on Manage Payments

  @ORPHAN
  Scenario: Different currency payment for Same day delivery method
    And user clicks on New Payment sub-module
      | From Account                     | To Account         | Delivery Method                                                                   | Purpose of Payment                                                | Correspondent Bank Fees paid by               | Amount| Pay Equivalent |
      | DDA account                      | Beneficiary EUR    | Same day Payment                                                                  | Notes to the client                                               | Beneficiary                                   | 1000  | EUR            |
      | DDA account                      | Beneficiary EUR    | Same day Payment                                                                  | Notes to the client                                               | Beneficiary                                   | 1000  | USD            |
      | DDA account                      | CAD Bene           | Same day Payment                                                                  |Notes to the client                                                |Beneficiary                                    | 1000  | CAD            |
      | DDA account                      | CAD Bene           | Same day Payment                                                                  | Notes to the client                                               |Beneficiary                                    | 1000  | USD            |
      | EUR client account               |BeneficiaryUSD      | Same day Payment                                                                  | Notes to the client                                               |Beneficiary                                    | 1000  | EUR            |
      | EUR client account               |BeneficiaryUSD      | Same day Payment                                                                  | Notes to the client                                               |Beneficiary                                    | 1000  | USD            |
      | CAD client account               |BeneficiaryUSD      | Same day Payment                                                                  | Notes to the client                                               |Beneficiary                                    | 1000  | CAD            |
      | CAD client account               |BeneficiaryUSD      | Same day Payment                                                                  | Notes to the client                                               |Beneficiary                                    | 1000  | USD            |
    And user click on Get Rate button
    And user click on Accept button
    And click on Confirm Payment
    Then system book the trade successfully
    And Generate payment confirmation details as
      | Transaction Number |From Account |To Account| Amount| Fee| Payment Date |Purpose of Payment |
     And click on Manage Payments

  @ORPHAN
  Scenario: Different currency payment for Next day delivery method
    And user clicks on New Payment sub-module
      | From Account                     | To Account         | Delivery Method  | Purpose of Payment    | Correspondent Bank Fees paid by  | Amount| Pay Equivalent |
      | DDA account                      | Beneficiary EUR    | Next day Payment | Notes to the client   | Beneficiary                      | 1000  | EUR            |
      | DDA account                      | Beneficiary EUR    |Next day Payment  | Notes to the client   | Beneficiary                      | 1000  | USD            |
      | DDA account                      | CAD Bene           | Next day Payment |Notes to the client    | Beneficiary                      | 1000  | CAD            |
      | DDA account                      | CAD Bene           | Next day Payment |Notes to the client    |Beneficiary                       | 1000  | USD            |
      | EUR client account               | BeneficiaryUSD     | Next day Payment |Notes to the client    |Beneficiary                       | 1000  | EUR            |
      | EUR client account               |BeneficiaryUSD      | Next day Payment |Notes to the client    |Beneficiary                       | 1000  | USD            |
      | CAD client account               |BeneficiaryUSD      | Next day Payment |Notes to the client    |Beneficiary                       | 1000  | CAD            |
      | CAD client account               |BeneficiaryUSD      | Next day Payment |Notes to the client    |Beneficiary                       | 1000  | USD            |
    And user click on Get Rate button
    And user click on Accept button
    And click on Confirm Payment
    Then system book the trade successfully
    And Generate payment confirmation details as
     | Transaction Number| From Account| To Account| Amount |Fee |Payment Date| Purpose of Payment |
     And click on Manage Payments

  @ORPHAN
  Scenario: Different currency payment for Future delivery method
    And user clicks on New Payment sub-module
      | From Account       | To Account     | Delivery Method   | Payment date   | Purpose of Payment   | Correspondent Bank Fees paid by | Amount           | Pay Equivalent |
      | DDA account        | Beneficiary EUR| Future Payment    |     08/10/2019 |Notes to the client   | Beneficiary                     | 1000             | EUR                |
      | DDA account        | Beneficiary EUR|Future Payment     |     08/10/2019 |  Notes to the client | Beneficiary                     | 1000             | USD                |
      | DDA account        | CAD Bene       | Future Payment    |     08/10/2019 |Notes to the client   | Beneficiary                     | 1000             | CAD                |
      | DDA account        | CAD Bene       | Future Payment    |  08/10/2019    | Notes to the client  | Beneficiary                     | 1000             | USD                |
      | EUR client account | BeneficiaryUSD | Future Payment    |  08/10/2019    | Notes to the client  | Beneficiary                     | 1000             | EUR                |
      | EUR client account | BeneficiaryUSD | Future Payment    |  08/10/2019    | Notes to the client  | Beneficiary                     | 1000             | USD                |
      | CAD client account | BeneficiaryUSD | Future Payment    |  08/10/2019    | Notes to the client  | Beneficiary                     | 1000             | CAD                |
      | CAD client account |BeneficiaryUSD  | Future Payment    |  08/10/2019    | Notes to the client  | Beneficiary                     | 1000             | USD                |
    And user click on Get Rate button
    And user click on Accept button
    And click on Confirm Payment
    Then system book the trade successfully
    And Generate payment confirmation details as
      | Transaction Number| From Account |To Account |Amount |Fee| Payment Date| Purpose of Payment |
     And click on Manage Payments

  @ORPHAN
  Scenario: DDA balance validation for same currency
    Given DDA account available balance is USD 1000
    And user clicks on New Payment sub-module
      | From Account      | To Account     | Amount| Delivery Method   | Purpose of Payment| Correspondent Bank Fees paid by |
      | DDA account       | beneficiaryUSD | 1000.01| Next Day Payment| USD Payment       | Beneficairy                      |
    And user clicks on confirm payment button
    Then system will display the error message as "Your account does not have sufficient funds for this transaction."

  @ORPHAN
  Scenario: MCA balance validation for same currency
    Given EUR Client account available balance is EUR 1000
    Given CAD Client account available balance is CAD 1000
    And user clicks on New Payment sub-module
      | From Account      | To Account     | Amount| Delivery Method   | Purpose of Payment| Correspondent Bank Fees paid by |
      | EUR Client account| Beneficiary EUR| 1000.01| Next Day Payment| EUR Payment       | Beneficairy                      |
      | CAD client account| CAD bene       | 1000.01| Next Day Payment| USD Payment         | Beneficairy                    |
    And user clicks on confirm payment button
    Then system will display the error message as "Your account does not have sufficient funds for this transaction."

  @ORPHAN
  Scenario: DDA balance validation for different currency
    Given DDA account available balance is USD 1000
    And user clicks on New Payment sub-module
      | From Account     | To Account     | Delivery Method | Purpose of Payment| Correspondent Bank Fees paid by |Amount  | Pay Equivalent|
      | DDA account      | Beneficiary EUR|Same day Payment |Notes to the client| Beneficiary                     | 849.22 | EUR            |
      | DDA account      | Beneficiary EUR| Same day Payment|Notes to the client| Beneficiary                     | 1000.01| USD            |
      | DDA account      | CAD Bene       | Same day Payment|Notes to the client| Beneficiary                     | 1566.62| CAD            |
      | DDA account      | CAD Bene       | Same day Payment|Notes to the client| Beneficiary                     | 1000.01| USD            |
    And user click on Get Rate button
    Then system will display the error message as "Your account does not have sufficient funds for this transaction."

  @ORPHAN
  Scenario: MCA balance validation for different currency
    Given EUR Client account available balance is EUR 1000
    Given CAD Client account available balance is CAD 1000
    And user clicks on New Payment sub-module
      | From Account      | To Account     | Delivery Method  | Purpose of Payment  | Correspondent Bank Fees paid by        |Amount  | Pay Equivalent |
      | EUR client account| BeneficiaryUSD | Next day Payment | Notes to the client | Beneficiary                            | 849.22 | EUR            |
      | EUR client account| BeneficiaryUSD | Next day Payment |Notes to the client  | Beneficiary                            | 1000   | USD            |
      | CAD client account| BeneficiaryUSD | Next day Payment | Notes to the client | Beneficiary                            | 1566.62| CAD            |
      | CAD client account| BeneficiaryUSD | Next day Payment | Notes to the client | Beneficiary                            | 1000   | USD            |
    And user click on Get Rate button
    Then system will display the error message as "Your account does not have sufficient funds for this transaction."

  @ORPHAN
  Scenario: Same currency payment cut off time for to-account currency
    Given Set fxoffice currency wire cut off time as 2:00.
    And user clicks on New Payment sub-module after 2:00.
      | From Account      | To Account     | Amount| Delivery Method   | Purpose of Payment| Correspondent Bank Fees paid by |
      | DDA account       | beneficiaryUSD | 1000.01| Next Day Payment| USD Payment       | Beneficairy                      |
      | EUR Client account| Beneficiary EUR| 1000.01| Next Day Payment| EUR Payment       | Beneficairy                      |
      | CAD client account| CAD bene       | 1000.01| Next Day Payment| USD Payment         | Beneficairy                    |
    And user clicks on confirm payment button
    Then system will display the error message as "You have past the payment cutoff time"

  @ORPHAN
  Scenario: Different currency payment cut off time for from-account currency
    Given Set fxoffice currency wire cut off time as 2:00.
    And user clicks on New Payment sub-module after 2:00.
    And user clicks on New Payment sub-module
      | From Account     | To Account      | Delivery Method  | Purpose of Payment  | Correspondent Bank Fees paid by|Amount  | Pay Equivalent |
      | DDA account      | Beneficiary EUR |Same day Payment  | Notes to the client | Beneficiary                    | 849.22 | EUR            |
      | DDA account      | Beneficiary EUR | Same day Payment | Notes to the client | Beneficiary                    | 1000.01| USD            |
      | DDA account      | CAD Bene        | Same day Payment | Notes to the client | Beneficiary                    | 1566.62| CAD            |
      | DDA account      | CAD Bene        | Same day Payment | Notes to the client | Beneficiary                    | 1000.01| USD            |
    And user click on Get Rate button
    Then system will display the error message as "You have past the payment cutoff time"

  @ORPHAN
  Scenario: Different currency cut off time for to-account currency
    Given Set fxoffice currency wire cut off time as 2:00.
    And user clicks on New Payment sub-module after 2:00.
    And user clicks on New Payment sub-module
      | From Account      | To Account     | Delivery Method | Purpose of Payment | Correspondent Bank Fees paid by |Amount  | Pay Equivalent |
      | EUR client account| BeneficiaryUSD | Next day Payment| Notes to the client| Beneficiary                     | 849.22 | EUR            |
      | EUR client account| BeneficiaryUSD | Next day Payment| Notes to the client| Beneficiary                     | 1000   | USD            |
      | CAD client account| BeneficiaryUSD | Next day Payment| Notes to the client| Beneficiary                     | 1566.62| CAD            |
      | CAD client account| BeneficiaryUSD | Next day Payment| Notes to the client| Beneficiary                     | 1000   | USD            |
    And user click on Get Rate button
    Then system will display the error message as "You have past the payment cutoff time"

  @ORPHAN @MANUAL
  Scenario: Verify listing all active from account

  @ORPHAN @MANUAL
  Scenario: Verify listing all active to account.
