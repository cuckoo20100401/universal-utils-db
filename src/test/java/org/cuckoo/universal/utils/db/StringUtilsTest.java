package org.cuckoo.universal.utils.db;

public class StringUtilsTest {
	
    public static void main( String[] args ) {
    	
        System.out.println(StringUtils.fromEntityNameToTableName("SysUser"));
        System.out.println(StringUtils.fromEntityPropertyNameToTableColumnName("createTime"));
        System.out.println(StringUtils.fromEntityPropertyNameToGetMethodName("createTime"));
        System.out.println(StringUtils.fromEntityPropertyNameToSetMethodName("createTime"));
    }
}
