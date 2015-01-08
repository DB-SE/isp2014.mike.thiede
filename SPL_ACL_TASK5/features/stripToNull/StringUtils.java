public class StringUtils {
	public static String stripToNull(String str) {
		if (str == null) return null;
		str = strip(str, null);
		return str.isEmpty() ? null : str;
	}
}