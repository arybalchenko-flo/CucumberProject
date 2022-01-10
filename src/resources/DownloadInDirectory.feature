Feature: I want to download file in the selected directory

  Background: Open page
    When I open the main page
    Then Page opened

  Scenario: Download
    When I move to the photo
    And I click on the download button
    Then I wait until download is finished












