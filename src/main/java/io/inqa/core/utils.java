package io.inqa.core;

import io.inqa.ApplicationSingleton;
import org.assertj.swing.core.BasicRobot;
import org.assertj.swing.core.Robot;
import org.assertj.swing.finder.WindowFinder;
import org.assertj.swing.fixture.FrameFixture;
import org.assertj.swing.launcher.ApplicationLauncher;

import static io.inqa.finders.MainFrame.mainFrameByTitleFinder;

/**
 * Created by Andrew on 18/02/2017.
 */
public class utils {

    public static void  startup() {
        ApplicationLauncher
                .application(io.inqa.movies.LaunchApplication.class)
                .start();

        Robot robot = BasicRobot.robotWithCurrentAwtHierarchy();
        FrameFixture frame = WindowFinder.findFrame(mainFrameByTitleFinder("My Movies - MOVIESUSER")).using(robot);

        ApplicationSingleton.getInstance().setRobot(robot);
        ApplicationSingleton.getInstance().setFrame(frame);

        frame.focus();
    }

    public static void tearDown() {
        FrameFixture frame = ApplicationSingleton.getInstance().getFrame();
        frame.cleanUp();

        ApplicationSingleton.getInstance().setFrame(null);
        ApplicationSingleton.getInstance().setRobot(null);
    }

}
