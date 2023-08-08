package CodingBat_Warmup1;

import CodingBat_WarmUp1.SleepIn;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;

class SleepInTest {

    @org.junit.jupiter.api.BeforeEach
    void setUp() {
    }

    @org.junit.jupiter.api.Test
    void sleepIn_1() {
        boolean expected = true;
        boolean result = SleepIn.sleepIn(false, false);
        assertEquals(expected, result);
    }

    @org.junit.jupiter.api.Test
    void sleepIn_2() {
        boolean expected = false;
        boolean result = SleepIn.sleepIn(true, false);
        assertEquals(expected, result);
    }

    @org.junit.jupiter.api.Test
    void sleepIn_3() {
        boolean expected = true;
        boolean result = SleepIn.sleepIn(false, true);
        assertEquals(expected, result);
    }

    @org.junit.jupiter.api.Test
    void sleepIn_4() {
        boolean expected = true;
        boolean result = SleepIn.sleepIn(true, true);
        assertEquals(expected, result);
    }
}