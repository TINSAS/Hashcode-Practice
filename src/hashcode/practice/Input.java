package hashcode.practice;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author Benoît
 */
public class Input {

    public static Pair input(ArrayList<Integer> Pizza,ArrayList<Integer> PizzaTri){
        int N=-1,M=-1;
        
        BufferedReader reader = null;
        try {
            String S;
            int Length = 0;
            reader = new BufferedReader(new FileReader("a_example.in"));
            S = reader.readLine();
            M = Integer.valueOf(S.substring(0, S.indexOf(" ")));
            N = Integer.valueOf(S.substring(S.indexOf(" ") + 1, S.length()));
            String T[];
            S = reader.readLine();
            T = S.split(" ");
            for (int i = 0; i < N; i++) {
                Pizza.add(Integer.valueOf(T[i]));
            }   PizzaTri = Pizza;
            Collections.sort(PizzaTri);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Input.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Input.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                reader.close();
            } catch (IOException ex) {
                Logger.getLogger(Input.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return new Pair(M,N);
    }
}
