import java.awt.event.ActionEvent;

import javax.swing.JRadioButton;

public class DemoFrame {
	private final JRadioButton	rdbtnMid;
	
	public DemoFrame() {
		rdbtnMid = new JRadioButton("mid");
		rdbtnMid.addActionListener(this);
		panel.add(rdbtnMid);
		buttonGroup.add(rdbtnMid);
	}
	
	public void actionPerformed(ActionEvent e) {
		original(e);
		if (!e.getSource().equals(btnRun)) return;
		String s1 = textField.getText();
		int i1 = Integer.parseInt(spinner.getValue().toString());
		int i2 = Integer.parseInt(spinner_1.getValue().toString());
		if (rdbtnMid.isSelected()) {
			String res = StringUtils.mid(s1, i1, i2);
			txtrOutputWillBe.append("mid(\"" + s1 + "\", " + i1 + "\", " + i2 + ")");
			txtrOutputWillBe.append(":\n\n\"" + res + "\"");
		}
	}
	
	private void setupInput(Object reference) {
		if (rdbtnMid.equals(reference)) {
			lblArgument1.setVisible(true);
			lblArgument2.setVisible(false);
			lblArgument3.setVisible(true);
			lblArgument4.setVisible(true);
		}
		original(reference);
	}
}
