package utils;

public class CommonUtil {

	public static Boolean checkValue(String value) {
		return value != null && ! value.trim().isEmpty() ? Boolean.TRUE : Boolean.FALSE; 
	}
	
	public static Boolean checkValue(Object value) {
		return value != null ? Boolean.TRUE : Boolean.FALSE; 
	}
			
}
