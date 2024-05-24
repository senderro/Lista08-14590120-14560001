package Ex3;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TesteEstruturas {

    @Test
    public void testArrayList() {
        ArrayListT<String> multiset1 = new ArrayListT<>();
        multiset1.add("apple");
        multiset1.add("banana");
        multiset1.add("apple");

        ArrayListT<String> multiset2 = new ArrayListT<>();
        multiset2.add("banana");
        multiset2.add("cherry");

        multiset1.addAll(multiset2);

        assertEquals(5, multiset1.getElements().size());
        assertTrue(multiset1.getElements().contains("apple"));
        assertTrue(multiset1.getElements().contains("banana"));
        assertTrue(multiset1.getElements().contains("cherry"));
    }

    @Test
    public void testHashSet() {
        HashSetT<String> multiset1 = new HashSetT<>();
        multiset1.add("apple");
        multiset1.add("banana");
        multiset1.add("apple");

        HashSetT<String> multiset2 = new HashSetT<>();
        multiset2.add("banana");
        multiset2.add("cherry");

        multiset1.addAll(multiset2);

        assertEquals(3, multiset1.getElements().size());
        assertTrue(multiset1.getElements().contains("apple"));
        assertTrue(multiset1.getElements().contains("banana"));
        assertTrue(multiset1.getElements().contains("cherry"));
    }

    @Test
    public void testLinkedList() {
        LinkedListT<String> multiset1 = new LinkedListT<>();
        multiset1.add("apple");
        multiset1.add("banana");
        multiset1.add("apple");

        LinkedListT<String> multiset2 = new LinkedListT<>();
        multiset2.add("banana");
        multiset2.add("cherry");

        multiset1.addAll(multiset2);

        assertEquals(5, multiset1.getElements().size());
        assertTrue(multiset1.getElements().contains("apple"));
        assertTrue(multiset1.getElements().contains("banana"));
        assertTrue(multiset1.getElements().contains("cherry"));
    }

    @Test
    public void testStack() {
        StackT<String> multiset1 = new StackT<>();
        multiset1.add("apple");
        multiset1.add("banana");
        multiset1.add("apple");

        StackT<String> multiset2 = new StackT<>();
        multiset2.add("banana");
        multiset2.add("cherry");

        multiset1.addAll(multiset2);

        assertEquals(5, multiset1.getElements().size());
        assertTrue(multiset1.getElements().contains("apple"));
        assertTrue(multiset1.getElements().contains("banana"));
        assertTrue(multiset1.getElements().contains("cherry"));
    }
}