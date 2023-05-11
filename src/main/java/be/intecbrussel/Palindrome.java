package be.intecbrussel;

import java.io.SequenceInputStream;
import java.util.Objects;
import java.util.stream.Stream;

public class Palindrome {

    private String input;


    public boolean isPalindrome(String input){

        if(input == null || input.isBlank() || input.isEmpty()){
            return false;
        }

        input = input.trim().replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        String palindrome = new StringBuilder(input).reverse().toString();

        return palindrome.equals(input);

    }

}
