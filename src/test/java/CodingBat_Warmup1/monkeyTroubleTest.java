package CodingBat_Warmup1;

import CodingBat_WarmUp1.MonkeyTrouble;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class monkeyTroubleTest {

    @BeforeEach
    void setUp() {
    }

    @Test
    void monkeyTrouble_1() {
        boolean expected = true;
        boolean result = MonkeyTrouble.monkeyTrouble(true, true);
        assertEquals(expected, result);
    }

    @Test
    void monkeyTrouble_2() {
        boolean expected = true;
        boolean result = MonkeyTrouble.monkeyTrouble(false, false);
        assertEquals(expected, result);
    }
    @Test
    void monkeyTrouble_3() {
        boolean expected = false;
        boolean result = MonkeyTrouble.monkeyTrouble(true, false);
        assertEquals(expected, result);
    }
    @Test
    void monkeyTrouble_4() {
        boolean expected = false;
        boolean result = MonkeyTrouble.monkeyTrouble(false, true);
        assertEquals(expected, result);
    }


}