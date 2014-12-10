@SuppressWarnings("all")
public class IndexIC extends DoubleStringFeature {
	
	@Override
	public String getLabel() {
		return "indexOfIgnoreCase";
	}
	
	@Override
	public String perform(String s1, String s2) {
		StringBuilder sb = new StringBuilder("Result of call\n\n");
		sb.append(getLabel()).append("(\"" + s1 + "\", \"" + s2 + "\")");
		sb.append(":\n\n\"").append(StringUtils.indexOfIgnoreCase(s1, s2)).append("\"");
		return sb.toString();
	}
}
