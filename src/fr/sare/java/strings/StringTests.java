package fr.sare.java.strings;

import org.apache.commons.lang3.StringUtils;
import org.junit.Assert;
import org.junit.Test;

import java.util.StringJoiner;

public class StringTests {

    @Test
    public void testJoiner() {
        StringJoiner joiners = new StringJoiner(" ");
        joiners.add("SARE").add("Aboudou").add("Samadou");

        Assert.assertEquals("SARE ABOUDOU SAMADOU",StringUtils.upperCase( joiners.toString()));

    }

}
