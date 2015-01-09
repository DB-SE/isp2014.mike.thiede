/**
 * TODO description
 */
public class CharSequenceUtils {
	private static final int	NOT_FOUND	= -1;	
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