package com.angelcode.appserviceclientesproductos.config;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class Application {
	
	private static final String FILE_PATH = "application.properties";
	
	public static String getValue(String name) {
		Properties prop = new Properties();
        try (InputStream resourceAsStream = Application.class.getClassLoader().getResourceAsStream(FILE_PATH)) {
            prop.load(resourceAsStream);
        } catch (IOException e) {
            System.err.println("Error al cargar el archivo de configuracion : " + FILE_PATH);
        }
		return prop.getProperty(name, "");
	}
}