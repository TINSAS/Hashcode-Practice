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
        /*parts.add(2);
        parts.add(5);
        parts.add(6);
        parts.add(8);*/
        
        Retour retour = Input.input();
        
        int m=retour.M;
        int n=retour.N;
        ArrayList<Integer> parts = retour.pizzaTri;
        ArrayList<Integer> partsSansTri = retour.pizza;

        
        Collections.sort(parts);
        System.out.println("Parts :" + Arrays.toString(partsSansTri.toArray()));
        System.out.println("Parts Trié:" + Arrays.toString(parts.toArray()));
        
        ArrayList<Integer> soluc = trouveSolution(parts, n, m);
        System.out.println(Arrays.toString(soluc.toArray()));

        
        
    }
    
    public static ArrayList<Integer> trouveSolution(ArrayList<Integer> parts, int nbParts, int maxParts){
        ArrayList<Integer> partsChoisis = new ArrayList<>();
        
        int somme=0;
        
        int part;
        for (int i = nbParts-1; i >= 0; i--) {
            part = parts.get(i);
            System.out.println(""+part);
            if(part+somme<=maxParts){
                partsChoisis.add(part);
                somme+= part;
            }else if (somme>maxParts) break;
        }

        
        /*int[][] T = new int[nbParts+1][maxParts+1];
        
        for(int c=0;c<maxParts+1;c++){
            T[0][c] = 0;
        }
        
        for (int i = 1; i <= nbParts; i++) {
            for (int c = 0; c < maxParts+1; c++) {
                int pizza = parts.get(i-1);
                if(c>=pizza){
                    T[i][c] = Integer.max(T[i-1][c], 
                                          T[i-1][c-pizza] + pizza);
                    System.out.println(pizza);

                }
                else{
                    T[i][c] = T[i-1][c];
                }
            }
        }
        for (int i = 0; i < nbParts+1; i++) {
            for (int c = 0; c < maxParts+1; c++) {
                System.out.print(" "+ T[i][c]);
            }
            System.out.println("");
        }*/        
        return partsChoisis;
    }
    
}