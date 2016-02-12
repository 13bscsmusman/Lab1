/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;


import abc.Multiply;





/**
 *
 * @author musman.bscs13seecs
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        int [][] a=new int [2][2];
        int [][] b=new int[2][2];
        
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                a[i][j]=i;
                b[i][j]=j;
            }
        }
        System.out.println(Multiply.strassen(a, b));
        
        
    }
    
}
