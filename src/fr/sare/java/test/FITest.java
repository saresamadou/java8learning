package fr.sare.java.test;

import fr.sare.java.enums.EnumGender;
import fr.sare.java.functionalinterface.Person;
import fr.sare.java.functionalinterface.PersonUtils;
import org.junit.Assert;
import org.junit.Test;

/**
 * Test class for java 8 FI test
 */
public class FITest {

    Person person1 = new Person("SARE", 27, EnumGender.MALE);
    Person person2 = new Person("SARE", 20, EnumGender.MALE);
    Person person3 = new Person("SARE", 2, EnumGender.MALE);
    Person person4 = new Person("SARE", 7, EnumGender.MALE);
    Person person5 = new Person("SARE", 13, EnumGender.MALE);
    Person person6 = new Person("SARE", 16, EnumGender.MALE);

    @Test
    public void cenUseFIWithJava() {
        Assert.assertEquals(6.0, PersonUtils.countPerson(person1, person2, person3, person4, person5,
                person6));

    }

    @Test
    public void cenUseFIFilterWithJava() {
        PersonUtils.printPerson(person1, person2, person3, person4, person5,
                person6);
        Assert.assertEquals(2L, PersonUtils.identifyPAdultPerson(person1, person2, person3, person4, person4
                , person6));
    }
}
