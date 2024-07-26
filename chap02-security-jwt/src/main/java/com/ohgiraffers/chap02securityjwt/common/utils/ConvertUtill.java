package com.ohgiraffers.chap02securityjwt.common.utils;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class ConvertUtill {

    private static Object convertObjectToJsonObject(Object obj) {
        ObjectMapper mapper = new ObjectMapper();
        JSONParser parser = new JSONParser();
        String convertJsonString;
        Object covertObj;

        try{
            convertJsonString = mapper.writeValueAsString(obj);
            covertObj = parser.parse(convertJsonString);
        }catch (ParseException e){
            throw new RuntimeException(e);
        }catch (JsonProcessingException e){
            throw new RuntimeException(e);
        }
        return covertObj;
    }
}
