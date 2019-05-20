package org.cuckoo.universal.utils.db;

public class StringUtils {

	public static String fromEntityNameToTableName(String entityName) {
		
		StringBuilder tableName = new StringBuilder();
		
		char[] chars = entityName.toCharArray();
		for (int i = 0; i < chars.length; i++) {
			if (i == 0) {
				tableName.append(String.valueOf(chars[i]).toLowerCase());
			} else if (Character.isUpperCase(chars[i])) {
				tableName.append("_");
				tableName.append(String.valueOf(chars[i]).toLowerCase());
			} else {
				tableName.append(String.valueOf(chars[i]));
			}
		}
		return tableName.toString();
	}
	
	public static String fromEntityPropertyNameToTableColumnName(String entityPropertyName) {
		return fromEntityNameToTableName(entityPropertyName);
	}
	
	public static String fromEntityPropertyNameToGetMethodName(String entityPropertyName) {
		
		StringBuilder methodName = new StringBuilder("get");
		
		char[] chars = entityPropertyName.toCharArray();
		for (int i = 0; i < chars.length; i++) {
			if (i == 0) {
				methodName.append(String.valueOf(chars[i]).toUpperCase());
			} else {
				methodName.append(String.valueOf(chars[i]));
			}
		}
		return methodName.toString();
	}
	
	public static String fromEntityPropertyNameToSetMethodName(String entityPropertyName) {
		
		StringBuilder methodName = new StringBuilder("set");
		
		char[] chars = entityPropertyName.toCharArray();
		for (int i = 0; i < chars.length; i++) {
			if (i == 0) {
				methodName.append(String.valueOf(chars[i]).toUpperCase());
			} else {
				methodName.append(String.valueOf(chars[i]));
			}
		}
		return methodName.toString();
	}
}
