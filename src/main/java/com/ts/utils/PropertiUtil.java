package com.ts.utils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.apache.log4j.Logger;

public class PropertiUtil {

	private static final Logger LOG = Logger.getLogger(PropertiUtil.class);

	public String getProperty1(String key) throws IOException {
		Properties prop = loadApplicationProperties();
		return prop.getProperty(key);
	}

	
	private Properties loadApplicationProperties() throws FileNotFoundException {
		String dir = System.getProperty("user.dir");
		FileInputStream fis = new FileInputStream(dir + "\\src\\main\\resources\\application.properties");
		Properties prop = new Properties();
		try {
			prop.load(fis);
		} catch (IOException e) {
			LOG.info("unable to application.properties  File ");
		}
		return prop;
	}
}
