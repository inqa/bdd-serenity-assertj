package io.inqa;

import org.assertj.swing.core.Robot;
import org.assertj.swing.fixture.DialogFixture;
import org.assertj.swing.fixture.FrameFixture;

/**
 * Created by Andrew on 18/02/2017.
 */
public class ApplicationSingleton {

    private ApplicationSingleton() {}

    private static ApplicationSingleton applicationSingleton = new ApplicationSingleton();

    public static ApplicationSingleton getInstance() {
        return applicationSingleton;
    }

    public FrameFixture frame = null;

    public FrameFixture getFrame() {
        return frame;
    }

    public void setFrame (FrameFixture frame) {
        this.frame = frame;
    }

    public Robot robot = null;

    public Robot getRobot() {
        return robot;
    }

    public void setRobot(Robot robot) {
        this.robot = robot;
    }

    public DialogFixture dialog = null;

    public DialogFixture getDialog() {
        return dialog;
    }

    public void setDialog(DialogFixture dialog){
        this.dialog = dialog;
    }

}
