package uk.axone.devintest.filehandling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class PropertiesDemo {
    public static void main (String[] args) throws IOException {
        //relative path and absolute path


        FileInputStream fis = new FileInputStream("M1-File Handling/application.properties");
        Properties props = new Properties();
        props.load(fis);
        String uName = props.getProperty("browse");
        System.out.println(uName);
    }

}
