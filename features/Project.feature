Feature: Project
  Creating and saving projects

  Scenario: Testing project ID
    When An employee creates the first project
    Then The project ID is 22001
    Then An employee creates another project
    Then The next project ID is 22002

  Scenario: Testing project creation
    When An employee creates a project with the name SystemProgram
    Then A project called SystemProgram is saved

  Scenario: Testing project creation of an already existing project
    Given There is already a project called Testing
    When An employee tries to create a project called Testing
    Then the project isn't created

