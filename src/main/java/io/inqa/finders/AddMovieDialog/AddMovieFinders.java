package io.inqa.finders.AddMovieDialog;

import io.inqa.finders.MainFrame;
import org.assertj.swing.core.GenericTypeMatcher;

import javax.swing.*;

/**
 * Created by Andrew on 18/02/2017.
 */
public class AddMovieFinders extends MainFrame {

    //FINDERS...

    /**
     * Find the dialog for adding movies, assuming it's open
     */
    public static GenericTypeMatcher<JDialog> addMovieDialogFinder = new GenericTypeMatcher<JDialog>(
            JDialog.class) {
        @Override
        protected boolean isMatching(final JDialog loginDialog) {
            return loginDialog.isVisible();
        }
    };

    /**
     * Find the name field on the "Add Movie" dialog
     */
    public static GenericTypeMatcher<JTextField> addMovieDialogMovieNameFinder = new GenericTypeMatcher<JTextField>(
            JTextField.class) {
        @Override
        protected boolean isMatching(final JTextField movieName) {
            if (movieName.getY() == 16 && movieName.isVisible()){
                return true;
            }
            else {
                return false;
            }
        }
    };

    /**
     * Find the rating field on the "Add Movie" dialog
     */
    public static GenericTypeMatcher<JTextField> addMovieDialogRatingFinder = new GenericTypeMatcher<JTextField>(
            JTextField.class) {
        @Override
        protected boolean isMatching(final JTextField movieRating) {
            if (movieRating.getY() == 92 && movieRating.isVisible()){
                return true;
            }
            else {
                return false;
            }
        }
    };

    /**
     * Find the date field on the "Add Movie" dialog
     */
    public static GenericTypeMatcher<JTextField> addMovieDialogDateFinder = new GenericTypeMatcher<JTextField>(
            JTextField.class) {
        @Override
        protected boolean isMatching(final JTextField movieDate) {
            if (movieDate.getY() == 54 && movieDate.isVisible()){
                return true;
            }
            else {
                return false;
            }
        }
    };

    /**
     * Find the comments field on the "Add Movie" dialog
     */
    public static GenericTypeMatcher<JTextField> addMovieDialogCommentsFinder = new GenericTypeMatcher<JTextField>(
            JTextField.class) {
        @Override
        protected boolean isMatching(final JTextField movieComments) {
            if (movieComments.getY() == 130 && movieComments.isVisible()){
                return true;
            }
            else {
                return false;
            }
        }
    };

    /**
     * Find the add button on the "Add Movie" dialog
     */
    public static GenericTypeMatcher<JButton> addMovieDialogAddButton = new GenericTypeMatcher<JButton>(
            JButton.class) {
        @Override
        protected boolean isMatching(final JButton addButton) {
            if(addButton.getText().equals("Add")){
                return true;
            }
            else {
                return false;
            }
        }
    };


}
