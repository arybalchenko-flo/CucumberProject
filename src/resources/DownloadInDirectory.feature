Feature: I want to download file in the selected directory

  Background: Open page
    When I open the main page
    Then Page opened

  Scenario: Download
    Given I click on the download button
    When I wait until download is finished
    And File with filename "pexels-nguyen-duc-10757932.jpg" downloaded
    Then I check file availability














