/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.arrayoperations;

/**
 *
 * @author DELL
 */
public class TestScoremain{
   public static void main(String[] args) throws Exception {
       
       double[] badScores = { 97.5, 66.7, 88.0, 101.0, 99.0 };
       double[] goodScores = { 97.5, 66.7, 88.0, 100.0, 99.0 };
       Testscores test_Score = null;
       // Start tshe try block.
       try {
           test_Score = new Testscores(badScores);
       } catch (IllegalArgumentException e) {
           System.out.println(e.getMessage());
       }
       // Start the try block.
       try {
           test_Score = new Testscores(goodScores);
       } catch (IllegalArgumentException e) {
           System.out.println(e.getMessage());
       }
      
       System.out.print("Good scores" + "\n\tThe average of the good scores is " + test_Score.getAverage());
   }  

    private TestScoremain(double[] badScores) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}