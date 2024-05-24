package ex4;

import java.util.Collection;

public interface MultiSet<T> {
    void add(T element);
    void addAll(MultiSet<T> m);
    Collection<T> getElements();
}
