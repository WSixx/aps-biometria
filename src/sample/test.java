package sample;

import java.util.ArrayList;
import java.util.Random;

public class test {

    public static void main(String[] args) {
        int numberOfWords = 10000;

        String[] randomStrings = new String[numberOfWords];
        Random random = new Random();
        for(int i = 0; i < numberOfWords; i++)
        {
            char[] word = new char[random.nextInt(3)+3];
            for(int j = 0; j < word.length; j++)
            {
                word[j] = (char)('a' + random.nextInt(26));
            }
            randomStrings[i] = new String(word);
        }
        for (String randomString : randomStrings) {
            System.out.println(randomString);
        }
    }

}
