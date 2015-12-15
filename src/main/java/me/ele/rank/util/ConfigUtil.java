package me.ele.rank.util;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class ConfigUtil {

	private static String[] propNames = new String[] {"rank_config.properties","restaurant_thrift.properties",
		"rabbitmq_config.properties","search.properties","rank_redis.properties","metrics.properties"};
	
	static String env=System.getProperty("env","alpha");
	
	private static Properties properties = new Properties();
	static { 
		for (int i = 0; i < propNames.length; i++) {
			InputStream in = ConfigUtil.class.getResourceAsStream("/"+env+"/"+propNames[i]);
			Properties prop = new Properties();
			try {		
				prop.load(in);
			} catch (IOException e) {
				e.printStackTrace();
			}
			if (prop != null) {
				properties.putAll(prop);
			}
		}
	}

	public static String get(String name) {
		if (name == null) {
			return null;
		}
		return properties.getProperty(name);
	}

	public static String get(String name, String def) {
		String val = get(name);
		return val != null ? val : def;
	}

	public static int getInt(String name) {
		String val = get(name);
		return val == null ? 0 : Integer.parseInt(val);
	}

	public static int getInt(String name, int def) {
		String val = get(name);
		return val != null ? Integer.parseInt(val) : def;
	}

	public static long getLong(String name) {
		String val = get(name);
		return val == null ? 0L : Long.parseLong(val);
	}

	public static long getLong(String name, long def) {
		String val = get(name);
		return val != null ? Long.parseLong(val) : def;
	}

	public static boolean getBool(String name) {
		String val = get(name);
		return val == null ? false : Boolean.parseBoolean(val);
	}

	public static boolean getBool(String name, boolean def) {
		String val = get(name);
		return val != null ? Boolean.parseBoolean(val) : def;
	}

	public static float getFloat(String name) {
		String val = get(name);
		return val == null ? 0 : Float.parseFloat(val);
	}

	public static float getFloat(String name, float def) {
		String val = get(name);
		return val != null ? Float.parseFloat(val) : def;
	}

	public static double getDouble(String name) {
		String val = get(name);
		return val == null ? 0 : Double.parseDouble(val);
	}

	public static double getDouble(String name, double def) {
		String val = get(name);
		return val != null ? Double.parseDouble(val) : def;
	}
	
	public static void main(String[] args) {
		String reusltfields=ConfigUtil.get("search_url");
		System.out.println(reusltfields);
	}
}
