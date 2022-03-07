package com.company;
import java.util.Scanner;
import java.util.*;

public class Main {
    public static void main(String args[]) {
        //displays Grid class
        Grid myGrid = new Grid();
        myGrid.myGrid();
        System.out.println();

        Grid gridAscention = new Grid("Ascending order: ");
        gridAscention.display();
        System.out.println();

        Grid gridDescension = new Grid("Descension order: ");
        gridAscention.display();
        System.out.println();



    }
}


// public int getValue(int col, int row) {
//    int column = col;
//   int row_ = row;
//}

//public int setValue(int col, int row) {
//   return col,row;

// for future reference always remember this
//Main object = new Main();
//int arr[] = {};
// implement this later : boolean swapped = true;