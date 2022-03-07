package com.company;
import java.util.Scanner;
import java.util.*;

public class Main {
    public static void main(String args[]) {
        Grid myGrid = new Grid();
        myGrid.myGrid();
        Main object = new Main();
        int arr[] = {};
        // implement this later : boolean swapped = true;
        sortAlg mySort = new sortAlg();
        mySort.mySort();

        object.sortAlg(arr);
        System.out.println("Sorted Array:");
        object.printArray(arr);
    }
}


// public int getValue(int col, int row) {
//    int column = col;
//   int row_ = row;
//}

//public int setValue(int col, int row) {
//   return col,row;
