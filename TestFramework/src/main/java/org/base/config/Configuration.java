package org.base.config;

import java.io.*;
import java.util.Properties;

public class Configuration {
    private static Properties properties = new Properties();
    private static final String configName = "build/resources/test/config.properties";

    public static String getProperty(String propertyName){
        try {
            InputStream reader = new FileInputStream(configName);
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
