import java.util.logging.Level;
import java.util.logging.Logger;

import static org.junit.Assert.*;

public class LogginLabTest {
    private final static Logger logger = Logger.getLogger(LogginLab.class.getName());

    @org.junit.Before
    public void setUp() throws Exception {
    }

    @org.junit.After
    public void tearDown() throws Exception {
    }

    @org.junit.Test
    public void userInputReached() {
        Integer finalLimit = 5;

        LogginLab lab = new LogginLab();
        lab.setUserInput(finalLimit);

        for (Integer i = 1; i <= finalLimit; i++) {
            if (lab.userInputReached(i)) {
                logger.log(Level.INFO, "Threshold (userInput) not reached! It is " + i);
                assertTrue(lab.userInputReached(i));
            } else {
                logger.log(Level.INFO, "Threshold (userInput) finally reached!");
                assertFalse(lab.userInputReached(i));
            }
        }
    }

    @org.junit.Test
    public void userInputExceeds() {
        Integer finalLimit = 5;

        LogginLab lab = new LogginLab();
        lab.setUserInput(finalLimit);

        for (Integer i = 1; i <= finalLimit; i++) {
            if (lab.userInputExceeds(i)) {
                //SUBSTITUTE THE EXCEED LANGUAGE IN THE MESSAGE BELOW (not "reached"

                logger.log(Level.WARNING, "Not So Bad Error!");
                assertTrue(lab.userInputExceeds(i));
            } else {
                logger.log(Level.INFO, "Threshold finally reached!");
                assertFalse(lab.userInputExceeds(i));
            }
        }


    }

    @org.junit.Test
    public void userInputEgregiouslyExceeds() {
        Integer finalLimit = 9;

        LogginLab lab = new LogginLab();
        lab.setUserInput(finalLimit);

        for (Integer i = 1; i <= finalLimit; i++) {
            if (lab.userInputEgregiouslyExceeds(i)) {
                //SUBSTITUTE THE EXCEED LANGUAGE IN THE MESSAGE BELOW (not "reached"

                logger.log(Level.SEVERE, "Terrible Error!, SHUT DOWN THE NUCLEAR REACTOR STRAIGHTAWAY, ELSE EARTH AND THE GALAXY UP TO AND INCLUDING 5 PARSECs WILL SURELY BE OBLITERATED");
                assertTrue(lab.userInputEgregiouslyExceeds(i));
            } else {
                logger.log(Level.INFO, "Threshold (userInput) finally reached!");
                assertFalse(lab.userInputEgregiouslyExceeds(i));
            }
        }


    }
}