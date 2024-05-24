package ex4;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Objects;

public class ArrayListT<T> implements MultiSet<T> {
    private ArrayList<T> elements;

    public ArrayListT() {
        elements = new ArrayList<>();
    }

    @Override
    public void add(T element) {
        elements.add(element);
    }

    @Override
    public void addAll(MultiSet<T> m) {
        elements.addAll(m.getElements());
    }

    @Override
    public Collection<T> getElements() {
        return elements;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ArrayListT<?> that = (ArrayListT<?>) o;
        return Objects.equals(elements, that.elements);
    }

}
