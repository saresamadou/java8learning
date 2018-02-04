package fr.sare.java.test;

import fr.sare.java.enums.EnumGender;
import fr.sare.java.functionalinterface.Person;
import fr.sare.java.utils.LoggerTechnique;
import org.apache.commons.lang3.StringUtils;
import org.junit.Before;
import org.junit.Test;

import java.util.*;


public class CollectionsTest {


    private Map<String, Person> personsMap;
    private List<Person> personList;
    private Set<Person> personSet;
    private Deque<Person> personDeque;
    private static final Person SARE = new Person("SARE", 27, EnumGender.MALE);

    @Before
    public void beforeTest() {
        personsMap = new TreeMap<>();
        personList = new ArrayList<>();
        personSet = new HashSet<>();
        personDeque = new ArrayDeque<>();
    }

    @Test
    public void canUseLambdaWithMap() {
        //GIVEN
        insertPersonsInMap();
        //WHEN
        personsMap.forEach((s, person) -> LoggerTechnique.LogInfo(s + StringUtils.EMPTY + person.toString()));
        //THEN

    }

    @Test
    public void canUseLambdaWithList() {
        //GIVEN
        insertPeopleInList();
        //WHEN
        personList.stream().filter(person -> person.getGender() == EnumGender.MALE).forEach(System.out::print);
    }

    @Test
    public void canUseLambdaWithSet() {
        //GIVEN
        insertPeopleInSet();
        //WHEN
        personSet.parallelStream().forEach(System.out::print);
    }

    @Test
    public void canUseLambdaWithDeque() {
        //GIVEN
        insertPersonsInDeque();
        //WHEN
        LoggerTechnique.LogInfo(personDeque.getLast().toString());
    }

    private void insertPersonsInMap() {
        personsMap.put("first", new Person("SARE", 27, EnumGender.MALE));
        personsMap.put("second", new Person("SARE", 27, EnumGender.MALE));
        personsMap.put("first", new Person("SARE", 27, EnumGender.MALE));
        personsMap.put("third", new Person("SARE", 27, EnumGender.MALE));
        personsMap.put("first", new Person("SARE", 27, EnumGender.MALE));
        personsMap.put("fourth", new Person("SARE", 27, EnumGender.MALE));
        personsMap.put("third", new Person("SARE", 27, EnumGender.MALE));
    }

    private void insertPeopleInList() {
        personList.add(new Person("SARE", 27, EnumGender.MALE));
        personList.add(new Person("ABOUKADRI", 27, EnumGender.FEMALE));
        personList.add(new Person("SARE", 27, EnumGender.MALE));
        personList.add(new Person("MATHEWS", 26, EnumGender.FEMALE));
        personList.add(new Person("SARE", 27, EnumGender.MALE));
        personList.add(new Person("SARE", 27, EnumGender.MALE));
    }

    private void insertPeopleInSet() {
        personSet.add(new Person("SARE", 27, EnumGender.MALE));
        personSet.add(new Person("SARE", 26, EnumGender.MALE));
        personSet.add(new Person("SARE", 27, EnumGender.MALE));
        personSet.add(new Person("MATHEWS", 25, EnumGender.FEMALE));
        personSet.add(new Person("MATHEWS", 26, EnumGender.FEMALE));
        personSet.add(new Person("MATHEWS", 26, EnumGender.FEMALE));
    }

    private void insertPersonsInDeque() {
        personDeque.add(new Person("SARE", 27, EnumGender.MALE));
        personDeque.add(new Person("SARE", 278, EnumGender.MALE));
        personDeque.add(new Person("SARE", 277, EnumGender.MALE));
        personDeque.add(new Person("SARE", 279, EnumGender.MALE));
        personDeque.add(new Person("SARE", 270, EnumGender.MALE));
    }
}
