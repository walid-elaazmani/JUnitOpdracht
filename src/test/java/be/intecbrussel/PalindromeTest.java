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

        String exampleOfPalindrome = "rotator";
        boolean toTest = palindrome.isPalindrome(exampleOfPalindrome);

        assertTrue(toTest);
    }

    @Test
    void ifEmptyShouldReturnFalse(){
        Boolean toTest = palindrome.isPalindrome("       ");
        assertFalse(toTest);
    }

    @Test
    void ifPalindromeContainsSpecialCharactersIgnoreAndReturnTrue(){
        Boolean toTest = palindrome.isPalindrome("ro ***/////^^   or");
        assertTrue(toTest);
    }

    @Test
    void testingALongPalindromeShouldBeTrue(){

        String longPalindrome = "A man, a plan, a canal: Panama";

        boolean toTest = palindrome.isPalindrome(longPalindrome);

        assertTrue(toTest);
    }

    @Test
    void aLetterShouldReturnTrue(){
        boolean toTest = palindrome.isPalindrome("b");

        assertTrue(toTest);
    }
    
}
