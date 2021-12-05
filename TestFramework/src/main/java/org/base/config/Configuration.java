package org.base.config;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class Configuration {
    private static Properties properties;
    private static final String configName = "config.properties";

    private Configuration(){
        properties = new Properties();
    }

    public static String getProperty(String propertyName){
        try {
            FileReader reader = new FileReader(configName);
            properties.load(reader);
            reader.close();
            return properties.getProperty(propertyName);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return  null;
    }
}
