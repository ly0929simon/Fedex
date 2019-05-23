package com.emrekoca.utils;

import java.io.IOException;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.databind.ObjectMapper;

public class JSONUtils {
    /**
     * This simulates the actual code that is used inside Jersey to generate
     * json from the object. This guarantees the same generation mechanism, as
     * different object to json conversion classes normally produce slightly
     * different results.
     * 
     * Indent is added for readability, since it will only be used in testing.
     */
    public static String toJson(Object o, boolean ignoreNull) {
        try {
            ObjectMapper mapper = new ObjectMapper();
            if (ignoreNull)
                mapper.setSerializationInclusion(Include.NON_NULL);
            return mapper.writerWithDefaultPrettyPrinter().writeValueAsString(o);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
