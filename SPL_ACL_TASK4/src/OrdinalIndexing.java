@SuppressWarnings("all")
public class OrdinalIndexing extends StringStringIntFeature {
	
	@Override
	public String getLabel() {
		return "ordinalIndexOf";
	}
	
	@Override
	public String perform(String s1, String s2, int i) {
		StringBuilder sb = new StringBuilder("Result of call\n\n");
		sb.append(getLabel()).append("(\"" + s1 + "\", \"" + s2 + "\", " + i + ")");
		sb.append(":\n\n\"").append(StringUtils.ordinalIndexOf(s1, s2, i)).append("\"");
		return sb.toString();
	}
}
