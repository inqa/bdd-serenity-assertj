package io.inqa.finders.AddMovieDialog;

import io.inqa.ApplicationSingleton;
import io.inqa.finders.MainFrame;
import org.assertj.swing.core.Robot;
import org.assertj.swing.fixture.DialogFixture;
import org.assertj.swing.fixture.FrameFixture;

import static io.inqa.finders.AddMovieDialog.AddMovieFinders.*;
import static io.inqa.finders.AddMovieDialog.AddMovieFinders.addMovieDialogAddButton;
import static io.inqa.finders.AddMovieDialog.AddMovieFinders.addMovieDialogCommentsFinder;

/**
 * Created by Andrew on 24/02/2017.
 */
public class AddMovieActions extends MainFrame {

    public static void fillInAddMovieDialog(String movieName, String movieDate, String movieRating, String movieComments) {
        FrameFixture frame = ApplicationSingleton.getInstance().getFrame();
        Robot robot = ApplicationSingleton.getInstance().getRobot();

        DialogFixture addMovieDialog = frame.dialog(addMovieDialogFinder).requireVisible();
        addMovieDialog.focus();
        addMovieDialog.textBox(addMovieDialogMovieNameFinder).requireVisible().enterText(movieName);
        addMovieDialog.textBox(addMovieDialogDateFinder).requireVisible().enterText(movieDate);
        addMovieDialog.textBox(addMovieDialogRatingFinder).requireVisible().enterText(movieRating);
        addMovieDialog.textBox(addMovieDialogCommentsFinder).requireVisible().enterText(movieComments);
        addMovieDialog.button(addMovieDialogAddButton).requireVisible().click();
    }
}
