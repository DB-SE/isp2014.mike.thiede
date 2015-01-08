import java.awt.event.ActionEvent;

import javax.swing.JRadioButton;

public class DemoFrame {
	private final JRadioButton	rdbtnIndexAny;
	
	public DemoFrame() {
		rdbtnIndexAny = new JRadioButton("indexOfAny");
		rdbtnIndexAny.addActionListener(this);
		panel.add(rdbtnIndexAny);
		buttonGroup.add(rdbtnIndexAny);
	}
	
	public void actionPerformed(ActionEvent e) {
		original(e);
		if (!e.getSource().equals(btnRun)) return;
		String s1 = textField.getText();
		String s2 = textField_1.getText();
		if (rdbtnIndexAny.isSelected()) {
			String res = Integer.toString(StringUtils.indexOfAny(s1, s2));
			txtrOutputWillBe.append("indexOfAny(\"" + s1 + "\", '" + s2 + "')");
			txtrOutputWillBe.append(":\n\n\"" + res + "\"");
		}
	}
	
	private void setupInput(Object reference) {
		if (rdbtnIndexAny.equals(reference)) {
			lblArgument1.setVisible(true);
			lblArgument2.setVisible(true);
			lblArgument3.setVisible(false);
			lblArgument4.setVisible(false);
		}
		original(reference);
	}
}
