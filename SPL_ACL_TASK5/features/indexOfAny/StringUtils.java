
public class StringUtils {
	public static final int		INDEX_NOT_FOUND	= -1;
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
}