@SuppressWarnings("all")
public class CharSequenceUtils {
	private static final int	NOT_FOUND	= -1;
	
	static int indexOf(final CharSequence cs, final int searchChar, int start) {
		if (cs instanceof String) return ((String) cs).indexOf(searchChar, start);
		final int sz = cs.length();
		if (start < 0) {
			start = 0;
		}
		for (int i = start; i < sz; i++) {
			if (cs.charAt(i) == searchChar) return i;
		}
		return NOT_FOUND;
	}
	
	static int indexOf(final CharSequence cs, final CharSequence searchChar, final int start) {
		return cs.toString().indexOf(searchChar.toString(), start);
	}

	static int lastIndexOf(final CharSequence cs, final int searchChar, int start) {
		if (cs instanceof String) return ((String) cs).lastIndexOf(searchChar, start);
		final int sz = cs.length();
		if (start < 0) return NOT_FOUND;
		if (start >= sz) {
			start = sz - 1;
		}
		for (int i = start; i >= 0; --i) {
			if (cs.charAt(i) == searchChar) return i;
		}
		return NOT_FOUND;
	}
	
	/**
	 * Used by the lastIndexOf(CharSequence methods) as a green implementation of lastIndexOf
	 *
	 * @param cs the {@code CharSequence} to be processed
	 * @param searchChar the {@code CharSequence} to be searched for
	 * @param start the start index
	 * @return the index where the search sequence was found
	 */
	static int lastIndexOf(final CharSequence cs, final CharSequence searchChar, final int start) {
		return cs.toString().lastIndexOf(searchChar.toString(), start);
	}

}
