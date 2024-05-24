package Ex3;

import java.util.ArrayList;
import java.util.Objects;

public class ArrayListT<T> {
    private ArrayList<T> elements;

    public ArrayListT() {
        setElements(new ArrayList<>());
    }

    public void add(T element) {
        getElements().add(element);
    }

    public void addAll(ArrayListT<T> m) {
        getElements().addAll(m.getElements());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ArrayListT<?> that = (ArrayListT<?>) o;
        return Objects.equals(getElements(), that.getElements());
    }

	public ArrayList<T> getElements() {
		return elements;
	}

	public void setElements(ArrayList<T> elements) {
		this.elements = elements;
	}
}
