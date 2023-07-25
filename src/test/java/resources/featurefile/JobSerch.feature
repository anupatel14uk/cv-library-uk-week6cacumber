@regression
Feature: Job Search Test
  As user I want to search job website

  @smoke
  Scenario Outline:verify Job Search Result Using Different DataSet
    Given I am om job Search page
    When  I click on accept alert cookie button
    And   I click on enter job titile "<jobTitle>"
    And   I click on enter location  "<jobLocation>"
    And   I click on select the distance "<jobDistance>"
    And   I click on search option link
    And   I click on enter minimum salary  "<jobMinSalary>"
    And   I click on enter maximum salary  "<jobMaxSalary>"
    And   I click on enter salary type  "<jobSalaryType>"
    And   I click on enter job type  "<jobType>"
    And   I click on find between
    Then  I click on verify the result  "<jobResult>"

    Examples:
      | jobTitle           | jobLocation                        | jobDistance | jobMinSalary | jobMaxSalary | jobSalaryType | jobType   | jobResult                                      |
      | Tester             | Harrow on the Hill, Greater London | 5 miles     | 30000        | 50000        | Per annum     | Permanent | Permanent Tester jobs in Harrow on the Hill    |
      | Software           | Pitsea, Essex                      | 15 miles    | 35000        | 55000        | Per annum     | Permanent | Permanent Software jobs in Pitsea              |
      | Manager            | Ilford, Greater London             | 2 miles     | 35000        | 55000        | Per annum     | Permanent | Permanent Manager jobs in Ilford               |
      | Bookkeeper         | Bishops Hatfield, Hertfordshire    | 10 miles    | 35000        | 55000        | Per annum     | Permanent | Permanent Bookkeeper jobs in Hatfield          |
      | Sales Manager      | Lincoln, Lincolnshire              | 15 miles    | 35000        | 55000        | Per annum     | Permanent | Permanent Sales Manager jobs in Lincoln        |
      | Software Developer | Kingswood, South Gloucestershire   | 100 miles   | 35000        | 55000        | Per annum     | Permanent | Permanent Software Developer jobs in Kingswood |