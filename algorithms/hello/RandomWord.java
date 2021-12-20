/* *****************************************************************************
 *  Name:              Ada Lovelace
 *  Coursera User ID:  123456
 *  Last modified:     October 16, 1842
 **************************************************************************** */

import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;
import edu.princeton.cs.algs4.StdRandom;

public class RandomWord {
    public static void main(String[] args) {
        String champion = null;
        String current;
        boolean currentProbability = false;

        while (!StdIn.isEmpty()) {
            current = StdIn.readString();
            currentProbability = StdRandom.bernoulli(0.5);
            if (currentProbability) {
                champion = current;
            }
        }
        StdOut.println(champion);
    }
}
