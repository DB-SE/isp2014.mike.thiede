import java.awt.event.ActionEvent;

import javax.swing.JRadioButton;

/**
 * TODO description
 */
public class DemoFrame {
	private final JRadioButton	rdbtnStripEnd;
	
	public DemoFrame() {
		rdbtnStripEnd = new JRadioButton("stripEnd");
		rdbtnStripEnd.addActionListener(this);
		panel.add(rdbtnStripEnd);
		buttonGroup.add(rdbtnStripEnd);
	}
	
	public void actionPerformed(ActionEvent e) {
		original(e);
		if (!e.getSource().equals(btnRun)) return;
		String s1 = textField.getText();
		String s2 = textField_1.getText();
		if (rdbtnStripEnd.isSelected()) {
			String res = StringUtils.stripEnd(s1, s2);
			txtrOutputWillBe.append("stripEnd(\"" + s1 + "\", \"" + s2 + "\")");
			txtrOutputWillBe.append(":\n\n\"" + res + "\"");
		}
	}
	
	private void setupInput(Object reference) {
		if (rdbtnStripEnd.equals(reference)) {
			lblArgument1.setVisible(true);
			lblArgument2.setVisible(true);
			lblArgument3.setVisible(false);
			lblArgument4.setVisible(false);
		}
		original(reference);
	}
}
