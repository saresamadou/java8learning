package fr.sare.java.utils;

import org.apache.log4j.Logger;

import java.text.MessageFormat;

/**
 * Logger  for technical information
 */
public final class LoggerTechnique {

    private final static String LOGGER_NAME = "LOGGER_TECHNIQUE";
    private final static Logger logger = Logger.getLogger(LOGGER_NAME);


    /**
     * Private constructor to avoid instantiation
     */
    private LoggerTechnique() {

    }

    public static void LogInfo(String info) {
        if (logger.isInfoEnabled()) {
            logger.info(MessageFormat.format("Log : {0}", info));
        }
    }
}
