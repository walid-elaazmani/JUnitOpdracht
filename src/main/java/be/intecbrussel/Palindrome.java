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


    public static void main(String[] args) {
        Palindrome p = new Palindrome();

        System.out.println(p.isPalindrome("A man, a plan, a caretaker, a moksha, Lufkin, a jacinth, Gile, Daniell, Ivanov, an odor, a negativeness, a tsarevna, melanomas, an ire…globigerinas, a mon, a leman, Vera, Stassen, Evita, Genaro, Donavon, a villein, a delight, Nica, Janik, Fulahs, Komarek, a ter, a canal, Panama."));
    }





}
