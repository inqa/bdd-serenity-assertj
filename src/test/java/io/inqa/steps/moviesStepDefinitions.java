package io.inqa.steps;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.inqa.ApplicationSingleton;
import org.assertj.swing.core.Robot;
import org.assertj.swing.fixture.*;

import static io.inqa.core.utils.*;
import static io.inqa.finders.AddMovieDialog.AddMovieActions.fillInAddMovieDialog;
import static io.inqa.finders.AddMovieDialog.AddMovieFinders.*;
import static io.inqa.finders.MoviesTable.MoviesTableFinders.*;
import static io.inqa.finders.Menus.FileMenuFinders.*;
import static org.assertj.swing.data.TableCell.row;
import static org.junit.Assert.assertEquals;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


/**
 * Created by Andrew on 18/02/2017.
 */
public class moviesStepDefinitions {

    private static final Logger LOGGER = LoggerFactory.getLogger(moviesStepDefinitions.class);

    /**
     * Action to add a movie via the File - Add menu
     * @param movieName
     * @param movieDate
     * @param movieRating
     * @param movieComments
     */
    @When("^I add a movie with name \"([^\"]*)\" and date \"([^\"]*)\" and rating \"([^\"]*)\" and comments \"([^\"]*)\"$")
    public void i_add_a_movie_with_name_and_rating_and_date_and_comments(String movieName, String movieDate, String movieRating, String movieComments) {
        menuFileAddClick();
        fillInAddMovieDialog(movieName, movieDate, movieRating, movieComments);
    }

    /**
     * Ensures we have no data in the application. Includes and assertion to check this before we proceed
     */
    @Given("^I have no data in the application$")
    public void i_have_no_data_in_the_application() {
        FrameFixture frame = ApplicationSingleton.getInstance().getFrame();
        Robot robot = ApplicationSingleton.getInstance().getRobot();

        JTableFixture mainMoviesTable = frame.table(moviesTableFinder).requireVisible();
        Integer numberOfRows = mainMoviesTable.rowCount();
        LOGGER.info("Verifying the table is empty before proceeding");
        assertEquals((Integer) 0, numberOfRows);
    }

    /**
     * Check the first movie name
     * @param movieName
     */
    @Then("^the movie \"([^\"]*)\" should appear first in the list of movies$")
    public void the_movie_should_appear_in_the_list_of_movies(String movieName) {
        FrameFixture frame = ApplicationSingleton.getInstance().getFrame();
        Robot robot = ApplicationSingleton.getInstance().getRobot();

        JTableFixture mainMoviesTable = frame.table(moviesTableFinder).requireVisible();
        String firstTitle = mainMoviesTable.cell(row(0).column(0)).value();
        LOGGER.info("Checking that movieName is: " + firstTitle);
        assertEquals(movieName, firstTitle);

    }

    /**
     * Starts the application before each scenario runs
     */
    @Before
    public void runMoviesApplication() {
        startup();
    }

    /**
     * Clears the application down after each scenario
     */
    @After
    public void cleardownTheApplication() {
        tearDown();
    }
}
