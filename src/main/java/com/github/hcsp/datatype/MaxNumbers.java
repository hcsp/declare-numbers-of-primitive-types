package com.github.hcsp.datatype;
public class MaxNumbers {
    // byte类型能存储的最大值是？
    // The maximum value a byte type can store
    public static byte maxByte = 127;

    // short类型能存储的最大值是？
    // The maximum value a short type can store
    public static short maxShort = 32767;

    // int类型能存储的最大值是？
    // The maximum value an int type can store
    public static int maxInt = 0x7FFFFFFF;

    // long类型能存储的最大值是？
    // The maximum value an long type can store
    public static long maxLong = 9223372036854775807l;

    // float类型能存储的最大值是？
    // The maximum value an float type can store
    public static float maxFloat = 3.4028235E38f;

    // double类型能存储的最大值是？
    // The maximum value an double type can store
    public static double maxDouble = 1.7976931348623157E308;

    // char类型能存储的最大值是？
    // The maximum value an char type can store
    public static char maxChar = 32767;

    public static void main(String[] args) {
        System.out.println("maxByte=" + maxByte);
        System.out.println("maxByte+1=" + (maxByte + 1));
        System.out.println("maxShort=" + maxShort);
        System.out.println("maxShort+1=" + (maxShort + 1));
        System.out.println("maxInt=" + maxInt);
        System.out.println("maxInt+1=" + (maxInt + 1));
        System.out.println("maxLong=" + maxLong);
        System.out.println("maxLong+1=" + (maxLong + 1));
        System.out.println("maxFloat=" + maxFloat);
        System.out.println("maxFloat+1=" + (maxFloat + 1));
        System.out.println("maxDouble=" + maxDouble);
        System.out.println("maxDouble+1=" + (maxDouble + 1));
        System.out.println("maxChar=" + maxChar);
        System.out.println("maxChar+1=" + (maxChar + 1));
    }
}
