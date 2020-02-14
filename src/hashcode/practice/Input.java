package hashcode.practice;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author Benoît
 */
public class Input {

    public static void input(Integer N, Integer M, ArrayList<Integer> Pizza,ArrayList<Integer> PizzaTri) throws FileNotFoundException, IOException {
        String S;
        int Length = 0;
        BufferedReader reader = new BufferedReader(new FileReader("a_example.in"));
        S = reader.readLine();
        M = Integer.valueOf(S.substring(0, S.indexOf(" ")));
        N = Integer.valueOf(S.substring(S.indexOf(" ") + 1, S.length()));
        String T[];
        S = reader.readLine();
        T = S.split(" ");
        for (int i = 0; i < N; i++) {
            Pizza.add(Integer.valueOf(T[i]));
        }
        PizzaTri = Pizza;
        Collections.sort(PizzaTri);
    }
}
