@SuppressWarnings("all")
public class StringUtils {
	public static final int	INDEX_NOT_FOUND	= -1;
	
	public static String stripToNull(String str) {
		if (str == null) return null;
		str = strip(str, null);
		return str.isEmpty() ? null : str;
	}
	
	public static String strip(String str, final String stripChars) {
		if (isEmpty(str)) return str;
		str = stripStart(str, stripChars);
		return stripEnd(str, stripChars);
	}
	
	public static String stripStart(final String str, final String stripChars) {
		int strLen;
		if (str == null || (strLen = str.length()) == 0) return str;
		int start = 0;
		if (stripChars == null) {
			while (start != strLen && Character.isWhitespace(str.charAt(start))) {
				start++;
			}
		}
		else if (stripChars.isEmpty()) return str;
		else {
			while (start != strLen && stripChars.indexOf(str.charAt(start)) != INDEX_NOT_FOUND) {
				start++;
			}
		}
		return str.substring(start);
	}
	
	public static String stripEnd(final String str, final String stripChars) {
		int end;
		if (str == null || (end = str.length()) == 0) return str;
		
		if (stripChars == null) {
			while (end != 0 && Character.isWhitespace(str.charAt(end - 1))) {
				end--;
			}
		}
		else if (stripChars.isEmpty()) return str;
		else {
			while (end != 0 && stripChars.indexOf(str.charAt(end - 1)) != INDEX_NOT_FOUND) {
				end--;
			}
		}
		return str.substring(0, end);
	}
	
	public static boolean isEmpty(final CharSequence cs) {
		return cs == null || cs.length() == 0;
	}
	
	public static boolean isAnyEmpty(final CharSequence... css) {
		if (ArrayUtils.isEmpty(css)) return true;
		for (final CharSequence cs : css) {
			if (isEmpty(cs)) return true;
		}
		return false;
	}
	
	public static int indexOf(final CharSequence seq, final int searchChar) {
		if (isEmpty(seq)) return INDEX_NOT_FOUND;
		return CharSequenceUtils.indexOf(seq, searchChar, 0);
	}
	
	public static int indexOfAny(final CharSequence cs, final char... searchChars) {
		if (isEmpty(cs) || ArrayUtils.isEmpty(searchChars)) return INDEX_NOT_FOUND;
		final int csLen = cs.length();
		final int csLast = csLen - 1;
		final int searchLen = searchChars.length;
		final int searchLast = searchLen - 1;
		for (int i = 0; i < csLen; i++) {
			final char ch = cs.charAt(i);
			for (int j = 0; j < searchLen; j++) {
				if (searchChars[j] == ch) {
					if (i < csLast && j < searchLast && Character.isHighSurrogate(ch)) {
						if (searchChars[j + 1] == cs.charAt(i + 1)) return i;
					}
					else return i;
				}
			}
		}
		return INDEX_NOT_FOUND;
	}
	
	public static int indexOfAny(final CharSequence cs, final String searchChars) {
		if (isEmpty(cs) || isEmpty(searchChars)) return INDEX_NOT_FOUND;
		return indexOfAny(cs, searchChars.toCharArray());
	}
	
	public static int ordinalIndexOf(final CharSequence str, final CharSequence searchStr, final int ordinal) {
		return ordinalIndexOf(str, searchStr, ordinal, false);
	}
	
	private static int ordinalIndexOf(final CharSequence str, final CharSequence searchStr, final int ordinal, final boolean lastIndex) {
		if (str == null || searchStr == null || ordinal <= 0) return INDEX_NOT_FOUND;
		if (searchStr.length() == 0) return lastIndex ? str.length() : 0;
		int found = 0;
		int index = lastIndex ? str.length() : INDEX_NOT_FOUND;
		do {
			if (lastIndex) {
				index = CharSequenceUtils.lastIndexOf(str, searchStr, index - 1);
			}
			else {
				index = CharSequenceUtils.indexOf(str, searchStr, index + 1);
			}
			if (index < 0) return index;
			found++;
		}
		while (found < ordinal);
		return index;
	}
}
