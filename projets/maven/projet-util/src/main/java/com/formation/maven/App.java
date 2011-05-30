package com.formation.maven;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/**
 * 
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        InputStream inStream = App.class.getClassLoader().getResourceAsStream("app.properties");
        Properties props = new Properties();
        try {
        	props.load(inStream);
        } catch (IOException e) {
        	e.printStackTrace();
        }
        System.out.println(props.getProperty("db.url"));
    }
}
