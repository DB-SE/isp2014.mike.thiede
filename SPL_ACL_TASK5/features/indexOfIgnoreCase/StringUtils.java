@SuppressWarnings("all")
public class StringUtils {
	public static int indexOfIgnoreCase(final CharSequence str, final CharSequence searchStr) {
		return indexOfIgnoreCase(str, searchStr, 0);
	}
	
	public static int indexOfIgnoreCase(final CharSequence str, final CharSequence searchStr, int startPos) {
		if (str == null || searchStr == null) return INDEX_NOT_FOUND;
		if (startPos < 0) {
			startPos = 0;
		}
		final int endLimit = str.length() - searchStr.length() + 1;
		if (startPos > endLimit) return INDEX_NOT_FOUND;
		if (searchStr.length() == 0) return startPos;
		for (int i = startPos; i < endLimit; i++) {
			if (CharSequenceUtils.regionMatches(str, true, i, searchStr, 0, searchStr.length())) return i;
		}
		return INDEX_NOT_FOUND;
	}
}