import java.util.*;

public class Counter<T> {
    private Map<T, Integer> count;

    public Counter() {
        this.count = new HashMap<>();
    }

    public void add(T element) {
        if (!count.containsKey(element)) {
            count.put(element, 1);
        } else {
            count.put(element, count.get(element) + 1);
        }
    }

    public int get(T element) {
        if (!count.containsKey(element)) {
            return 0;
        }
        return count.get(element);
    }

    public T max() {

        T maxElement = null;
        int maxCount = -1;
        
        for (Map.Entry<T, Integer> entry : count.entrySet()) {
            if (entry.getValue() > maxCount) {
                maxCount = entry.getValue();
                maxElement = entry.getKey();
            }
        }
        
        return maxElement;
    }
}
