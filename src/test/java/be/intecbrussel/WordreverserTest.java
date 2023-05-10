package be.intecbrussel;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

class WordreverserTest {

    Wordreverser wordreverser;

    @BeforeEach
    void initial(){
        wordreverser = new Wordreverser();
    }

    @ParameterizedTest
    @CsvSource(value = {"something,gnihtemos", "lala,alal"})
    void TestIfWordIsReversed(String inputWord, String expectedWord){
        String actualWord = wordreverser.reverseThisWord(inputWord);
        assertEquals(actualWord, expectedWord);
    }

}