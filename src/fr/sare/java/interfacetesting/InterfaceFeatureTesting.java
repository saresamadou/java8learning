package fr.sare.java.interfacetesting;

import fr.sare.java.utils.LoggerTechnique;

/**
 * interface for testing java 8 new interface feature
 */
public interface InterfaceFeatureTesting {

    final static String ABOUT = "Message form default method in java 8, cool or works";

    default long talkAboutMe() {
        LoggerTechnique.LogInfo(ABOUT);
        LoggerTechnique.LogInfo(String.valueOf(calculateSinus()));
        return calculateSinus();
    }

    static long calculateSinus() {
         return calculateSinus(1);
     }

    static long calculateSinus(int value) {
        return Math.round(Math.cos(value));
    }
}
