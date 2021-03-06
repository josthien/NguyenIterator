import java.util.Hashtable;
import java.util.Set;

public class StarbuzzCondimentsIterator implements Iterator{
    Hashtable items;
    int position = 0;
    Set<String> keys;

    public StarbuzzCondimentsIterator(Hashtable items) {
        this.items = items;
        this.keys = items.keySet();
    }

    public Object next() {
        Object object = items.get(this.keys.toArray()[position]);
        position = position + 1;
        return object;
    }

    public boolean hasNext() {
        if (position >= items.size()) {
            return false;
        } else {
            return true;
        }
    }
}
