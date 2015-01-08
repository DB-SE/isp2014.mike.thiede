
public class StringUtils {
	public static String strip(String str, final String stripChars) {
		if (isEmpty(str)) return str;
		str = stripStart(str, stripChars);
		return stripEnd(str, stripChars);
	}
}