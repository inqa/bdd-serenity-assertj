@inprogress
Feature: A basic test to ensure Cucumber and Assertj are working

  Scenario: An initial scenario
    Given I have no data in the application
    When I add a movie with name "Avatar" and date "2016-03-05" and rating "5" and comments "Amazing!!"
    Then the movie "Avatar" should appear first in the list of movies
