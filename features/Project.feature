Feature: Project
  Creating and saving projects

  Scenario: Testing project creation
    When An employee creates a project with the name SystemProgram
    Then A project called SystemProgram is saved

  Scenario: Testing project creation of an already existing project
    Given There is already a project called Testing
    When An employee tries to create a project called Testing
    Then A message "This project name is already in use" is printed