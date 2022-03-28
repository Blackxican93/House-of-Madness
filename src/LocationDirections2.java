import java.util.HashMap;
import java.util.Map;


public class LocationDirections2 {
    private String key;
    private String  value;


    public LocationDirections2(String key, String value) {
        this.key = key;
        this.value = value;
    }


    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "LocationDirections2{" +
                "key='" + key + '\'' +
                ", value='" + value + '\'' +
                '}';
    }
}