package com.testing.Json;

import org.json.simple.JSONObject;

import java.io.FileWriter;
import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.Map;

public class JsonSimpleWriteOrdered {
    public static void main(String[] args) {
        Map<Object, Object> map = new LinkedHashMap<>();
        map.put("is_vip", new Boolean(true));
        map.put("name", "mkyong.com");
        map.put("age", new Integer(100));
        map.put("balance", new Double(100.21));

        JSONObject obj = new JSONObject();

        try(FileWriter file = new FileWriter("testOrder.json")){
            file.write(obj.toJSONString(map));
            file.flush();
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
