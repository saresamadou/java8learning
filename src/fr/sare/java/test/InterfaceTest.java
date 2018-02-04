package fr.sare.java.test;

import static org.junit.Assert.assertEquals;

import fr.sare.java.interfacetesting.InterfaceFeatureTesting;
import fr.sare.java.interfacetesting.impl.IntefaceFeatureTestingImpl;
import org.junit.Test;

public class InterfaceTest {
    private static long SINUS_EXPECTED_VALUE = 1L;

    @Test
    public void canUseDefaultMethodInInterface() {
        InterfaceFeatureTesting intefaceFeatureTesting = new IntefaceFeatureTestingImpl();
        assertEquals("Wrong sinus value",intefaceFeatureTesting.talkAboutMe(), SINUS_EXPECTED_VALUE);
    }
}
