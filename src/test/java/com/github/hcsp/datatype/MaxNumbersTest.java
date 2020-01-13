package com.github.hcsp.datatype;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MaxNumbersTest {
    @Test
    public void test() {
        Assertions.assertEquals(Byte.MAX_VALUE, MaxNumbers.maxByte);
        Assertions.assertEquals(Short.MAX_VALUE, MaxNumbers.maxShort);
        Assertions.assertEquals(Integer.MAX_VALUE, MaxNumbers.maxInt);
        Assertions.assertEquals(Long.MAX_VALUE, MaxNumbers.maxLong);
        Assertions.assertEquals(Float.MAX_VALUE, MaxNumbers.maxFloat);
        Assertions.assertEquals(Double.MAX_VALUE, MaxNumbers.maxDouble);
        Assertions.assertEquals(Character.MAX_VALUE, MaxNumbers.maxChar);
    }
}
