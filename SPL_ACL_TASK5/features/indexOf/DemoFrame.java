import java.awt.event.ActionEvent;

import javax.swing.JRadioButton;

@SuppressWarnings("all")
public class DemoFrame {
	private final JRadioButton		rdbtnIndexof;
	
	public DemoFrame() {
		rdbtnIndexof = new JRadioButton("indexOf");
		rdbtnIndexof.addActionListener(this);
		panel.add(rdbtnIndexof);
		buttonGroup.add(rdbtnIndexof);
	}
	
	public void actionPerformed(ActionEvent e) {
		original(e);
		if (!e.getSource().equals(btnRun))return;
		String s1 = textField.getText();
		String s2 = textField_1.getText();
		if (rdbtnIndexof.isSelected()) {
			String res = Integer.toString(StringUtils.indexOf(s1, s2.isEmpty() ? 0 : s2.charAt(0)));
			txtrOutputWillBe.append("indexOf(\"" + s1 + "\", '" + (s2.isEmpty() ? 0 : s2.charAt(0)) + "')");
			txtrOutputWillBe.append(":\n\n\"" + res + "\"");
		}
	}
	
	private void setupInput(Object reference) {
		if (rdbtnIndexof.equals(reference)) {
			lblArgument1.setVisible(true);
			lblArgument2.setVisible(true);
			lblArgument3.setVisible(false);
			lblArgument4.setVisible(false);
		}
		original(reference);
	}
}