/**
 * TODO description
 */
public  class  CharSequenceUtils {
	
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

	
	static boolean regionMatches(final CharSequence cs, final boolean ignoreCase, final int thisStart, final CharSequence substring, final int start,
			final int length) {
		if (cs instanceof String && substring instanceof String) return ((String) cs).regionMatches(ignoreCase, thisStart, (String) substring, start, length);
		int index1 = thisStart;
		int index2 = start;
		int tmpLen = length;
		while (tmpLen-- > 0) {
			final char c1 = cs.charAt(index1++);
			final char c2 = substring.charAt(index2++);
			if (c1 == c2) {
				continue;
			}
			if (!ignoreCase) return false;
			if (Character.toUpperCase(c1) != Character.toUpperCase(c2) && Character.toLowerCase(c1) != Character.toLowerCase(c2)) return false;
		}
		
		return true;
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

	
	
	static int lastIndexOf(final CharSequence cs, final CharSequence searchChar, final int start) {
		return cs.toString().lastIndexOf(searchChar.toString(), start);
	}


}
