/*
 * JsonUtil.java
 *
 * Copyright (C) 2021 by Vinsmart. All right reserved.
 * This software is the confidential and proprietary information of Vinsmart
 */
package inftrasutructure.support;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.gson.Gson;

import java.util.Objects;

/**
 * The Class JsonUtil.
 */
public class JsonUtil {
    /**
     * The Constant gSon.
     */
    private static final Gson gSon = new Gson();

    public static <T> T toObejct(String json, Class<T> classOfT) {
     try {
         if (Objects.isNull(json)) {
             return null;
         }
         ObjectMapper objectMapper = new ObjectMapper();

         return objectMapper.readValue(json, classOfT);
     }catch (Exception e){
         e.printStackTrace();
     }
     return null;
    }

    /**
     * From json.
     *
     * @param <T>      the generic type
     * @param json     the json
     * @param classOfT the class of T
     * @return the t
     */
    public static <T> T convertJsonToObject(String json, Class<T> classOfT) {
        if (Objects.isNull(json)) {
            return null;
        }

        return gSon.fromJson(json, classOfT);
    }

    /**
     * Convert to json string.
     *
     * @param obj the obj
     * @return the string
     */
    public static String convertToJsonString(Object obj) {
        if (Objects.isNull(obj)) {
            return "";
        }

        return gSon.toJson(obj);
    }


}
