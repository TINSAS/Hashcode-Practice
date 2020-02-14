/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hashcode.practice;

import java.util.ArrayList;

/**
 *
 * @author Benoît
 */
public class Output {
    public static void researchLastIndex(ArrayList<Integer> Pizza, int Index){
        System.out.print(Pizza.indexOf(Index)+" ");
        Pizza.set(Pizza.indexOf(Index), -1);
    }
    
    public static void output(ArrayList<Integer> Pizza,ArrayList<Integer> PizzaTri){
        System.out.println(PizzaTri.size());
        for (int i=0;i<PizzaTri.size();i++){
            researchLastIndex(Pizza, PizzaTri.get(i));
        }  
    }
}
