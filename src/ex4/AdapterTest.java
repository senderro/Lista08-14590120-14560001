package ex4;
import org.junit.jupiter.api.Test;
import java.util.HashSet;
import java.util.Set;
import static org.junit.jupiter.api.Assertions.*;

public class AdapterTest {

    @Test
    public void testeAdapter() {
        ArrayListT<String> multiset = new ArrayListT<>();
        multiset.add("apple");
        multiset.add("banana");
        multiset.add("apple");

        MultiSetAdapter<String> adapter = new MultiSetAdapter<>(multiset);
        Set<String> set = adapter.toSet();

        assertEquals(2, set.size());
        assertTrue(set.contains("apple"));
        assertTrue(set.contains("banana"));
    }
}