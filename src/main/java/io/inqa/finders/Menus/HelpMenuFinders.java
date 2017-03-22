package io.inqa.finders.Menus;

import io.inqa.ApplicationSingleton;
import io.inqa.finders.MainFrame;
import org.assertj.swing.fixture.FrameFixture;
import org.assertj.swing.fixture.JMenuItemFixture;

/**
 * Created by Andrew on 24/02/2017.
 */
public class HelpMenuFinders extends MainFrame {

    public static void menuHelpAboutClick(){
        FrameFixture frame = ApplicationSingleton.getInstance().getFrame();
        JMenuItemFixture helpAbout = frame.menuItemWithPath("Help", "About");
        helpAbout.click();
    }
}
