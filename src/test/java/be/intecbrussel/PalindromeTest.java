package be.intecbrussel;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.NullSource;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

public class PalindromeTest {

    Palindrome palindrome;

    @BeforeEach
    void init(){
        palindrome = new Palindrome();
    }

    @Test
    void UntrimmedWordShouldReturnTrueIfPalindrome(){
        String input = "      ala      ";
        boolean toTest = palindrome.isPalindrome(input);

        assertTrue(toTest);
    }

    @Test
    void NullShouldReturnFalse(){
        boolean toTest = palindrome.isPalindrome(null);
        assertFalse(toTest);
    }

    @ParameterizedTest()
    @CsvSource({"Non", "NoN"})
    void ShouldBeCaseSensitive(String input){
        boolean toTest = palindrome.isPalindrome(input);

        assertTrue(toTest);
    }

    @Test
    void ifPalindromeShouldReturnTrue(){
        boolean toTest = palindrome.isPalindrome("goog");

        assertTrue(toTest);
    }

    @Test
    void ifEmptyShouldReturnFalse(){
        Boolean toTest = palindrome.isPalindrome("       ");
        assertFalse(toTest);
    }








}
