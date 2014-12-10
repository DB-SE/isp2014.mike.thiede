import java.util.HashSet;

import javax.swing.JRadioButton;

/**
 * Selector methods are common across all features, so they are implemented here to prevent code replication. This is the only reason for this to be an abstract
 * class instead of an interface. Subclasses don't need to know anything about the implementations made here. {@link #equals(Object)} and {@link #hashCode()}
 * are just implemented for an safe use of {@link HashSet} in the main method to simulate plugin loading.
 * 
 * @author mik
 */
@SuppressWarnings("all")
public abstract class Feature {
	
	private JRadioButton	btn;
	
	public abstract String getLabel();
	
	public final JRadioButton getSelector() {
		return btn;
	}
	
	public final void setSelector(JRadioButton b) {
		btn = b;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (!(obj instanceof Feature)) return false;
		if (getLabel() == null || ((Feature) obj).getLabel() == null) return false;
		return getLabel().equals(((Feature) obj).getLabel());
	}
	
	@Override
	public int hashCode() {
		if (getLabel() == null) return super.hashCode();
		return getLabel().hashCode();
	}
}
