package json;

import java.util.HashMap;
import java.util.Map;
import java.util.StringJoiner;

/**
 * Created by Andrii_Rodionov on 1/3/2017.
 */
public class JsonObject extends Json {

    private Map<String, Json> objs =  new HashMap<>();

    public JsonObject(JsonPair... jsonPairs) {
        
        for (JsonPair pair : jsonPairs) 
        {
            objs.put(pair.key, pair.value);    
        }
    }

    @Override
    public String toJson() {
        
        StringJoiner composer = new StringJoiner(", ", "{", "}");
        for (Map.Entry<String, Json> var : objs.entrySet()) 
        {
            composer.add(String.format("'%s': %s", var.getKey(), var.getValue().toJson()));
        }
        return composer.toString();
    }

    public void add(JsonPair jsonPair) {
        // ToDo
    }

    public Json find(String name) {
        // ToDo
        return null;
    }

    public JsonObject projection(String... names) {
        // ToDo
        return null;
    }
}
