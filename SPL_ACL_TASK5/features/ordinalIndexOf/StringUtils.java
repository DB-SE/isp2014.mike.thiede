
public class StringUtils {
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