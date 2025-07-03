/* 4. Dynamic array operations and decoding
● Two dynamic arrays are given below L1, L2.
● Create a new dynamic array called L3 containing items in below given pattern
● From L1 it must take only odd index items
● From L2 it must take only even index items */

import java.util.*;

public class LNBdynamicarray {
    public static void main(String[] args) {
        List<Integer> L1 = Arrays.asList(11, 21, 24, 12, 18);
        List<Integer> L2 = Arrays.asList(14, 44, 25, 37, 13);
        List<Integer> L3 = new ArrayList<>();

        for (int i = 0; i < L1.size(); i += 2)
            L3.add(L1.get(i));

        for (int i = 1; i < L2.size(); i += 2)
            L3.add(L2.get(i));

        System.out.println("L3 = " + L3);
    }
}
