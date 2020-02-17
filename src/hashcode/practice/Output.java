/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hashcode.practice;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Benoît
 */
public class Output {

    public static void researchLastIndex(ArrayList<Integer> Pizza, int Index, ArrayList<Integer> T) {
        T.add(Pizza.indexOf(Index));
        Pizza.set(Pizza.indexOf(Index), -1);
    }

    public static void output(ArrayList<Integer> Pizza, ArrayList<Integer> PizzaTri) {
        System.out.println(PizzaTri.size());
        ArrayList<Integer> T = new ArrayList<Integer>();
        for (int i = 0; i < PizzaTri.size(); i++) {
            researchLastIndex(Pizza, PizzaTri.get(i), T);
        }
        Collections.sort(T);
        for (int i = 0; i < T.size(); i++) {
            System.out.print(T.get(i) + " ");
        }
        File output = new File("output.in");

        try {
            FileWriter fw = new FileWriter(output);
            fw.write(PizzaTri.size() + "\n");
            for (int i = 0; i < T.size(); i++) {
                fw.write(T.get(i) + " ");
            }
            fw.close();
        } catch (IOException ex) {
            Logger.getLogger(Output.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
}
