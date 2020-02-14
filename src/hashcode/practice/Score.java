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
public class Score {
    public static int score(ArrayList<Integer> Pizza, int M){
      int S=0;
        for(int i=0;i<Pizza.size();i++){
            S+=Pizza.get(i);
        }
        if(S<=M){
            return S;
        }else{
            return -1;
        }
    }
}
