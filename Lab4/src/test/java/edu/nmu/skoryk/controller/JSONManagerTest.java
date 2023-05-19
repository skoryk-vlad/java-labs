package edu.nmu.skoryk.controller;

import edu.nmu.skoryk.model.University;
import org.junit.Test;
import java.io.IOException;

import static org.junit.Assert.assertEquals;

public class JSONManagerTest {

    @Test
    public void test() throws IOException {
        JSONManager<University> jsonManager = new JSONManager<>();
        University oldUniversity = new UniversityCreator().createTypicalEntity();

        jsonManager.writeToFile(oldUniversity, "test.json");
        University newUniversity = jsonManager.readFromFile("test.json", University.class);

        assertEquals(oldUniversity, newUniversity);
    }
}
