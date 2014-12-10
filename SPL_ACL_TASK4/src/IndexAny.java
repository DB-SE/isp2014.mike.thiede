@SuppressWarnings("all")
public class IndexAny extends DoubleStringFeature {
	
	@Override
	public String getLabel() {
		return "indexOfAny";
	}
	
	@Override
	public String perform(String s1, String s2) {
		StringBuilder sb = new StringBuilder("Result of call\n\n");
		sb.append(getLabel()).append("(\"" + s1 + "\", \"" + s2 + "\")");
		sb.append(":\n\n\"").append(StringUtils.indexOfAny(s1, s2)).append("\"");
		return sb.toString();
	}
	
}
