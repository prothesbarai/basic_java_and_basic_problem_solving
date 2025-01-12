package com.mycompany.basicjava.this_keyword;

import java.util.Scanner;

public class RunnerClass {
    public static void main(String[] args) {
        // Java Array 
        int col,row;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Row : ");
        row = scanner.nextInt();
        System.out.print("Col : ");
        col = scanner.nextInt();
        scanner.nextLine();
        
        int[][] myArray = new int[row][col];
        
        // Input....
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                myArray[i][j] = scanner.nextInt();
            }
        }
        
        System.out.println("\n\n===================================================\n\n");
        
        // Output .....
        for (int i = 0; i < row; i++) {
            
            for (int j = 0; j < col; j++) {
                System.out.print(" "+myArray[i][j]);
            }
            
            System.out.println();
        }
        
        
        
        
        
    }
}
