package problems;

import org.testng.Assert;

import java.util.HashSet;
import java.util.Set;

public class UnitTestingStringProblem {
    public static void main(String[] args) {

        //Apply Unit Test into all the methods in this package.

        //Anagram

        try {
            Assert.assertEquals(Anagram.isAnagram("rat", "tar"), true);
            System.out.println("Anagram Unit Test Passed.");
        } catch (AssertionError as) {
            System.out.println("Anagram Unit Test Failed!!!!");
        }


        //Duplicate word

        try {
            Set<String> set = new HashSet<>();
            set.add("Java");
            set.add("is");
            String test = "Java is a programming Language. Java is also an Island of Indonesia";
            Assert.assertEquals(DuplicateWord.duplicateWords(test), set);
            System.out.println("Duplicate Word Unit Test Passed.");
        } catch (AssertionError as) {
            System.out.println("Duplicate Word Unit Test Failed!!!.");
        }



    }
}
