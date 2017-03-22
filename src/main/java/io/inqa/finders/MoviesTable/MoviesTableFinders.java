package io.inqa.finders.MoviesTable;

import io.inqa.finders.MainFrame;
import org.assertj.swing.core.GenericTypeMatcher;

import javax.swing.*;

/**
 * Created by Andrew on 24/02/2017.
 */
public class MoviesTableFinders extends MainFrame {

    /**
     * Find the main table listing movies
     */
    public static GenericTypeMatcher<JTable> moviesTableFinder = new GenericTypeMatcher<JTable>(
            JTable.class) {
        @Override
        protected boolean isMatching(final JTable moviesTable) {
            return moviesTable.isVisible();
        }
    };
}
