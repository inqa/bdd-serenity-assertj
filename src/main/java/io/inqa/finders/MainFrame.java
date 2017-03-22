package io.inqa.finders;

import org.assertj.swing.core.GenericTypeMatcher;
import org.assertj.swing.dependency.jsr305.Nonnull;

import javax.swing.*;

/**
 * Created by Andrew on 18/02/2017.
 */
public class MainFrame {

    /**
     * Find the main window of the application
     * @param title
     * @return
     */
    public static GenericTypeMatcher<javax.swing.JFrame> mainFrameByTitleFinder(
            final String title) {
        GenericTypeMatcher<javax.swing.JFrame> textMatcher = new GenericTypeMatcher<JFrame>(
                javax.swing.JFrame.class) {
            @Override
            protected boolean isMatching(JFrame jFrame) {
                return (title.replace(" ","")).equals(jFrame.getTitle().replace(" ",""));
            }
        };
        return textMatcher;
    }





}
