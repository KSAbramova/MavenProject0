import org.yaml.snakeyaml.Yaml;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class YamlReader {

    public List<Person> readPeople() {
        Yaml yaml = new Yaml();
        
        InputStream inputStream = this.getClass().getClassLoader()
                .getResourceAsStream("people.yaml");

        List<Map<String, Object>> rawData = yaml.load(inputStream);

        List<Person> people = new ArrayList<>();
        for (Map<String, Object> map : rawData) {
            String name = (String) map.get("name");
            String address = (String) map.get("address");
            people.add(new Person(name, address));
        }

        return people;
    }
}