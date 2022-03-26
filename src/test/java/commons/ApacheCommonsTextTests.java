package commons;

import org.apache.commons.text.StringSubstitutor;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

public class ApacheCommonsTextTests {

    @Test
    void replaceStringTest() {
        String template = "Hello My name is ${name} and I'm ${age} years old";

        Map<String, String> valMap = new HashMap<>();
        valMap.put("name", "Lee");
        valMap.put("age", String.valueOf(30));

        StringSubstitutor sub = new StringSubstitutor(valMap);

        String result = sub.replace(template);

        assertAll(
                () -> assertTrue(result.contains("Lee")),
                () -> assertTrue(result.contains("30"))
        );
    }
}
