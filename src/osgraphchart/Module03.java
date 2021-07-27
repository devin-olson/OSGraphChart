/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package osgraphchart;

import java.util.Random;

/**
 *
 * @author Devin
 */
public class Module03 {
    
    //An array to hold random unsorted numbers 1-1000
    private int[] numbers = new int[100];
    
    
   //function to fill the array with random numbers
    public void fillArr(int n){
        
        System.out.println("Unsorted numbers: ");
        //loop to continiously add numbers
        for(int i=0; i < numbers.length; i++){
            numbers[i] = new Random().nextInt(n);
            
            System.out.print(numbers[i] + " ");
        }
        
        
    }//end function
    
    //function to perform the bubble sort algorithm
    public void bubbleSort(){
        
        //loop to traverse the array
        for(int i=0;i<numbers.length;i++){
            //nested loop to compare and swap if needed
            for(int j = 1; j < (numbers.length - 1);j++){
                //compare
                if(numbers[j - 1] > numbers[j]){
                    //swap the numbers
                    int temp = numbers[j-1];
                    numbers[j-1] = numbers[j];
                    numbers[j] = temp;
                }
            }
        }
        System.out.println("\n\nBubble Sort Outcome: ");
        //output
        for(int x=0;x<numbers.length;x++){
            System.out.print(numbers[x] + " ");
        }
    }
    
    //function to perform the selection sort
    public void selectionSort(){
        
        //loop to run through the entire array
        for(int i=0; i<numbers.length;i++){
            
           //holds the number that will be the "lowest" current number
            int minNum = i;
            
            //nested loop to perform the actual comparing and swapping of numbers
            for(int j = i+1; j< numbers.length; j++){
                
                //if statement to comare the two numbers position
                if(numbers[j]< numbers[minNum]){
                    minNum = j;
                }
            }
            
            //swap the numbers
            int temp = numbers[minNum];
            numbers[minNum] = numbers[i];
            numbers[i] = temp;
            
          
        }
        
        System.out.println("\n\nSelection Sort Outcome ");
        //output for the sorted array
        for(int x = 0; x<numbers.length;x++){
            System.out.print(numbers[x] + " ");
        }
    }//end function
    
    
}
