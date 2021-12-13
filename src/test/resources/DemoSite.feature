
Feature: DemoSite

@First
Scenario: Verify text
Given The user wants to go to url.
When The user wants to see "Mother Elephant With Babies Soft Toy"


  @Second
  Scenario: Verify price.
  Given The user wants to see price as "Price: $20"

    @Third
    Scenario: Verify if url contains some words
    Given The user wants to see that thee url contains "payment-gateway"

      @Forth
      Scenario:Verify Payment
      Given  The user want to see quantity is "5"
      When The user wants to click buy now button
      Then The user wants to fill out some information
      |Card Number|1234567890123456|
      |Expriation Month|01         |
      |Expiration Year |2028       |
      |CVV Code        |123        |
      Then The user wants to click pay button
      Then The user wants to see the sentence "Payment successfull!"

        @Fifth
        Scenario Outline:Verify!!
        Given The user wants to see some "<Quantities>"
          When The user wants to click buy button
          Then The user wants to enter card info
          And The user wants to click last button
          Then The user wants "Payment successfull!"
          Examples:
          |Quantities|
          |5        |
          |8        |
          |9        |
          |2        |
          |2        |



