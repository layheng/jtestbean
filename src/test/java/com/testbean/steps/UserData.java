package com.testbean.steps;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class UserData {
    public static String get(String key) throws IOException {
        FileInputStream in = new FileInputStream("./src/test/resources/userdata.properties");
        Properties prop = new Properties();
        prop.load(in);
        return prop.getProperty(key);
    }
}
