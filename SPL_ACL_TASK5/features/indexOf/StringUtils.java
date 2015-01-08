@SuppressWarnings("all")
public class StringUtils {
	public static final int		INDEX_NOT_FOUND	= -1;
	
	public static int indexOf(final CharSequence seq, final int searchChar) {
		if (isEmpty(seq)) return INDEX_NOT_FOUND;
		return CharSequenceUtils.indexOf(seq, searchChar, 0);
	}
}