/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hashcode.practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

/**
 *
 * @author Leon
 */
public class HashcodePractice {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<Integer> parts = new ArrayList<>();
        parts.add(2);
        parts.add(5);
        parts.add(6);
        parts.add(8);
        
        int m=17;
        int n=4;
        
        Collections.sort(parts);
        System.out.println("Parts :" + Arrays.toString(parts.toArray()));
        
        ArrayList<Integer> soluc = trouveSolution(parts, n, m);
        System.out.println(Arrays.toString(soluc.toArray()));

        
        
    }
    
    public static ArrayList<Integer> trouveSolution(ArrayList<Integer> parts, int nbParts, int maxParts){
        ArrayList<Integer> partsChoisis = new ArrayList<>();
        
        int[][] T = new int[nbParts][maxParts];
        
        for(int c=0;c<maxParts;c++){
            T[0][c] = 0;
        }
        
        for (int i = 1; i < nbParts; i++) {
            for (int c = 0; c < maxParts; c++) {
                if(c>=parts.get(i)){
                    T[i][c] = Integer.max(T[i-1][c], 
                                          T[i-1][c-parts.get(i)] + parts.get(i));
                }
                else{
                    T[i][c] = T[i-1][c];
                }
                System.out.print(" "+ T[i][c]);
            }
            System.out.println("");
        }
        
        return partsChoisis;
    }
    
}