import java.awt.event.ActionEvent;

import javax.swing.JRadioButton;

/**
 * TODO description
 */
public class DemoFrame {
	private final JRadioButton	rdbtnStripStart;
	
	public DemoFrame() {
		rdbtnStripStart = new JRadioButton("stripStart");
		rdbtnStripStart.addActionListener(this);
		panel.add(rdbtnStripStart);
		buttonGroup.add(rdbtnStripStart);
	}
	
	public void actionPerformed(ActionEvent e) {
		original(e);
		if (!e.getSource().equals(btnRun)) return;
		String s1 = textField.getText();
		String s2 = textField_1.getText();
		if (rdbtnStripStart.isSelected()) {
			String res = StringUtils.stripStart(s1, s2);
			txtrOutputWillBe.append("stripStart(\"" + s1 + "\", \"" + s2 + "\")");
			txtrOutputWillBe.append(":\n\n\"" + res + "\"");
		}
	}
	
	private void setupInput(Object reference) {
		if (rdbtnStripStart.equals(reference)) {
			lblArgument1.setVisible(true);
			lblArgument2.setVisible(true);
			lblArgument3.setVisible(false);
			lblArgument4.setVisible(false);
		}
		original(reference);
	}
}
