package urban_andrii;
import java.util.HashMap;
public class Task72 {

        private HashMap<String, String> map;
        public Task72() {
            map = new HashMap<>();
        }
        public void newEntry(String key, String value) {
            map.put(key, value);
        }
        public String look(String key) {
            return map.getOrDefault(key, "Cant find entry for " + key);
        }

}
