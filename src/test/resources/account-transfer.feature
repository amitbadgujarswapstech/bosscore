Feature: Account transfer

  Payment module

  Background:
    Given I launch the application "Boss URL"
    And user enters username "Testuser1" and password "Password@1"
    And user clicks on Login Button
    #And user clicks on Payment module

  @ORPHAN
  Scenario: Same currency transfer for same day delivery method.
    And user click on account transfer sub-module
     |From Account        |To Account           |Delivery Method  |Amount|
     | EUR Client account | EUR Client account2 |Same Day Transfer| 400  |
     | CAD client account | CAD client account2 |Same Day Transfer| 300  |
    And user click on confirm transfer button
    And user page redirect to Transfer confirmation screen
    And user able to view the below details
      | Transaction Number| From Account |To Account| Amount| Transfer Date |
      |                   |              |          |       |               |
      |                   |              |          |       |               |
    And user click on Manage payment button

  @ORPHAN
  Scenario: Different currency transfer for same day delivery method
    And user click on account transfer sub-module
     |From Account       |To Account        |Delivery Method  |Amount|Transfer Equivalent|
     | EUR Client account|DDA Account       |Same Day Transfer| 400  |        USD        |
     | CAD client account|DDA Account       |Same Day Transfer| 300  |        USD        |
     | DDA Account       |EUR Client account|Same Day Transfer| 400  |        USD        |
     | DDA Account       |CAD client account|Same Day Transfer| 300  |        USD        |
     | EUR Client account|DDA Account       |Same Day Transfer| 400  |        EUR        |
     | CAD client account|DDA Account       |Same Day Transfer| 300  |        CAD        |
     | DDA Account       |EUR Client account|Same Day Transfer| 400  |        EUR        |
     | DDA Account       |CAD client account|Same Day Transfer| 300  |        CAD        |
    And user click on confirm transfer button
    And user click on Get Rate button
    And user click on accept button
    And user page redirect to Transfer confirmation screen
    And user able to view the below details
      | Transaction Number| From Account |To Account| Amount| Transfer Date |
      |                   |              |          |       |               |
      |                   |              |          |       |               |
    And user click on Manage payment button

  @ORPHAN
  Scenario: Different currency transfer for Next day delivery method
    And user click on account transfer sub-module
     |From Account       |To Account        |Delivery Method  |Amount|Transfer Equivalent|
     | EUR Client account|DDA Account       |Next Day Transfer| 400  |        USD        |
     | CAD client account|DDA Account       |Next Day Transfer| 300  |        USD        |
     | DDA Account       |EUR Client account|Next Day Transfer| 400  |        USD        |
     | DDA Account       |CAD client account|Next Day Transfer| 300  |        USD        |
     | EUR Client account|DDA Account       |Next Day Transfer| 400  |        EUR        |
     | CAD client account|DDA Account       |Next Day Transfer| 300  |        CAD        |
     | DDA Account       |EUR Client account|Next Day Transfer| 400  |        EUR        |
     | DDA Account       |CAD client account|Next Day Transfer| 300  |        CAD        |
    And user click on confirm transfer button
    And user click on Get Rate button
    And user click on accept button
    And user page redirect to Transfer confirmation screen
    And user able to view the below details
      | Transaction Number| From Account |To Account| Amount| Transfer Date |
      |                   |              |          |       |               |
      |                   |              |          |       |               |
      |                   |              |          |       |               |
      |                   |              |          |       |               |
      |                   |              |          |       |               |
      |                   |              |          |       |               |
      |                   |              |          |       |               |
      |                   |              |          |       |               |
    And user click on Manage payment button

  @ORPHAN
  Scenario: Different currency transfer for Spot transfer delivery method.
    And user click on account transfer sub-module
     |From Account       |To Account        |Delivery Method       |Amount|Transfer Equivalent|
     | EUR Client account|DDA Account       |Standard/Spot Transfer| 400  |        USD        |
     | CAD client account|DDA Account       |Standard/Spot Transfer| 300  |        USD        |
     | DDA Account       |EUR Client account|Standard/Spot Transfer| 400  |        USD        |
     | DDA Account       |CAD client account|Standard/Spot Transfer| 300  |        USD        |
     | EUR Client account|DDA Account       |Standard/Spot Transfer| 400  |        EUR        |
     | CAD client account|DDA Account       |Standard/Spot Transfer| 300  |        CAD        |
     | DDA Account       |EUR Client account|Standard/Spot Transfer| 400  |        EUR        |
     | DDA Account       |CAD client account|Standard/Spot Transfer| 300  |        CAD        |
    And user click on Get Rate button
    And user click on accept button
    And user click on confirm transfer button
    And user page redirect to Transfer confirmation screen
    And user able to view the below details
      | Transaction Number| From Account |To Account| Amount| Transfer Date |
      |                   |              |          |       |               |
      |                   |              |          |       |               |
      |                   |              |          |       |               |
      |                   |              |          |       |               |
      |                   |              |          |       |               |
      |                   |              |          |       |               |
      |                   |              |          |       |               |
      |                   |              |          |       |               |
    And user click on Manage payment button

  @ORPHAN
  Scenario: DDA to DDA account transfer
    And user click on account transfer sub-module
     |From Account  |To Account |                  
     | DDA account2 |DDA Account|
    Then System will display "DDA to DDA Account transfer is not allowed"
    

  @ORPHAN
  Scenario: MCA balance validation for same currency
    Given EUR Client account available balance is EUR 1000
    Given CAD Client account available balance is CAD 1000
    And user clicks on account transfer sub-module
     |From Account        |To Account           |Delivery Method  |Amount  |
     | EUR Client account | EUR Client account2 |Same Day Transfer| 1000.01|
     | CAD client account | CAD client account2 |Same Day Transfer| 1000.01|
    And user clicks on transfer payment button
    Then system will display the error message as "Your account does not have sufficient funds for this transaction."

  @ORPHAN
  Scenario: DDA balance validation for different currency
    Given DDA account available balance is USD 1000
    And user clicks on Account transfer sub-module
      |From Account       |To Account        |Delivery Method  |Amount  |Transfer Equivalent|
     | DDA Account       |EUR Client account|Same Day Transfer| 1000.01|        USD        |
     | DDA Account       |CAD client account|Same Day Transfer| 1000.01|        USD        |
     | DDA Account       |EUR Client account|Same Day Transfer| 900    |        EUR        |
     | DDA Account       |CAD client account|Same Day Transfer| 9000   |        CAD        |
    And user click on Get Rate button
    Then system will display the error message as "Your account does not have sufficient funds for this transaction."

  @ORPHAN
  Scenario: MCA balance validation for different currency
    Given EUR Client account available balance is USD 1000
    Given CAD Client account available balance is CAD 1000
    And user clicks on Account transfer sub-module
      |From Account       |To Account |Delivery Method  |Amount  |Transfer Equivalent|
     | EUR Client account|DDA account|Same Day Transfer| 1000.01|        USD        |
     | CAD Client account|DDA account|Same Day Transfer| 1000.01|        USD        |
     | EUR Client account|DDA account|Same Day Transfer| 900    |        EUR        |
     | CAD Client account|DDA account|Same Day Transfer| 9000   |        CAD        |
    And user click on Get Rate button
    Then system will display the error message as "Your account does not have sufficient funds for this transaction."
