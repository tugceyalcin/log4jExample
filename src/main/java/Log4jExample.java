import org.apache.log4j.Logger; //log4j lib including

public class Log4jExample {

    private static final Logger logger = Logger.getLogger(Log4jExample.class); //creating object

    public static void main(String[] args) {

        logger.info("STARTED!");
        logger.trace("Trace");
        logger.debug("Debug");
        logger.info("Info");
        logger.warn("Warn");
        logger.error("Error");
        logger.fatal("Fatal");

        logger.info("FINISHED!");
    }



}
