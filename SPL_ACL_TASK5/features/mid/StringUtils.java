public class StringUtils {
	public static String mid(final String str, int pos, final int len) {
		if (str == null) return null;
		if (len < 0 || pos > str.length()) return "";
		if (pos < 0) {
			pos = 0;
		}
		if (str.length() <= pos + len) return str.substring(pos);
		return str.substring(pos, pos + len);
	}
}