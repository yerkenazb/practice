package mindtek.collections;

import java.util.HashSet;

public class IntroHashSet {
    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>();
        set.add(55);
        set.add(55);
        set.add(55);
        set.add(67);
        set.remove(67);
        System.out.println(set);
    }
}
