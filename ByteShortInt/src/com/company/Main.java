package com.company;

public class Main {

    public static void main(String[] args) {

        //int takes up 32bits
        int intMinValue = -2_147_483_648;
        int intMaxValue = 2_147_483_647;
        int intMyTotal = (intMinValue/2);

        //byte takes up 8bits
        byte byteMinValue = -128;
        byte byteMaxValue = 127;
        //java automatically evaluates expressions as Int's so when working with bytes need to specify (byte) before expression.
        byte byteMyTotal = (byte) (byteMinValue/2);


        //short takes up 16 bits
        short shortMinValue = -32_768 ;
        short shortMaxValue = 32_767 ;

        //long takes up 64 bits
        long longMinValue = -9_223_372_036_854_775_808L;
        long longMaxValue = 9_223_372_036_854_775_807L;




        System.out.println("Int Min Value = " + intMinValue);
        System.out.println("Int Max Value = " + intMaxValue);

        System.out.println("Byte Min Value = " + byteMinValue);
        System.out.println("Byte Max Value = " + byteMaxValue);
        System.out.println(byteMyTotal);

        System.out.println("Short Min Value = " + shortMinValue);
        System.out.println("Short Max Value = " + shortMaxValue);

        System.out.println("Long Min Value = " + longMinValue);
        System.out.println("Long Max Value = " + longMaxValue);

        byte myByte =  10;
        short myShort = 10_000;
        int myInt = 100_000;
        long myLong= 50_000L + 10L* (myByte+myShort+myInt);
        System.out.println("Long Total = " + myLong);

    }
}
sa