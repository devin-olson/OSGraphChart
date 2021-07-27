/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package osgraphchart;

/**
 *
 * @author Devin
 */
public class OSGraphChart {

    
    public static void main(String[] args) {
        //Retrieves the current system time in milliseconds
        long startTime = System.currentTimeMillis();
      
      /* MODULE02 ASSIGNMENT 
       *   Module02 mod2 = new Module02();
       * 
       *  mod2.StackOperations();
       */
      
      Module03 mod3 = new Module03();
      System.out.println("Selection Sort: \n");
      mod3.fillArr(1000);
      mod3.selectionSort();
      
      System.out.println();
      System.out.println("\n------------------------------------------------------------------------");
      System.out.println("\nBubble Sort: \n");
      mod3.fillArr(1000);
      mod3.bubbleSort();
      
      
      
      
      
      
     
      //Calculates the amount of time the compiler takes to execute the code 
      //written in milliseconds
      long stopTime = System.currentTimeMillis();
      long runTime = stopTime - startTime;
      System.out.println("\n\nRun time: " + runTime);
      
      
    }
    
}
