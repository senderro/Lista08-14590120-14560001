package Ex3;

import java.util.Objects;
import java.util.Stack;

public class StackT<T> {
    private Stack<T> elements;

    public StackT() {
        setElements(new Stack<>());
    }

    public void add(T element) {
        getElements().add(element);
    }

    public void addAll(StackT<T> m) {
        getElements().addAll(m.getElements());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        StackT<?> that = (StackT<?>) o;
        return Objects.equals(getElements(), that.getElements());
    }

	public Stack<T> getElements() {
		return elements;
	}

	public void setElements(Stack<T> elements) {
		this.elements = elements;
	}
}
