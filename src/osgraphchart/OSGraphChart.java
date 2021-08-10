/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package osgraphchart;

import java.util.ArrayList;

/**
 *
 * @author Devin
 */
public class OSGraphChart {

    //iterative
    private static String reverseIterative (String str){
        StringBuilder reverseName = new StringBuilder();
        char[] ch = str.toCharArray();
        int len = str.length() -1;
        
        /*This for loop will iterate through the string "Iterative" by evaulating
            the individual characters and essentially reversing them. The end
        ** result returns the reversed string.
        **  
        */
        for(int i = len; i >= 0; i--){
            reverseName.append(ch[i]);
            
        }
        return(reverseName.toString());
    }
    
    //recursive
    private static String reverseRecursive(String str){
       //if the string is equal to zero then print the string
       //will print the string if it only has one letter
        if(str.length() == 0){
            return(" ");
        }else{
            //looks at each character
            System.out.print(str.charAt(str.length() -1));
            //recursion call
            //returns the reversed string through continiously calling iteself
            return(reverseRecursive(str.substring(0, str.length()-1)));
        }
    }
    public static void main(String[] args) {
        //Retrieves the current system time in milliseconds
        long startTime = System.currentTimeMillis();
      
      /* MODULE02 ASSIGNMENT 
       *   Module02 mod2 = new Module02();
       * 
       *  mod2.StackOperations();
       */
      
      
      Module03 mod3 = new Module03();
      
      for(int i = 0; i<=4;i++){
         mod3.directedGraph(i);
          System.out.println("\n");
      }
        //initilized with 5 nodes
       /*
        Module04 mod4 = new Module04(5);

        //graph implemented from module 03
        //0->1  0->4
        mod4.directedGraph(0, 1);
        mod4.directedGraph(0, 4);

        //1->0 1->2 1->3 1->4
        mod4.directedGraph(1, 0);
        mod4.directedGraph(1, 2);
        mod4.directedGraph(1, 3);
        mod4.directedGraph(1, 4);

        //2->1 2->3
        mod4.directedGraph(2, 1);
        mod4.directedGraph(2, 3);

        //3->1 3->2 3->4
        mod4.directedGraph(3, 1);
        mod4.directedGraph(3, 2);
        mod4.directedGraph(3, 4);

        //4->0 4->1 4->3
        mod4.directedGraph(4, 0);
        mod4.directedGraph(4, 1);
        mod4.directedGraph(4, 3);


       // mod4.directedGraph();
        System.out.println("Depth First Search: ");

        System.out.println("\nPath for node 0:");
        mod4.depthCall(0);
        System.out.println();

        System.out.println("\nPath for node 1:");

        mod4.depthCall(1);
        System.out.println();

        System.out.println("\nPath for node 2:");
        mod4.depthCall(2);
        System.out.println();

        System.out.println("\nPath for node 3:");
        mod4.depthCall(3);
        System.out.println();

        System.out.println("\nPath for node 4:");
        mod4.depthCall(4);

        */
      
     
     /*
      //reverse the string using iteration
      System.out.println(reverseIterative("Iterative"));
      
      //reverse the string using recursion
      System.out.println(reverseRecursive("Recursion"));
      */
      
     
      //Calculates the amount of time the compiler takes to execute the code 
      //written in milliseconds
      long stopTime = System.currentTimeMillis();
      long runTime = stopTime - startTime;
      System.out.println("\n\nRun time: " + runTime);
      
      
    }
    
}
