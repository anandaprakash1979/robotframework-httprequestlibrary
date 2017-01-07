package com.github.hi_fi.httprequestlibrary.utils;

import java.util.Map;

import com.google.gson.Gson;

public class Robot {
	
	public static Map<String, String> getParamsValue(String[] params, int index, String defaultValue) {
		String value = defaultValue;
		if (params.length > index) {
			value = params[index];
		}
		return parseRobotDictionary(value);
	}
	
	public static Object getParamsValue(String[] params, int index, Object defaultValue) {
		Object value = defaultValue;
		if (params.length > index) {
			value = params[index];
		}
		return value;
	}
	
	public static Map<String, String> parseRobotDictionary(String dictionary) {
		return new Gson().fromJson(dictionary.replace("u'", "'"), Map.class);
	}


}
