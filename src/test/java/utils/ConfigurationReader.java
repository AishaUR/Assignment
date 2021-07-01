package utils;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigurationReader {

    //In this class we will implement the repeated steps of reading
    // from the configuration.properties file

    //create one utility method that is reading form configuration object of properties
    private static Properties properties=new Properties();
    static{
        //get the path and open file
        try {
            FileInputStream file=new FileInputStream("configuration.properties");
            //load the opened file
            properties.load(file);
            file.close(); //close the file in jvm memory
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    //use the object to read from the configuration.properties file
    public static String getProperty(String keyWord){
        return properties.getProperty(keyWord);
    }
}

