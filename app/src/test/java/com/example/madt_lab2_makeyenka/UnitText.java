package com.example.madt_lab2_makeyenka;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class UnitText {
    @Test
    public void counter_Symbols() {
        assertEquals(8, Counter.count("TestText", true));
        assertEquals(0, Counter.count("", true));
        assertEquals(1, Counter.count(" ", true));
        assertEquals(3, Counter.count("!!!", true));

    }
    @Test
    public void counter_Words() {
        assertEquals(0, Counter.count("", false));
        assertEquals(3, Counter.count("Three, small, words! ", false));
        assertEquals(0, Counter.count(",,,, !!??? )) )", false));
    }
}
