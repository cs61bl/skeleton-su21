import java.util.HashMap;

public class SimpleNameMap {

    /* TODO: Instance variables here */

    public SimpleNameMap() {
        // TODO: YOUR CODE HERE


    }

    public static void main(String[] args) {
Lamp a = new Lamp(1);  // a.brightness = 1
Lamp b = new Lamp(2);  // b.brightness = 2

HashMap<Lamp, Integer> map = new HashMap<>();

map.put(b, 0);
map.put(a, 1);
map.put(a, 2);

System.out.println(map.get(a));  // print statement 1
System.out.println(map.get(b));  // print statement 2

map.put(b, 3);
a.brightness = 2;
map.put(b, 4);
"hello".substring()
System.out.println(map.get(a));  // print statement 3
System.out.println(map.get(b));  // print statement 4
System.out.println(map.get(new Lamp(1)));
    }

    static class Lamp {
        int brightness;

        Lamp(int brightness) {
            this.brightness = brightness;
        }

        @Override
        public int hashCode() {
            return brightness;
        }

        @Override
        public boolean equals(Object o) {
            return ((Lamp) o).brightness == brightness;
        }
    }

    /* Returns the number of items contained in this map. */
    public int size() {
        // TODO: YOUR CODE HERE
        return 0;
    }

    /* Returns true if the map contains the KEY. */
    public boolean containsKey(String key) {
        // TODO: YOUR CODE HERE
        return false;
    }

    /* Returns the value for the specified KEY. If KEY is not found, return
       null. */
    public String get(String key) {
        // TODO: YOUR CODE HERE
        return null;
    }

    /* Puts a (KEY, VALUE) pair into this map. If the KEY already exists in the
       SimpleNameMap, replace the current corresponding value with VALUE. */
    public void put(String key, String value) {
        // TODO: YOUR CODE HERE
    }

    /* Removes a single entry, KEY, from this table and return the VALUE if
       successful or NULL otherwise. */
    public String remove(String key) {
        // TODO: YOUR CODE HERE
        return null;
    }

    private static class Entry {

        private String key;
        private String value;

        Entry(String key, String value) {
            this.key = key;
            this.value = value;
        }

        /* Returns true if this key matches with the OTHER's key. */
        public boolean keyEquals(Entry other) {
            return key.equals(other.key);
        }

        /* Returns true if both the KEY and the VALUE match. */
        @Override
        public boolean equals(Object other) {
            return (other instanceof Entry
                    && key.equals(((Entry) other).key)
                    && value.equals(((Entry) other).value));
        }

        @Override
        public int hashCode() {
            return super.hashCode();
        }
    }
}