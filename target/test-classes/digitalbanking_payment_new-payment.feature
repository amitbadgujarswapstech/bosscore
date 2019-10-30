Feature: DigitalBanking_Payment_New Payment

  Background:
    Given I launch the FXBOSS application
    And I enter correct username and password 
     |Username   |Password    |  
     |Automation1|passdowrd@12|
    And Click on Login Button
    
    Then I am login into application
    And click on Payment Module
    And Click on New Payment 

  @ORPHAN @E2E @Payment @Spot @MANUAL
  Scenario: Payment_New Payment_Spot
    Given Trade Date is <TradeDate>
    |TradeDate|09/19/2019|
    
    When User enter values
     |From Account    |To Account            |Delivery Method      |Purpose of Payment |Correspondent Bank Fees paid by|Amount|
     |DDA....0000(USD)|EUR....3000(EUR)      |Standard/Spot Payment|Notes to the client|Beneficiary                    |1000  |
     |DDA....0000(USD)|EUR....6333(EUR)      |SameDayPayment       |Notes to the client|Beneficiary                    |1000  |
     |DDA....0000(USD)|FRANCE BENE..2606(EUR)|NextDayPayment       |Notes to the Client|Remitter                       |1000  |
    And click on Get Rate button
    And Accept the Rate
    And click on Confirm Payment
    
    Then system book the trade successfully
    And Generate payment confirmation details as
     |Transaction Number|From Account|To Account     |Amount      |Fee      |Payment Date|Purpose of Payment |
     |55114             |DDA Account |EUR BENEFICIARY|EUR 1,000.00|USD 13.25|09/23/2019  |Notes to the client|
     |55116             |DDA Account |EUR BENE       |EUR 1,000.00|USD 13.25|09/19/2019  |Notes to the client|
     |55117             |DDA Account |FRANCE BENE    |EUR 1,000.00|USD 13.25|09/20/2019  |Notes to the client|
    And click on Manage Payments
    And Check Recent Payment block
    And Payment must be in Approved Status
