package org.example.utils;

import org.example.Constant.FrameworkConstant;
import org.example.Enum.ConfigProperties;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Properties;

public final class PropertiesReader {

    private static Properties properties = new Properties();
    private static final Map<String, String> CONFIGMAP = new HashMap<>();

    private PropertiesReader() {

    }

    static
    {
        try
        {
            FileInputStream fileInputStream = new FileInputStream(FrameworkConstant.getConfigfilepath());
            properties.load(fileInputStream);
            for(Map.Entry<Object, Object> entry : properties.entrySet())
            {
                CONFIGMAP.put(String.valueOf(entry.getKey()).toLowerCase(), String.valueOf(entry.getValue()).trim());
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }


   public static String get(ConfigProperties key) throws Exception {
       if(Objects.isNull(key) || Objects.isNull(CONFIGMAP.get(key.name().toLowerCase()))){
           throw new Exception("Property name " +key+ " is not found check config.properties");
       }
       return CONFIGMAP.get(key.name().toLowerCase());
   }



}
