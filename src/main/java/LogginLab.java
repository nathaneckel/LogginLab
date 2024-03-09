import java.util.logging.Level;
import java.util.logging.Logger;
// Copied LogginLabTest into NewTest and will improve later. Write a test for the method in the Test class.
public class LogginLab {
    private final static Logger logger = Logger.getLogger(LogginLab.class.getName());

    private Integer userInput = 0;
    public LogginLab() {
        this.userInput = 0;
    }
    public static void main(String[] args) {

        logger.log(Level.INFO, "Hello World!");
        logger.log(Level.WARNING, "Not So Bad Error!");
        logger.log(Level.SEVERE, "Terrible Error!, SHUT DOWN THE NUCLEAR REACTOR STRAIGHTAWAY, ELSE EARTH AND THE GALAXY UP TO AND INCLUDING 5 PARSECs WILL SURELY BE OBLITERATED");
        logger.log(Level.INFO, "****\n\tAt ZipCode, " +
                "\n\twe don't use System.out.Println \n\tuntil we've earned the right.\n****");
    }
    public Integer getUserInput() {return this.userInput;
    }
    public void setUserInput(Integer userInput) {
        this.userInput = userInput;
    }


    public boolean userInputReached(Integer limit) {
        if (this.userInput == limit)
            return true;
        else
            return false;
    }
    public boolean userInputExceeds(Integer limit) {
        if (this.userInput > limit)
          return true;
        else
            return false;
    }

    public boolean userInputEgregiouslyExceeds(Integer limit) {
        if (this.userInput > limit)
            return true;
        else
            return false;
    }
    // OK - Write a method called thresholdReached, returns true if argument 'limit' is over the threshold.
    }
/* HERES WHAT I NEED TO DO:
- DONE - ---------------------------------------CREATE LOGGER OBJECT
- CREATE LOGGER METHOD (THRESHOLD REACHED) to log messages
- If OVER THRESHOLD REACHED = TRUE
- create THRESHOLD EXCEEDS for the pattern
- write TEST METHOD in TEST class
(ALWAYS write a test for a method. Create Method, create TEST).
- CONFIGURE to output messages to a file console or other output stream
- EXCEPTIONS - to identify cause of errors
[Title vs lowerclass]
 */