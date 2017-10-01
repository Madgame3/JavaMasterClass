package com.company;

public class Main {

    public static void main(String[] args) {

    //32 bits or 4 bytes
    int myIntValue = 5 /2 ;

    //32 bits or 4 bytes
    //7 decimal's of precision
	float myFloatValue = 5f/3f ;

	//64 bits or 8 bytes, faster on modern computers
	//16 decimal's of precision
	double myDoubleValue = 5d/3d;

        System.out.println("My Int Value = " + myIntValue);
        System.out.println("My Float Value = " + myFloatValue);
        System.out.println("My Double Value = " + myDoubleValue);


        //convert a given number of pounds to kilograms
        // 1. Create a variable to store the number of pounds
        // 2. Calculate the number of Kilograms for the number above and store in a variable.
        // 3. Print out the results.
        //
        //NOTES: 1 pound is equal to 0.45359237 Kilograms

        double myPounds = 200d;
        double conversion = 0.45359237d;
        double myKiloGrams = myPounds * conversion;
        System.out.println(myPounds + " In KiloGrams = " + myKiloGrams);


    }
}
