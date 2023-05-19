package edu.nmu.skoryk.controller;

import edu.nmu.skoryk.model.Sex;

import java.util.Random;

public interface IEntityCreator<T> {
    T createTypicalEntity();

    public static String generateRandomWord()
    {
        Random random = new Random();
        char[] randomWord = new char[random.nextInt(8)+3];
        for(int i = 0; i < randomWord.length; i++)
        {
            randomWord[i] = (char)('a' + random.nextInt(26));
        }

        return new String(randomWord);
    }

    public static Sex generateRandomGender()
    {
        int rand = (int) (Math.random() * 2);
        if (rand == 0) {
            return Sex.MALE;
        } else {
            return Sex.FEMALE;
        }
    }
}
