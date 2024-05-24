package Ex3;

import java.util.LinkedList;
import java.util.Objects;

public class LinkedListT<T> {
    private LinkedList<T> elements;

    public LinkedListT() {
        setElements(new LinkedList<>());
    }

    public void add(T element) {
        getElements().add(element);
    }

    public void addAll(LinkedListT<T> m) {
        getElements().addAll(m.getElements());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        LinkedListT<?> that = (LinkedListT<?>) o;
        return Objects.equals(getElements(), that.getElements());
    }

	public LinkedList<T> getElements() {
		return elements;
	}

	public void setElements(LinkedList<T> elements) {
		this.elements = elements;
	}

}
