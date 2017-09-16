package com.ram.builds;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class BuildFile s
	
	
	static{
		BuildFile buildFile = new BuildFile();
		buildFile.load(null);
	}
	
	public void load(String[] args) {
		Properties properties = new Properties();
		try {
			InputStream in = this.getClass().getClassLoader()
                    .getResourceAsStream("build.properties");
			properties.load(in);
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println(properties.getProperty("key"));
	}
	
	
	public static void main(String[] args) {
		
	}
	
}
