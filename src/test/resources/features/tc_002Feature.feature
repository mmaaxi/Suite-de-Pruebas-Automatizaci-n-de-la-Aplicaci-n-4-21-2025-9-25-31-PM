Feature: Article Creation

  Scenario: Successfully creating a new article
    Given the user is on the homepage
    When the user clicks on the "Nuevo Artículo" button
    Then the create article form should be displayed
    When the user completes the form and submits it
    Then the article should be created successfully