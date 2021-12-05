package org.base.config;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class Configuration {
    private static Properties properties = new Properties();
    private static final String configName = "config.properties";

    public String getProperty(String propertyName){
        try {
            InputStream reader = getClass().getClassLoader().getResourceAsStream(configName);
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
