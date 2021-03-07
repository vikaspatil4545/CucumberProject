package com.ts.utils;

import java.io.IOException;

import org.apache.log4j.Logger;

public class Config {
	private static final Logger LOG = Logger.getLogger(Config.class);

	public static String getBrowser() throws IOException {
		PropertiUtil prop = new PropertiUtil();
		String browser = prop.getProperty1("browser.name");
		LOG.info("Browser Name" + browser);
		return browser;
	}

	public static String getAppUrl() throws IOException {
		PropertiUtil prop = new PropertiUtil();
		String url = prop.getProperty1("url");
		LOG.info("URL" + url);
		return url;
	}
}
