package be.intecbrussel;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;

import static org.junit.jupiter.api.Assertions.*;

class MinNumberInArrayClassTest {

    MinNumberInArrayClass minNumberInArray;

    @BeforeEach
    void init(){
        minNumberInArray = new MinNumberInArrayClass();
    }

    @Test
    void ShouldReturn0InArrayOfNumbersThatContain0(){

        Integer[] anArrayToTest = {1,5,0,6,9};

        int numberGenerated = minNumberInArray.findMinimumNumber(anArrayToTest);

        int expectedNumber = 0;

        assertEquals(numberGenerated, expectedNumber);
    }

}