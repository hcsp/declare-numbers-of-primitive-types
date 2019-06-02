package com.github.hcsp.datatype;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class MaxNumbersTest {
    @Test
    public void test() {
        assertEquals(Byte.MAX_VALUE, MaxNumbers.maxByte);
        assertEquals(Short.MAX_VALUE, MaxNumbers.maxShort);
        assertEquals(Integer.MAX_VALUE, MaxNumbers.maxInt);
        assertEquals(Long.MAX_VALUE, MaxNumbers.maxLong);
        assertEquals(Float.MAX_VALUE, MaxNumbers.maxFloat);
        assertEquals(Double.MAX_VALUE, MaxNumbers.maxDouble);
        assertEquals(Character.MAX_VALUE, MaxNumbers.maxChar);
    }
}
