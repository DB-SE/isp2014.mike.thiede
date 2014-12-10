@SuppressWarnings("all")
public class StripToNull extends SingleStringFeature {
	
	@Override
	public String getLabel() {
		return "stripToNull";
	}
	
	@Override
	public String perform(String s) {
		StringBuilder sb = new StringBuilder("Result of call\n\n");
		sb.append(getLabel()).append("(\"" + s + "\"");
		sb.append(":\n\n\"").append(StringUtils.stripToNull(s)).append("\"");
		return sb.toString();
	}
	
}
