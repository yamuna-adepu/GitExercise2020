package com.axone.devintest.chapter2;

public class Assignment2 {
    public static void main(String[] args) {
int [] intArray = {-569,-857,-99,-28,-7,0,45,-988};
int highest = intArray[0];
for (int i=1; i<= intArray.length-1; i++) {
    if(intArray[i] > highest) {
        highest = intArray[i];
    }
}

        System.out.println(highest);

}
    }