package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    //TDD -> Red -> Green -> Refactor
    @Test
    void fizzBuzz_ShouldReturnFizz_whenNumberIs3() {
        //GIVEN
        String expected = "Fizz";
        int n = 3;
        //WHEN
        String actual = Main.fizzBuzz(n);
        //THEN
        assertEquals(expected, actual);
    }
    @Test
    void fizzBuzz_ShouldReturnFizz_whenNumberIs5() {
        //GIVEN
        String expected = "Buzz";
        int n = 5;
        //WHEN
        String actual = Main.fizzBuzz(n);
        //THEN
        assertEquals(expected, actual);
    }
    @Test
    void fizzBuzz_ShouldReturnFizz_whenNumberIs15() {
        //GIVEN
        String expected = "FizzBuzz";
        int n = 15;
        //WHEN
        String actual = Main.fizzBuzz(n);
        //THEN
        assertEquals(expected, actual);
    }
    @Test
    void fizzBuzz_ShouldReturnFizz_whenNumberIs1() {
        //GIVEN
        String expected = "1";
        int n = 1;
        //WHEN
        String actual = Main.fizzBuzz(n);
        //THEN
        assertEquals(expected, actual);
    }
}