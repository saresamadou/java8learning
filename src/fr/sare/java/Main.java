package fr.sare.java;

import fr.sare.java.interfacetesting.impl.IntefaceFeatureTestingImpl;

/**
 * Main class for testing java 8 features
 */
public class Main {

    public static void main(String[] args) {
        IntefaceFeatureTestingImpl intefaceFeatureTesting = new IntefaceFeatureTestingImpl();
        intefaceFeatureTesting.talkAboutMe();
        assert(true);
    }
}
