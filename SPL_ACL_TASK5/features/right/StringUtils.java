public class StringUtils {
	public static String right(final String str, final int len) {
		if (str == null) return null;
		if (len < 0) return "";
		if (str.length() <= len) return str;
		return str.substring(str.length() - len);
	}
}