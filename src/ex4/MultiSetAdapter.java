package ex4;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class MultiSetAdapter<T> implements Iterable<T> {
    private MultiSet<T> multiset;

    public MultiSetAdapter(MultiSet<T> multiset) {
        this.multiset = multiset;
    }

    public Set<T> toSet() {
        return new HashSet<>(multiset.getElements());
    }

    @Override
    public Iterator<T> iterator() {
        return toSet().iterator();
    }
}
