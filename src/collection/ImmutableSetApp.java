package collection;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class ImmutableSetApp {
    public static void main(String[] args) {

        Set<String> empty = Collections.emptySet();
        Set<String> one = Collections.singleton("Komeng");

        Set<String> mutable = new HashSet<>();
        mutable.add("Catur");
        mutable.add("Putra");
        Set<String> immutable = Collections.unmodifiableSet(mutable);

        Set<String> set = Set.of("Catur", "Putra");

        set.add("Caturr");

    }
}
