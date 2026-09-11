package com.example.practical_exam;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;


class PracticalExamApplicationTests {



    @Test
    void regularReverseLetterCase() {
        String res = ReverseLetter.reverseLetter("J@va the be$t!123");
        assertEquals("t@eb eht av$J!123", res);
    }


    @Test
    void blankStringCase() {
        String res = ReverseLetter.reverseLetter(" ");
        assertEquals("", res);
    }

    @Test
    void oneLetterCase() {
        String res = ReverseLetter.reverseLetter("a");
        assertEquals("a", res);
    }

    @Test
    void stringWithoutLettersCase() {
        String res = ReverseLetter.reverseLetter("123 !@#");
        assertEquals("123 !@#", res);
    }

    @Test
    void onlyLettersCase() {
        String res = ReverseLetter.reverseLetter("abcd");
        assertEquals("dcba", res);
    }

    @Test
    void nonAlphabeticCharactersAtTheEdgesAndMiddleCase() {
        String res = ReverseLetter.reverseLetter("!@#$%^&*()_+");
        assertEquals("!@#$%^&*()_+", res);
    }

    @Test
    void nullInputCase() {
        String res = ReverseLetter.reverseLetter(null);
        assertEquals("" , res);
    }

    @Test
    void lettersChangesWithTheirRegisteryCase() {
        String res = ReverseLetter.reverseLetter("AsdFgHasl");
        assertEquals("lsaHgFdsA", res);
    }
}
