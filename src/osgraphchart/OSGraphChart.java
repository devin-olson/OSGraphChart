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
      
     // mod3.directedGraph();
      
      //reverse the string using iteration
      System.out.println(reverseIterative("Iterative"));
      
      //reverse the string using recursion
      System.out.println(reverseRecursive("Recursion"));
      
      
     
      //Calculates the amount of time the compiler takes to execute the code 
      //written in milliseconds
      long stopTime = System.currentTimeMillis();
      long runTime = stopTime - startTime;
      System.out.println("\n\nRun time: " + runTime);
      
      
    }
    
}
