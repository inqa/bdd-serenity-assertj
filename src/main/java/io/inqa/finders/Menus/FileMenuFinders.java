package io.inqa.finders.Menus;

import io.inqa.ApplicationSingleton;
import io.inqa.finders.MainFrame;
import org.assertj.swing.core.Robot;
import org.assertj.swing.fixture.FrameFixture;
import org.assertj.swing.fixture.JMenuItemFixture;

/**
 * Created by Andrew on 18/02/2017.
 */
public class FileMenuFinders extends MainFrame {

    /**
     * Action to select the "File - Add..." menu item
     */
    public static void menuFileAddClick(){
        FrameFixture frame = ApplicationSingleton.getInstance().getFrame();
        JMenuItemFixture fileAdd = frame.menuItemWithPath("File", "Add...");
        fileAdd.click();
    }
}
