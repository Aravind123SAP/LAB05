/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.arrayoperations;

public class Testscores {
   private double[] scores;
   double sum = 0;

   public Testscores(double array[]) {
      
       for (int i = 0; i < array.length; i++) {
           scores = new double[array.length];
        
           if (array[i] < 0 || array[i] > 100) {
        
               throw new IllegalArgumentException(
                      
                       "Bad scores" + "\n\tInvalid score found." + "\n\tElement: " + i + " Score: " + array[i]);
           } else {
               
               scores[i] = array[i];
               sum += array[i];
           }
       }
   }

   public double getAverage() {
       return sum / scores.length;
   }
}