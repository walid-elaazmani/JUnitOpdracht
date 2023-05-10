package be.intecbrussel;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

class CalculationsTest {

    Calculations calculations;

    @BeforeEach
    void Initial(){
        calculations = new Calculations();
    }


    @ParameterizedTest
    @ValueSource(ints = {-50, -1, -90})
    void ifInputNumberIsNegativeReturnNegative(int inputNumbers){

        String receivedMessage = calculations.NegativeOrPositive(inputNumbers);

        String expectedMessage = "negative";

        assertEquals(receivedMessage, expectedMessage);
    }

    @ParameterizedTest
    @ValueSource(ints = {0,1,2,3})
    void ifInputNumberIsOddReturnOdd(int inputNumbers) {

        String receiveMessage = calculations.OddOrEven(inputNumbers);

        String expectedMessage = "odd";

        assertEquals(receiveMessage, expectedMessage);
    }
}