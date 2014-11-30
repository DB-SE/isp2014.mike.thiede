import java.lang.reflect.Array;

@SuppressWarnings("all")
public class ArrayUtils {
	
	public static boolean isEmpty(final Object[] array) {
		return array == null || array.length == 0;
	}

	public static boolean isEmpty(final char[] array) {
		return array == null || array.length == 0;
	}
	
	public static <T> T[] addAll(final T[] array1, final T... array2) {
		if (array1 == null) return clone(array2);
		else if (array2 == null) return clone(array1);
		final Class<?> type1 = array1.getClass().getComponentType();
		final T[] joinedArray = (T[]) Array.newInstance(type1, array1.length + array2.length);
		System.arraycopy(array1, 0, joinedArray, 0, array1.length);
		try {
			System.arraycopy(array2, 0, joinedArray, array1.length, array2.length);
		}
		catch (final ArrayStoreException ase) {
			final Class<?> type2 = array2.getClass().getComponentType();
			if (!type1.isAssignableFrom(type2)) throw new IllegalArgumentException("Cannot store " + type2.getName() + " in an array of " + type1.getName(),
					ase);
			throw ase;
		}
		return joinedArray;
	}
	
	public static <T> T[] clone(final T[] array) {
		if (array == null) return null;
		return array.clone();
	}

}
