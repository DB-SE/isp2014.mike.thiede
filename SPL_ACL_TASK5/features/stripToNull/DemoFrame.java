import java.awt.event.ActionEvent;

import javax.swing.JRadioButton;

@SuppressWarnings("all")
public class DemoFrame {
	private final JRadioButton		rdbtnStripToNull;
	
	public DemoFrame() {
		rdbtnStripToNull = new JRadioButton("stripToNull");
		rdbtnStripToNull.addActionListener(this);
		panel.add(rdbtnStripToNull);
		buttonGroup.add(rdbtnStripToNull);
	}
	
	public void actionPerformed(ActionEvent e) {
		original(e);
		if (!e.getSource().equals(btnRun))return;
		String s1 = textField.getText();
		if (rdbtnStripToNull.isSelected()) {
			String res = StringUtils.stripToNull(s1);
			txtrOutputWillBe.append("stripToNull(\"" + s1 + "\")");
			txtrOutputWillBe.append(":\n\n\"" + res + "\"");
		}
	}
	
	private void setupInput(Object reference) {
		if (rdbtnStripToNull.equals(reference)) {
			lblArgument1.setVisible(true);
			lblArgument2.setVisible(false);
			lblArgument3.setVisible(false);
			lblArgument4.setVisible(false);
		}
		original(reference);
	}
}