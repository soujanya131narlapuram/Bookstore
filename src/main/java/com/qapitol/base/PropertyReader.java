package com.qapitol.base;

import java.io.FileReader;
import java.util.Properties;

public class PropertyReader {

    String ConfigPath = "src\\test\\resources\\config.properties";

    FileReader fileReader = null;
    public static Properties properties = null;

    public void initialize() {
        properties = new Properties();
        try {
            fileReader = new FileReader(ConfigPath);
            properties.load(fileReader);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
