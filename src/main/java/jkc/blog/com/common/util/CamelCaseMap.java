package jkc.blog.com.common.util;

import java.util.LinkedHashMap;

public class CamelCaseMap extends LinkedHashMap<String,Object> {
    @Override
    public Object put(String key, Object value) {
        return super.put(toCamelCase(key), value);
    }

    private String toCamelCase(String key) {
        StringBuilder result = new StringBuilder();
        boolean nextUpper = false;
        for (char c : key.toCharArray()) {
            if (c == '_') {
                nextUpper = true;
            } else {
                result.append(nextUpper ? Character.toUpperCase(c) : Character.toLowerCase(c));
                nextUpper = false;
            }
        }
        return result.toString();
    }
}
