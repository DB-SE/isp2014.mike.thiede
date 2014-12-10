@SuppressWarnings("all")
public class StripStart extends DoubleStringFeature {
	
	@Override
	public String getLabel() {
		return "stripStart";
	}
	
	@Override
	public String perform(String s1, String s2) {
		StringBuilder sb = new StringBuilder("Result of call\n\n");
		sb.append(getLabel()).append("(\"" + s1 + "\", \"" + s2 + "\")");
		sb.append(":\n\n\"").append(StringUtils.stripStart(s1, s2)).append("\"");
		return sb.toString();
	}
	
}
