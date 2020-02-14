package hashcode.practice;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

/**
 *
 * @author Benoît
 */
public class Input {

    public static void input(Integer N, Integer M, ArrayList<Integer> Pizza) throws FileNotFoundException, IOException {
        String S;
        int Length = 0;
        BufferedReader reader = new BufferedReader(new FileReader("a_example.in"));
        S = reader.readLine();
        M = Integer.valueOf(S.substring(0, S.indexOf(" ")));
        N = Integer.valueOf(S.substring(S.indexOf(" ") + 1, S.length()));
        String T[]=new String[N];
        S = reader.readLine();
        System.out.println(S);
        T=S.split(" ");
        for (int i = 0; i < N; i++) {
            Pizza.add(Integer.valueOf(T[i]));
            System.out.println(Pizza.get(i));
        }
    }
}
