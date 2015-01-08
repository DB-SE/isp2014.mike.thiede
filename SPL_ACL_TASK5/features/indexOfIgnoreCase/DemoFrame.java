import java.awt.event.ActionEvent;

import javax.swing.JRadioButton;


public class DemoFrame {
	private final JRadioButton		rdbtnIndexIC;
	public DemoFrame() {
		rdbtnIndexIC = new JRadioButton("indexOfIgnoreCase");
		rdbtnIndexIC.addActionListener(this);
		panel.add(rdbtnIndexIC);
		buttonGroup.add(rdbtnIndexIC);
	}
	
	public void actionPerformed(ActionEvent e) {
		original(e);
		if (!e.getSource().equals(btnRun))return;
		String s1 = textField.getText();
		String s2 = textField_1.getText();
		if (rdbtnIndexIC.isSelected()) {
			String res = Integer.toString(StringUtils.indexOfIgnoreCase(s1, s2));
			txtrOutputWillBe.append("indexOfIgnoreCase(\"" + s1 + "\", '" + (s2.isEmpty() ? 0 : s2.charAt(0)) + "')");
			txtrOutputWillBe.append(":\n\n\"" + res + "\"");
		}
	}
	
	private void setupInput(Object reference) {
		if (rdbtnIndexIC.equals(reference)) {
			lblArgument1.setVisible(true);
			lblArgument2.setVisible(true);
			lblArgument3.setVisible(false);
			lblArgument4.setVisible(false);
		}
		original(reference);
	}
}