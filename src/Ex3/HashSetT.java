package Ex3;

import java.util.HashSet;
import java.util.Objects;

public class HashSetT<T> {
    private HashSet<T> elements;

    public HashSetT() {
        setElements(new HashSet<>());
    }

    public void add(T element) {
        getElements().add(element);
    }

    public void addAll(HashSetT<T> m) {
        getElements().addAll(m.getElements());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        HashSetT<?> that = (HashSetT<?>) o;
        return Objects.equals(getElements(), that.getElements());
    }

	public HashSet<T> getElements() {
		return elements;
	}

	public void setElements(HashSet<T> elements) {
		this.elements = elements;
	}

}
