#Author : Luis Alejandro Aguirre Sossa

  Feature: Sign up process
    As a demoblaze' new user
    i want to do process on demoblaze page
    for make a register with my credentials


  @Register
  Scenario: Register
    Given  User without credentials
    When User got information for to make a new credentials
    Then System show that register was successful