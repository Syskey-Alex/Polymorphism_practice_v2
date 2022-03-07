package com.company;
//TODO Create a class Grid that contains a 10x10, 2D array of ints.
// The constructor should take no parameters and initialise all elements to zero.
// Create getter and setter methods that can read/write to the array by passing the row and column coordinates (plus a value, for the setter).


//TODO Create an alternative constructor with an integer parameter. The grid is initialised so all elements are set to this value.
import java.util.Scanner;
public class Grid {
  // this isn't useful: public int[][] myGrid= new myGrid [10][10];
    public void myGrid() {
            for (int i = 1; i <= 10; i++) {
                for (int j = 1; j <=10; j++) {
                    System.out.print("▢");
                }
            //loop prints out the numbers 1-10
            System.out.println();
        }
    }
//public void alternativeGrid(int setValue) {
  //    setValue = new setValue;
//}
//valueOrders = new valueOrders;
    public void sortAlg(String valueOrder ,int arr[]) {
        int n = arr.length;

        Scanner scanner = new Scanner(new myFile("ListOfNumbers.txt"));
        int[] tall = new int[100];
        int i = 0;
        while(scanner.hasNextInt()){
            tall[i++] = scanner.nextInt();
        }

        //moves boundary one by one of the unsorted array
        for (i = 0; i< n-1; i++) {
            //finds the minimum element in the unsorted array
            int min_idx = i;
            for(int j =i+1;j<n;j++)
                if ( arr[j] <arr[min_idx])
                    min_idx = j;
            //Swaps the found minimum element with the first element
            int temp = arr[min_idx];
            arr[min_idx] = arr[i];
            arr[i] = temp;
        }
    }
//printing array
  public static void printArray(int arr[]) {
        int n=arr.length;
        for(int i=0;i<n;i++)
            System.out.print(arr[i]+" ");
        System.out.println();
    }
//tests the array above

}


